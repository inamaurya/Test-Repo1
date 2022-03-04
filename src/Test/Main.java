package Test;

import java.util.ArrayList;
import java.util.List;


class a extends Thread {
	
	public void run(){
		
		System.out.println("aaa");
	}
	
}

class c {
	
static void t(){
	System.out.println("c");
	}
}
class b extends c {
	
	
	
}

public class Main  {

	
	public static void main(String[] args) {
		
		b c  = new b();
		c.t();
		
		/*PriorityQueue<String> s = new PriorityQueue<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		System.out.println(s.poll() +""+s.peek());*/
		
/*	a s = new a();
	s.setDaemon(false);
	s.start();
	s.setDaemon(true);*/
	
	
		
	}
	
	
	 public static long getMaxUnits(List<Long> boxes, List<Long> unitsPerBox, long truckSize) {
		    // Write your code here
		     long maxval = 0;
		     long capt = 0;
		     int boxsie = boxes.size();
		     
		      long endmaxval = 0;
		      for(int j =0; j<boxsie; j++){
		          capt+=boxes.get(j);
		          if(capt <=truckSize){
		               endmaxval+= boxes.get(j)*unitsPerBox.get(j);
		              if(maxval < endmaxval){
		                  maxval =  endmaxval;
		              }
		          }
		      }
		      System.out.println(maxval);
		     return maxval;
		    }
}


