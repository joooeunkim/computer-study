//풀이 시간 : 20분
//문제 핵심 내용 : stack 문제
//회고 : stack을 사용해 괄호 문제를 해결



def solution(s):
    stack = []
    for i in s:
        if i == '(':
            stack.append('(')
        else:
            if stack and stack[-1] == '(':
                stack.pop()
            else:
                stack.append(i)

    if stack:
        return False
    else:
        return True

