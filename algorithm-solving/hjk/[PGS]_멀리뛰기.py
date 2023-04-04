//풀이 시간 : 45분
//문제 핵심 내용 : dp 문제
//회고 : 뛰는 칸 개수를 dp로 늘려 풀이

def solution(n):
    if n<3:
        return n
    d=[0]*(n+1)
    d[1]=1
    d[2]=2
    for i in range(3,n+1):
        d[i]=d[i-1]+d[i-2]
    return d[n] % 1234567