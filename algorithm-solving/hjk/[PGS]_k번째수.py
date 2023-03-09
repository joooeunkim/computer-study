//풀이 시간 : 25분
//문제 핵심 내용 : 정렬 문제
//회고 : 숫자를 인덱스로 자르고 반복문을 이용해 풀이

def solution(array, command):
    answer = []
    arr = []
    for i in range(len(command)):
        arr.append(sorted(array[command[i][0] - 1: command[i][1]]))
    for i in range(len(command)):
        answer.append(arr[i][(command[i][2]) - 1])

    return answer