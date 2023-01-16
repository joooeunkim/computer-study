//풀이 시간 : 25분
//문제 핵심 내용 : 큐 사용해서 푸는 문제
//회고 : 다른 문제에 비해 비교적 쉽게 풀 수 있었다.


T = int(input())
for tc in range(1, T+1):
    N, M = map(int, input().split())
    C = list(map(int, input().split()))
    q = list(range(N))

    while q:
        check = q.pop(0)

        C[check] = C[check]//2
        if C[check] == 0:
            if N < M:
                q.append(N)
                N += 1

        else:
            q.append(check)

    print(f'#{tc} {check+1}')
