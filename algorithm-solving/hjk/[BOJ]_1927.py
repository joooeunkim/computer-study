//풀이 시간 : 30분
//문제 핵심 내용 : 파이썬 heapq 라이브러리를 import해서 푸는 문제
//회고 : 간단한 문제인데 heapq를 사용하는 문제라 cs 스터디 이해에 도움이 되는 것 같다.


import sys
import heapq

n = int(sys.stdin.readline())
lst = []


for _ in range(n):
    x = int(sys.stdin.readline())

    if x != 0:
        heapq.heappush(lst, x)

    elif x == 0 and len(lst) != 0:
        print(heapq.heappop(lst))

    else:
        print(0)