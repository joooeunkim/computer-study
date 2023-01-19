//풀이 시간: 30분
//풀이 핵심 내용 : 누적합을 이용해서 구간당 틀린 횟수를 알 수 있도록 해야한다
//회고 : 누적합 문제를 좀더 많이 풀어봐야할것 같다.

import java.io.*;
import java.util.*;

public class Main_BJ_21318_피아노체조_김주은 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());//악보 갯수
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N+1]; //악보 난이도
		for(int i=1;i<=N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] miss = new int[N+1];
		for(int i=1;i<N;i++) {
			if(arr[i]>arr[i+1]) {
				if(i==1) {
					miss[i]=1;
				}else {
					miss[i]=miss[i-1]+1;
				}
			}else {
				miss[i]=miss[i-1];
			}
		}
		if(N>=3) {
			miss[N] = miss[N-1];
		}

		int Q = Integer.parseInt(br.readLine());
		for(int i=0;i<Q;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int ans = miss[y]-miss[x-1];
			if(miss[y]>miss[y-1]) {
				ans-=1;
			}
			
			sb.append(ans).append("\n");
		}
		
		System.out.println(sb);
	}

}
