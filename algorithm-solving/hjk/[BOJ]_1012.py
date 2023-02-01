//풀이 시간 : 60분
//문제 핵심 내용 : dfs/bfs 문제
//회고 : dfs로 푸니까 런타임에러가 떴는데 setrecursionlimit으로 해결!




import sys
sys.setrecursionlimit(10000)

T = int(input())
for i in range(T):
    m, n, k = map(int, sys.stdin.readline().strip().split())
    arr = [[0]*m for _ in range(n)]
    for j in range(k):
        y,x = map(int, input().split())
        arr[x][y] = 1

    def dfs(x,y):
        if x <= -1 or x >= n or y <= -1 or y >= m:
            return False
        if arr[x][y] == 1:
            arr[x][y] = 0
            dfs(x-1, y)
            dfs(x, y-1)
            dfs(x+1, y)
            dfs(x, y+1)
            return True
        return False

    res = 0
    for a in range(n):
        for b in range(m):
            if dfs(a,b) == True:
                res += 1

    print(res)

