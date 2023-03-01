//풀이 시간 : 50분
//문제 핵심 내용 : dfs/bfs 문제
//회고 : 시간을 줄이기 위해 해시를 사용해서 해결.

from collections import defaultdict


def solution(tickets):
    path = []

    graph = defaultdict(list)
    for (start, end) in tickets:
        graph[start].append(end)

    for des in graph.keys():
        graph[des].sort(reverse=True)

    stack = ["ICN"]

    while stack:
        top = stack.pop()

        if top not in graph or not graph[top]:
            path.append(top)

        else:
            stack.append(top)
            stack.append(graph[top].pop())

    return path[::-1]