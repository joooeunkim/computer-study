//풀이 시간 : 45분
//문제 핵심 내용 : 스도쿠 확인하는 문제
//회고 : 중복 for문을 많이 돌려 풀었는데 다른 방법으로도 풀어봐야겠다.

def solve(sudoku):
    for i in range(9):
        lst = [0] * 10
        for j in range(9):
            if lst[sudoku[i][j]]:
                return 0
            else:
                lst[sudoku[i][j]] = 1

    for i in range(9):
        lst = [0] * 10
        for j in range(9):
            if lst[sudoku[j][i]]:
                return 0
            else:
                lst[sudoku[j][i]] = 1

    for i in range(0, 9, 3):
        for j in range(0, 9, 3):
            lst = [0] * 10
            for k in range(i, i + 3):
                for l in range(j, j + 3):
                    if lst[sudoku[k][l]]:
                        return 0
                    else:
                        lst[sudoku[k][l]] = 1

    return 1




T = int(input())
for tc in range(1, T+1):
    sudoku = [list(map(int, input().split())) for _ in range(9)]
    result = solve(sudoku)

    print(f'#{tc} {result}')