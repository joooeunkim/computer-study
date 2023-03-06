//풀이 시간 : 4시간
//풀이 핵심 내용 : stack 사용, 피연산자는 먼저 출력, 연산자만 스택에 넣어서 연산자 우선순위에 따라 pop해야한다
//회고 : 전혀 다른 방향으로 문자열 자체를 push pop 하느라 오랜 삽질을 했다. 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_BJ_1918_후위표기식_김주은 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char now = str.charAt(i);
			
			if(now=='+'||now=='-'||now=='*'||now=='/') {
				while(!stack.isEmpty() && priority(stack.peek())>=priority(now)) {
					sb.append(stack.pop());
				}
				stack.add(now);
			}else if(now=='(') {
				stack.add(now);
			}else if(now==')') {
				while(!stack.isEmpty() && stack.peek()!='(') {
					sb.append(stack.pop());
				}
				stack.pop();//'('삭제
			}else { //피연산자
				sb.append(now);
			}
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		
		System.out.println(sb);
		
	}
	
	public static int priority(char oper) {
		if(oper =='(' || oper==')') {
			return 0;
		}else if(oper=='+' || oper=='-') {
			return 1;
		}else {
			return 2;
		}
	}
	
	
}
