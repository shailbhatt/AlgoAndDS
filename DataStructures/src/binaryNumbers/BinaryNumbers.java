package binaryNumbers;

public class BinaryNumbers {

	/*
	 * 1 | 1 > 1 ,1 | 0 > 1, 0 | 1 > 1, 0 | 0 > 0
	 */
	/*
	 * Think of it like a bucket with two holes in it. If both holes are closed,
	 * no water comes out. If either hole is open, or if both are open, water
	 * comes out.
	 */
	static void BitwiseOR(int a, int b) {
		System.out.println("BitwiseOR " + (a | b));
	}

	/*
	 * Think of it like a hose with two knobs. Both knobs must be set to on for
	 * water to come out.
	 */
	static void BitwiseAND(int a, int b) {
		System.out.println("BitwiseAND " + (a & b));
	}

	static void BitwiseNOT(int a) {
		System.out.println("BitwiseNOT " + (~a));
	}

	static void BitwiseXOR(int a, int b) {
		System.out.println("BitwiseXOR " + (a ^ b));
	}

	/* shifting left multiply by 2 */
	static void BitShiftingLeft(int a, int shift) {
		System.out.println("BitShiftingLeft " + (a << shift));
	}

	/* shifting right divides by 2, throwing out any remainders. */
	static void BitShiftingRight(int a, int shift) {
		System.out.println("BitShiftingRight " + (a >> shift));
	}

	public static void main(String[] args) {
		BitwiseOR(5, 6);
		BitwiseAND(5, 6);

		// At the bit level:
		// ~ 0000 0101 (5)
		// = 1111 1010 (-6)
		BitwiseNOT(5);

		// At the bit level:
		// 0101 (5)
		// ^ 0110 (6)
		// = 0011 (3)
		BitwiseXOR(5, 6);

		BitShiftingLeft(2, 2);

		BitShiftingRight(4, 2);

	}
}
