public class Person {
	
	public int display(){
		return 0;
	}
}

class Student extends Person{
	
	public int display(){
		return 0;
	}
}

class Demo{
	
	public static void main(String[] args) throws Exception {
		Person p = new Person();
		Student s = new Student();
		
		Person p1 = new Student();
		
		
		Object o = new Student();
		
	}
}

