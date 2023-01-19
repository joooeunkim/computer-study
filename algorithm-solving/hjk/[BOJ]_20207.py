//풀이 시간 : 30분
//문제 핵심 내용 : 2차원 배열로 풀이하는 문제
//회고 : 시간 줄이는 연습해보기


import sys
days = [0] * 366
input = sys.stdin.readline
N = int(input())

for _ in range(N):
  S, E = map(int, input().split())
  for i in range(S, E+1):
    days[i] += 1

row = 0
col = 0
answer = 0

for i in range(1, 366):
  if days[i]:
    row = max(row, days[i])
    col += 1
  else:
    answer += row * col
    row = 0
    col = 0
answer += row * col

print(answer)