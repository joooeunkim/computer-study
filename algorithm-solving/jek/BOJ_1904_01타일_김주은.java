//풀이 시간 : 30분
//풀이 핵심 내용 : 피보나치 형태의 규칙을 찾아낼 수 있는 것이 중요
//회고 : 특히 숫자 나열일때는 수의 규칙을 빨리 찾아보기도하자

import java.util.Scanner;

public class Main_BJ_1904_01타일_김주은 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] dp = new int[N+1];
		
		dp[1]=1;
		if(N>=2) {
			dp[2]=2;
		}
		
		for(int i=3;i<=N;i++) {
			dp[i]=(dp[i-1]+dp[i-2])%15746;
		}
		
		System.out.println(dp[N]);
	}

}
