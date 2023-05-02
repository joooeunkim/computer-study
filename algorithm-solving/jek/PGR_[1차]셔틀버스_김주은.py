#풀이 시간 : 1시간
#풀이 핵심 내용 : 구현력
#회고 : 시간에 대한 출력은 string format 이용하면 편리하다

from collections import deque

def solution(n, t, mm, timetable):
    answer = ''
    timetable.sort()
    
    times = []
    for time in timetable:
        h, m = time.split(":")
        h = int(h[1]) if h[0]=='0' else int(h)
        m = int(m[1]) if m[0]=='0' else int(m)
        times.append(h*60+m)
        
    times.sort()
    
    d = deque(times)
    
    start = 540
    for i in range(n):
        if i+1<n:
            for _ in range(mm):
                if d and d[0]<=start:
                    d.popleft()
            start+=t
        else:
            answer = 0
            if len(d)<mm or d[mm-1]>start:
                answer = start
            else:
                answer =  d[mm-1]-1
            
            h = answer // 60
            m = answer % 60
            return '{0:02d}:{1:02d}'.format(h, m)
                
    
        
        
