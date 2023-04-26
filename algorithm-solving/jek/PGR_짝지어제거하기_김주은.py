# 풀이 시간 : 4분
# 풀이 핵심 내용 : stack이용할 것
# 회고 : 쉬웠음

def solution(s):
    
    stack = []
    
    for i in s:
        if stack:
            if stack[-1]==i:
                stack.pop()
            else:
                stack.append(i)
        else:
            stack.append(i)
            
    if stack:
        return 0
    else:
        return 1
