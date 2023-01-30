//풀이 시간 : 10분
//풀이 핵심 내용 : 조합을 구현할 수 있다
//회고 : 문제를 읽고 예시를 통해서 바로 조합임을 알았다면 빨리 풀 수 있었을 것(처음에 순열로 풀었다)

import java.util.Scanner;

public class Main_BJ_15650_N과M2_김주은 {
	
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		combination(N,M,0,0,new int[M]);

		System.out.println(sb);
	}

	private static void combination(int N, int M, int cnt, int idx, int[] sel) {

		if(cnt==M) {
			for(int i=0;i<M;i++) {
				sb.append(sel[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=idx;i<N;i++) {
			sel[cnt]=i+1;
			combination(N,M,cnt+1,i+1,sel);
		}
	}

}
