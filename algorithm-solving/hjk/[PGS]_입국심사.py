//풀이 시간 : 40분
//문제 핵심 내용 : 이분 탐색 문제
//회고 : 어디를 기준으로 잡고 문제를 풀어나가느냐가 중요


def solution(n, times):
    answer = 0
    start = 1
    end = max(times) * n

    while start <= end:
        mid = (start + end) // 2
        people = 0
        for time in times:
            people += mid // time
            if people >= n:
                break

        if people >= n:
            answer = mid
            end = mid - 1

        elif people < n:
            start = mid + 1

    return answer