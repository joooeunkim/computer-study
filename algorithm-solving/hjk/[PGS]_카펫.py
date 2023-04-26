//풀이 시간 : 30분
//문제 핵심 내용 : 완전탐색 문제
//회고 : 노란색과 브라운색의 갯수 차이를 생각해내면 쉽게 풀리는 문제

def solution(brown, yellow):
    yellow_x = 0
    yellow_y = 0
    ans = []

    for i in range(1, yellow+1):
        if yellow % i == 0:
            yellow_y = i
            yellow_x = yellow // i

        if yellow_x * 2 + yellow_y * 2 + 4 == brown:
            ans.append(yellow_x+2)
            ans.append(yellow_y+2)
            break

    return ans
