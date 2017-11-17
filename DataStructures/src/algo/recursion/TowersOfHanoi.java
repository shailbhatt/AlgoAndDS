package algo.recursion;

import java.util.Scanner;

public class TowersOfHanoi {
	
	static int move = 0;
	
	static void towersOfHanoi(int n, String start, String end,String  auxiliary){
		
		if(n==1){
			System.out.println(start +"->"+end);
			move++;
		}
		else{
			towersOfHanoi(n-1,start,auxiliary,end);
			System.out.println(start +"->"+end); move++;
			towersOfHanoi(n - 1, auxiliary, start, end);
		}
	}
	
	 public static void main(String[] args) {
	       System.out.print("Enter number of discs: ");
	       Scanner scanner = new Scanner(System.in);
	       int discs = scanner.nextInt();
	       towersOfHanoi(discs, "A", "B", "C");
	       System.out.println("Total moves: "+ move);
	   }
}
