//풀이 시간 : 50분
//문제 핵심 내용 : 그리디 문제
//회고 : 어려웠던 문제. 다른 사람 해설 참고해서 해결.


def solution(name):
    ans = 0
    move = len(name) - 1
    for i, char in enumerate(name):
        ans += min(ord(char) - ord('A'), ord('Z') - ord(char) + 1)

        next = i + 1
        while next < len(name) and name[next] == 'A':
            next += 1
        move = min([move, 2 * i + len(name) - next, i + 2 * (len(name) - next)])
    ans += move
    return ans
