package com.demo;

public class ExceptionChallenge {
	
	public static void main(String[] args) throws Exception {
		try{
			String str = "xyz";
			int a = Integer.parseInt(str);
		}catch(NumberFormatException e){
			System.out.println("10");
			throw new Exception();
		}finally{
			System.out.println("123");
		}	
	}
}
