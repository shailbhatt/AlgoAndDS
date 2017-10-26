package arrays;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[][] matrix = new int[a][a];
		for (int row = 0; row < a; row++) {
			for (int col = 0; col < a; col++) {
				matrix[row][col] = scan.nextInt();
			}
		}

		int sumOfDiagonal1 = 0;
		for (int i = 0, j = 0; i < a && j < a; i++, j++) {
			System.out.println(matrix[i][j]);
			sumOfDiagonal1 += matrix[i][j];
		}

		int sumOfDiagonal2 = 0;
		for (int i = 0, j = a-1; i < a && j >= 0; i++, j--) {
			System.out.println(matrix[i][j]);
			sumOfDiagonal2 += matrix[i][j];
		}

		int difference = Math.abs(sumOfDiagonal1 - sumOfDiagonal2);
		System.out.println("SumOfBothDiagonals"+difference);
	}
}
