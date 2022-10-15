package Basic_Code;

public class Odd_evenMost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=10;
		int end=50;
		
		System.out.println("evn");
		for (int i = start; i < end; i++)
		{
			if(i%2==0)
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("odd");
		for (int i = start; i < end; i++)
		{
		if(i%2!=0)
			System.out.print(i+" ");
			
		}
	}

}
