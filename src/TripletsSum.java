import java.util.HashSet;


public class TripletsSum {

	static void getPAir(int arr[], int sum){
		int val = 0;
		
		for(int i = 0; i< arr.length; i++){
			
			int tem = sum-arr[i];
		HashSet<Integer> set = new HashSet<>();
		for(int j = 1; j< arr.length; j++){
			
			
			
			if(set.contains(tem-arr[j])){
				
				System.out.println(arr[i] +" "+ arr[j] +" " +(tem-arr[j]));
				return;
				
			}
			set.add(arr[j]);
		}
	
		}
	
	}
	
	public static void main(String[] args) {
		
		int arr [] = {2,4,5,6,7,8};
		getPAir(arr, 20);
	}
	
}
