//풀이 시간 : 30분
//풀이 핵심 내용 : 최대공약수를 구하는 함수를 사용 또는 math 라이브러리의 math.gcd, math.min, Fraction과 .numerator, .denominator, list에 append 하는 등 여러 파이썬 문법을 알면 도움이 된다
//회고 : 이 문제와 여러 사람들의 풀이를 통해 math 라이브러리, fractions 라이브러리, list에 append까지 알 수 있었다.

def solution(denum1, num1, denum2, num2):

    denum = denum1*num2 + denum2*num1
    num = num1*num2
    g = gcd(denum,num)
    return [denum/g, num/g]

def gcd(num1, num2):
    a = num1 if num1<num2 else num2
    for i in range(a,0,-1):
        if num1%i==0 and num2%i==0:
            return i
