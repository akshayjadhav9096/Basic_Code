package Basic_Code;

public class Palindrome {

	public static void main(String[] args) {
	
		int num1=121;
		int num2=num1;
		int b=0;
		while(num1>0)
		{
			int rem=num1%10;
			num1=num1/10;
			b =(b*10)+rem;
		}
		if(num2==b)
			System.out.println("pali");
		else 
			System.out.println("not");
	}

}
