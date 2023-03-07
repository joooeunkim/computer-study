//풀이 시간 : 1시간
//풀이 핵심 내용 : 다익스트라를 2번 활용한 거리 계산. 다익스트라에서 시작 정점이 2개 이상일 경우 해당 정점을 모두 queue에 넣고 시작해도 되더라
//회고 : pq에 우선순위를 커스텀하기 위한 방법 comparator, comparable 사용법 익숙해지고, dijkstra 응용 문제를 더 풀어봐야할것 같다.

import java.io.*;
import java.util.*;

public class Main_BJ_13911_집구하기_김주은 {
	
	static class Node implements Comparable<Node>{
		int v;
		int w;
		public Node(int v, int w) {
			super();
			this.v = v;
			this.w = w;
		}
		@Override
		public int compareTo(Node o) {
			return this.w-o.w;
		}
		
	}
	
	static int V,E;
	static LinkedList<Node>[] graph;
	static PriorityQueue<Node> pq = new PriorityQueue();


	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		
		graph = new LinkedList[V];
		for(int i=0;i<V;i++) {
			graph[i] = new LinkedList<Node>();
		}
		
		for(int i=0;i<E;i++) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken())-1;
			int v2 = Integer.parseInt(st.nextToken())-1;
			int w = Integer.parseInt(st.nextToken());
			
			graph[v1].add(new Node(v2,w));
			graph[v2].add(new Node(v1,w));
		}
		
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int maxM = Integer.parseInt(st.nextToken());
		
		int[] distM = new int[V];
		Arrays.fill(distM, Integer.MAX_VALUE);
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			int v =Integer.parseInt(st.nextToken())-1;
			distM[v]=0;
			pq.add(new Node(v,0));
		}
		dijkstra(distM);
		
		st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int maxS = Integer.parseInt(st.nextToken());
		
		int[] distS = new int[V];
		Arrays.fill(distS, Integer.MAX_VALUE);
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<S;i++) {
			int v =Integer.parseInt(st.nextToken())-1;
			distS[v]=0;
			pq.add(new Node(v,0));
		}
		dijkstra(distS);
		
		int minSum=Integer.MAX_VALUE;
		for(int i=0;i<V;i++) {
			if(distM[i]>0 && distS[i]>0 && distM[i]<=maxM && distS[i]<=maxS) {
				minSum = Math.min(minSum, distM[i]+distS[i]);
			}
		}
		
		System.out.println(minSum==Integer.MAX_VALUE?-1:minSum);
	}

	private static void dijkstra(int[] dist) {

		while(!pq.isEmpty()) {
			
			Node n = pq.poll();
			
			if(dist[n.v]<n.w) {
				continue;
			}
			
			for(int i=0;i<graph[n.v].size();i++) {
				Node next = graph[n.v].get(i);
				if(dist[n.v]+next.w<dist[next.v]) {
					dist[next.v]=dist[n.v]+next.w;
					pq.add(new Node(next.v,dist[next.v]));
				}
			}
		}
	}

}
