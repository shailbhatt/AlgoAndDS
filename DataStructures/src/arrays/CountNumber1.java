package demo;

import java.util.Arrays;
import java.util.Scanner;

public class CountNumber1 {
	public static void main(String[] args) {

		System.out.println(0%2);
		
		Scanner sc = new Scanner(System.in).useDelimiter("\\s");

		String str = sc.nextLine();
		String[] splitStr = str.trim().split("\\s+");

		int n = Integer.parseInt(splitStr[0]);
		int d = Integer.parseInt(splitStr[1]);

		String secInput = sc.nextLine();
		String[] splitStr2 = secInput.trim().split("\\s+");

		int a = Integer.parseInt(splitStr2[0]);
		int b = Integer.parseInt(splitStr2[1]);

		String thirdInput = sc.nextLine();
		String[] splitStr3 = thirdInput.trim().split("\\s+");

		int[] arr = Arrays.stream(splitStr3).mapToInt(Integer::parseInt).toArray();

		int count = 0;
		int c = Math.abs(a - b);

		if (c == 0)
			c = a;

		int e = Math.abs(a + b);

		for (int j = 0; j < n; j++) {
			if (arr[j] != 0) {
				if ((arr[j] % (d + a) == 0) || (arr[j] % (d + b) == 0) || (arr[j] % (d + c) == 0)
						|| (arr[j] % (d + e) == 0)) {
					count++;
					System.out.println("count if"+ count +" iteration no "+ j);
//					continue;
				} else {
					if ((Math.abs(d - a) % arr[j] == 0) || (Math.abs(d - b) % arr[j] == 0)
							|| (Math.abs(d - c) % arr[j] == 0) || (Math.abs(d - e) % arr[j] == 0)) {
						count++;
						System.out.println("count else"+count+" iteration no "+ j);
					}
				}
			}
		}

		System.out.println(count);
	}
}
