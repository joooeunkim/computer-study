# 풀이 시간 : 1시간 30분
# 풀이 핵심 내용 : 그리디하게 현재 이용할 수 있는 방을 선점하도록, heap을 사용하든, 누적합, list에서 remove하는 등 해야한다
# 회고 : 어떻게 하면 그리디를 구성할지를 정렬 기준을 잘 확인할 것

from heapq import heappush, heappop

def solution(book_time):
    time = []
    for s,e in book_time:
        s_hour = int(s[1:2] if s[0]=='0' else s[:2])
        s_min = int(s[4:] if s[3]=='0' else s[3:])
        e_hour = int(e[1:2] if e[0]=='0' else e[:2])
        e_min = int(e[4:] if e[3]=='0' else e[3:])
        time.append([s_hour*60+s_min,e_hour*60+e_min+10])
    
    time.sort(key = lambda x : (x[0],x[1]))
    
    heap = []
    
    cnt=1
    heappush(heap,time[0][1])
    
    for i in range(1,len(time)):
        min_end = heappop(heap)
        if time[i][0]<min_end:
            heappush(heap,min_end)
            cnt+=1
        heappush(heap,time[i][1])
            
    return cnt
    
