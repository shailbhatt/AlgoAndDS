package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Divisibility {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] digits = Integer.toString(n).chars().map(c -> c -= '0').toArray();
		ArrayList al= new ArrayList(Arrays.asList(digits));
		int[] digits1 = Integer.toString(21).chars().map(c -> c -= '0').toArray();
		ArrayList al3= new ArrayList(Arrays.asList(digits1));
		
		System.out.println(al.contains(al3));
//		for (int i : digits) {
//			System.out.println(i);
//		}
		
		/*if(n%k==0){
			System.out.println(n);
		}else{
			int i=1;
			lable:while(true){
				System.out.println("ENTRY WHile");
				int multiple = k*i;
				System.out.println(multiple);
				int[] digits1 = Integer.toString(multiple).chars().map(c -> c -= '0').toArray();
				ArrayList al2= new ArrayList(Arrays.asList(digits1));

				if(al.containsAll(al2)){
					System.out.println("al.containsAll(al2)  "+multiple);
					break lable;
				}else{
					i++;
				}
			}
		}*/
	}
}
