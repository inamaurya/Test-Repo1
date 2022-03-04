import java.util.ArrayList;
import java.util.List;

public class Test11 {

	public static int reductionCost(List<Integer> num) {
	    int sum = 0;
	    int cost = 0;
	    while(num.size()>1){
	        int first_min = Integer.MAX_VALUE, second_min = Integer.MAX_VALUE;
	       int index1 = 0, index2 = 0;
	        for(int i = 0; i< num.size(); i++){
	           if(num.get(i) < first_min) {
	               second_min = first_min;
	               first_min = num.get(i);
	               index1 = i;
	           } else if(num.get(i) < second_min ){
	               second_min = num.get(i);
	               index2 = i;
	           }
	        }
	        sum = first_min + second_min;
	            num.remove(index1);
	            num.remove(index2-1);

	        num.add(sum);
	    cost += sum;
	    }
	return cost;
	    }
	
/*public static int reductionCost(List<Integer> num) {
	int cost = 0;
	int sum = 0;
	 while(num.size()>1){
	
		 Collections.sort(num);
		 sum = num.get(0) +num.get(1);
		 num.remove(0);
		 num.remove(0);
		 num.add(sum);
		 cost += sum;
    }
		return cost;
    }*/
	
	public static void main(String[] args) {
		ArrayList< Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);

		// 1 2 3 -> 3 3 -> 6 9      3+6 9 
		System.out.println(reductionCost(arr));
	}
}
