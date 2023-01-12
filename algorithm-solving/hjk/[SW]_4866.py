//풀이 시간 : 25분
//문제 핵심 내용 : 괄호 검사 문제
//회고 : 다른 문제에 비해 쉽게 풀 수 있었다.


T = int(input())
for tc in range(1, T+1):
    N = input()
    stack = []
    result = 1

    for word in N:
        if word == '(' or word == '{':
            stack.append(word)

        elif word == ')':
            if stack != [] and stack[-1] == '(':
                stack.pop()
            else:
                result = 0
                break

        elif word == '}':
            if stack != [] and stack[-1] == '{':
                stack.pop()
            else:
                result = 0
                break
    if stack:
        result = 0

    print(f'#{tc} {result}')