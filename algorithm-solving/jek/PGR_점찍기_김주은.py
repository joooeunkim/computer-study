# 풀이 시간 : 30분
# 풀이 핵심 내용 : for문을 1차원으로 줄이는 것
# 회고 : 코드 최적화를 스스로 이루어낼 수 있도록

def solution(k, d):
    
    answer = 0
    dd = d**2
    
    # for i in range(d//k+1):
    #     if ((i*k)**2)*2<=dd:
    #         answer+=1
    #     for j in range(i+1,d//k+1):
    #         if (i*k)**2+(j*k)**2<=dd:
    #             answer+=2
    #         else:
    #             break
    
    for i in range(0,d+1,k):
        answer += int((dd-i**2)**0.5)//k + 1
                
    return answer
