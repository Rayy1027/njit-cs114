package week3;

public class SimpleAlgorithms {
	
	public static int maxOfThree(int a, int b, int c) {
		int max = a;
		if (b > a) {
			max = b;
		}
		if (c > max){
			max = c;
		}
		return max;
	}
	
	/* Matrix pass */
	public static void oneDimArray(int[] arr) {
		for (int i = 0; i <= arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}
	
	public static void twoDimMatrix(int[][] matrix) {
		for (int i = 0; i <= matrix.length-1; ++i) {
			for (int j = 0; j <= matrix[i].length; ++j) {
				System.out.println(matrix[i][j]);
			}
		}
	}
	
	public static void threeDimMatrix(int[][][] matrix) {
		for (int i = 0; i <= matrix.length; ++i) {
			for (int j = 0; j <= matrix[i].length; ++j) {
				for (int k = 0; k <= matrix[i][j].length; ++k) {
				System.out.println(matrix[i][j][k]);
				}
			}
		}
	}
	
	/* Find maximum in array */
	public static int maxOfarray(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	/* Find key in array */
	public static int sequantialSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
		
	/* Find key in SORTED array */
	public static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid = (high - low) / 2;
			if (key < arr[mid]) {
				high = mid - 1;
			}
			else if (key > arr[mid]) {
				low = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}	
	
	/* How many iterations */
	public static int funnyLoop(int n) {
		int itrCounter = 0;
		for (int i = 1; i <= n; i*=2) {
			++itrCounter;
		}
		return itrCounter;
	}
	
}