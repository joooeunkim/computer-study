//풀이 시간 : 35분
//문제 핵심 내용 : dfs를 이용해 푸는 문제
//회고 : 다양한 dfs, bfs 문제 풀기!


def dfs(n,y, total):
    global result
    if total > result:
        return
    if n == N:
        total += arr[y][0]
        if total < result:
            result = total
            return

    for ni in range(1, N):
        if arr[y][ni] != 0 and visited[ni] == 0 :
            visited[ni] = 1
            dfs(n+1, ni, total+arr[y][ni])
            visited[ni] = 0



T = int(input())
for tc in range(1, T+1):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    visited = [0]*N
    result = 12345678
    dfs(1, 0, 0)

    print(f'#{tc} {result}')
