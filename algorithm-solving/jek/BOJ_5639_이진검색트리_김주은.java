//Ǯ�� �ð� : 50��
//���� �ٽ� ���� : �Է��� �����鼭 ���� �����ص� Node Ŭ������ ���� Ʈ���� ��� ������ ��. ���������� ���ؼ� �˰� �־�� ��
//ȸ�� : ������ȸ�� ��Ģ�� �����ߴٸ� Node�� ������ �ʿ� ���� root������ ���� �۴ٰ� Ŀ���� ���� �߰��Ͽ� ��������� ó���� �� �ִ�.

import java.util.Scanner;

public class Main_BJ_5639_�����˻�Ʈ��_������ {
	
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
		if(node.val>val) { //���� �ڽ�
			if(node.left == null) { //�ڽ� �߰�
				node.left = new Node(null, null, val);
			} else { //�ڽ����� �̵�
				addNode(node.left, val);
			}
		} else if(node.val<val) { //������ �ڽ�
			if(node.right == null) { //�ڽ� �߰�
				node.right = new Node(null, null, val);
			} else { //�ڽ����� �̵�
				addNode(node.right, val);
			}
		}
	}

}
