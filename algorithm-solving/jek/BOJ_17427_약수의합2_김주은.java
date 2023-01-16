//풀이 시간 : 30분
//풀이 핵심 내용 : 약수의 합을 모두 더하는 것이므로 배수의 합의 개념으로 생각해야 한다.
//회고 : 시간 복잡도를 줄이기 위한 방법을 더 영리하게 생각할 수 있어야한다.

import java.util.Scanner;

public class Main_BJ_17427_약수의합2_김주은 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long ans = 0;
		for(long i=1;i<=N;i++) {
			ans += i*(N/i);
		}
		
		System.out.println(ans);
	}

}
