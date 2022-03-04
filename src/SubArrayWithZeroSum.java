import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {

	
	static int countTotalSubArrayWithZeroSum(int arr[], int size, int num){
		int count = 0;
		int sum= 0;
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i<size; i++){
			sum = sum+arr[i];
			if(!set.contains(sum-num)){
				set.add(sum);
			
			}else{
				count++;
			}
			
		}
		
		return count;
	} 
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,1, 5,-1};
		System.out.println(countTotalSubArrayWithZeroSum(arr, arr.length, 5));
	}
}
