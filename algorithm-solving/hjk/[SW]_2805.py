//풀이 시간 : 35분
//문제 핵심 내용 : 이진 탐색 문제
//회고 : 간단하게 이진 탐색으로 푸는 문제

T = int(input())
for tc in range(1, T+1):
    N = int(input())
    arr = [list(map(int, input())) for _ in range(N)]
    middle = N//2
    start = middle
    end = middle

    result = 0

    for i in range(N):
        for j in range(start, end+1):
            result += arr[i][j]

        if i < middle:
            start -= 1
            end += 1
        else:
            start += 1
            end -= 1

    print(f'#{tc} {result}')
