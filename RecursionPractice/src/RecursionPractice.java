public class RecursionPractice {
	private static int loopCount = 0;
	private static int recursiveCount = 0;

	public static int factorial(int n) {
		if (n == 0) {

			return 1;
		}

		else
			return (n * factorial(n - 1));

	}

	public static int squareNumber(int n) {
		if (n == 1) {
			return 1;
		} else {
			return squareNumber(n - 1) + (2 * n) - 1;
		}
	}

	public static int logBase2(int n) {
		if (n == 1) {
			return 0;
		} else {
			return 1 + logBase2(n / 2);
		}

	}

	public static int pow(int n) {
		if (n == 1) {
			return 1;
		} else {
			return 2 * pow(n - 1);
		}
	}

	public static int pentagonalNumber(int n) {
		if (n == 1) {
			return 1;
		} else {
			return pentagonalNumber(n - 1) + (4 + 3 * (n - 2));
		}

	}

	public static int findTriangle(int n) {
		if (n == 0) {
			return 0;
		} else {
			return (findTriangle(n - 1) + (n));
		}
	}

	public static int findPyramid(int n) {
		if (n == 0) {
			return 0;
		} else {
			return (findPyramid(n - 1) + findTriangle(n));
		}
	}

	public static int recursiveFibonacci(int n) {
		if (n <= 1) {
			recursiveCount++;

			return n;
		}

		else {
			recursiveCount++;

			return recursiveFibonacci(n - 2) + recursiveFibonacci(n - 1);
		}

	}

	public static int loopingFibonacci(int n) {
		int sum = 0;
		int previous = 0;
		int next = 1;
		if (n <= 1) {
			loopCount++;
			return n;
		}

		while (2 <= n) {
			loopCount++;
			sum = previous + next;
			previous = next;
			next = sum;
			n--;

		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 2;
		int test1 = factorial(n);
		int test2 = squareNumber(n);
		int test3 = pentagonalNumber(1);
		int test4 = pentagonalNumber(2);
		int test5 = pentagonalNumber(3);
		int test6 = pentagonalNumber(4);

		// System.out.println(n + " factorial is " + test1);
		// System.out.println(test2);
		// System.out.println(test3);
		// System.out.println(test4);
		// System.out.println(test5);
		// System.out.println(test6);
		// System.out.println(findPyramid(3));
		for (int i = 1; i <= 10; i++) {
			long start = System.nanoTime();
			 //long test= recursiveFibonacci(i);
			long test = loopingFibonacci(i);
			long end = System.nanoTime();

			System.out.println(
					i + " fibonnaci number is " + test + ", and it took " + (end - start) + " nanoseconds" + loopCount);
		}

	}

}