//풀이 시간 : 20분
//문제 핵심 내용 : 스택/큐 문제
//회고 : deque를 사용해서 풀면 빠르게 풀 수 있다. any 함수를 사용해서 풀었다.

from collections import deque


def solution(priorities, location):
    turn = 0
    array = deque([(i, p) for i, p in enumerate(priorities)])

    while array:
        doc = array.popleft()
        if any(doc[1] < other_doc[1] for other_doc in array):
            array.append(doc)
        else:
            turn += 1
            if doc[0] == location:
                break
    return turn