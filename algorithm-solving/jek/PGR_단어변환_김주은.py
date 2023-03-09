# 풀이 시간 : 1시간
# 풀이 핵심 내용 : 그래프를 생성하든, bfs 탐색을 하든 여러 가지 방법
# 회고 : 다른 사람들의 짧은 풀이도 학습

from collections import deque

def solution(begin, target, words):
    
    if target not in words:
        return 0
    
    q = deque()
    q.append([begin, 0,[False for _ in range(len(words))]])
    
    while q:
        
        curr, cnt, visited = q.popleft()
        
        if curr==target:
            return cnt
        
        for idx, word in enumerate(words):
            
            # 알파벳이 하나만 다른지 확인
            diff = 0
            for i in range(len(word)):
                if curr[i]!=word[i]:
                    diff+=1
                if diff>=2:
                    break
                    
            if diff==1:
                if visited[idx]==False :
                    nextVisited = visited[:]
                    nextVisited[idx]=True
                    q.append([word,cnt+1,nextVisited])
                
        
        
    return 0
                    
            
