package demo;

import java.util.Scanner;

public class MonkeyMan {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int n = scan.nextInt();
		
		int a[] = new int[n];
		int i = 0;
		
		for(i=0;i<n;i++){
			a[i] = scan.nextInt();
			System.out.println("***"+a[i]);
		}
		
		int jump =0;
		
		loop:for(i=0;i<n;i++){
			while(a[i]- x >0){
			
				a[i]= a[i]-x+y;
				jump++;
			}
			jump++;
		}
		
		System.out.println(jump);
	}
	
	
}
