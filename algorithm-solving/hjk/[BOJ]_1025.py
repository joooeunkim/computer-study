//풀이 시간 : 60분
//문제 핵심 내용 : 브루트 포슴 문제 반복문을 여러번 돌면서 math의 sqrt 함수를 써서 품
//회고 : 생각하고 구현할 때까지 시간이 많이 걸렸고, 시간 초과가 떠서 다른 사람들의 코드들을 참고해서 풀었다.



from  math import sqrt


N,M=map(int,input().split())

lst =[list(map(int,input()))for _ in range(N)]

answer=-1

for i in range(N):
    for j in range(M):
        for d1 in range(-N,N):
            for d2 in range(-M,M):
                num=''
                x,y=i,j
                while 0<=x<N and 0<=y<M:
                    num+=str(lst[x][y])
                    if d1==0 and d2==0:
                        break
                    if int(sqrt(int(num)))**2==int(num):
                        answer=max(int(num),answer)

                    x+=d1
                    y+=d2

print(answer)
