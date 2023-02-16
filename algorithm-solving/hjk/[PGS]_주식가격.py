//풀이 시간 : 30분
//문제 핵심 내용 : 스택/큐 유형의 문제
//회고 : 데크를 사용하면 간단하게 풀 수 있는 문제

from collections import deque

def solution(prices):
    answer = []
    queue = deque(prices)

    while queue:
        price = queue.popleft()
        ans = 0
        for n in queue:
            ans += 1
            if price > n:
                break
        answer.append(ans)
    return answer

print(solution([1, 2, 3, 2, 3]))