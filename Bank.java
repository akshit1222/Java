package ak;

public class Bank {
	int Id;
	double Num;
	String Name;
	float Balance;
	

	public Bank(int id, double num, String name, float balance) {
		
		this.Id = id;
		this.Num = num;
		this.Name = name;
		this.Balance = balance;
		
	
	}


	public int getId() {
		return Id;
	}


	public double getNum() {
		return Num;
	}


	public String getName() {
		return Name;
	}


	public float getBalance() {
		return Balance;
	}


	@Override
	public String toString() {
		return "Bank [Id=" + Id + ", Num=" + Num + ", Name=" + Name + ", Balance=" + Balance + "]";
	}

	
	


	
}
