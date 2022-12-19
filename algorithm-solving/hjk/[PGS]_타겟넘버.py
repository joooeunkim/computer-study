//풀이 시간 : 20분
//문제 핵심 내용 : dfs/bfs로 경우의 수를 구하는 문제
//회고 : bfs로 풀었는데 dfs로도 다시 한 번 풀어 봐야겠다.

def solution(numbers, target):
    lst = [0]

    for number in numbers:
        result = []
        for i in lst:
            result.append(i + number)
            result.append(i - number)

        lst = result

    return lst.count(target)