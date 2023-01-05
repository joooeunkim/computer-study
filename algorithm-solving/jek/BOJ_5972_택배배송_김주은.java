//풀이 시간 : 1시간
//풀이 핵심 내용 : Priority Queue를 쓰지않고 직접 다음 탐색 노트를 찾도록 구현했더니 시간초과가 발생했다. Priority Queue로 다익스트라 적용하는 법을 알아야한다.
//회고 : 가중치가 있는 인접리스트 만드는 법을 잊었다. 주기적으로 그래프 문제를 풀어야한다.

import java.io.*;
import java.util.*;

public class Main_BJ_5972_택배배송_김주은 {
	
	static class Node {
		int idx;
		int w;
		
		public Node(int idx, int w) {
			this.idx = idx;
			this.w = w;
		}
	}
	
	static int INF = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		ArrayList<Node>[] adjList = new ArrayList[N];
		
		for(int i=0;i<N;i++) {
			adjList[i] = new ArrayList<>();
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken())-1;
			int y = Integer.parseInt(st.nextToken())-1;
			int w = Integer.parseInt(st.nextToken());
			
			adjList[x].add(new Node(y,w));
			adjList[y].add(new Node(x,w));
			
		}
		
		//dijkstra
		int[] dist = new int[N];
		Arrays.fill(dist, INF);
		dist[0]=0;
		boolean[] visited = new boolean[N];
		
		PriorityQueue<Node> pq = new PriorityQueue<Node>((o1,o2)->{return o1.w-o2.w;});
		
		pq.offer(new Node(0,0));
		
		while(!pq.isEmpty()) {
			
			int curr = pq.poll().idx;
			
			if(visited[curr]) continue;
			visited[curr]=true;
			
			for(Node n : adjList[curr]) {
				if(dist[n.idx]>dist[curr]+n.w) {
					dist[n.idx] = dist[curr]+n.w;
					pq.offer(new Node(n.idx,dist[n.idx]));
				}
			}
			
		}
		
		System.out.println(dist[N-1]);
		
	}
}
