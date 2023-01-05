//풀이 시간 : 60분
//문제 핵심 내용 : 복잡한 파리 퇴치 문제
//회고 : 기존 파리퇴치보다 조금 더 난이도가 있는 문제. 생각보다 시간이 많이 걸림


T = int(input())
for tc in range(1, T+1):
    N, M = map(int,input().split())
    arr = [list(map(int, input().split())) for _ in range(N)]

    maxV = 0
    for i in range(N):
        for j in range(N):
            result = arr[i][j]
            di = [0, 1, 0, -1]
            dj = [1, 0, -1, 0]
            for k in range(4):
                for l in range(1, M):
                    ni = i + di[k]*l
                    nj = j + dj[k]*l
                    if 0 <= ni < N and 0 <= nj < N:
                        result += arr[ni][nj]
            if maxV < result:
                maxV = result

            result = arr[i][j]
            di = [1, 1, -1, -1]
            dj = [1, -1, -1, 1]
            for k in range(4):
                for l in range(1, M):
                    ni = i + di[k] * l
                    nj = j + dj[k] * l
                    if 0 <= ni < N and 0 <= nj < N:
                        result += arr[ni][nj]

            if maxV < result:
                maxV = result

    print(f'#{tc} {maxV}')