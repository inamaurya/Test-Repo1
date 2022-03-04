
public class ArrangeABC {

	
static void sort(int arr[]){
		
		int i = 0;
		int j = 1;
		int k = 2;
		int right = arr.length-1;
		
		
		
		while(i<right){
			
			while(i<right){
				if(arr[i] ==0)
					i +=3;
				else
					break;
			}
			while(j<right){
				if(arr[j] ==1)
					j +=3;
				else
					break;
			}
			while(k<right){
				if(arr[k] ==2)
					k +=3;
				else
					break;
			}
			
			if(i<right && arr[i] != 0 && j<right )	{
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}	
			
              if(j<right && arr[j] != 1  && k<right )	{
				
				int temp = arr[j];
				arr[j] = arr[k];
				arr[k] = temp;
			}	
              if(k<right && arr[k] != 2  && i<right)	{
  				
  				int temp = arr[k];
  				arr[k] = arr[i];
  				arr[i] = temp;
  			}	
			
		}
		for(int a : arr)
		System.out.print(a);
	} 
	
	public static void main(String[] args) {
		
		
		int array []  = {2 , 2, 1 ,0, 1, 0};
	
		 
		
		sort(array);
		
	}
}
