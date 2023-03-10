//풀이 시간 : 1시간 30분
//풀이 핵심 내용 : 어떤 자료구조인지 파악을 하지 못했다. 그리디로 가장 구간이 긴 길이를 K번 제외한 나머지 합
//회고 : 문제를 제대로 이해하지 못한 채 풀이했다. 예제로 풀이 논리가 맞는지 확인하고 개발 시작할 것

import java.io.*;
import java.util.*;

public class Main_BJ_2212_센서_김주은 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());

		int[] sensor = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			sensor[i] = Integer.parseInt(st.nextToken());
			
		}

		Arrays.sort(sensor);
		
		int[] dist = new int[N-1];
		for(int i=1;i<N;i++) {
			dist[i-1] = sensor[i]-sensor[i-1];
		}
		
		Arrays.sort(dist);
		
		int sum = 0;
		for(int i=0;i<N-K;i++) {
			sum +=dist[i];
		}
		
		System.out.println(sum);
		
		
		
		
	}

}
