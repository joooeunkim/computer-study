# 풀이 시간 : 10분
# 풀이 핵심 내용 : 이차원 배열을 기준에 따라 정렬, xor 연산
# 

def solution(data, col, row_begin, row_end):
    
    data.sort(key = lambda x:(x[col-1],-x[0]))
    
    base=0
    for idx in range(row_begin-1,row_end):
        base ^= sum([i%(idx+1) for i in data[idx]])
        
    return base
