# 풀이 시간 : 1시간
# 풀이 핵심 내용 : o(n)안에 해결해야한다.
# 회고 : 재귀로 풀려고...했었는데, 프로그래머스의 완탐 외의 해결법을 구상하려는 노력 필요

def solution(a):
    result = [False for _ in range(a)]
    minFront, minRear = float("inf"), float("inf")
    for i in range(len(a)):
        if a[i] < minFront:
            minFront = a[i]
            result[i] = True
        if a[-1-i] < minRear:
            minRear = a[-1-i]
            result[-1-i] = True
    return sum(result)
