package ak;
import java.util.*;

public class Menu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Enter 1 for overLoad,2 for OverRide,0 to terminate:");
		choice=sc.nextInt();
		if(choice==2) {
			OverRide obj=new OverRide();
			obj.ADD(78,90);
			System.out.println("OverRide");
		}
		else if(choice==1){
			OverLoad obj=new OverLoad();
			obj.ADD(12);
			System.out.println("OverLoad");
		}
		else if(choice==0) {
			System.out.println("Terminated");
			System.exit(0);
		}
		else {
			System.out.println("Enter a valid choice");
		}
	}

}

