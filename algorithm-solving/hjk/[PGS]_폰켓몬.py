//풀이 시간 : 20분
//문제 핵심 내용 : 해시 문제
//회고 : set을 활용해 리스트에 중복값을 제거하고 문제 풀이

def solution(nums):
    n = len(nums) / 2
    lst = list(set(nums))
    if len(lst) >= n:
        return n
    else:
        return len(lst)