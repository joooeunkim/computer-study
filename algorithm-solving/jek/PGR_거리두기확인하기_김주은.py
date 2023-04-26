#풀이 시간 : 120분
#풀이 핵심 내용 : 그냥 2단계 까지 탐색하는 dfs 또는 완전 탐색
#회고 : python에서 loop 탈출법이 있는지 확인해야겠다

dr = [0,1,0,-1]
dc = [1,0,-1,0]

def solution(places):
    
    answer = [0]*5

    for k in range(5):
        avail=True
        place = []
        for x in places[k]:
            place.append([i for i in x])

        for i in range(5):
            for j in range(5):
                if avail and place[i][j]=='P':
                    visited = [[False for _ in range(5)] for _ in range(5)]
                    visited[i][j]=True
                    for d in range(4):
                        nx = i+dr[d]
                        ny = j+dc[d]
                        if 0<=nx<=4 and 0<=ny<=4:
                            if place[nx][ny]=='P':
                                avail=False
                                break
                            elif place[nx][ny]=='X':
                                continue
                            elif place[nx][ny]=='O':
                                visited[nx][ny]=True
                                for d in range(4):
                                    nxx = nx+dr[d]
                                    nyy = ny+dc[d]
                                    if 0<=nxx<=4 and 0<=nyy<=4:
                                        if not visited[nxx][nyy] and place[nxx][nyy]=='P':
                                            avail=False
                                            break
                                visited[nx][ny]=False
                        if not avail:
                            break
        if avail:
            answer[k]=1
            
    return answer
                    
