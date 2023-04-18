#풀이 시간 : 40분
#풀이 방법 : index를 이용한 범위 탐색
#회고 : 꼼꼼함 필요

def solution(n, stations, w):
    answer = 0
    spread = 0
    ranges = 2*w+1
    
    for station in stations:
        
        if spread+1<station-w:
            dist = station-w-spread-1
            answer+=(((dist-1)//ranges)+1)

        spread = station+w
    
    if spread<n:    
        dist = n-spread
        answer+=(((dist-1)//ranges)+1)
            
    return answer
