import java.util.Scanner;
import java.lang.Math;

public class Sequence {
	public static void main( String[] args ){
		
		int n, x = 0, count = 0, pn = 0;

		Scanner kb = new Scanner(System.in);
			
		System.out.println("This problem computes the Hailstone sequence.");
		System.out.print("Enter a positive integer: ");
			n = kb.nextInt();
		while ( n != 1 ){
			if ( n % 2 == 0 ){
			   pn = n;
			    n = (n / 2);
			    count++;
			   System.out.println(pn + " is even, so take half = " + n);
		} else { if ( n % 2 != 0 ){
			   pn = n;
			n = ((3*n) + 1);
			count++;
			   System.out.println(pn + " is odd, so I make 3n + 1 = " + n );
		  }
		  }
		}
		System.out.println("The process took " + count + " steps to reach 1");
		}
	   }


