//풀이 시간 : 25분
//문제 핵심 내용 : 간단한 이진 탐색 문제
//회고 : 다른 문제에 비해 비교적 쉽게 풀 수 있었다.


def binarysearch(P, page):
    start = 1
    end = P
    cnt = 0

    while start <= end:
        middle = (start+end)//2
        if middle == page:
            return cnt
        elif middle > page:
            end = middle
        else:
            start = middle
        cnt += 1
    return False

T = int(input())
for tc in range(1, T+1):
    P, Pa, Pb = map(int, input().split())

    cnt_a = binarysearch(P, Pa)
    cnt_b = binarysearch(P, Pb)

    result = 0
    if cnt_b > cnt_a:
        result = 'A'
    elif cnt_a > cnt_b:
        result = 'B'
    else:
        result = 0

    print(f'#{tc} {result}')





