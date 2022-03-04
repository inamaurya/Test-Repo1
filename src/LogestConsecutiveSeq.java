import java.util.HashSet;
import java.util.Set;

public class LogestConsecutiveSeq {

	
	static int getLongestConse(int arr[], int size ){
     int res = 0;
	Set<Integer> set =  new HashSet<>();
	for(int a : arr){
		set.add(a);
	}
	for(int b: set){
		
		if(set.contains(b-1) == false){
			
			int current =1;
			while(set.contains(b+current)){
				current++;
				
			}
			res =  Math.max(res, current);
		}
	}
     return res;
  	}
	public static void main(String[] args) {
		int arr[] = new int[]{2,4, 6, 3,1 ,9 };
        int len = arr.length;
        
        System.out.println(getLongestConse(arr, len));
	}
}

