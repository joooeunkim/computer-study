//풀이 시간 : 35분
//문제 핵심 내용 : dfs/bfs 문제 
//회고 : bfs 사용해서 문제 해결, 다음 단어가 하나 차이 나면 queue에 추가해주는 식으로 해결


from collections import deque


def solution(begin, target, words):
    answer = 0
    queue = deque()
    queue.append([begin, 0])

    V = [0] * (len(words))

    while queue:
        word, cnt = queue.popleft()

        if word == target:
            answer = cnt
            break

        for i in range(len(words)):
            diff = 0
            if not V[i]:
                for j in range(len(word)):
                    if word[j] != words[i][j]:
                        diff += 1
                if diff == 1:
                    queue.append([words[i], cnt + 1])
                    V[i] = 1

    return answer
