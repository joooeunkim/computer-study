//풀이 시간 : 20분
//풀이 핵심 내용 : 비트마스킹으로 26개의 알파벳을 처리하면 int내에서 모두 처리 가능하다
//회고 : 가능한 부분에 대해서는 배열 말고 비트마스킹을 사용하면 편리할 수 있다.

import java.io.*;
import java.util.*;

public class Main_BJ_18119_단어암기_김주은 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] words = new int[N];
		
		int total=0;
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			int num=0;
			for(int j=0;j<s.length();j++) {
				num|=1<<(s.charAt(j)-'a');
				total|=1<<(s.charAt(j)-'a');
			}
			words[i]=num;
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int o = Integer.parseInt(st.nextToken());
			char x = st.nextToken().charAt(0);
			int cnt=0;
			
			if(o==1) {//잊기
				total &= ~(1<<x-'a');
			} else {//기억하기
				total |= (1<<x-'a');
			}
			
			for(int j=0;j<N;j++) {
				if((total & words[j]) == words[j]) {
					++cnt;
				}
			}
			sb.append(cnt).append("\n");
		}
		
		System.out.println(sb);
	}

}
