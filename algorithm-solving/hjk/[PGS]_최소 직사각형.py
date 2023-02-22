//풀이 시간 : 20분
//문제 핵심 내용 : 완전탐색 문제제
//회고 : 간단한 비교를 통해 풀이 가능


def solution(sizes):
    answer = 0
    ans1 = []
    ans2 = []
    for size in sizes:
        if size[0] < size[1]:
            size[0], size[1] = size[1], size[0]
        ans1.append(size[0])
        ans2.append(size[1])
    return max(ans1) * max(ans2)