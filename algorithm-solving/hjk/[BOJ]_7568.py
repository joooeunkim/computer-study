//풀이 시간 : 30분
//문제 핵심 내용 : 키와 몸무게를 비교해 덩치가 큰 지 비교하는 문제
//회고 :  브루트포스 알고리즘 문제, 구현 문제


import sys
n = int(input())
arr = []
grade = []
for _ in range(n):
    data = list(map(int, sys.stdin.readline().strip().split()))
    arr.append(data)


for i in range(n):
    cnt = 1
    for j in range(n):
        if (arr[i][0] < arr[j][0] and arr[i][1] < arr[j][1]):
            cnt += 1
    grade.append(cnt)
    print(grade[i], end=" ")

