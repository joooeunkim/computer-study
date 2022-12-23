//풀이 시간 : 30분
//문제 핵심 내용 : 단순 구현 문제
//회고 : 동서남북을 돌면서 답을 찾으면 되는 간단한 문제

T= int(input())
for tc in range(1,T+1):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    result = []

    for i in range(N):
        for j in range(N):
            di = [0, 1, 0, -1]
            dj = [1, 0, -1, 0]
            for k in range(4):
                for l in range(1, N):
                    ni = i + di[k]*l
                    nj = j + dj[k]*l
                    if 0 <= ni < N and 0 <= nj < N:
                        if arr[i][j] == 2:
                            if arr[ni][nj] == 1:
                                break
                            arr[ni][nj] = 1
    cnt = 0
    for i in range(N):
        for j in range(N):
            if arr[i][j] == 0:
                cnt += 1
    print(f'#{tc} {cnt}')

