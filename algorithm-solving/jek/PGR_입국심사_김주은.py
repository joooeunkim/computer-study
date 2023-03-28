# 풀이 시간 : 20분
# 풀이 핵심 내용 : e가 될 수 있는 범위가 너무 커서 이를 queue 등으로 풀면 시간이 많이 소요될 수 있다는 것. 이러한 문제에서 이분탐색을 떠올릴 수 있어야 하는 것. 범위를 잘 설정하는 것
# 회고 : e에 대한 범위의 조정도 필요하다!

def solution(n, times):

    s=1
    e=max(times)*n
    
    answer=0
    
    while s<=e:
        
        m  = (s+e)//2
        
        if check(m,times)>=n:
            e=m-1
            answer = m
        else:
            s=m+1
            
    return s
            
            
        
def check(m, times):
    sums = 0
    for t in times:
        sums+=m//t
    return sums
