package Basic_Code;

public class Lrap_yeare {

	public static void main(String[] args) {
		
		int year=2021;
		
		if(year%100==0&&year%400==0)
			System.out.println("leap");
		else if(year%100!=0&&year%4==0)
			System.out.println("leap");
		else
			System.out.println("not");

	}

}
