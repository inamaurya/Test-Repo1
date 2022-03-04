package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Program1 {

	static int m(){
		
		
try{
		int i = 5 ;	
			
		i= 5/0;
		} catch(Exception e){
			
			return 1;
		}

finally{
	return 0;
	
}

	}
		
	
	static int reqSpace(int arry[][])	{	
		
			
		Arrays.sort(arry, (a,b)->Integer.compare(a[0], b[0]));
		
		PriorityQueue<Integer> q = new PriorityQueue();
		
		for(int arr[] : arry){
			
			if(q.isEmpty()){
				q.add(arr[1]);
			}
			if(q.peek() <= arr[0]){
				q.remove();
			}
			
			q.add(arr[1]);
		}
		return q.size();
	}
	
	public static void main(String[] args) {
		
		
		int array[][] = {{7,10},{8,15},{9, 11}, {10, 12} , {11,13}, {12,14}};
		//System.out.println(reqSpace(array));
		
		System.out.println(m());
		
		final List<Integer>  s =  new ArrayList();
		
		s.add(1);
		s.add(1);
		System.out.println(s);
		
	}
	
}

