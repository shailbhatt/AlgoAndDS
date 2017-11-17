package advanceJava;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.Permission;

public class InnerClass_CanYouAccess {
	public static void main(String[] args) throws Exception {
		DoNotTerminate.forbidExit();	

		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine().trim());
			Object o = null;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
			
			
			
			 o = new Inner().new Private();
			
			System.out.println(num +" is "+((advanceJava.InnerClass_CanYouAccess.Inner.Private) o).powerof2(num));
			
			
			System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
			
		}//end of try
		
		catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}//end of main
	
	
	static class Inner{
		private class Private{
			private String powerof2(int num){
				return ((num&num-1)==0)?"is power of 2":"not a power of 2";
			}
		}
	}//end of Inner
	
}//end of InnerClass_CanYouAccess


class DoNotTerminate { //This class prevents exit(0)
	 
    public static class ExitTrappedException extends SecurityException {

		private static final long serialVersionUID = 1L;
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}	
