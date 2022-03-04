
public class BinarySearchIterative {

	static int binarySearch(int arr[], int num){
		
		int left = 0, right = arr.length-1;
		
		while(left<right){
			
			int m = (left+right)/2;
			if(arr[m] == num){
				
				return m;
			}
			if(arr[m] < num){
				
				left = m+1;
				
			}else{
				
				right = m-1;
				
			}
			
		}
		
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		
		
		int arr[] = {1,3,4,5,6,7,9,12,15,30};
		
		int k = binarySearch(arr, 12);
		
		if(k == -1){
			System.out.println("item not found");
		}
		else{
			
			System.out.println("Item found at place of"+k);
		}
	}
}
