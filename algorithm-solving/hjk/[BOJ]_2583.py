//풀이 시간 : 50분
//문제 핵심 내용 : bfs로 영역을 구하는 문제
//회고 : bfs, dfs 문제 많이 풀어보기!

from collections import deque

dx=[1,-1,0,0]
dy=[0,0,1,-1]

m,n,k = map(int,input().split())
arr=[[0]*(n) for _ in range(m)]


for tc in range(k):
    a,b,c,d = map(int,input().split())
    for x in range(b,d):
        for y in range(a,c):
            arr[x][y]=1


dq=deque()
answer=[]
for i in range(m):
    for j in range(n):
        if arr[i][j]==0:
            dq.append((i,j))
            cnt=0
            while dq:
                cx,cy=dq.popleft()
                for i in range(4):
                    nx=cx+dx[i]
                    ny=cy+dy[i]
                    if 0<=nx<m and 0<=ny<n and arr[nx][ny]==0:
                        cnt+=1
                        arr[nx][ny]=2
                        dq.append((nx,ny))
            if cnt==0: answer.append(1)
            else: answer.append(cnt)

answer.sort()
print(len(answer))
for a in answer:
    print(a,end=' ')