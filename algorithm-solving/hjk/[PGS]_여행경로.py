//풀이 시간 : 20분
//문제 핵심 내용 : dfs/bfs 문제 
//회고 : 시간을 줄이기 위해 해시를 사용해서 해결. stack 사용 간단해결

from collections import defaultdict


def solution(tickets):
    path = []

    graph = defaultdict(list)

    for (start,end) in tickets:
        graph[start].append(end)

    for destination in graph.keys():
        graph[destination].sort(reverse=True)

    stack =['ICN']

    while stack:
        s = stack[-1]

        if graph[s]:
            stack.append(graph[s].pop())

        else:
            path.append(stack.pop())
    path.reverse()
    return path