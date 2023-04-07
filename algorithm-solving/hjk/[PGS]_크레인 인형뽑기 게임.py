//풀이 시간 : 30분
//문제 핵심 내용 : 배열판 문제
//회고 : 반복문을 여러 번 사용해서 풀이

def solution(board, moves):
    answer = 0
    result = []

    for i in moves:
        for j in range(len(board)):
            if board[j][i-1] != 0:
                result.append(board[j][i-1])
                board[i][j-1] = 0
                break
        if len(result) >= 2:
            for k in range(len(result)-1):
                if result[k] == result[k+1]:
                    answer += 2
                    result = result[:k]
    return answer