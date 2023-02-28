//풀이 시간 : 30분
//문제 핵심 내용 : dfs/bfs 문제
//회고 : 간단하게 bfs를 사용해 연결된 카운트 수를 구하는 문제


from collections import deque


def solution(n, computers):
    def BFS(s):
        queue = deque()
        queue.append(i)

        while queue:
            s = queue.popleft()
            visited[s] = 1
            for a in range(n):
                if computers[s][a] and not visited[a]:
                    queue.append(a)

    answer = 0
    visited = [0 for i in range(n)]
    for i in range(n):
        if not visited[i]:
            BFS(i)
            answer += 1

    return answer