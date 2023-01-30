//풀이 시간 : 20분
//문제 핵심 내용 : 피보나치 수열 문제
//회고 : 피보나치 수열 문제 푸는 법 기억하기
def solution(n):
    answer = 0자
    f = [1, 1]

    for i in range(n):
        f.append(f[i] + f[i + 1])

    answer = f[n - 1] % 1234567
    return answer