package scenerioBased2;

public class MathUtility {

	//Method to calculate factorial
	public int factorial(int number) {
		
		if(number<0) {
			System.out.println("Not possible for negative number");
			return -1;
		}
		
		if(number==0) {
			return 1;
		}
		int factorialValue=1;
		for(int num=1;num<=number;num++) {
			factorialValue*=num;
		}
		return factorialValue;
	}
	
	//Method to check a number a prime or not
	public boolean isPrime(int number) {
		
		if (number <= 1) {
	        return false;
	    }
		
		for(int divisor=2;divisor<=number/2;divisor++) {
			if(number%divisor==0) {
				return false;
			}
		}
		return true;
	}
	
	//Method to find GCD of two numbers
	public int findGcd(int number1,int number2) {
		
		
		if(number1==0) {
			return Math.abs(number2);
		}
		
		if(number2==0) {
			return Math.abs(number1);
		}
		
		while(number1!=number2) {
			 if(number1>number2) {
				 number1=number1-number2;
			 }else {
				 number2=number2-number1;
			 }
		}
		return number1;
	}
	
	//Method to find the nth Fibonacci number
	public int findFibonacciNumber(int number) {
		
		if(number<0) {
			System.out.println("Not possible for negative number");
			return -1;
		}
		
		if(number==0||number==1) {
			return number;
		}
		
		int first=0;
		int second=1;
		int result=0;
		
		for(int i=2;i<=number;i++ ) {
			result=first+second;
			first=second;
			second=result;
		}
		
		return result;
		
	}
	
	
	public static void main(String[] args) {

		MathUtility math1=new MathUtility();
		
		System.out.println(math1.factorial(5));
		System.out.println(math1.isPrime(3));
		System.out.println(math1.findFibonacciNumber(-5));
		System.out.println(math1.findFibonacciNumber(5));
		System.out.println(math1.findGcd(12, 18));
		
	}

}
