//풀이 시간 : ?? 오류 때문에 며칠..
//풀이 핵심 내용 : bfs를 통해 가까운 물고기 찾고 이동
//회고 : 아직까지도 왜 queue에 넣기 전에는 되는데, queue에서 빼서 확인하면 안되는지 모르겠다..

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_BJ_16236_아기상어_김주은2 {
	
	static int[] dr = {0,1,0,-1};
	static int[] dc = {1,0,-1,0};
	
	static int N;
	static int [][] map;
	static int sx=-1;
	static int sy=-1;
	static int size=2;
	static int eat=0;
	
	static int time=0;
	
	static Queue<int[]> queue = new ArrayDeque<>();
	static boolean[][] visited;

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
				
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
				if(map[i][j]==9) {
					map[i][j]=0;
					sx=i;
					sy=j;
				}
			}
		}
		
		while(true) {
			
			//다음으로 잡아먹을 물고기 탐색
			int nfx=-1;
			int nfy=-1;
			int ndist=Integer.MAX_VALUE;
			
			boolean canEat = false;
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(map[i][j]>0 && map[i][j]<size) {
						int dist = getDistance(i,j);
						if(dist>0 && ndist>dist) {
							nfx=i;
							nfy=j;
							ndist=dist;
							canEat=true;
						}
					}
				}
			}
			
			if(!canEat) { //잡아먹을 물고기가 없다
				break;
			}
			
			//물고기 잡아먹고 다음 위치로 이동
			time+=ndist;
			sx=nfx;
			sy=nfy;
			map[sx][sy]=0;
			++eat;
			if(eat==size) {
				eat=0;
				++size;
			}
			
		}
		
		System.out.println(time);
		
	}

	private static int getDistance(int i, int j) {
		
		queue.clear();
		visited = new boolean[N][N];
		queue.add(new int[] {i,j,0});
		visited[i][j]=true;
		
		while(!queue.isEmpty()) {
			int[] v = queue.poll();
			
//			if(v[0]==sx && v[1]==sy) {
//				return v[2];
//			}
			
			for(int d=0;d<4;d++) {
				int nr = v[0]+dr[d];
				int nc = v[1]+dc[d];
				
				if(nr<0 || nr>=N || nc<0 || nc>=N || visited[nr][nc] || map[nr][nc]>size) {
					continue;
				}
				
				//수정!
				if(nr==sx && nc==sy) {
					return v[2]+1;
				}
				
				visited[nr][nc]=true;
				queue.add(new int[] {nr,nc,v[2]+1});
			}
		}
		
		return -1;
	}

}
