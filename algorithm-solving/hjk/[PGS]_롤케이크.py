//풀이 시간 : 30분
//문제 핵심 내용 : 카운터 사용
//회고 : Counter와 set으로 간단히 문제를 풀 수 있음

from collections import Counter
def solution(topping):
    answer = 0

    old_bro = Counter(topping)
    young_bro = set()

    for i in topping:
        old_bro[i] -= 1
        young_bro.add(i)
        if old_bro[i] == 0:
            del old_bro[i]
        if len(old_bro) == len(young_bro):
            answer += 1       

    return answer