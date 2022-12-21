//풀이 시간 : 40분
//문제 핵심 내용 : 최소 생산 비용을 찾는 백트래킹 문제
//회고 : 난이도가 낮은 dfs, bfs 문제를 많이 풀면서 문제 감 익히기!


def dfs(ni,total):
    global min_v

    if total > min_v:
        return

    if ni == N:
        if min_v > total:
            min_v = total
        return

    for nj in range(N):
        if not visited[nj]:
            visited[nj] = 1
            dfs(ni+1, total+arr[ni][nj])
            visited[nj] = 0

T = int(input())
for tc in range(1, T+1):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    visited = [0] * N
    min_v = 9999999999999999

    dfs(0,0)

    print(f'#{tc} {min_v}')