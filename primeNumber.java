package Basic_Code;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int number = 100; number <=200; number++)
		{
			int count=0;
			for (int i = 2; i <number; i++) 
			{
				if(number%i==0)
				{
					System.out.println("not "+ number);
					count++;
					break;
				}
				
			}
		if(count==0)
			System.out.println("number is prime "+ number);
			
		}
		
		
	
	}
}
