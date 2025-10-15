package ak;
import java.util.*;
public class Arr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int[]arr=new int[size];
		for(int i=0;i<size;i++) {
			System.out.printf("Enter the %d element of array:",i);
			arr[i]=sc.nextInt();
		}
		for(int i=size-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
	}
}
}
		