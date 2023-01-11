//풀이 시간 : 40분
//문제 핵심 내용 : 이분 탐색 알고리즘을 활용해 푸는 문제
//회고 : 어떻게 풀어야 될 지 생각할 때 시간이 조금 걸렸다.



n, m = map(int, input().split())
lst = list(map(int, input().split()))

start = 1
end = sum(lst)

while start <= end:
    mid = (start + end ) //2
    cnt = 0

    for i in lst:
        if i > mid:
            cnt += i - mid

    if cnt >= m:
        start = mid + 1
    else:
        end = mid - 1

print(end)