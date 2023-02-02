//풀이 시간 :35분
//문제 핵심 내용 : bfs 문제
//회고 : bfs 기본 문제 연습 배열 형태로 값을 넣어 문제를 풀었다.


from collections import deque

def bfs(s):
    visited = [0] * (n+1)
    queue = deque([s])
    visited[s] = 1
    sol = s
    while queue:
        c = queue.popleft()
        if visited[sol] < visited[c] or visited[sol] == visited[c] and sol < c:
            sol = c

        for j in range(1, 101):
            if arr[c][j] and visited[j] == 0:
                queue.append(j)
                visited[j] = visited[c] +1

    return sol
T = 1
for tc in range(1, T+1):
    n, m = map(int, input().split())
    lst = list(map(int, input().split()))
    arr = [[0]*101 for _ in range(101)]

    for i in range(0,len(lst),2):
        arr[lst[i]][lst[i+1]] = 1
    ans = bfs(m)
    print(f'#{tc} {ans}')
