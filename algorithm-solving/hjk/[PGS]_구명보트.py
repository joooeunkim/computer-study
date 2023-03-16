//풀이 시간 : 45분
//문제 핵심 내용 : deque를 사용해 푸는 문제
//회고 : 덱에 넣고 sorted를 해주는 게 필요함


from collections import deque


def solution(people, limit):
    answer = 0

    people = deque(sorted(people, reverse=True))
    while len(people) > 1:
        if people[0] + people[-1] <= limit:
            people.pop()
            people.popleft()
            answer += 1
        else:
            people.popleft()
            answer += 1
    if people:
        answer += 1

    return answer