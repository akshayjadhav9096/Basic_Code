package Basic_Code;

public class palindromenum {

	public static void main(String[] args) {
		int number1=121;
		int number2=number1;
		int sum=0;
		int b=0;
		while(number1>0)
		{
			sum=sum+number1%10;
			number1=number1/10;
			b=(b*10)+sum;
		}
		if(number2==b)
			System.out.println("p");
		
		else 
			System.out.println("n");

	}

}
