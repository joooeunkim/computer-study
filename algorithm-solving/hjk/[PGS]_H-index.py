//풀이 시간 : 40분
//문제 핵심 내용 : 정렬 문제
//회고 : 문제를 이해하는데 시간이 걸림. 구현은 생각보다 쉬운 편


def solution(citations):
    answer = 0
    citations.sort()

    for i in range(len(citations)):
        if citations[i] >= len(citations) - i:
            answer += 1
    return answer