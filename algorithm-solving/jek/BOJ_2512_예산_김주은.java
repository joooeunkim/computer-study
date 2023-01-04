//풀이 시간 : 45분
//풀이 핵심 내용 : 이분 탐색을 통해 값을 찾는다면 전체 탐색보다 효율적이다.
//회고 : 이분 탐색을 어떻게 적용하는지가 어려운 부분이었다. 다른 문제들 통해서 전체 탐색 중 이분탐색이 가능한지 확인 해봐야겠다.

import java.io.*;
import java.util.*;

public class Main_BJ_2512_예산_김주은 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
    int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		int max = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(arr[i], max);
		}
		
		int M = Integer.parseInt(br.readLine());
		int start = 1;
		int end = max;
		
		while(start<=end) {
		
			int mid = (start+end)/2;
			
			int val = 0;
			for(int i=0;i<N;i++) {
				if(mid<arr[i]) {
					val+=mid;
				} else {
					val+=arr[i];
				}
			}
			
			if(val>M) {
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		
		System.out.println(end);
	}

}
