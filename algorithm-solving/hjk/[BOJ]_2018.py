n = int(input())
cnt = 1
start = 1
end = 1
ssum = 1

while end != n:
    if ssum == n:
        cnt += 1
        end += 1
        ssum += end
        
    elif ssum > n:
        ssum -= start
        start += 1

    else:
        end += 1
        ssum += end
print(cnt)