//풀이 시간 : 20분
//문제 핵심 내용 : 피보나치 수열 문제
//회고 : 피보나치 수열 문제 푸는 법 기억하기
def solution(n):
    answer = 0자
    fibo = [1, 1]

    for i in range(n):
        fibo.append(fibo[i] + fibo[i + 1])

    answer = fibo[n - 1] % 1234567
    return answer