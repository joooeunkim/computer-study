//풀이 시간 : 35분
//문제 핵심 내용 : 시뮬레이션 문제
//회고 : 아이디어 생각해서 구현하는 기본 문제


h, w = map(int, input().split())
lst = list(map(int, input().split()))

water = 0
for i in range(1, w-1):
    l = max(lst[:i])
    r = max(lst[i+1:])

    minus = min(l, r)

    if lst[i] < minus:
        water += minus - lst[i]

print(water)