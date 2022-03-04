import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithGivenSum {

	static int getLongestSubArray(int arr[], int size, int given_sum ){
		
		int max_len = 0;
		int sum =0;
		
		int i = 0;
		Map<Integer, Integer> map = new HashMap<>();
		while(i<size){
		
			sum = sum+arr[i];
			if(given_sum == sum){
				max_len = i+1;
			}
			if(map.containsKey(sum) == false)
				map.put(sum, i);
			
			  if(map.containsKey(sum-given_sum) == true)
	            {
	                if(max_len < i - map.get(sum-given_sum))
	                	max_len = i - map.get(sum-given_sum);
	                
	            }
			  i++;
		}
		
		return max_len;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = new int[]{1, 1, -1, 0 };
        int len = arr.length;
        
        System.out.println(getLongestSubArray(arr, len, 2));
	}
}
