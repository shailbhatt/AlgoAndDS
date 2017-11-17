package numberTheory;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("isPrime(10) ->"  +isPrime(10));
		System.out.println("isPrime(11) ->"  +isPrime(11));
	}
	
	static boolean isPrime(int n){
		if(n <= 1){
			return false;
		}
		
		if(n <=3 ){
			return true;
		}
		
		if(n%2 ==0 || n%3 ==0){
			return false;
		}
		
		for(int i=5; i*i <=n; i = i+6){
			if(n%i ==0 || n%(i+2) == 0)
				return false;
		}
		
		return true;
	}
}
