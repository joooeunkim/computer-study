//풀이 시간 : 20분
//문제 핵심 내용 : 문자열 문제
//회고 : replace를 활용하면 간단하게 문제를 풀 수 있다

def solution(s):
    cnt = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
    for i in range(len(cnt)):
        s = s.replace(cnt[i], str(i))

    return int(s)