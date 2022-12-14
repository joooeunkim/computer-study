//풀이 시간 : 50분
//문제 핵심 내용 : 세그먼트 트리를 이용해 푸는 문제
//회고 : 세그먼트 트리를 처음 사용해봐서 어떻게 적용하는 지 다른 사람들의 코드를 읽고 이해하려고 노력했다.
//       이해하기 쉽지 않았는데 세그먼트 트리를 여러 다양한 문제에 적용해봐야 이해될 듯하다.


tree = [0] * 4000000
n = int(input())


def update(node, start, end, idx, diff):
    if start > idx or end < idx:
        return

    tree[node] += diff

    if start != end:
        update(node * 2, start, (start + end) // 2, idx, diff)
        update(node * 2 + 1, (start + end) // 2 + 1, end, idx, diff)


def query(node, start, end, k):
    if start == end:
        return start

    if tree[node * 2] >= k:
        return query(node * 2, start, (start + end) // 2, k)

    else:
        return query(node * 2 + 1, (start + end) // 2 + 1, end, k - tree[node * 2])


for _ in range(n):
    s = list(map(int, input().split()))
    if s[0] == 1:
        ans = query(1, 1, 1000000, s[1])
        print(ans)
        update(1, 1, 1000000, ans, -1)
    elif s[0] == 2:
        update(1, 1, 1000000, s[1], s[2])