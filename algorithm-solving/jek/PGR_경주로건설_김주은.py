# 풀이 시간 : 2시간
# 풀이 핵심 내용 : 3차원 배열을 통한 dp
# 회고 : 꺾이면서 값이 변할 수 있을 때, 3차원 배열을 통해 방향별 값을 기록하면 틀리지다않을 수 있다

from collections import deque

#우, 하, 좌, 상
dr = [0,1,0,-1]
dc = [1,0,-1,0]
minScore = 987654321

def solution(board):
    
    global N, visited
    N = len(board[0])
    dp = [[[987654321 for _ in range(N)] for _ in range(N)] for _ in range(4)]
    q = deque()

    q.append([0,0,0,None])

    while q:
        
        x, y, score, dirs = q.popleft()

        for d in range(4):
            nr = x+dr[d]
            nc = y+dc[d]
            
            adds = score
            if dirs==None or dirs==d:
                adds+=100
            else:
                adds+=600
        
            if nr<0 or nr>=N or nc<0 or nc>=N or board[nr][nc]==1:
                continue
                
            if dirs==None or dp[d][nr][nc]>adds:
                dp[d][nr][nc]=adds
                q.append([nr,nc,adds,d])
                
        
    answer = dp[0][N-1][N-1]
    for i in range(1,4):
        if answer>dp[i][N-1][N-1]:
            answer = dp[i][N-1][N-1]

    return answer
