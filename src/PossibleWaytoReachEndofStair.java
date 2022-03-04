
public class PossibleWaytoReachEndofStair {

	static int countWaysToReachLast(int n){
		
		if(n == 1){
			return 1;
		}
		if(n == 2){
			return 2;
		}
/*		
		if(n == 3){
			return 4;
		}*/
		//return countWaysToReachLast(n-1) +countWaysToReachLast(n-2) +countWaysToReachLast(n-3);
		return countWaysToReachLast(n-1) +countWaysToReachLast(n-2) ;
	}
	
	public static void main(String[] args) {
		
		System.out.println(countWaysToReachLast(3));
	}
}
