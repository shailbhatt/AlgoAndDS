package warmup;

import java.util.Scanner;

public class Timeconversion {
	static String timeConversion(String s) {
        // Complete this function
        
        int hh = Integer.parseInt(s.substring(0,2));
        String mm = s.substring(3,5);
        String ss = s.substring(6,8);
        String meridian = s.substring(8);
        
        if("PM".equals(meridian)){
            if(hh != 12){
                hh += 12;
                if(hh == 24){
                    hh = 00;
                }
            }
        }else if("AM".equals(meridian) && hh == 12){
            hh = 00;
        }
        
        StringBuffer sb = null;
        if(hh < 10){
        	sb = new StringBuffer("0");
        	sb.append(hh);
        }else{
        	sb = new StringBuffer(String.valueOf(hh));
        }
        
        
        return sb+":"+mm+":"+ss;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
