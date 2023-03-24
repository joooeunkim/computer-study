# 풀이 시간 : 30분
# 풀이 핵심 내용 : 백트래킹
# 회고 : permutation과는 조금 다른 완탐으로 구현

Min = 0

def solution(picks, minerals):

    global Picks, L, Minerals, Min
    Picks = picks
    L = len(minerals)
    Minerals = minerals
    Min = L*25

    tools = []
    for idx, cnt in enumerate(picks):
        for i in range(cnt):
            tools.append(idx)

    dfs(0,picks[0],picks[1],picks[2],0)

    return Min


def dfs(cnt, dcnt, icnt, scnt, sums):

    global Min

    if (dcnt==0 and icnt==0 and scnt==0) or cnt*5>=L:
        if Min>sums:
            Min=sums
        return

    if dcnt>0 and cnt*5<L:
        adds = 0
        for m in Minerals[cnt*5:min(cnt*5+5, L)]:
            adds+=1
        dfs(cnt+1,dcnt-1,icnt,scnt, sums+adds)

    if icnt>0 and cnt*5<L:
        adds = 0
        for m in Minerals[cnt*5:min(cnt*5+5, L)]:
            if m=="diamond":
                adds+=5
            else:
                adds+=1
        dfs(cnt+1,dcnt,icnt-1,scnt, sums+adds)

    if scnt>0 and cnt*5<L:
        adds=0
        for m in Minerals[cnt*5:min(cnt*5+5, L)]:
            if m=="diamond":
                adds+=25
            elif m=="iron":
                adds+=5
            else:
                adds+=1
        dfs(cnt+1,dcnt,icnt,scnt-1, sums+adds)
