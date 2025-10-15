package ak;
import java.util.*;
public class Prime {
public static boolean isPrime(int x) {
	for(int j=2;j<=Math.sqrt(x);j++){
		if(x%j==0) {
			return false;
		}
	}
	return true;
}

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting Range:");
		int Srange=sc.nextInt();
		System.out.println("Enter Ending Range:");
		int Erange=sc.nextInt();
		
		for(int i=Srange;i<=Erange;i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		System.out.println("total prime numbers:"+count);
	}
}

