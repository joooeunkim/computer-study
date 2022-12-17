//풀이 시간 : 40분
//풀이 핵심 내용 : Trie 구조를 위한 node 클래스를 생성하여 탐색 시 빠른 검색 가능
//회고 : Map 컬렉션에서 제공하는 메소드들이 다양하고, 좀더 사용 범위를 넓혀야겠다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main_BJ_14426_접두사찾기_김주은 {
	
	static class Node{
		Map<Character, Node> childNode = new HashMap<Character, Node>();
		boolean endOfword;
	}
	
	static Node root = new Node();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			makeTrie(str);
		}
		
		int ans = 0;
		
		for(int i=0;i<M;i++) {
			String pre = br.readLine();
			if(search(pre)) {
				++ans;
			}
		}
		
		System.out.println(ans);
	}

	private static boolean search(String pre) {

		Node node = root;
		
		for(int i=0;i<pre.length();i++) {
			node = node.childNode.getOrDefault(pre.charAt(i), null);
			if(node==null) {
				return false;
			}
		}
		
		return true;
	}

	private static void makeTrie(String s) {

		Node node = root;
		
		for(int i=0;i<s.length();i++) {
			node = node.childNode.computeIfAbsent(s.charAt(i), key->new Node());
		}
		
		node.endOfword = true;
		
	}

}
