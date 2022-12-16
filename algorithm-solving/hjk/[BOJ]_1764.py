//풀이 시간 : 45분
//문제 핵심 내용 : 해시 문제인데 파이썬에서 딕셔너리로 문제를 해결할 수 있다.
//회고 : 해시 관련 문제들도 더 풀어보면 좋을 것 같다.



n, m = map(int, input().split())
a = [input() for _ in range(n)]
b = [input() for _ in range(m)]

dict = {}

for person in a:
    dict[person] = dict.get(person, 0) + 1
for person in b:
    dict[person] = dict.get(person, 0) + 1

answer = []

for key in dict.keys():
    if dict[key] == 2:
        answer.append(key)

print(len(answer))
answer.sort()
for person in answer:
    print(person)

