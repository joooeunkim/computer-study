# 풀이 시간 : 30분
# 풀이 핵심 내용 : 딕셔너리를 통한 데이터 접근 시간 줄이기
# 회고 : 문제 숫자 범위 잘 읽을 것

def solution(topping):
    l = len(topping)
    
    answer = 0
    
    d1 = dict()
    d2 = dict()
    for i in range(10000):
        d1[i+1]=0
        d2[i+1]=0
        
    d1[topping[0]]+=1
    for i in topping[1:]:
        d2[i]+=1
    
    s1 = 0
    s2 = 0
    for i in range(10000):
        if d1[i+1]>0:
            s1+=1
        if d2[i+1]>0:
            s2+=1
    if s1==s2:
        answer+=1
        
    for i in range(1,l):
        
        v = topping[i]
        
        if d2[v]==1:
            s2-=1
        d2[v]-=1
                
        if d1[v]==0:
            s1+=1
        d1[v]+=1
            
        
        if s1==s2:
            answer+=1
            
    return answer
        
        
        
        
    
        
