# 풀이 시간 : 25분
# 풀이 핵심 내용 : 완전 탐색 및 백트래킹
# 회고 : 백트래킹을 적절히 이용할 것

K=0
Dungeons = []
visited = []
L = 0
MAX = 0

def solution(k, dungeons):
    global K, Dungeons, L, visited
    K=k
    Dungeons=dungeons
    L=len(dungeons)
    visited=[False]*L
    
    dfs(0, k)
    
    return MAX
    
    
def dfs(cnt, currK):
    
    global MAX
    
    if MAX<cnt:
        MAX=cnt
    
    for i in range(L):
        if not visited[i] and Dungeons[i][0]<=currK:
            visited[i]=True
            dfs(cnt+1,currK-Dungeons[i][1])
            visited[i]=False
