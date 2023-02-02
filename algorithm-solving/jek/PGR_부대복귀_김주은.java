//풀이 시간 : 20분
//풀이 핵심 내용 : bfs로 탐색하며 최단거리 발견하기
//회고 : array.length 속성을 


import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        int[] answer = new int[sources.length];
        
        ArrayList<Integer>[] list = new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            list[i]=new ArrayList<>();
        }
        
        for(int i=0;i<roads.length;i++){
            list[roads[i][0]].add(roads[i][1]);
            list[roads[i][1]].add(roads[i][0]);
        }
        
        Queue<int[]> queue;
        boolean[] visited;
        boolean canEnd;
        
        for(int i=0;i<sources.length;i++){
            
            canEnd=false;
            
            //bfs
            visited = new boolean[n+1];
            queue = new ArrayDeque<int[]>();
            queue.add(new int[]{sources[i],0});
            visited[sources[i]]=true;
            
            while(!queue.isEmpty()){
                int[] v = queue.poll();
                
                if(v[0]==destination){
                    answer[i]=v[1];
                    canEnd=true;
                    break;
                }
                
                for(int t=0;t<list[v[0]].size();t++){
                    int val = list[v[0]].get(t);
                    if(!visited[val]){
                        visited[val]=true;
                        queue.add(new int[]{val,v[1]+1});
                    }
                }
            }
            
            if(!canEnd){
                answer[i]=-1;
            }
            
        }
        
        return answer;
    }
}
