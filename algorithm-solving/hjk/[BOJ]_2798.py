//풀이 시간 : 15분
//문제 핵심 내용 : for문(반복문)을 여러번 돌려서 푸는 문제
//회고 : 쉬운 문제들을 좀 많이 풀면서 다시 알고리즘 감을 익힌 후에 다음 단계로 넘어가려고 한다. 


N,M = map(int,input().split())
lst = list(map(int, input().split()))
result = 0
a = []

for i in range(N):
    for j in range(i+1, N):
        for k in range(j+1, N):
            if lst[i] + lst[j] + lst[k] <= M:
                a.append(lst[i] + lst[j] + lst[k])

print(max(a))
