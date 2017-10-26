package com.demo;

import java.util.Arrays;
import java.util.Comparator;

//passing behaviour->  passong some code to method parameter
// we are familier with passing primitive type and objects to method parameter
//below is known example
public class ComposingLambda {

	public static void main(String[] args) {

		String[] names = {"Mr sagar", "Ms urvi", "Dr ajay"};
		
		/*Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String name1, String name2) {
				return name1.split(" ")[1].compareTo(name2.split(" ")[1]);
			}
		});*/
		
		//lambda function
		Arrays.sort(names, (name1,name2) -> name1.split(" ")[1].compareTo(name2.split(" ")[1]));
		
		//using comparing static method (helper method) of the comparator functional interface
		Arrays.sort(names, Comparator.comparing(name -> name.split(" ")[1]));
		
		//more readability by using java8 method reference
		Arrays.sort(names, Comparator.comparing(ComposingLambda::firstName));
		
		//reverse the array using JAVA8 functional interface's default method
		Arrays.sort(names, Comparator.comparing(ComposingLambda::firstName).reversed());
		
		System.out.println(Arrays.toString(names));
	}
	
	public static String firstName(String name){
			return name.split(" ")[1];
	}
}
