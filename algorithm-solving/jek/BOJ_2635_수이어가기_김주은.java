//풀이 시간: 10분
//풀이 핵심 내용 : 문제를 잘 이해하여 완전 탐색으로 해결한다.
//회고 : 음수가 된다는 조건에서 0을 포함해서 오래걸렸다
import java.io.*;
import java.util.*;

public class Main_BJ_2635_수이어가기_김주은 {

	public static void main(String[] args) throws Exception {

		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		int max_i = 0;
		
		for (int i = 1; i <= N; i++) {
			int a = N;
			int b = i;
			int cnt = 2;
			while (a - b >= 0) {
				++cnt;
				int na = b;
				int nb = a - b;
				a = na;
				b = nb;
			}
			if (cnt > max) {
				max = cnt;
				max_i = i;
			}

		}

		sb.append(max).append("\n");
		sb.append(N).append(" ").append(max_i).append(" ");

		int x = N;
		int y = max_i;
		while (x - y >= 0) {
			int nx = y;
			int ny = x - y;
			sb.append(ny).append(" ");
			x = nx;
			y = ny;
		}
		
		System.out.println(sb);
		sc.close();
	}

}
