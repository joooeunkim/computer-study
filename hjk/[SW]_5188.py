//풀이 시간 : 45분
//문제 핵심 내용 : dfs로 풀어야 된다는 것을 알면 풀리는 문제
//회고 : 오랜만에 푸니 문제 접근 방법에 대한 생각이 잘...ㅜ 많이 풀면서 익숙해지는 것을 목표로!


import sys
sys.stdin = open('sample_input.txt')

def dfs(n,ci, cj, ssum):
    global min_sum

    if min_sum < ssum:
        return

    if ci == N-1 and cj == N-1 :
        if min_sum > ssum:
            min_sum = ssum
        return

    for di, dj in ((1,0),(0, 1)):
        ni, nj = ci + di, cj + dj
        if 0 <= ni < N and 0 <= nj < N:
            dfs(n+1, ni, nj, ssum+arr[ni][nj])

T = int(input())
for tc in range(1, T+1):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    min_sum = 12345678

    dfs(0, 0, 0, arr[0][0])

    print(f'#{tc} {min_sum}')