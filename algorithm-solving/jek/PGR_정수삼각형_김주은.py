#풀이 시간 : 15분
#풀이 핵심 내용: dp이용
#회고 : 위에서, 아래에서 시작해도 가능하다!

def solution(triangle):
    
    n = len(triangle)
    
    for i in range(1,n):
        for j in range(i+1):
            if j==0:
                triangle[i][j]+=triangle[i-1][j]
            elif j==i:
                triangle[i][j]+=triangle[i-1][j-1]
            else:
                triangle[i][j]+=max(triangle[i-1][j-1],triangle[i-1][j])
            
    return max(triangle[-1])
        
    
