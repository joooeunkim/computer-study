//풀이 시간 : 30분
//풀이 핵심 내용 : 다익스트라 적용
//회고 : 다익스트라와 크루스칼의 차이를 이해하고 있을 것

import java.io.*;
import java.util.*;

public class Main_BJ_1916_최소비용구하기_김주은 {
	
	static class Node{
		int v;
		int w;
		public Node(int v, int w) {
			super();
			this.v = v;
			this.w = w;
		}
	}

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		final int INF = 100000*(N-1);
		
		ArrayList<Node>[] adjList = new ArrayList[N+1];
		for(int i=1;i<=N;i++) {
			adjList[i] = new ArrayList<>();
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			adjList[a].add(new Node(b,w));
		}
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		//dijkstra
		
		int[] dist = new int[N+1];
		Arrays.fill(dist, INF);
		
		PriorityQueue<Node> pq = new PriorityQueue<>((o1,o2)->{
			return o1.w-o2.w;
		});
		
		dist[x]=0;
		pq.add(new Node(x,0));
		
		while(!pq.isEmpty()) {
			Node n = pq.poll();
			
			if(dist[n.v]<n.w) {
				continue;
			}
			
			for(int i=0;i<adjList[n.v].size();i++) {
				Node next = adjList[n.v].get(i);
				if(dist[n.v]+next.w<dist[next.v]) {
					dist[next.v]=dist[n.v]+next.w;
					pq.add(new Node(next.v, dist[next.v]));
				}
			}
		}
		
		System.out.println(dist[y]);
		
	}

}
