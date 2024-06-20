
public class printSumOfDigitOfGivenInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigit(123));
	}
public static int sumOfDigit(int integer) {
	int sum = 0;
	while(integer!=0) {
		int i=integer%10; //3;2;1
		sum = sum+i; //3;5;6
		integer = integer/10; //12//1
	}
	
	return sum;
	}

}
