package demo;

import java.util.Scanner;

public class SubArrayQuestion {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();
		while (T-- > 0) {

			int N = scan.nextInt();
			int arr[] = new int[N];
			for (int i = 0; i < N; i++) {

				arr[i] = scan.nextInt();
			}
			int n = arr.length;
			if (arr[0] >= arr[n - 1]) {

				System.out.println(n);

			} else {

				System.out.println(largestSubArrayLength(arr, n));
			}
		}

		scan.close();

	}

	static int maximum(int x, int y) {

		return (x > y) ? x : y;
	}

	static int largestSubArrayLength(int arr[], int n) {

		int maxlength = 1;
		for (int i = 0; i < n - 1; i++) {
			int ai = arr[i];

			for (int j = n - 1; j > 0; j--) {

				if (ai >= arr[j]) {

					maxlength = maximum(maxlength, j - i + 1);
					break;
				}
			}

			if (i >= maxlength) {

				return maxlength;
			}
		}
		return maxlength;
	}

}
