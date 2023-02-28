//풀이 시간 : 1시간 30분
//풀이 핵심 내용 : arraylist vs linkedlist 중에서 자료구조를 잘 선택할 것, 구현 실력
//회고 : 좀더 구현력이 필요한 부분이었다. 생각은 했지만, 이를 구현해내지 못했다

import java.io.*;
import java.util.*;

public class Main_BJ_1092_배_김주은 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> crane = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			crane.add(Integer.parseInt(st.nextToken()));
		}
		
		ArrayList<Integer> box = new ArrayList<>();
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			box.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(crane, Collections.reverseOrder());
		Collections.sort(box, Collections.reverseOrder());
		
		if(crane.get(0)<box.get(0)) {
			System.out.println(-1);
			return;
		}
		
		int time=0;
		while(!box.isEmpty()) {
			int idx = 0;
			for(int i=0;i<N;) {
				if(idx==box.size()) {
					break;
				} else if(crane.get(i)>=box.get(idx)) {
					box.remove(idx);
					i++;
				} else {
					idx++;
				}
			}
			++time;
		}
		
		System.out.println(time);
	}

}
