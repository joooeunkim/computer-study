//풀이 시간: 15분
//풀이 핵심 내용 : greedy를 적용하여 왼쪽위에서 부터 오른쪽, 아래로 탐색하며 검색할 것
//회고 : 배열을 탐색하는 과정으로 간단히 구할 수 있었고, -1를 출력해내기 위한 탐색 변수 조정요필요

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BJ_1080_행렬_김주은 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] a = new int[N][M];
		int[][] b = new int[N][M];
		
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			for(int j=0;j<M;j++) {
				a[i][j] = s.charAt(j)-'0';
			}
		}
		
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			for(int j=0;j<M;j++) {
				b[i][j] = s.charAt(j)-'0';
			}
		}
		
		int cnt=0;
		
		for(int i=0;i<N-2;i++) {
			for(int j=0;j<M-2;j++) {
				if(a[i][j]!=b[i][j]) {
					++cnt;
					for(int x=i;x<i+3;x++) {
						for(int y=j;y<j+3;y++) {
							a[x][y]=a[x][y]^1;
						}
					}
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(a[i][j]!=b[i][j]) {
					System.out.println(-1);
					return;
				}
			}
		}
		
		System.out.println(cnt);
		
	}

}
