//풀이 시간 : 20분
//문제 핵심 내용 : 스택/큐 문제
//회고 : answer를 스택처럼 사용, answer에 길이를 잘라야 반복되는 수를 뺄 수 있음


def solution(number, k):
    answer = []
    for num in number:
        while answer and k > 0 and answer[-1] < num:
            answer.pop()
            k -= 1
        answer.append(num)

    answer = ''.join(answer[:len(number)-k])
    return answer