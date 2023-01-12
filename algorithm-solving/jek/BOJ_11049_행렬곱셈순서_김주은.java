//풀이 시간 : 2시간(해설 참조)
//풀이 핵심 내용: 어떻게 DP를 적용할 수 있는지, 점화식을 세울 수 있는지 수학문제 풀듯이 고민해야한다
//회고 : 너무 어려웠다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BJ_11049_행렬곱셈순서_김주은 {
	
	static int[][] arr;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		arr = new int[N][2];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
	
		int[][] dp = new int[N][N];
		
		for(int d=1;d<N;d++) {
			for(int i=0;i+d<N;i++) {
				int min = Integer.MAX_VALUE;
				for(int k=i;k<i+d;k++) {
					int val = dp[i][k]+dp[k+1][i+d] + sum(i,k,i+d);
					min = Math.min(min, val);
				}
				dp[i][i+d] = min;
			}
		}
		
		System.out.println(dp[0][N-1]);
	}

	private static int sum(int i, int k, int j) {
		return arr[i][0] * arr[k][1] * arr[j][1];
	}

}
