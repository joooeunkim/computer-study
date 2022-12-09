// 풀이 시간 : 50분
//문제 핵심 내용 : 기초적인 java의 문자열 다루는 문제이다. 해당 문자열만을 포함하는 문자열을 찾을 때 문자열을 제거해나가면서 해결했다.
//회고 : 더 빠르게 문제를 해결해나가는 방법이 있을 것이다. string의 메소드들을 더 공부해야할 필요가 있다.

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String str : babbling){
            
            boolean ok = true;
            
            while(str.length() > 0){
                if(str.length() >=3 && str.charAt(0)=='a' && str.charAt(1)=='y' && str.charAt(2)=='a'){
                    str = str.substring(3,str.length());
                } else if(str.length() >=2 && str.charAt(0)=='y' && str.charAt(1)=='e'){
                    str = str.substring(2,str.length());
                } else if(str.length() >=3 && str.charAt(0)=='w' && str.charAt(1)=='o' && str.charAt(2)=='o'){
                    str = str.substring(3,str.length());
                } else if(str.length() >=2 && str.charAt(0)=='m' && str.charAt(1)=='a'){
                    str = str.substring(2,str.length());
                } else{
                    ok = false;
                    break;
                }
            }
            
            if(ok){
                ++answer;
            }
            
        }
        return answer;
    }
}
