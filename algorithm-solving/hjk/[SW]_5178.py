//풀이 시간 : 25분
//문제 핵심 내용 : 트리 문제
//회고 : 쉬운 트리 문제


T = int(input())
for tc in range(1, T+1):
    N, M, L = map(int, input().split())
    tree = [0] * (N+1)
    for i in range(M):
        leap_node, value = map(int,input().split())
        tree[leap_node] = value

    for i in range(N, 0, -1):
        if i//2:
            tree[i//2] += tree[i]

    print(f'#{tc} {tree[L]}')
