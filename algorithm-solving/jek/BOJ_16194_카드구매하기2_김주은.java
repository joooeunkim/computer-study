//풀이 시간 : 5분
//풀이 핵심 내용: dp를 이용하여 각 카드 갯수 별로 최소 금액을 가질 수 있도록 한다
//회고: 카드 구매하기 문제에서 최솟값을 구하는 것으로 dp가 0이 되지 않도록 초기화해야한다
import java.util.Scanner;

public class Main_BJ_16194_카드구매하기2_김주은 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N+1];
		int[] dp = new int[N+1];
		
		for(int i=1;i<=N;i++) {
			arr[i]=dp[i]=sc.nextInt();
		}
		
		for(int i=1;i<=N;i++) {
			for(int j=i;j<=N;j++) {
				dp[j] = Math.min(dp[j], dp[j-i]+arr[i]);
			}
		}
		
		System.out.println(dp[N]);
		
	}

}
