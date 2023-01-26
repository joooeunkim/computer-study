//풀이 시간 : 50분
//풀이 핵심 내용 : 최소 시간을 맞추는 경로를 출력하기 위해 어떤 자료구조를 이용하는 것이 시간 초과를 내지 않을지 생각해내야 한다.
//회고 : 경로를 출력하는 여러 방법에 대해서 생각할 수 있었다.


import java.util.LinkedList;
import java.util.Scanner;

public class Main_BJ_13913_숨바꼭질4_김주은 {
	
	static int N,K;
	static boolean[] visited;
	static int[] path;
	static LinkedList<Integer> queue;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		N = sc.nextInt();
		K = sc.nextInt();
		
		visited = new boolean[100001];
		path = new int[100001];
		
		queue = new LinkedList<>();
		visited[N]=true;
		queue.add(N);
		
		int time=0;
		while(!queue.isEmpty()) {
			
			int s = queue.size();
			while(s-->0) {
				
				int v = queue.poll();
				
				if(v==K) {
					System.out.println(time);
					int t = time+1;
					int[] paths = new int[t];
					int n = K;
					while(--t>=0) {
						paths[t]=n;
						n = path[n];
					}
					for(int i=0;i<=time;i++) {
						System.out.print(paths[i]+" ");
					}
					System.out.println();
					return;
				}
				
				if(v-1>=0 && !visited[v-1]) {
					visited[v-1] = true;
					path[v-1]=v;
					queue.add(v-1);
				}
				if(v+1<=100000 && !visited[v+1]) {
					visited[v+1] = true;
					path[v+1]=v;
					queue.add(v+1);
				}
				if(v*2<=100000 && !visited[v*2]) {
					visited[v*2] = true;
					path[v*2]=v;
					queue.add(v*2);
				}
				
			}
			time++;
		}
		
	}

}
