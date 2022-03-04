
public class Test {

	
	public static void main(String[] args) {
		
	/*	print2(1,2,3); // stalled  fine with existing
		print2(2,3,1); // on trac   fine with existing
		print2(3,1,2); // stalled    
		print2(1,3,2); // slow    fine with existing
		print2(3,2,1); // on trac   fine with existing
		print2(2,1,3); // slow   
		
	


		
		print2(25, 26, 12);
		print2(1,2,2); // 
		print2(2,1,2); //
		print2(2,2,1);
		print2(3,1,1); // 
		print2(1,3,1); //
		print2(3,3,1); // on trac   fine with existing
		print2(2,3,2); // slow 
		print2(2,2,3);
		print2(3,3,2);
		print2(2,3,1);*/

		print1(2,2,1); // stalled  fine with existing
		
/*		print1(1,2,3); // stalled  fine with existing
		print1(2,3,1); // on trac   fine with existing
		print1(3,1,2); // stalled    
		print1(1,3,2); // slow    fine with existing
		print1(3,2,1); // on trac   fine with existing
		print1(2,1,3); // slow  
*/		
/*		print1(1,2,2); 
		print1(2,1,2);
		print1(2,2,1);
		print1(3,1,1); 
		print1(1,3,1); 
		print1(3,3,1); 
		print1(2,3,2); 
		print1(2,2,3);
		print1(3,3,2);
		print1(2,3,1);*/
		
	}
	
	
	
	
static void print2(int i, int j, int k)
	
	{
		
		if(k<i){
			
			if(k<j){
								
				System.out.println("on track");
			} else {
				
				System.out.println("stalled");
			}
		}
		
		else {
			
			if(i<j && k>=j){
				System.out.println("stalled");
			} else {
				System.out.println("slow");
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
/*	static void print2(int i, int j, int k)
	
	{
		
		if(k<=i){
			
			if(k<=j){
								
				System.out.println("on track");
			} else if(i > j ) {
				System.out.println("stalled");
			} else {
				
				System.out.println("slow");
			}
		}
		
		else {
			if(i<j && k > j){
				System.out.println("stalled");
			} else {
				
				System.out.println("slow");
			}
		}
		
		
	}*/
	
	
	
// correct one
/*	static void print2(int i, int j, int k)
	
	{
		
		if(k<i){
			
			if(k<j){
								
				System.out.println("on track");
			} else if(i > j ) {
				System.out.println("stalled");
			} else {
				
				System.out.println("slow");
			}
		}
		
		else {
			
			if(i<j && k>=j){
				System.out.println("stalled");
			} else {
				System.out.println("slow");
			}
		}
		
		
	}*/
	
	
	
	
	static void print1(int i, int j, int k)	{
		
		if(k<i){
			System.out.println("on track");
			
		} else if(k < j)
		{
			System.out.println("slow");
		}
		else {
			
			System.out.println("stalled");
		}
		
		
	}
	
/*	static void print(int i, int j, int k)
	
	{
		
		if(k<i){
			
			if(k<j){
				
				System.out.println("on track");
			} else {
				System.out.println("slow");
			}
		}
		
		else {
			
			if(i<j && k>j){
				System.out.println("slow");
			} else {
				System.out.println("stalled");
			}
		}
		
		
	}*/
	

}
