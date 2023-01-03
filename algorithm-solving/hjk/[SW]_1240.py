//풀이 시간 : 50분
//문제 핵심 내용 : 단순 이진 암호 코드 문제
//회고 : 방법 생각까지 생각보다 시간이 걸렸다. 다시 한 번 더 풀어보기!


# code를 딕셔너리로 받아오기
pw_code = {
    '0001101': 0,
    '0011001': 1,
    '0010011': 2,
    '0111101': 3,
    '0100011': 4,
    '0110001': 5,
    '0101111': 6,
    '0111011': 7,
    '0110111': 8,
    '0001011': 9
}
T = int(input())
for tc in range(1, T+1):
    N, M = map(int, input().split())
    lst = [input() for _ in range(N)]

    code = ''
    for i in range(N):
        for j in range(M-1, -1, -1):
            if lst[i][j] == '1':
                code = lst[i][j-55:j+1]
                break

    pwd = []
    for i in range(0, len(code), 7):
        pwd.append(pw_code[code[i:i+7]])

    even = 0
    odd = 0
    for i in range(7):
        if i % 2:
            even += pwd[i]
        else:
            odd += pwd[i]

    result = 0
    if (odd * 3 + even + pwd[-1]) % 10 == 0:
        for j in pwd:
            result += j
    else:
        result = 0

    print(f'#{tc} {result}')