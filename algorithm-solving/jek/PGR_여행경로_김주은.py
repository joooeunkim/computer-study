# 풀이 시간: 3시간
# 풀이 핵심 내용 : dfs를 이용한 stack 이용
# 회고 : dfs, bfs 여러 방법이 있지만 시간초과 하지 않는 것이 힘들었다


from collections import defaultdict

def solution(tickets):
    
    path = []
    
    graph = defaultdict(list)
    for start, end in tickets:
        graph[start].append(end)
        
    for airport in graph.keys():
        graph[airport].sort(reverse=True)
        
    stack = ["ICN"]
    
    while stack:
        
        top = stack.pop()
        
        if top not in graph or not graph[top]:
            path.append(top)
            
        else:
            stack.append(top)
            stack.append(graph[top].pop())
            
    return path[::-1]
            
        
        
