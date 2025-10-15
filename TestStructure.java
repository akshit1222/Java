package ak;
class Ride{
	public void ADD( int a, int b) {
		b=28;
		System.out.println(a+b);
	}
}
class Load{
	public void ADD(int a) {
		int b=10;
		System.out.println(a+b);
		
		
	}
	
}

public class TestStructure {
	public static void main(String[] args) {
		Load obj=new Load();
		obj.ADD(10);
		obj.ADD(9);
	}

}


