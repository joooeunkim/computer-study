//풀이 시간 : 1시간
//풀이 핵심 내용 : 그리디인데 union-find를 쓰면 빠른 것을 알아내기 어렵다
//회고 : 문제 해결을 위해 내가 적용할 수 잆는 자료구조를 총동원 할 것

import java.util.Scanner;

public class Main_BJ_10775_공항_김주은 {
	
	static int G, P;
	static int[] gate;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		G = sc.nextInt();
		P = sc.nextInt();
		
		gate = new int[G+1];
		for(int i=1;i<=G;i++) {
			gate[i]=i;
		}
		
		int count=0;
		
		for(int i=0;i<P;i++) {
			int n = sc.nextInt();
			int docking = find(n);
			if(docking==0) {
				break;
			}
			gate[docking] = find(docking-1);
			++count;
		}
		
		System.out.println(count);
		
	}

	private static int find(int n) {
		if(gate[n]==n) {
			return n;
		}
		return gate[n]=find(gate[n]);
	}

}
