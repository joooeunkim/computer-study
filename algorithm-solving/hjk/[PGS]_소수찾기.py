//풀이 시간 : 45분
//문제 핵심 내용 : 완전 탐색 문제
//회고 : permutations를 import해서 푸는 문제. 생각보다 시간이 걸림


from itertools import permutations


def solution(numbers):
    answer = []
    nums = list(numbers)
    per = []
    for i in range(1, len(numbers) + 1):
        per += list(permutations(nums, i))
    n_nums = [int(('').join(p)) for p in per]

    n_nums = list(set(n_nums))
    for n in n_nums:
        if n < 2:
            continue
        check = True
        for i in range(2, int(n ** 0.5) + 1):
            if n % i == 0:
                check = False
                break
        if check:
            answer.append(n)
    return len(answer)