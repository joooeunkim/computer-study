//풀이 시간 : 30분
//풀이 핵심 내용 : 전체 카드에 대해서 해당 카드와 기존 dp배열 값의 최대값을 비교해야한다
//회고 : 일차원 배열로, 현재 비교하는 카드에 대한 값이 바로 바로 반영이 된다는 생각을 

import java.util.Scanner;

public class Main_BJ_11052_카드구매하기_김주은 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N+1];
		int[] dp = new int[N+1];
		
		for(int i=1;i<=N;i++) {
			arr[i] = sc.nextInt();
		}
	
		for(int i=1;i<=N;i++) {
			for(int j=i;j<=N;j++) {
				dp[j] = Math.max(dp[j], dp[j-i]+arr[i]);
			}
		}
		
		System.out.println(dp[N]);
	}

}
