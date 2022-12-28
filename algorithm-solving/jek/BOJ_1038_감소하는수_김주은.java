//풀이 시간 : 90분
//풀이 핵심 내용 : 최대 존재할 수 있는 감소하는 수는 9876543210이고, 총 감소하는 수의 갯수는 1022라는 것을 확인하여 백트래킹을 적용해야했다.
//회고 : 문제 조건을 잘 못 이해한 것이 시작, 문제의 최대 범위를 생각해보고 백트래킹을 적용하는 연습, 다양한 자료구조를 활용하는 연습을 해야한다. 

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_BJ_1038_감소하는수_김주은 {
	
	static int N;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		if(N<=10) {
			System.out.println(N);
		} else if(N>=1023) {
			System.out.println(-1);
		} else {
			Queue<Long> q = new LinkedList<>();
			int cnt=0;
			for(int i=0;i<10;i++) {
				q.add(new Long(i));
				cnt++;
			}
			while(cnt<N) {
				long k = q.poll();
				long temp = k%10;
				for(int i=0;i<temp;i++) {
					q.add(k*10+i);
					cnt++;
					if(cnt==N) {
						System.out.println(k*10+i);
						break;
					}
				}
			}
		}
		
		for(int i=0;i<10;i++) {
			dfs(i);
		}
		
	}

	private static void dfs(int i) {

		
	}

}
