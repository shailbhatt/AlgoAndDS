package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SubArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();
		while (T-- > 0) {

			int N = scan.nextInt();
			int A[] = new int[N];
			for (int i = 0; i < N; i++) {

				A[i] = scan.nextInt();
			}

			int n = A.length;
			largestSubArrayLength(A, n);

		}

		scan.close();
	}

	static void largestSubArrayLength(int[] A, int N) {
		int[] temp = Arrays.copyOf(A, N);
		Arrays.sort(temp);
		List<Integer> al = Arrays.stream(A).boxed().collect(Collectors.toList());
		List<Integer> sorted = Arrays.stream(temp).boxed().collect(Collectors.toList());

		for (Integer s : sorted) {
			System.out.println("----" + s);
		}

		for (Integer a1 : al) {
			System.out.println("--al--" + a1);
		}

		int index = 0;
		int leftmostE = 0;
		int searchEIndex = 0;
		int length = 0;
		int[] max = new int[N];
		int leftIndex = 0;
		int result = 0;

		for (int i = 0; i < N; i++) {

			index = sorted.indexOf(A[i]);

			lable: for (int j = 0; j < index; j++) {
				leftmostE = (int) sorted.get(j);
				searchEIndex = al.indexOf(sorted.get(j));

				if (searchEIndex > i) {
					length = searchEIndex - index + 1;
					System.out.println("^^^" + length);
					if (length == N) {
						result = length;
						continue lable;
					} else if (result < length) {
						result = length;
					}
				}
			}
		}

		System.out.println("Length---" + result);

	}

}
