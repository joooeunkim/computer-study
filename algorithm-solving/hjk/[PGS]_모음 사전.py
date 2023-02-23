//풀이 시간 : 45분
//문제 핵심 내용 : 완전 탐색색 문제
//회고 : product를 사용해서 중복 순열 만들어서 해결

from itertools import product
def solution(word):
    lst = []
    for i in range(1, 6):
        lst += list(map(''.join, product('AEIOU', repeat=i)))
    lst.sort()
    answer = lst.index(word) + 1
    return answer