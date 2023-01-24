//풀이 시간 : 30분
//문제 핵심 내용 : 층수를 밑에서 부터 채워 올라오며 푸는 문제
//회고 :  브루트포스 알고리즘 문제, 구현 문제


import sys

t = int(sys.stdin.readline())

for _ in range(t):
    h, w, n = map(int, sys.stdin.readline().strip().split())
    floor = (n % h) * 100
    num = (n//h) + 1

    if n % h == 0:
        floor = h * 100
        num = n//h

    print(floor + num)