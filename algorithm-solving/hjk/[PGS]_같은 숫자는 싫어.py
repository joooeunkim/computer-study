//풀이 시간 : 20분
//문제 핵심 내용 : 스택/큐 문제제
//회고 : 간단하게 풀이 가능한 스택 문제


def solution(arr):
    ans  = [arr[0]]
    for i in range(1,len(arr)):
        if arr[i] == arr[i-1]:
            continue
        else:
            ans.append(arr[i])
    return ans