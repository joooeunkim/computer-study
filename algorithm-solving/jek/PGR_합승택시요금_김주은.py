#풀이 시간 : 30분
#풀이 핵심 내용 : 플로이드 와샬 또는 다익스트라를 통한 계산
#회고 : 처음에 dfs 완탐으로 시간이 오래걸렸다. 처음부터 시간 최소할 수 있는 방법 더 고민하고 코딩 시작 할것

def solution(n, s, a, b, fares):
    
    INF = 100001*n
    
    graph = [[INF for _ in range(n+1)] for _ in range(n+1)]
    
    for i in fares:
        x, y, dist = i
        graph[x][y]=graph[y][x]=dist
        
    for i in range(1,n+1):
        graph[i][i]=0
        
    for k in range(1,n+1):
        for i in range(1,n+1):
            for j in range(1,n+1):
                graph[i][j] = min(graph[i][j], graph[i][k]+graph[k][j])
    
    answer = graph[s][a] + graph[s][b]
    
    for i in range(1,n+1):
        if i==s:
            continue
            
        ss = graph[s][i]+graph[i][a]+graph[i][b]
        
        if ss<answer:
            answer = ss
        
    
    return answer
        
