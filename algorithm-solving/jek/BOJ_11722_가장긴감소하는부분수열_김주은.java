//풀이 시간: 15분
//풀이 핵심 내용: dp를 이용하여 이전 탐색한 내용보다 값이 작다면 길이를 늘려서 체크하는 방식
//회고: 모든 dp[]의 값을 1로 초기화하면 로직의 중복을 줄일 수 있다

import java.util.Scanner;

public class Main_BJ_11722_가장긴감소하는부분수열_김주은 {

	public static void main(String[] args) throws Exception{

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] dp = new int[N];
		
		int ans=1;
		
		for(int i=0;i<N;i++) {
			dp[i]=1;
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[i] && dp[i]<=dp[j]) {
					dp[i]=dp[j]+1;
				}
			}
			
			if(ans<dp[i]) {
				ans = dp[i];
			}
		}
		
		System.out.println(ans);
	}

}
