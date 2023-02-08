//풀이 시간 : 30분
//풀이 핵심 내용 : 슬라이딩 윈도우 개념을 적용하여 a의 갯수만큼의 일렬에서 b의 갯수가 최소일 때를 찾아낸다
//회고 : 슬라이딩 윈도우 개념에 대해 더 익숙해져야한다.

import java.util.Scanner;

public class Main_BJ_1522_문자열_김주은 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int L = s.length();
		
		int aCnt=0;
		for(int i=0;i<L;i++) {
			if(s.charAt(i)=='a') {
				++aCnt;
			}
		}
		
		int min = L;
		
		for(int i=0;i<L;i++) {
			int cnt=0;
			for(int j=0;j<aCnt;j++) {
				if(s.charAt((i+j)%L)=='b') {
					++cnt;
				}
			}
			min = Math.min(min, cnt);
		}
		
		System.out.println(min);
	}

}
