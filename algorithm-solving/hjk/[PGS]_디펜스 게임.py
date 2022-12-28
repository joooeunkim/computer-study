//풀이 시간 : 45분
//문제 핵심 내용 : 힙을 사용해 시간을 줄여서 푸는 문제
//회고 : 힙큐를 import해서 시간을 줄이니까 해결 완료!


import heapq


def solution(n, k, enemy):
    i = 0
    ssum = 0
    enemies = []
    heapq.heapify(enemies)

    while i < len(enemy):
        heapq.heappush(enemies, (-enemy[i], enemy[i]))
        ssum += enemy[i]

        if ssum > n and k > 0:
            ssum -= enemies[0][1]
            heapq.heappop(enemies)
            k -= 1
        elif ssum > n and k == 0:
            break

        i += 1

    return i