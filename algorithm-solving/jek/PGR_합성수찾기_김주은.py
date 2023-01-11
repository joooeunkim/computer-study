#풀이 시간 : 10분
#풀이 핵심 내용 : 약수의 갯수를 확인하여 홥성수 여부를 판단한다.
#회고 : 좀더 깔끔하게 풀이할 수 있는 방법을 생각해보자

import math

def solution(n):
    ans = 0
    for i in range(1, n+1):
        cnt=0
        for v in range(1,int(math.sqrt(i))+1):
            if i%v==0 :
                cnt+=1
        if cnt>1:
            ans+=1
            
    return ans
