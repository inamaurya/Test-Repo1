package com.test.java8;

@FunctionalInterface
 interface FunctionalInterface1 {
    void method1(int x, int y);
    
    public default void default_method1(){
        System.out.println("I am default method of interface");
   }
    public static void default_method(){
        System.out.println("I am default method of interface");
   }
    
    
}

interface interface_default {
	
     public static void default_method(){
        System.out.println("I am default method of interface");
   }
    static void default_method1(){
        System.out.println("I am default method of interface");
   }
   default void default_method2(){
        System.out.println("I am default method of interface");
   }
}

public class FunIterface implements interface_default {

	   public static void main(String args[]) {

		   interface_default i = new FunIterface();
		   
          i.default_method2();
          FunctionalInterface1  fobj = (int x, int y)->System.out.println(x+y); 
          
          fobj.method1(1, 2);
	   }

	}