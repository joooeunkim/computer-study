//풀이 시간: 5분
//풀이 핵심 내용: 등차수열과 등비수열에 대한 개념
//회고: 중복 내용을 줄이자

class Solution {
    public int solution(int[] common) {
        int answer = 0;

        if(common[2]-common[1] == common[1]-common[0]){
            int d = common[2]-common[1];
            answer = common[common.length-1]+d;
        } else if(common[2]/common[1] == common[1]/common[0]){
            int d = common[2]/common[1];
            answer = common[common.length-1]*d;
        }

        return answer;
    }
}
