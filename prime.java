package Basic_Code;

public class prime {

	public static void main(String[] args) {
	
		int num=7;
		boolean isthisnumprime=true;
		for (int i = 2; i <num; i++)
		{
			if(num%i==0)
				isthisnumprime=false;		
		}
		if(isthisnumprime==true)
			System.out.println("its prime");
		else
			System.out.println("its not prime");

	}

}
