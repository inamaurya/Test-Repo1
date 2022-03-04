
public class BinarySearchRec {

	static int binarySearch(int arr[], int left, int right, int num){
		
		if(left<right){
			int m = (left+right)/2;
			if(arr[m] == num){
				
				return m;
			}
			if(arr[m] < num){
				
				return binarySearch(arr, m+1, right, num);
				
			}else{
				
				return binarySearch(arr, left, m-1, num);
				
			}
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		
		
		int arr[] = {1,3,4,5,6,7,9,12,15,30};
		
		int k = binarySearch(arr, 0, arr.length-1, 15);
		
		if(k == -1){
			System.out.println("item not found");
		}
		else{
			
			System.out.println("Item found at place of"+k);
		}
	}
}

