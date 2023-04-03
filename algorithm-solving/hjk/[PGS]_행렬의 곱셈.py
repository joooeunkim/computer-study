//풀이 시간 : 40분
//문제 핵심 내용 : 행렬의 곱셈 방식을 알아야 풀이 가능
//회고 : 어렵진 않았지만 헷갈렸음


def solution(arr1, arr2):
    answer = [[0]*len(arr2[0]) for _ in range(len(arr1))]
    for i in range(len(arr1)):
        for j in range(len(arr2[0])):
            for k in range(len(arr1[0])):
                answer[i][j] += arr1[i][k] * arr2[k][j]
    return answer