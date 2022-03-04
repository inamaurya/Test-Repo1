
public class Arrange012 {

static void sort(int arr[]){
		
		int left = 0;
		int mid = 0;
		int temp = 0;
		int right = arr.length-1;
		
		while(mid<=right){
			
			switch( arr[mid]){
			case 1:
			mid++;
			break;
			case 0 :{
				 temp = arr[mid];
				arr[mid] = arr[left];
				arr[left] = temp;
				left++; mid++;
				break;
			}	
		  case 2 :{
			 temp = arr[right];
			arr[right] = arr[mid];
			arr[mid] = temp;
			right--;
			break;
		  }
		}
				
		}
			
	}
	
	public static void main(String[] args) {
int array []  = {2 , 2, 1 ,0, 1, 0};
	
		 
		
		sort(array);
	}
}
