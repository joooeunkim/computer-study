//풀이 시간 : 1시간 40분
//풀이 핵심 내용 : 완전 탐색, 백트래킹으로 최소 경로 구하기
//회고 : 더 여러 가지 풀이가 있을 수 있다

import java.io.*;
import java.util.*;

public class Main_BJ_4991_로봇청소기_김주은 {
	
	static int W,H;
	static char[][] map;
	static int[] dirts;
	static int dirtCnt;
	static int min;
	static boolean[] visited;
	static boolean clean;
	
	static int[][] dist;
	static int[] distToRobot;
	
	static boolean[][] visited2;
	static Queue<int[]> queue = new ArrayDeque<>();
	
	static int[] dr = {0,1,0,-1};
	static int[] dc = {1,0,-1,0};

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());
			
			if(W==0 && H==0) break;
			
			int rx=-1,ry=-1;
			
			map = new char[H][W];
			dirts = new int[10];
			dirtCnt=0;
			
			min= Integer.MAX_VALUE;
			clean=true;
			
			for(int i=0;i<H;i++) {
				String s = br.readLine();
				for(int j=0;j<W;j++) {
					map[i][j] = s.charAt(j);
					if(map[i][j]=='o') {
						rx=i;
						ry=j;
						map[i][j]='.';
					}
					else if(map[i][j]=='*') {
						dirts[dirtCnt++]=i*W+j;
					}
				}
			}
			
			dist = new int[dirtCnt][dirtCnt];
			distToRobot = new int[dirtCnt];
			
			for(int i=0;i<dirtCnt;i++) {
				for(int j=i+1;j<dirtCnt;j++) {
					dist[i][j] = dist[j][i] = getDist(dirts[i]/W,dirts[i]%W,dirts[j]/W, dirts[j]%W);
					if(dist[i][j]==-1) {
						clean=false;
						break;
					}
				}
				distToRobot[i] = getDist(rx,ry,dirts[i]/W,dirts[i]%W);
			}
			
			if(!clean) {
				sb.append(-1+"\n");
				continue;
			}
			
			visited = new boolean[dirtCnt];
			dfs(0,-1,0);
			sb.append(min+"\n");
			
		}
		
		System.out.println(sb);
	}

	private static void dfs(int cnt, int idx, int sum) {
		
		if(sum>min) {
			return;
		}

		if(cnt==dirtCnt) {
			min = Math.min(min, sum);
			return;
		}
		
		for(int i=0;i<dirtCnt;i++) {
			if(!visited[i]) {
				visited[i]=true;
				if(idx<0) {
					dfs(cnt+1,i,sum+distToRobot[i]);
				} else {
					dfs(cnt+1,i,sum+dist[idx][i]);
				}
				visited[i]=false;
			}
		}
	}

	private static int getDist(int rx, int ry, int dx, int dy) {
		
		//rx,ry에서 dx,dy까지 최단경로 탐색
		visited2 = new boolean[H][W];
		queue.clear();
		visited2[rx][ry]=true;
		queue.add(new int[] {rx,ry,0});
		
		while(!queue.isEmpty()) {
			
			int[] v = queue.poll();
			
			for(int d=0;d<4;d++) {
				
				int nr = v[0]+dr[d];
				int nc = v[1]+dc[d];
				
				if(nr<0 || nr>=H || nc<0 || nc>=W || visited2[nr][nc] || map[nr][nc]=='x') {
					continue;
				}
				
				visited2[nr][nc]=true;
				if(nr==dx && nc==dy) {
					return v[2]+1;
				}
				queue.add(new int[] {nr,nc,v[2]+1});
			}
		}
		
		return -1;
	}

}
