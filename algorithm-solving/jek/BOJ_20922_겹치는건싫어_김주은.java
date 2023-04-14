#풀이 시간 : 20분
#풀이 핵심 내용 : 투포인터 조건 잘 찾기
#회고 : 더 풀어보자

import java.io.*;
import java.util.*;

public class Main_BJ_20922_겹치는건싫어_김주은 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		int start = 0;
		int end = 0;
		int maxlen = 1;
		
		while(end<N) {
			
			int v = map.getOrDefault(arr[end], 0);
			if(v<K) {
				map.put(arr[end], v+1);
				end+=1;
			} else if(v==K){
				
				int p = map.get(arr[start]);
				if(p>1) {
					map.put(arr[start], p-1);
				} else if(p==1) {
					map.remove(arr[start]);
				}
				start+=1;
			}
			
			maxlen = Math.max(maxlen, end-start);
			
		}
		
		System.out.println(maxlen);
	}

}
