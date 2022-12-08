//풀이 시간 : 30분
//문제 핵심 내용 : 백트래킹 문제
//회고 : 난이도가 낮은 dfs, bfs 문제를 많이 풀면서 익숙해지기!




def dfs(n, cnt):
    global result
    if result <= cnt:
        return
    if n == N-1:
        result = min(result, cnt)
        return
    for i in range(1, charging[n] + 1):
        dfs(n+i, cnt+1)

T = int(input())
for tc in range(1, T+1):
    lst = list(map(int, input().split()))
    N = lst[0]
    charging = lst[1:]
    result = 123456789
    dfs(0, -1)

    print(f'#{tc} {result}')