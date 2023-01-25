//풀이 시간 : 20분
//문제 핵심 내용 : 피보나치 수열 문제
//회고 : 다이나믹 프로그래밍 문제도 많이 풀어보며 익숙해지기


k=int(input())
a,b=0,1
for i in range(1,k):
    a,b = b,a+b
print(a,b)