//풀이 시간 : 1시간
//풀이 핵심 내용 : 딕셔너리 구조를 사용해서 푸는 것이 효과적이다. collection에서 Counter(array).most_common()을 통해 바로 최빈값을 구할 수 있다
//회고 : 출력할 때 최빈값을 return해야하나 최빈값의 갯수를 반환해 오랫동안 삽질했다..

def solution(array):

    d = {}
    for i in array:
        if i in d:
            d[i] += 1
        else:
            d[i] = 1

    max_ = -1
    mode = -1
    for i,v in d.items():
        if v>max_: 
            max_=v
            cnt=1
            mode=i
        elif v==max_:
            cnt+=1

    return -1 if cnt>1 else mode
