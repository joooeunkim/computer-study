//풀이 시간 : 20분
//문제 핵심 내용 : 배열판 문제
//회고 : 반복문을 여러번 활용해 풀 수 있다.

def solution(board, moves):
    answer = 0
    res = []

    for i in moves:
        for j in range(len(board)):
            if board[j][i-1] != 0:
                res.append(board[j][i-1])
                board[i][j-1] = 0
                break
        if len(res) >= 2:
            for k in range(len(res)-1):
                if res[k] == res[k+1]:
                    answer += 2
                    res = res[:k]
    return answer