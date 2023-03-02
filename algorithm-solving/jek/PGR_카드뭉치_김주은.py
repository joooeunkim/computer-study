# 풀이 시간 : 40분
# 풀이 핵심 내용 : 어떻게 순서대로 두 배열을 탐색하면서 조건에 맞게 탐색을 종료할 수 있을지
# 회고 : pop하는 방식도 있다는 것을 배움

def solution(cards1, cards2, goal):
    
    c1 = []
    for word in cards1:
        if word in goal:
            c1.append(word)
        else:
            break
    c2 = []
    for word in cards2:
        if word in goal:
            c2.append(word)
        else:
            break
    
    c1idx=-1
    c2idx=-1
    for word in goal:
        if word in c1:
            if c1.index(word)>c1idx:
                c1idx = c1.index(word)
            else:
                return 'No'
            
        elif word in c2:
            if c2.index(word)>c2idx:
                c2idx = c2.index(word)
            else:
                return 'No'
        else:
            return 'No'     
    
    return 'Yes'
