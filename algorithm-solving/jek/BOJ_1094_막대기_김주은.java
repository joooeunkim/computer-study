//풀이 시간 : 15분
//문제 핵심 내용 : 비트마스킹에 대한 개념이 있다면 쉽게 풀 수 있다
//회고 : 비트마스킹 후 어떤 수와 비교해야하는지 더 빨리 생각해냈다면 더 빨리 풀 수 있었다.

public class Main_BJ_1094_막대기_김주은 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int cnt=0;
		
		for(int i=0;i<7;i++) {
			if((N & (1<<i)) == (1<<i)) {
				++cnt;
			}
		}
		
		System.out.println(cnt);
	}

}
