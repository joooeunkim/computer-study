//풀이 시간 : 20분
//문제 핵심 내용 : deque를 사용해 시간을 줄여야 런타임 에러 없이 통과할 수 있다.
//회고 : 간단한 문제인데 deque를 사용하는 문제라 cs 스터디 이해에 도움이 되는 것 같다.


from collections import deque
n = int(input())
lst = deque(list(range(1, n+1)))

while len(lst) != 1:
    lst.popleft()
    lst.append(lst[0])
    lst.popleft()

print(lst[0])

