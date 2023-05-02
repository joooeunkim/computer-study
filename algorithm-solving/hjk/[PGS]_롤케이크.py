//풀이 시간 : 15분
//문제 핵심 내용 : 카운터 사용
//회고 : Counter와 set으로 간단히 문제를 풀 수 있음

from collections import Counter
def solution(topping):
    answer = 0

    old = Counter(topping)
    young = set()

    for i in topping:
        old[i] -= 1
        young.add(i)
        if old[i] == 0:
            del ord[i]
        if len(old) == len(young):
            answer += 1       

    return answer