//풀이 시간 : 1시간
//풀이 핵심 내용 : DP문제라는 것을 인식하는 것, 조건을 단순하게 짜서 실수를 줄이는 것
//회고 : 조건을 단순화하여 실수를 줄이고, 문제 조건을 잘 확인할 것

import java.util.Arrays;
import java.util.Scanner;

public class Main_BJ_2011_암호코드_김주은 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int len = s.length();
		
		int[] arr = new int[len+1]; 
		int[] dp = new int[len+1]; 
		
		for(int i=0;i<len;i++) {
			arr[i+1]=s.charAt(i)-'0';
		}
		
		dp[0]=1;
		
		for(int i=1;i<=len;i++) {
			
			if(arr[i]!=0) {
				dp[i]+=dp[i-1];
			}
			
			int x = arr[i-1]*10+arr[i];
			
			if(10<=x && x<=26) {
				dp[i]+=dp[i-2];
			}
			
			dp[i]%=1000000;
			
		}
		
		System.out.println(dp[len]%1000000);
	}

}
