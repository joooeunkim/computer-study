# 풀이 시간 : 26분
# 풀이 핵심 내용 : 완전 탐색
# 회고 : 다른 풀이를 통한 product 법 탐색

d = dict()
cnt = 0

def solution(word):
    
    global d
    
    dfs('',0)   
    
    return d.get(word)
    
def dfs(path, l):
    
    global d, cnt
    
    if l==5:
        return
    
    for i in ['A','E','I','O','U']:
        np = path+i
        cnt+=1
        d[np]=cnt
        dfs(path+i,l+1)
