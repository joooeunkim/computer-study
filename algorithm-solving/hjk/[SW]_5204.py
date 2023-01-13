//풀이 시간 50분
//문제 핵심 내용 : 병합 정렬 문제
//회고 : 정렬 개념을 다시 보고 적용하느라 시간이 많이 걸림.

def merge_sort(arr):
    if len(arr) == 1:
        return arr
    mid = len(arr)//2
    left = arr[:mid]
    right = arr[mid:]

    left = merge_sort(left)
    right = merge_sort(right)

    return merge(left, right)

def merge(left, right):
    global cnt
    result = []
    i = j = 0
    left_length = len(left)
    right_length = len(right)

    if left[-1] > right[-1]:
        cnt += 1

    while i < left_length or j < right_length:
        if i < left_length and j < right_length:
            if left[i] < right[j]:
                result.append(left[i])
                i += 1
            else:
                result.append(right[j])
                j += 1

        else:
            if i < left_length:
                result.append(left[i])
                i += 1
            else:
                result.append(right[j])
                j += 1

    return result

T = int(input())
for tc in range(1, T+1):
    N = int(input())
    arr = list(map(int, input().split()))
    cnt = 0
    result = merge_sort(arr)

    print(f'#{tc} {result[N//2]} {cnt}')