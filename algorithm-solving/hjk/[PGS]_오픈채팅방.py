//풀이 시간 : 45분
//문제 핵심 내용 : 해시 문제
//회고 : 딕셔너리를 이용해 문제를 쉽게 풀 수 있음


def solution(record):
    dict = {}
    ans = []
    for a in record:
        if len(list(map(str, a.split()))) == 3:
            i, j, k = map(str, a.split())
            if i == 'Enter':
                dict[j] = k
                ans.append([j, '님이 들어왔습니다.'])
            elif i == 'Change':
                dict[j] = k
        else:
            i, j = map(str, a.split())
            ans.append([j, '님이 나갔습니다.'])
    result = []
    for i, j in ans:
        result.append(dict[i]+j)
    return result