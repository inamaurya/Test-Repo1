
public class WaterTrapping {
	
	public static int cal_stored_water(int arr[]){
		
		int left[] = new int[arr.length];
		int right[]= new int[arr.length];
		int cal = 0;
		
		
		
		left[0] = arr[0];
		int leftmax= left[0];
		for(int i=1; i<arr.length;i++){
			if(leftmax < arr[i]){
				leftmax = arr[i];
				
			}
			left[i] = leftmax;
			
		}
        right[arr.length - 1] = arr[arr.length - 1];
        int rightmax= right[arr.length - 1];
		for(int i=arr.length-2; i>=0;i--){
			if(rightmax < arr[i]){
				rightmax = arr[i];
				
			}
			right[i] = rightmax;
			
		}
		for(int i = 0; i< left.length; i++){
			cal += Math.min(left[i], right[i]) - arr[i];
		}
		
		return cal;
	}

	public static void main(String[] args) {
		int arr[] = new int[] {  0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int k = cal_stored_water(arr);
		System.out.println("output" +k);
	}
}
