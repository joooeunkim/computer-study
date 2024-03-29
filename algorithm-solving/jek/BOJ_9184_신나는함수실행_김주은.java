//풀이 시간 : 50분
//핵심 풀이 내용 : 문제 조건을 구현한 뒤 메모이제이션으로 중복을 줄일 수 있는 내용을 줄인다.
//회고 : 어떤 곳에서 메모이제이션을 넣을 수 있는지 잘 확인해야 함

import java.util.*;
import java.io.*;

public class Main_BJ_9184_신나는함수실행_김주은 {

	static int[][][] dp = new int[21][21][21];

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while (true) {

			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			if (a == -1 && b == -1 && c == -1) {
				return;
			}

			System.out.println("w("+a+", "+b+", "+c+") = "+w(a,b,c));
		}

	}

	private static int w(int a, int b, int c) {

		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		} else if (a > 20 || b > 20 || c > 20) {
			return w(20, 20, 20);
		} 
		
		if(dp[a][b][c]==0) {
			if (a < b && b < c) {
				return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
			} else {
				return dp[a][b][c] =  w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
			}
		}
		
		return dp[a][b][c];

	}

}
