package ak;
import java.util.*;

public class Fib {
	public static int fibb(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		else {
			return fibb(n-1)+fibb(n-2);
		}
		
	}
	public static void main(String[]args) {
		System.out.println("Enter till which number you want the series");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibb(i) + " ");  // ✅ Printing series
        }

        sc.close();
	}

}
