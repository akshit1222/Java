package ak;
import java.util.*;
public class Testter {
	public static void main(String[] args) {
		
	List<Bank>list=new ArrayList<Bank>();
	Bank a1=new Bank(1,22,"Rishi",0);
	Bank a2=new Bank(2,23,"Lucky Pandey",-600);
	Bank a3=new Bank(3,24,"choco",100);
	Bank a4=new Bank(4,25,"rohan",17564);
	
	int x;
	
	list.add(a1);
	list.add(a2);
	list.add(a3);
	list.add(a4);
	
	int max=0;
	
	for(Bank x: list) {
		if(x.getBalance()>max) {
			
		}
	}
	
	System.out.println(list);
	}
}
