package string;

import java.util.Scanner;

public class SuperReduce {
	static String super_reduced_string(String s){
        // Complete this function
        
        StringBuffer sb = new StringBuffer(s);
        
        int n = sb.length();
        
        int j = 0;
        for(int i=j; i<(sb.length()-1);i++){
        	 System.out.println(sb+"-i-"+i+"condition: "+ (sb.length()-1) );
            if(sb.charAt(i) == sb.charAt(i+1)){
            	if(sb.length() == 2){
            		 sb.delete(0,sb.length());
            	}else{
            		sb.delete(i,i+2);
            		while(i>=0){
            			i--;
            		}
            	}
            }

        }
        
     
        
       
        
        
         return (sb.length() == 0) ? "Empty String" : sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
