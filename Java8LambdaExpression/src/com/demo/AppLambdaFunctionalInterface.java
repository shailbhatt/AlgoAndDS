package com.demo;

//passing behaviour->  passong some code to method parameter
// we are familier with passing primitive type and objects to method parameter
//below is known example
public class AppLambdaFunctionalInterface {

	public static void main(String[] args) {

		// LAMBDA FUNCTION REPLACE THE anonymous object of the interface which
		// is implementing the single method
		System.out.println(process("Hello World!", str -> str.toUpperCase()));
		System.out.println(process("Hello World!", String::toUpperCase));
	}

	private static String process(String str, Processor1 processor) {
		return processor.process(str);
	}
}

// interface with the single method is called as FUNCTIONAL INTERFACE in Java8
//so whenever functional interface we pass, we can pass lambda function there
@FunctionalInterface //not mandatory annotation
interface Processor1 {
	public String process(String str);
}