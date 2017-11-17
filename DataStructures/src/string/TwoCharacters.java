package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TwoCharacters {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		String s = in.next();

		char[] ch = s.toCharArray();
		Set<Character> set = new HashSet();
		for (Character c : ch) {
			set.add(c);
		}

		List<Character> list = new ArrayList<Character>();
		list.addAll(set);
		System.out.println("printing list:"+ list);
		int max = 0;
		int n = set.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				max = Integer.MIN_VALUE;
				 System.out.print("i= "+list.get(i)+ " j= "+list.get(j));
				char iChar = list.get(i);
				char jChar = list.get(j);

				char[] copyCh = ch.clone();
				System.out.println();
				for (int p = 0; p < ch.length; p++) {
					char c = copyCh[p];
					if (c == iChar || c == jChar) {
						copyCh[p] = '#';
					}
					System.out.println(copyCh);
				}

				StringBuilder sb = new StringBuilder();

				for (int g = 0; g < ch.length; g++) {
					char c = copyCh[g];
					if (c != '#') {
						sb.append(c);
					}
				}
				
				int len =0;
				
				if(sb.toString().length() == 0){
					 len = getValidStringLength(new String(ch));
				}else{
					 len = getValidStringLength(sb.toString());
				}

				

				if (len > max) {
					max = len;
				}

			}
		}

		System.out.println(max);

	}

	static int getValidStringLength(String s) {
		System.out.println("s->"+s);
		int n = s.length();
		char[] ch = s.toCharArray();
		boolean retval = false;
		if(n>=2){
			char a = ch[0];
			char b = ch[1];
			
			 retval = true;

			for (int i = 0; i < n - 1; i = i + 2) {
				if (ch[i] != a && ch[i + 1] != b) {
					retval = false;
					break;
				}
			}
		}
		return retval ? s.length() : 0;
	}
}
