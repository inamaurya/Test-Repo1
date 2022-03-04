

class A{
	
	int i;
	int j;
	static void m(){
		System.out.println("aa");
	}
	
	
}

public class Testq extends A{
	static void m(){
		System.out.println("bb");
	}


public static void main(String[] args) {
	A t =  new Testq();
	A t1 = null;
	System.out.println(t.i);
	t1.m();


}
}