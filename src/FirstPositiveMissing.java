public class FirstPositiveMissing {

	static int firstPositive(int arr[]) {
		int n = arr.length;
		int current_pos;
		for (int i = 0; i < n; i++) {
			current_pos = arr[i]-1;
			while (arr[i] >= 1 && arr[i] < n && arr[i] != arr[current_pos]) {
				swap(arr, i, current_pos);
				current_pos = arr[i]-1;
			}
		}
		for (int i = 0; i < n; i++) {

			if (arr[i] != i + 1) {

				return i + 1;
			}
			
		}
		return n + 1;
	}

	static void swap(int arr[], int j, int k) {

		int l = arr[j];
		arr[j] = arr[k];
		arr[k] = l;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 7, 32, 4, 5, 19, 30 };

		System.out.println(firstPositive(arr));
	}
}
