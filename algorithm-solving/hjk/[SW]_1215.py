//풀이 시간 : 50분
//문제 핵심 내용 : 회문인지 판별하는 문제
//회고 : 반복문을 여러 개 돌려서 해결. 더 빠른 방법이 있는 지 찾아보기

T = int(input())
for tc in range(1,T+1):
    N,M = map(int, input().split())
    arr = [input() for _ in range(N)]

    result = ''
    for i in range(N):
        for j in range(N-M+1):
            cnt = 0
            for k in range(M):
                if arr[i][j+k] == arr[i][j+M-1-k]:
                    cnt += 1

                if cnt == M:
                    result = arr[i][j:j+M]


    for i in range(N):
            for j in range(N-M+1):
                c_chars = []
                for k in range(M):
                    c_chars.append(arr[j+k][i])
                if c_chars == c_chars[::-1]:
                    result = "".join(c_chars)

    print(f'#{tc} {result}')