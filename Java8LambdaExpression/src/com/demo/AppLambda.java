package com.demo;

import java.util.function.BiFunction;
import java.util.function.Function;

//passing behaviour->  passong some code to method parameter
// we are familier with passing primitive type and objects to method parameter
//below is known example
public class AppLambda {

	public static void main(String[] args) {

		// LAMBDA FUNCTION REPLACE THE anonymous object of the interface which
		// is implementing the single method
		System.out.println(process("Hello World!", String::toUpperCase ));
		
		
		System.out.println(process2("Hello World!", 5, String::substring ));
		
		//methos reference
		String prefix ="MR.";
		System.out.println(process("Hello World!", prefix::concat ));
		
		//lambda expression
		System.out.println(process("Hello World!", str -> {
			return prefix.concat(str);
		} ));
	}
	
	private static String process2(String str, int i, BiFunction<String ,Integer, String> processor) {
		return processor.apply(str,i);
	}

	private static String process(String str, Function<String , String> processor) {
		return processor.apply(str);
	}
}
