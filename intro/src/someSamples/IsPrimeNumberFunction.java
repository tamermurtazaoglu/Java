package someSamples;


public class IsPrimeNumberFunction {

	public static void main(String[] args) {
		int number = 3;
		if(isPrimeNumber2(number)) {
			System.out.println("Number is prime.");
		}
		else {
			System.out.println("Number is not prime.");			
		}
	}

	public static boolean isPrimeNumber(int number) {
		for(int i=number; i>0; i--)
		{
			if( (i != number && i != 1) && (number % i == 0) ) return false;
		}
		return true;
	}
	
	public static boolean isPrimeNumber2(int number) { // different algorithm
		for(int i=2; i<number; i++)
		{
			if( number % i == 0 ) return false;
		}
		return true;
	}
	
}
