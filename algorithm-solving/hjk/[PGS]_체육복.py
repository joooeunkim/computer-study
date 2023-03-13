//풀이 시간 : 40분
//문제 핵심 내용 : 그리디 문제
//회고 : set을 사용해서 중복을 제거하고 다시 품

def solution(n, lost, reserve):
    answer = 0

    a = n - len(lost) - len(reserve)
    set_reserve = set(reserve) - set(lost)
    set_lost = set(lost) - set(reserve)
    for i in set_reserve:
        if i-1 in set_lost:
            set_lost.remove(i-1)
        elif i + 1 in set_lost:
            set_lost.remove(i+1)

    return n - len(set_lost)