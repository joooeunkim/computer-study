//풀이 시간 : 20분
//풀이 핵심 내용 : 회의시작 시간 기준으로 오름차순 정렬한 뒤 회의가 끝나는 시간을 비교하여 그리디를 적용한다
//회고 : 한번에 그리디로 접근할 수 있는 이유를 좀더 생각해야 한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_BJ_1931_회의실배정_김주은 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] times = new int[N][2];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			times[i][0] = Integer.parseInt(st.nextToken());
			times[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(times, (o1, o2)->{
			if(o1[0]==o2[0]) {
				return o1[1]-o2[1];
			} else {
				return o1[0]-o2[0];
			}
		});
		
		int cnt=1;
		int end = times[0][1];
		
		for(int i=1;i<N;i++) {
			if(times[i][1]<end) {
				end = times[i][1];
			}
			else if(times[i][0]>=end) {
				end = times[i][1];
				++cnt;
			}
		}
		
		System.out.println(cnt);
	}

}
