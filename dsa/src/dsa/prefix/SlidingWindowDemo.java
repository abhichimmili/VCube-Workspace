package dsa.prefix;

public class SlidingWindowDemo {

	public static void main(String[] args) {
		int[] visitors = { 10, 120, 35, 45, 60, 80, 100 };
		int days = 3;

		int windowSum = 0;

		for (int i = 0; i < days; i++) {
			windowSum += visitors[i];
		}
		System.out.println("Total number of visitors visited : " + windowSum);

		for (int i = 1; i < visitors.length - days; i++) {
			windowSum = windowSum - visitors[i - 1] + visitors[i + days];
			System.out.println(windowSum);
		}
	}

}
