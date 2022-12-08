//풀이 시간 : 30분
//문제 핵심 내용 : 시간이 적게 걸리는 사람을 순서대로 정렬하는 것이 포인트
//회고 : 쉬운 문제인데 오랜만에 문제풀이를 하니 방법을 생각하는데 시간이 생각보다 걸리는 것 같다


n = int(input())
lst = list(map(int, input().split()))

num = 0

lst.sort()

for i in range(1, n+1):
    num += i*n
    n -= 1
print(num)