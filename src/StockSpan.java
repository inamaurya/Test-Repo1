import java.util.Stack;

public class StockSpan {
	
	static void printSpan(int arry[], int size){
		
		Stack<Integer> st =  new Stack<>();
		
		st.push(0);
		System.out.println("print span for element "+arry[0] + " is " +1);
		
		for(int i=1; i<size; i++){
			
			while(st.isEmpty() == false && arry[st.peek()] <= arry[i]){
				st.pop();
				
			}
			
			if(st.empty()){
				
				System.out.println("print span for element "+arry[i] + " is " +(i+1));
			}else{
				
				System.out.println("print span for element "+arry[i] + " is " +(i-st.peek()));
			}
			
			st.push(i);
			
		}
	}
	
	public static void main(String[] args) {
	
		
		int array[] = {10,6,4,3,2,1,16,18,5};
		
		printSpan(array, array.length);
	}

}
