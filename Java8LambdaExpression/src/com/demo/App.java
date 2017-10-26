package com.demo;

//passing behaviour->  passong some code to method parameter
// we are familier with passing primitive type and objects to method parameter
//below is known example
public class App {

	public static void main(String[] args) {
		System.out.println(process("Hello World!", new Processor() {

			@Override
			public String process(String str) {
				return str.toUpperCase();
			}
		}));
	}

	private static String process(String str, Processor processor) {
		return processor.process(str);
	}
}

interface Processor {
	public String process(String str);
}