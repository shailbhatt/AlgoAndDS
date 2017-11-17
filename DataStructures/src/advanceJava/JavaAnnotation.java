package advanceJava;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Scanner;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
    String userRole() default "GUEST";
    
    int budgetLimit();
}

class FamilyMember {

	@FamilyBudget(budgetLimit = 200,userRole = "SENIOR")
    public void seniorMember(int budget, int moneySpend) {
        System.out.println("Senior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }

	@FamilyBudget(budgetLimit = 100,userRole = "JUNIOR")
    public void juniorUser(int budget, int moneySpend) {
        System.out.println("Junior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }
}

public class JavaAnnotation {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int testCases = Integer.parseInt(in.nextLine());
	        while (testCases > 0) {
	            String role = in.next();
	            int spend = in.nextInt();
	            try {
	                Class annotatedClass = FamilyMember.class;
	                Method[] methods = annotatedClass.getMethods();
	                for (Method method : methods) {
	                    if (method.isAnnotationPresent(FamilyBudget.class)) {
	                        FamilyBudget family = method.getAnnotation(FamilyBudget.class);
	                        String userRole = family.userRole();
	                        int budgetLimit = family.budgetLimit();
	                        if (userRole.equals(role)) {
	                            if(spend<=budgetLimit){
	                                method.invoke(FamilyMember.class.newInstance(),budgetLimit, spend);
	                            }else{
	                                System.out.println("Budget Limit Over");
	                            }
	                        }
	                    }
	                }
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	            testCases--;
	        }
	    }
}

//SAMPLE INPUT
/*3
SENIOR 75
JUNIOR 45
SENIOR 40*/

//SAMPLE OUTPUT
/*Senior Member
Spend: 75
Budget Left: 25
Junior Member
Spend: 45
Budget Left: 5
Senior Member
Spend: 40
Budget Left: 60*/
