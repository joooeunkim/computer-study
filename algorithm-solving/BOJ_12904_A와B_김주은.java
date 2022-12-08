//풀이 시간 : 30분
//문제 핵심 내용 :  핵심은 문자열 마지막에 A 또는 B로 명확히 구별되므로 T에서 하나씩 제거해나가며 S를 찾아나가는 하나의 경로가 있다는 사실을 깨닫는 것이다.
//회고 : 처음에는 S에서 T로 2가지의 경우를 완전 탐색하며 풀이하니 시간초과가 났다. 그리디 문제라는 것을 한번에 판별해서 풀이하기 어려운 것 같다.

import java.util.Scanner;

public class Main_BJ_12904_A와B_김주은 {
	
	static String S,T;
	static int sl,tl;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		
		int sl = S.length();
		int tl = T.length();
		
		for(int t=tl;t>sl;t--) {
			if(T.charAt(t-1)=='A') {
				T = T.substring(0, t-1);
			} else if(T.charAt(t-1)=='B') {
				T = T.substring(0, t-1);
				String reverse_T = "";
				for(int i=T.length()-1;i>=0;i--) {
					reverse_T += T.charAt(i);
				}
				T = reverse_T;
			}
		}

		if(T.equals(S)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	
	}

}
