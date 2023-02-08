//풀이 시간 : 55분
//문제 핵심 내용 : 해시 문제 
//회고 : 효율성에서 계속 통과가 안되어 시간이 오래걸림

def solution(phone_book):
    phone_book = sorted(phone_book)
    hash_dict = {}

    for num in phone_book:
        hash_dict[num] = 1

    for num in phone_book:
        a = ''
        for j in num:
            a += j
            if a in hash_dict and a != num:
                return False
    return True
