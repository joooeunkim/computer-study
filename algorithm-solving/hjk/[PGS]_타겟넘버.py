//풀이 시간 : 20분
//문제 핵심 내용 : dfs/bfs로 경우의 수를 구하는 문제
//회고 : queue를 사용해 다시 풀기 완료

from collections import deque

def solution(numbers, target):
    answer = 0
    queue = deque()
    n = len(numbers)
    queue.append([numbers[0], 0])
    queue.append([-1*numbers[0], 0])
    
    while queue:
        num, idx = queue.popleft()
        idx += 1
        
        if idx < n :
            queue.append([num + numbers[idx], idx])
            queue.append([num - numbers[idx], idx])
            
        else:
            if num == target:
                answer += 1
    

    return answer
    
    
