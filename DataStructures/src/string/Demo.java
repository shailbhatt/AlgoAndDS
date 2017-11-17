package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Demo {

	static boolean validate(String s) {
		boolean isvalidate = true;
		char sArr[] = s.toCharArray();
		char a = sArr[0];
		char b = sArr[1];

		for (int i = 0; i < sArr.length - 1; i = i + 2) {
			if (sArr[i] == a & sArr[i + 1] == b) {
			} else {
				isvalidate = false;
				break;
			}
		}

		return isvalidate;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		scan.nextLine();
		String s = scan.nextLine();

		char sArr[] = s.toCharArray(); // char array
		Set<Character> set = new HashSet<Character>();

		for (char c : sArr) {

//			String sChar = String.valueOf(c);
//			set.add(sChar);
			set.add(c);
		}

		List<Character> list = new ArrayList<Character>();
		list.addAll(set);
		int max = 0;
		
		System.out.println("printing list:"+ list);

		int lengthSet = set.size();
		for (int i = 0; i < lengthSet - 1; i++) {
			for (int j = i + 1; j < lengthSet; j++) {
				max = Integer.MIN_VALUE;
				 System.out.print("i= "+list.get(i)+ " j= "+list.get(j));
				char iChar = list.get(i);
				char jChar = list.get(j);
				 
				char sArr2[] = sArr.clone();
				// code logic starts

				System.out.println();
				for (int p = 0; p < sArr2.length; p++) {
					char c = sArr2[p];
					
					
					System.out.println("printing list.get("+i+"):"+ iChar);
					System.out.println("printing list.get("+j+"):"+ jChar);

					if (c == iChar || c == jChar) {
						sArr2[p] = '#';
					}
					
					System.out.println(sArr2);
				}
				
				
				StringBuilder sB = new StringBuilder();

				for (int g = 0; g < sArr.length; g++) {
					char c = sArr2[g];
					if (c != '#') {
						sB.append(c);
					}
				}
				 System.out.println(set);
				String finalString = sB.toString();
				 System.out.println("sb "+sB);

				boolean resultStr = validate(finalString);
				 System.out.println("finalString "+ finalString + resultStr +" resultStr");
				if (resultStr == true) {
					System.out.println("finalString "+finalString);
					int len = finalString.length();
					if (len > max)
						max = len;
				}

				// code logic ends

			}

		}

		if (max < 0)
			System.out.println(0);
		else
			System.out.println(max);

	}
}
