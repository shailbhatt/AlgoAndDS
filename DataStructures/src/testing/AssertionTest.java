package testing;

/*While executing assertion, it is believed to be true. If it fails, 
 * JVM will throw an error named AssertionError.*/
public class AssertionTest {
	int a, b, c;

	void setA(int i) {
		a = i;
		assert validateC() : c;
	}

	void setB(int i) {
		b = i;
		assert validateC() : c;
	}

	AssertionTest(int i) {
		c = i;
		assert validateC() : c;
	}

	private boolean validateC() {
		return c > a * 2 + b;
	}

	public static void main(String[] args) {
		AssertionTest obj = new AssertionTest(251);
		obj.setA(80);
		obj.setB(70);
	}

}
