package Basic_Code;

public class Returnfact {

	public static void main(String[] args) {
		int n=40;
		int k=7;
		int f1=1;
		int f2=1;
		for (int i = 2; i <=n; i++)
		{
			f1=f1*i;
			
		}
		for (int i = 2; i <=k ; i++)
		{
		f2=f2*i;	
		}
		System.out.println(f1/(f2*(fact1(n-k))));

	}

	private static int fact1(int i) {
		
		int fact=1;
		for (int j = 2; j <=i; j++) 
		{
			fact=fact*j;
			
		}
		return fact;
	}

}
