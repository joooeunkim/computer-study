//풀이 시간 : 30분
//문제 핵심 내용 : 해시 문제 
//회고 : 재풀이 해보면서 시간을 줄임

def solution(phone_book):
    phone_book = sorted(phone_book)
    dict = {}

    for num in phone_book:
        dict[num] = 1

    for num in phone_book:
        a = ''
        for i in num:
            a += i
            if a in dict and a != num:
                return False
    return True
