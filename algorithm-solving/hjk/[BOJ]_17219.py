//풀이 시간 : 20분
//문제 핵심 내용 : 해시 사용해 시간을 줄이는 문제
//회고 : 딕셔너리를 사용해 시간을 줄임.

import sys

n,m = map(int, sys.stdin.readline().strip().split())

dict = {}

for i in range(n):
    a,b  = sys.stdin.readline().rstrip().split()
    dict.setdefault(a,b)

for i in range(m):
    n = input()
    print(dict[n])