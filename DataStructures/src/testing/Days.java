package testing;

public enum Days {MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY; 
	String getDay(){ return "HOLIDAY";}
}


class demo{
	public static void main(String[] args) {
		System.out.println(Days.SUNDAY.getDay());
	}
}
