//풀이 시간 : 30분
//문제 핵심 내용 : 정렬 문제
//회고 : lambda 함수를 사용해 정렬하고, 문자열에 * 3을 해서 문자열 크기를 비교해서 풀어야 하는 문제.

def solution(numbers):
    numbers = list(map(str, numbers))
    numbers.sort(key=lambda x : x * 3, reverse=True)
    return str(int(''.join(numbers)))