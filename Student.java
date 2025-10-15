package ak;

public class Student {
	int id;
	String name;
	float mark_1,mark_2,mark_3,mark_4,mark_5;
	public Student(int id, String name, float mark_1, float mark_2, float mark_3, float mark_4, float mark_5) {
		
		this.id = id;
		this.name = name;
		this.mark_1 = mark_1;
		this.mark_2 = mark_2;
		this.mark_3 = mark_3;
		this.mark_4 = mark_4;
		this.mark_5 = mark_5;
		
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getMark_1() {
		return mark_1;
	}
	public float getMark_2() {
		return mark_2;
	}
	public float getMark_3() {
		return mark_3;
	}
	public float getMark_4() {
		return mark_4;
	}
	public float getMark_5() {
		return mark_5;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark_1=" + mark_1 + ", mark_2=" + mark_2 + ", mark_3="
				+ mark_3 + ", mark_4=" + mark_4 + ", mark_5=" + mark_5 + "]";
	}
	
	
	
}
