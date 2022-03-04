package com.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamExceptionHanding {

	
	public static void main(String[] args) {
	
		
		List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
		List<String> strings = Arrays.asList("1", "9", "Ajay");
//		strings.forEach(lambdaWrapper(i-> System.out.println(Integer.parseInt(i))));
		strings.forEach(lambdaWrapper(Thread.sleep(10)));
		
//		integers.forEach(lambdaWrapper(i -> System.out.println(50 / i)));
		//		integers.forEach(i -> System.out.println(50 / i));
	}
	
	
	
	static <E> Consumer<E> lambdaWrapper(Object object) {
	    return i -> {
	        try {
	            ((Consumer<E>) object).accept(i);
	        } catch (Exception e) {
	            System.err.println(
	              "Runtime Exception occured : " + e.getMessage());
	        }
	    };
	}
}
