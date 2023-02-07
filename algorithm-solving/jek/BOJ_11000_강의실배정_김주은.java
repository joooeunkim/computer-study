//풀이 시간 : 80분
//풀이 핵심 내용 : 시간 복잡도를 줄이기 위해서, 큐에 다시 넣는 것이 아니라 새로운 우선순위 큐를 활용하는 방법을 선택해야했다.
//회고 : 시간복잡도를 줄이기 위해, 우선순위 큐를 하나 더 추가 하여 끝 점을 관리하므로 완전 탐색되는 부분을 크게 줄일 수 있다.


import java.io.*;
import java.util.*;

public class Main_BJ_11000_강의실배정_김주은 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
			if (o1[0] == o2[0]) {
				return o1[1] - o2[1];
			} else {
				return o1[0] - o2[0];
			}
		});
		
		PriorityQueue<Integer> endTime = new PriorityQueue<>();

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			pq.add(new int[] {s,e});
		}
		
		int cnt=0;
		while(!pq.isEmpty()) {
			int[] v = pq.poll();
			
			if(endTime.isEmpty()) {
				endTime.add(v[1]);
			} else {
				if(endTime.peek()<=v[0]) {
					endTime.poll();
					endTime.add(v[1]);
				} else {
					endTime.add(v[1]);
				}
			}
		}
		
		System.out.println(endTime.size());

	}

}
