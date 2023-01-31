//풀이 시간 : 2시간
//풀이 핵심 내용 : 조합으로 7개의 갯수를 추출 후 내부적으로 연결되어있는지 확인
//회고 : 배열을 매번 탐색하는 것보다 row*n+col 형식이 빠르고, Queue에서 LinkedList보다 ArrayDeque가 빠르다!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main_BJ_1941_소문난칠공주_김주은 {
	
	static int[] dr = {0,1,0,-1};
	static int[] dc = {1,0,-1,0};
	
	static char[][] map;
	static int[] sel = new int[7];
	static boolean[] visited;
	static int ans=0;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		map = new char[5][5];
		
		for(int i=0;i<5;i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		comb(0,0,0);
		
		System.out.println(ans);
	}

	private static void comb(int cnt, int start, int dasomCnt) {
		
		if(cnt-dasomCnt>3) return;

		if(cnt==7) {
			visited = new boolean[7];
			bfs(sel[0]/5,sel[0]%5);
			return;
		}
		
		for(int i=start;i<25;i++) {
			sel[cnt]=i;
			comb(cnt+1, i+1, map[i/5][i%5]=='S'?dasomCnt+1:dasomCnt);
		}
	}

	private static void bfs(int i, int j) {

		Queue<int[]> list = new ArrayDeque<>();
		
		int count=1;
		list.offer(new int[] {i, j});
		visited[0]=true;
		
		while(!list.isEmpty()) {
			int[] v = list.poll();

			for(int d=0;d<4;d++) {
				int nr = v[0]+dr[d];
				int nc = v[1]+dc[d];
				
				if(nr>=0 && nr<5 && nc>=0 && nc<5) {
					
					int nxt = nr*5+nc;
					for(int k=0;k<7;k++) {
						if(!visited[k] && sel[k]==nxt) {
							visited[k]=true;
							list.offer(new int[] {nr,nc});
							++count;
						}
					}

				}
			}
			
		}

		if(count==7) ++ans;
		
	}

}
