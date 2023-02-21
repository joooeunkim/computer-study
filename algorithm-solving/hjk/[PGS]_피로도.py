//풀이 시간 : 30분
//문제 핵심 내용 : 완전 탐색 유형의 문제
//회고 : 순열을 활용해 문제를 해결. 백트래킹으로도 풀어봐야겠다


from itertools import permutations


def solution(k, dungeons):
    num = len(dungeons)
    answer = 0

    for per in permutations(dungeons, num):
        cnt = 0
        tmp = k
        for p in per:
            if tmp >= p[0]:
                tmp -= p[1]
                cnt += 1
        if cnt > answer:
            answer = cnt

    return answer