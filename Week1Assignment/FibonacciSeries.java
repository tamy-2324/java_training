package week1.assignments;

public class FibonacciSeries {
	

	public static void main(String[] args) {
		 
		int n1=0;
		int n2=1;
		
		for(int i=0; n1<= 8; i++)
		{
			System.out.println(n1 + " " + "Fibonacci Series");
			
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		
		
	}

}
