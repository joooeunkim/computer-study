//풀이 시간 : 30분
//풀이 핵심 내용 : 슬라이딩 윈도우를 이용, N==M일 때 조건 처리가 필수이고 생각할 수 있어야 한다
//회고 : 조건 처리에 대해서 힌트를 얻었다

import java.io.*;
import java.util.*;

public class Main_BJ_13422_도둑_김주은 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int Tc = Integer.parseInt(br.readLine());
		for(int tc=0;tc<Tc;tc++) {
			
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			int[] house = new int[N];
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				house[i]=Integer.parseInt(st.nextToken());
			}
			
			int start=0;
			int sum = 0;
			for(int i=start;i<start+M;i++) {
				sum+=house[i%N];
			}
			if(N==M && sum<K) {
				sb.append(1).append("\n");
				continue;
			}
			int ans=0;
			while(start<N) {
				sum-=house[start%N];
				sum+=house[(start+M)%N];
				if(sum<K) {
					++ans;
				}
				++start;
			}
			
			sb.append(ans).append("\n");
		}
		System.out.println(sb);
	}

}

