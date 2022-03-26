package com.tectoro.even;

import java.util.stream.Stream;

public class streamOf {

	public static void main(String[] args) 
	{
		Stream<Integer> d=Stream.of(2,76,657,987);
		d.forEach(System.out::println);
		
		Integer[] h= {54,87,90,76};
		Stream.of(h).forEach(System.out::println);

	}

}
