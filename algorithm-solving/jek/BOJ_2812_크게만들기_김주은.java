# 풀이 시간 : 1시간
# 풀이 핵심 내용 : stack을 이용한 풀이
# 회고 : 전체를 탐색하니 시간초과

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main_BJ_2812_크게만들기_김주은 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int cnt = N-K;
		
		String n = br.readLine();
		
		ArrayDeque<Integer> stack = new ArrayDeque();
		stack.offer(n.charAt(0)-'0');
		
		
		for(int i=1;i<N;i++) {
			int v = n.charAt(i)-'0';
			
			while(!stack.isEmpty() && stack.peekLast()<v && K>0) {
				stack.pollLast();
				K--;
			}
			stack.offer(v);
			
		}
		
		while(cnt-->0) {
			sb.append(stack.pollFirst());
		}
		
		System.out.println(sb);
	}

}
