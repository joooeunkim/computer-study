//풀이 시간 :  8시간...
//풀이 핵심 내용 : dijkstra로 접근하거나 이진트리 & bfs로 접근하여 풀 수 있다.
//회고 : dijkstra를 처음에 생각했다가, 포기했는데 생각한 것을 구현하는데 까지 노력하자

import java.io.*;
import java.util.*;

public class Main {
	
	static class Node {
		int end;
		int w;
		
		public Node(int end, int w) {
			this.end = end;
			this.w = w;
		}
	}
	
	static int N, factoryA, factoryB, maxWeight=0;
	static ArrayList<Node>[] adjList;
	static final int INF = 1000000001;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		adjList = new ArrayList[N];
		for(int i=0;i<N;i++) {
			adjList[i] = new ArrayList<Node>();
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken())-1;
			int B = Integer.parseInt(st.nextToken())-1;
			int C = Integer.parseInt(st.nextToken());

			adjList[A].add(new Node(B,C));
			adjList[B].add(new Node(A,C));
		}
		
		st = new StringTokenizer(br.readLine());
		factoryA = Integer.parseInt(st.nextToken())-1;
		factoryB = Integer.parseInt(st.nextToken())-1;
		
		int[] dist = new int[N];
		Arrays.fill(dist, -1);
		
		//Dijkstra
		PriorityQueue<Node> pq = new PriorityQueue<>((o1,o2)->(o2.w-o1.w));
		pq.offer(new Node(factoryA, INF));
		dist[factoryA] = INF;
		
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			int from = node.end;
			int weight = node.w;
			
			if(dist[from]>weight) continue;
		
			for(int i=0;i<adjList[from].size();i++) {
				int to = adjList[from].get(i).end;
				int wTo = Math.min(weight, adjList[from].get(i).w);
				if(wTo>dist[to]) {
					dist[to] = wTo;
					pq.offer(new Node(to, wTo));
				}
			}
		}
		
		System.out.println(dist[factoryB]);
	}

}
