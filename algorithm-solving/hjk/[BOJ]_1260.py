//풀이 시간 : 50분
//문제 핵심 내용 : bfs와 dfs 문제
//회고 : bfs와 dfs로 각각 해결



import sys
from collections import deque

n, m, v = map(int,sys.stdin.readline().strip().split())
graph = [[] for i in range(n+1)]
visita = [False] *(n+1)
visitb = [False]*(n+1)
for i in range(m):
    a,b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in graph:
    i.sort()

def dfs(graph, v, visita):
    visita[v] = True
    print(v, end=' ')
    for i in graph[v]:
        if not visita[i]:
            dfs(graph, i, visita)


def bfs(graph, start, visitb):
    queue = deque([start])
    visitb[start] = True

    while queue:
        s = queue.popleft()
        print(s, end=' ')
        for i in graph[s]:
            if not visitb[i]:
                queue.append(i)
                visitb[i] = True

dfs(graph, v, visita)
print()
bfs(graph, v, visitb)
