//풀이 시간 : 45분
//문제 핵심 내용 : 4방향으로 방 탐색하는 문제
//회고 : bfs로 풀었는데 dfs로도 풀어보기!


def bfs(si, sj):
    q = []
    s = []

    q.append((si, sj))
    visited[si][sj] = 1
    s.append(arr[si][sj])

    while q:
        ci, cj = q.pop(0)
        for di, dj in ((-1, 0), (1,0), (0,-1), (0,1)):
            ni, nj = ci + di, cj+ dj
            if 0 <= ni < N and 0<= nj < N and visited[ni][nj] == 0 and \
                    abs(arr[ci][cj]-arr[ni][nj]) == 1 :
                q.append((ni,nj))
                visited[ni][nj] = 1
                s.append(arr[ni][nj])

    return min(s), len(s)

T = int(input())
for tc in range(1, T+1):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    visited = [[0]*N for _ in range(N)]
    num = 12345678
    cnt = 0

    for i in range(N):
        for j in range(N):
            if visited[i][j] == 0:
                tnum, tcnt = bfs(i, j)
                if cnt < tcnt or cnt == tcnt and num > tnum:
                    cnt = tcnt
                    num = tnum
    print(f'#{tc} {num} {cnt}')
