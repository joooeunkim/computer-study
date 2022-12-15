//풀이 시간 :20분
//문제 핵심 내용 : 완전 이진 트리 탐색 문제
//회고 : mst 문제를 풀려고 하니 나한테 난이도가 어려워서 기본 트리 문제부터 다시 풀어봤다.



def in_order(v):
    if v <= N: # v가 N 보다 작거나 같은 겨우
        in_order(v * 2) # 이진 트리 탐색
        print(lst[v], end='')
        in_order(v * 2 + 1)


T = 10
for tc in range(1, T+1):
    N = int(input()) # 정점의 총 수
    lst = [0] * (N+1) # 배열 생성

    for i in range(N):
        data = input().split() # 데이터 받아오기
        # 인덱스로 데이터 첫 번째 값 두 번째 값 받기
        v = int(data[0])
        char = data[1]
        lst[v] = char

    print(f'#{tc}',end=' ')
    in_order(1)
    print()