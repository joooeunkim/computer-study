//풀이 시간 : 20분
//풀이 핵심 내용 : greedy문제지만 정말 최소값을 찾기 위해 여러 최솟값을 비교하였다
//회고 : greedy문제는 정말 최솟값을 구하기 위해 필요한 조건을 찾아야만한다

import java.io.*;
import java.util.*;

public class Main_BJ_1049_기타줄_김주은 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] price = new int[M][2];
		
		int min_set = 1000;
		int min_one = 1000;
		
		for(int m=0;m<M;m++) {
			st = new StringTokenizer(br.readLine());
			price[m][0] = Integer.parseInt(st.nextToken());
			price[m][1] = Integer.parseInt(st.nextToken());
		
			min_set = Math.min(min_set, price[m][0]);
			min_one = Math.min(min_one, price[m][1]);
		}
		
		int q = N/6;
		int d = N%6;
		int set = (d>0)?q+1:q;
		int mix = q*min_set + d*min_one;
		
		System.out.println(Math.min(Math.min(set*min_set, N*min_one),mix));
		
	}

}
