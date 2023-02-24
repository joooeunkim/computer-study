# 풀이 시간 : 1시간30분
# 풀이 핵심 내용 : dfs 탐색을 통해 섬에 지낼 수 있는 일수의 총합을 구하는 간단한 문제
# 회고 : python에서 전역 지역변수 초기화에 대한 미숙, 최대 재귀 횟수를 늘려주어야하는 문제

import sys
sys.setrecursionlimit(10**5)
dr = [0,1,0,-1]
dc = [1,0,-1,0]

def solution(maps):
    global R
    R = len(maps)
    global C
    C = len(maps[0])
    
    global map
    map = []
    for str in maps:
        arr = []
        for i in str:
            if i=='X':
                arr.append(-1)
            else:
                arr.append(int(i))
        map.append(arr)
    
    global visited
    visited = [[False for _ in range(C)] for _ in range(R)]
    
    answers = []
    for i in range(R):
        for j in range(C):
            if map[i][j]>0 and visited[i][j]==False:
                visited[i][j]=True
                answers.append(dfs(i,j))
                
    if answers:                
        return sorted(answers)
    else:
        return [-1]
    
    
def dfs(i,j):
    sums = map[i][j]
    for d in range(4):
        nr=i+dr[d]
        nc=j+dc[d]
        if nr<0 or nr>=R or nc<0 or nc>=C or visited[nr][nc] or map[nr][nc]<0:
            continue
        
        visited[nr][nc]=True
        sums+=dfs(nr,nc)

    return sums
