//풀이 시간 : 25분
//문제 핵심 내용 : dfs를 이용해 푸는 문제
//회고 : 다양한 dfs, bfs 문제 풀기!

def dfs(n, ci, cj, num):
    if n == 7:
        sset.add(num)
        return

    for di, dj in ((-1,0),(1,0),(0,-1),(0,1)):
        ni = ci + di
        nj = cj + dj
        if 0<= ni < 4 and 0 <= nj < 4:
            dfs(n+1, ni, nj, num*10+arr[ni][nj])



T = int(input())
for tc in range(1, T+1):
    arr = [list(map(int, input().split())) for _ in range(4)]
    sset = set()
    for i in range(4):
        for j in range(4):
            dfs(0, i, j, 0)

    print(f'#{tc} {len(sset)}')