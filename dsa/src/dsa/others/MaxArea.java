package dsa.others;

public class MaxArea {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 5, 6, 7 };
		int maxArea = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int curr = arr[i];
			int prev = i;
			while (prev >= 0 && arr[prev] >= curr) {
				prev--;
			}
			int next = i;
			while (next < n && arr[next] >= curr) {
				next++;
			}
			int width = next - prev - 1;
			int area = curr * width;
			if (area > maxArea) {
				maxArea = area;
			}
		}
		System.out.println(maxArea);

	}

}
