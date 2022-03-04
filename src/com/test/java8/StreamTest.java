package com.test.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();

			list.add(1);
			list.add(10);
			list.add(21);
			list.add(41);
			list.add(15);
			list.add(14);
			list.add(11);
			Stream s = list.stream();
			
			List<Integer> streamList = new ArrayList<>();	
			streamList = list.stream().filter(i -> i<15).collect(Collectors.toList());
			
			System.out.println(streamList);

	}

}
