//풀이 시간 : 40분
//문제 핵심 내용 : 힙 문제
//회고: heapq를 import해서 문제 풀이에 사용


import heapq


def solution(scoville, K):
    h = []
    count = 0
    for i in scoville:
        heapq.heappush(h, i)
    while h[0] < K:
        if len(h) < 2:
            count = -1
            break

        v1 = heapq.heappop(h)
        v2 = heapq.heappop(h)

        temp = v1 + (v2 * 2)

        heapq.heappush(h, temp)
        count += 1

    answer = count

    return answer