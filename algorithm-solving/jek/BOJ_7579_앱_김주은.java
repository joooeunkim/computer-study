//풀이 시간 : 3시간
//풀이 핵심 내용 : 비용 관점으로 배낭 문제를 해결해야겠다는 시각 필요
//회고 : 더 다양한 배낭 문제를 해결해야겠다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_BJ_7579_앱_김주은 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] app = new int[N+1][2];
		
		int costs=0;
		
		for(int j=0;j<2;j++) {
			st = new StringTokenizer(br.readLine());
			for(int i=1;i<=N;i++) {
				app[i][j]=Integer.parseInt(st.nextToken());
				if(j==1) {
					costs+=app[i][j];
				}
			}
		}
		
		int[][] dp = new int[N+1][costs+1];
		
		for(int i=1;i<=N;i++) {
			for(int j=0;j<=costs;j++) {
				if(app[i][1]<=j) {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-app[i][1]]+app[i][0]);
				} else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		
		int ans=0;
		for(int j=0;j<=costs;j++) {
			if(dp[N][j]>=M) {
				ans=j;
				break;
			}
		}
		
		System.out.println(ans);
		
	}

}
