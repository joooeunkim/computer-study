//풀이 시간 : 40분
//문제 핵심 내용 : 기본 bfs 풀이 방법을 사용하면 풀리는 문제
//회고 : dfs로 풀이할 때 런타임에러가 발생해 dfs 시간을 줄이는 방법도 고민해봐야겠다.


from collections import deque

def bfs(si, sj):

    q = deque()
    q.append((si, sj))
    lst[si][sj] = 1
    cnt = 1

    while q:
        ci, cj = q.popleft()
        for di, dj in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
            ni, nj = ci+di, cj+dj
            if 0 <= ni < M and 0 <= nj < N and not lst[ni][nj]:
                cnt += 1
                lst[ni][nj] = 1
                q.append((ni, nj))
    return cnt


M, N, K = map(int, input().split())
lst = [[0] * N for _ in range(M)]
for _ in range(K):
    a, b, c, d = map(int, input().split())
    for i in range(M-d, M-b):
        for j in range(a, c):
            lst[i][j] = 1

result = []
for i in range(M):
    for j in range(N):
        if not lst[i][j]:
            result.append(bfs(i, j))

result.sort()
print(len(result))
print(*result)