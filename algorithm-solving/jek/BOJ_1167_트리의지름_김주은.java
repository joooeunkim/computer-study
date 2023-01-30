//풀이 시간 : 3시간
//풀이 핵심 내용 : 트리의 지름 구하는 방법이 따로 있다는 알고, 지름의 한 정점을 통해 다른 지름 정점을 알아낸다
//회고 : 알고리즘을 세울 때 시간복잡도 계산을 하고 개발을 시작할 것. ArrayList와 LinkedList의 시간복잡도 차이, 1억에 1초를 


import java.io.*;
import java.util.*;

public class Main_BJ_1167_트리의지름_김주은 {
	
	static class Node {
		int v;
		int w;
		
		public Node(int v, int w) {
			super();
			this.v = v;
			this.w = w;
		}
	}
	
	static int max=0;
	static int N, node;
	static ArrayList<Node>[] list;
	static boolean[] visited;
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());

		list = new ArrayList[N+1];
		for(int i=1;i<=N;i++) {
			list[i] = new ArrayList<Node>();
		}
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st.nextToken());
			int nextV = Integer.parseInt(st.nextToken());
			while (nextV != -1) {
				int w = Integer.parseInt(st.nextToken());
				list[v].add(new Node(nextV,w));
				nextV = Integer.parseInt(st.nextToken());
			}
		}
		
		visited = new boolean[N+1];
		dfs(1,0);
		visited = new boolean[N+1];
		dfs(node,0);
		
		
		System.out.println(max);
	}

	private static void dfs(int idx, int weight) {
		
		if(weight>max) {
			max=weight;
			node=idx;
		}
		
		visited[idx]=true;

		for(int i=0;i<list[idx].size();i++) {
			Node n = list[idx].get(i);
			if(!visited[n.v]) {
				dfs(n.v, weight+n.w);
			}
		}
	}

}
