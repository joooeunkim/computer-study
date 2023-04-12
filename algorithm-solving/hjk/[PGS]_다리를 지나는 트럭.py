//풀이 시간 : 40분
//문제 핵심 내용 : 스택/큐 문제
//회고 : deque를 활용해서 풀었는데 시간 초과 에러가 떠서 시간을 줄여서 다시 품.

from collections import deque


def solution(bridge_length, weight, truck_weights):
    answer = 0

    middle = deque(bridge_length * [0])
    truck_weights = deque(truck_weights)
    total = 0

    while middle:
        total -= middle.popleft()
        answer += 1
        if truck_weights:
            if total + truck_weights[0] <= weight:
                w = truck_weights.popleft()
                middle.append(w)
                total += w
            else:
                middle.append(0)

    return answer
