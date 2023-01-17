//풀이 시간 : 10분



T = int(input())
for tc in range(1, T+1):
    lst = list(map(int, input().split()))
    h, m = 0, 0
    for i in range(len(lst)):
        if i % 2 ==0:
            h += lst[i]
        else:
            m += lst[i]

    if h > 12:
        h = h - 12
    while m > 60:
        m = m - 60
        if m < 60:
            h += 1

    print(f'# {tc} {h} {m}')