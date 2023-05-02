# 풀이 시간 : 10분
# 풀이 핵심 내용 : 몫과 나머지, 중복 확인 로직 짜기
# 회고 : 몫과 나머지 잘 이용

def solution(n, words):
    
    w = dict()
    
    for idx, word in enumerate(words):
        if word in w:
            return [idx%n+1, idx//n+1]
        else:
            w[word]=True
            
        if idx>=1 and words[idx-1][-1]!=words[idx][0]:
            return [idx%n+1, idx//n+1]
        
    return[0,0]
