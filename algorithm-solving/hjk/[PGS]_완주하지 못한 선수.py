//풀이 시간 : 20분
//문제 핵심 내용 : 해시 문제
//회고 : collections에서 counter 함수를 꺼내 사용하면 빠르게 문제를 해결할 수 있다.

import collections

def solution(participant, completion):
    answer = collections.Counter(participant) - collections.Counter(completion)

    return list(answer.keys())[0]
