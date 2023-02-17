#풀이시간 : 10분
#풀이 핵심 내용 : 정렬 후, 두 사람만을 태우기 때문에 투 포인터 사용
#회고 : 다른 문제들을 풀어봐야곘다

def solution(people, limit):
    people.sort()
    
    start=0
    end=len(people)-1
    
    answer=0
    
    while start<=end:
        if people[start]+people[end]<=limit:
            start+=1
        answer+=1
        end-=1
    
    return answer
