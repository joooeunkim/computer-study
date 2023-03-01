# 풀이 시간 : 1시간
# 풀이 핵심 내용 : 직접 일일히 길이별 값을 직접 구하는 중복을 피한다
# 회고 : set을 활용하고, 반드시 부분합을 쓰지 않고, 합을 개별적으로 구할 수 있다는 점도 생각하면 좋을 듯하다

def solution(elements):
    numSet = set()
    l = len(elements)
    elements.extend(elements[:l-2])
    elements.insert(0,0)
    for i in range(1,len(elements)):
        elements[i] += elements[i-1]

    for cnt in range(1,l):
        for i in range(l):
            numSet.add(elements[i+cnt]-elements[i])

    return len(numSet)+1
