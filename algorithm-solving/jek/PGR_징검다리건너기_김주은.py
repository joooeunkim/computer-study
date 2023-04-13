# 풀이 시간 : 3시간
# 풀이 핵심 내용 : heapq를 통한 문제 해결
# 회고 : 방법은 알겠으니, 구현력의 부족

import heapq
from math import inf

def solution(stones, k):
    
    l = len(stones)
    
    q = []
    answer = inf
        
    for i in range(k-1):
        heapq.heappush(q, [-stones[i],i])
        
    for i in range(k-1,l):
        heapq.heappush(q, [-stones[i],i])
        
        while q[0][1]<i-k+1:
            heapq.heappop(q)
        answer = min(answer, -q[0][0])
        
    return answer
