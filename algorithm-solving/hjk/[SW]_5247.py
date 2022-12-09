//풀이 시간 : 25분
//문제 핵심 내용 : bfs 문제인데 run time error가 발생해 deque와 set으로 걸리는 시간을 줄였다.
//회고 : 난이도가 낮은 dfs, bfs 문제를 많이 풀면서 문제 감 익히기!




from collections import deque # deque 사용으로 runtime 에러 방지

def bfs(n):
    q = deque()
    q.append((n, 0))
    visited = set() # set으로 중복 방지
    visited.add(n)
    while q:
        c, cnt = q.popleft()
        for n_v in (c + 1, c - 1, c * 2, c - 10):
            if n_v <= 1000000 and n_v not in visited:
                visited.add(n_v)
                q.append((n_v, cnt + 1))
                if n_v == M:
                    return cnt + 1


for test in range(1, int(input()) + 1):
    N, M = map(int, input().split())
    print(f'#{test} {bfs(N)}')