// 풀이 시간 : 45분
// 풀이 핵심 내용 : 백트래킹을 사용하고, 확률에 대한 처리 잘 할것
// 회고 : 좀더 시간을 단축했을 수 있었다

import java.io.*;
import java.util.*;

public class Main_BJ_1405_미친로봇_김주은 {
	
	static int n;
	//동, 서, 남, 북
	static int[] dr = {0,0,1,-1};
	static int[] dc = {1,-1,0,0};
	static int[] per;
	static double answer = 0;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int E = sc.nextInt();
		int W = sc.nextInt();
		int S = sc.nextInt();
		int N = sc.nextInt();
		per = new int[] {E,W,S,N};
		
		boolean[][] visited = new boolean[n*2+1][n*2+1];
		visited[n][n]=true;
		
		dfs(0, n,n,1,visited);
		
		System.out.printf("%.14f\n", answer);
		
	}

	private static void dfs(int cnt, int x, int y, double p, boolean[][] visited) {
		
		if(n==cnt) {
			answer+=p;
			return;
		}
		
		for(int d=0;d<4;d++) {
			int nr = x+dr[d];
			int nc = y+dc[d];
			if(!visited[nr][nc] && per[d]>0) {
				visited[nr][nc]=true;
				dfs(cnt+1, nr,nc,p*per[d]*0.01,visited);
				visited[nr][nc]=false;
			}
		}
	}

}
