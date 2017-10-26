package algo.overlapping_subproblems;

public class CoinDenominations {

	public static int numberOFWayMakingMoney(int amount, int[] denomations){
		
		int count = 0;
		int result = 0;
		
			for(int j = 0; j<denomations.length; j++){
				
				for (int num = 0; num<amount ;num++ ){
					result += denomations[j];
					
					if(result == amount){
						count ++;
					}else if(result >amount){
						
					}
				}
			}
		
		return count;
	}
	
	public static void main(String[] args) {
		int denomations[] = {1,2,3};
		System.out.println(numberOFWayMakingMoney(4,denomations));
	}
}
