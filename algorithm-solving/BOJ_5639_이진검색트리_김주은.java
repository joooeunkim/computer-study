//풀이 시간 : 50분
//문제 핵심 내용 : 입력을 받으면서 따로 생성해둔 Node 클래스를 통해 트리를 즉시 생성할 것. 후위순위에 대해서 알고 있어야 함
//회고 : 전위순회의 규칙을 이해했다면 Node를 생성할 필요 없이 root값보다 값이 작다가 커지는 때를 발견하여 재귀적으로 처리할 수 있다.

import java.util.Scanner;

public class Main_BJ_5639_이진검색트리_김주은 {
	
	static class Node{
		
		Node left;
		Node right;
		int val;
		
		public Node(Node left, Node right, int val) {
			super();
			this.left = left;
			this.right = right;
			this.val = val;
		}
	}
	
	static Node root = null;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext() && !sc.equals("exit")) {
			int val = Integer.parseInt(sc.next());
			
			if(root==null) {
				root = new Node(null,null,val);
				continue;
			}

			addNode(root, val);
		}
		
		postOrder(root);
		
		System.out.println(sb);
		
	}

	private static void postOrder(Node node) {
		if(node!=null) {
			postOrder(node.left);
			postOrder(node.right);
			sb.append(node.val).append("\n");
		}
	}

	private static void addNode(Node node, int val) {
		if(node.val>val) { //왼쪽 자식
			if(node.left == null) { //자식 추가
				node.left = new Node(null, null, val);
			} else { //자식으로 이동
				addNode(node.left, val);
			}
		} else if(node.val<val) { //오른쪽 자식
			if(node.right == null) { //자식 추가
				node.right = new Node(null, null, val);
			} else { //자식으로 이동
				addNode(node.right, val);
			}
		}
	}

}
