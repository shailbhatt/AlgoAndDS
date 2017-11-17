package testing;

import java.io.Serializable;

public class Serialization01 implements Serializable {
		transient int b = 11;
		static int a = 91;
		
		Serialization01(){
			a++;
		}
		
}

class Test{

	public static void main(String[] args) {
		Serialization01 ob1= new Serialization01();
		System.out.print(ob1.a+ " ");
		
		Serialization01 ob2= new Serialization01();
		System.out.print(ob2.b+" "+ob2.a);
	}
	
	
}
