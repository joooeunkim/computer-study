#풀이 시간 : 40분
#풀이 핵심 내용 : 어떻게 트리를 역순으로 탐색할지 생각하는 방법
#회고 : 자료구조 설계가 더 필요

import java.io.*;
import java.util.*;

public class Main_BJ_3584_가장가까운공통조상_김주은 {
	
	static int N;
	static int[] parent;
	static ArrayList<Integer>[] childs;
	static boolean[] isLeaf;
	

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for(int tc=0;tc<T;tc++) {
			
			N = Integer.parseInt(br.readLine());
			
			parent = new int[N+1];
			
			for(int i=1;i<=N-1;i++) {
				st = new StringTokenizer(br.readLine());
				int p = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				
				parent[c]=p;
			}
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			boolean[] pathA = new boolean[N+1];
			
			int idx=a;
			while(idx!=0) {
				pathA[idx]=true;
				idx = parent[idx];
			}
			
			idx=b;
			while(idx!=0) {
				if(pathA[idx]) {
					sb.append(idx).append("\n");
					break;
				}
				idx=parent[idx];
			}

		}
		
		System.out.println(sb);
	}

}
