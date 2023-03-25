//풀이 시간 : 45분
//풀이 핵심 내용 : 구현
//회고 : 문제 조건을 잘 확인하고, 과정 예시를 먼저 본 후 구현할 것

import java.io.*;
import java.util.*;

public class Main_BJ_21610_마법사상어와비바라기_김주은 {

	static int[] dr = {0,-1,-1,-1,0,1,1,1};
	static int[] dc = {-1,-1,0,1,1,1,0,-1};
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N][N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		ArrayList<int[]> clouds = new ArrayList<>();
		clouds.add(new int[] {N-1,0});
		clouds.add(new int[] {N-1,1});
		clouds.add(new int[] {N-2,0});
		clouds.add(new int[] {N-2,1});
		
		for(int m=0;m<M;m++) {
			
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken())-1;
			int s = Integer.parseInt(st.nextToken());
			
			//1. 구름이 d방향으로 s칸 움직인다 && 2. 새로운 구름 위치에 물+1
			int size = clouds.size();
			for(int i=0;i<size;i++) {
				int[] v = clouds.get(i);
				
				int nr = (v[0]+dr[d]*s+N*s)%N;
				int nc = (v[1]+dc[d]*s+N*s)%N;
				
				clouds.set(i, new int[] {nr,nc});
				map[nr][nc]+=1;
			}
			
			
			//3. 비온 곳에 물복사버그 마법 시전
			int[][] map2 = new int[N][N];
			for(int i=0;i<size;i++) {
				int[] v = clouds.get(i);
				
				for(int dir=1;dir<8;dir+=2) {
					int nr = v[0]+dr[dir];
					int nc = v[1]+dc[dir];
					
					if(nr>=0 && nr<N && nc>=0 && nc<N && map[nr][nc]>0) {
						map2[v[0]][v[1]]+=1;
					}
				}
			}
			boolean[][] visited = new boolean[N][N];
			for(int i=0;i<size;i++) {
				int[] v = clouds.get(i);
				map[v[0]][v[1]]+=map2[v[0]][v[1]];
				visited[v[0]][v[1]]=true;
			}
			
			//4. 물이 2이상인 칸에 구름 생성되고 -2
			clouds.clear();
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(map[i][j]>=2 && !visited[i][j]) {
						map[i][j]-=2;
						clouds.add(new int[] {i,j});
					}
				}
			}
		}
		
		int answer = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				answer+=map[i][j];
			}
		}
		
		System.out.println(answer);
	}

}
