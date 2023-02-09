//풀이 시간 : 45분
//문제 핵심 내용 : bfs로 최단 거리 구하는 문제제
//회고 : bfs 기본 문제 dfs로도 풀어보기!

from collections import deque
def solution(maps):
    answer = 0

    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]

    def bfs(x, y):
        queue = deque()
        queue.append((x, y))


        while queue:
            x, y = queue.popleft()


            for i in range(4):
                nx = x + dx[i]
                ny = y + dy[i]


                if 0 <= nx < len(maps) and 0 <= ny < len(maps[0]) and maps[nx][ny] == 1:
                    maps[nx][ny] = maps[x][y] + 1
                    queue.append((nx, ny))

        return maps[len(maps)-1][len(maps[0])-1]

    answer = bfs(0, 0)
    return -1 if answer == 1 else answer