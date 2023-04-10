//풀이 시간 : 45분
//문제 핵심 내용 : queue를 사용해 푸는 문제
//회고 : 시간 단축시키는 방법 생각해내는데 시간이 걸림

from collections import deque

def solution(progresses, speeds):
    ans = []
    day = deque()

    tmp = 0
    for i in range(len(progresses)):
        if (100 - progresses[i]) % speeds[i] == 0:
            tmp = (100 - progresses[i]) // speeds[i]
        else:
            tmp = (100 - progresses[i]) // speeds[i] + 1
        day.append(tmp)

    time = 0
    res = 0
    while day:
        if day[0] == time:
            res += 1
            day.popleft()
        else:
            if res > 0:
                ans.append(res)
                res = 0
            time += 1
    ans.append(res)

    return ans

print(solution([93, 30, 55], [1, 30, 5]))