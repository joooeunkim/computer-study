//풀이 시간 : 1시간
//풀이 핵심 내용 : bfs에서 방문한 곳을 체크하지 않으면 메모리 초과가 날 수 있다는 사실을 기억할 것
//회고 : 미로 탈출 처럼 길을 찾는 것 같아 보여도 이또한 확장되어가는 bfs기에 방문체크를 해야한다


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_BJ_5427_불_김주은 {
	
	static int[] dr = {0,1,0,-1};
	static int[] dc = {1,0,-1,0};
	
	static char[][] room;
	static LinkedList<int[]> fire = new LinkedList<>();
	static LinkedList<int[]> sangeun = new LinkedList<>();
	static boolean[][] visited;
	
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t=0;t<T;t++) {
			
			st = new StringTokenizer(br.readLine());
			int W = Integer.parseInt(st.nextToken());
			int H = Integer.parseInt(st.nextToken());
			
			room = new char[H][W];
			visited = new boolean[H][W];
			
			fire.clear();
			sangeun.clear();
			
			for(int i=0;i<H;i++) {
				String s = br.readLine();
				for(int j=0;j<W;j++) {
					room[i][j] = s.charAt(j);
					if(room[i][j]=='@') {
						sangeun.add(new int[] {i,j});
						visited[i][j]=true;
						room[i][j]='.';
					} else if(room[i][j]=='*') {
						fire.add(new int[] {i,j});
					}
				}
			}
			
			int time=0;
			
			A : while(true) {
				
				if(!fire.isEmpty()) {
					int s = fire.size();
					while(s-->0) {
						int[] v = fire.poll();
						
						for(int d=0;d<4;d++) {
							int nr = v[0]+dr[d];
							int nc = v[1]+dc[d];
							
							if(nr<0 || nr>=H || nc<0 || nc>=W || room[nr][nc]=='#' || room[nr][nc]=='*') {
								continue;
							}
							
							room[nr][nc]='*';
							fire.add(new int[] {nr,nc});
						}
					}
				}
				
				if(sangeun.isEmpty()) {
					sb.append("IMPOSSIBLE\n");
					break;
				}
				
				int s = sangeun.size();
				while(s-->0) {
					int[] v = sangeun.poll();
					
					for(int d=0;d<4;d++) {
						int nr = v[0]+dr[d];
						int nc = v[1]+dc[d];
						
						if(nr<0 || nr>=H || nc<0 || nc>=W) {
							sb.append(time+1).append("\n");
							break A;
						}
						
						if(room[nr][nc]=='#' || room[nr][nc]=='*' || visited[nr][nc]) {
							continue;
						}
						
						visited[nr][nc]=true;
						sangeun.add(new int[] {nr,nc});
					}
				}

				++time;
				
			}
		}
		
		System.out.println(sb);
	}

}
