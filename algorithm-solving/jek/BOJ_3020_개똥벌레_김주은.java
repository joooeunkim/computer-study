//풀이 시간 : 1시간 40분
//풀이 핵심 내용 : 자료의 수가 많은 것을 고려하여 누적합을 적절히 이용해서 풀이해야한다
//회고 : 누적합을 어떻게 사용해야하는지 판단하는 것이 어렵다.

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main_BJ_3020_개똥벌레_김주은 {
	
	static int N, H;
	static int[] down, up;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		H = sc.nextInt();
		
		down = new int[H+2];
		up = new int[H+2];
		
		for(int i=0;i<N/2;i++) {
			down[sc.nextInt()]++;
			up[H-sc.nextInt()+1]++;
		}
		
		for(int i=1;i<=H;i++) {
			down[i]+=down[i-1];
		}
		for(int i=H;i>=1;i--) {
			up[i]+=up[i+1];
		}
		
		int min = N;
		int cnt = 0;
		
		for(int i=1;i<=H;i++) {
			int obs = (down[H]-down[i-1])+(up[1]-up[i+1]);
			
			if(obs<min) {
				min = obs;
				cnt = 1;
			} else if(obs == min) {
				cnt++;
			}
		}
		
		
		System.out.println(min+" "+cnt);
	}
}


}
