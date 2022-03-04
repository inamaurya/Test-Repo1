package Test;

public class MaxCovidCases {


	static int maxCases(int array[]){
		int max_case = 0;
/*
		for(int i = 0; i< array.length; i++){
			
			for(int j = i+1; j < array.length; j++){
				
				if(array[i] < array[j]){
					int diff = array[j] - array[i];
					
					if(diff>max_case){
						max_case = diff;
						
				}
				}
			}*/

		int left_min = array[0];
		int max_diff = 0;
		int i = 1; 
		int from_date = 0;
		int todate = 0;
		while(i<array.length){
								
			
				if (array[i] - left_min > max_diff){
	                max_diff = array[i] - left_min;
	                todate = i;
		}
				if(left_min>array[i]){
					left_min = array[i];
					from_date = i;
					
			}
				i++;
			
			}

      System.out.println(from_date  +"   "+ todate);
		return (max_diff);
	}
	
	
	public static void main(String[] args) {
		
		
		int array[] =  {79,20,135,130,69,40};
		System.out.println(maxCases(array));
	}
}
