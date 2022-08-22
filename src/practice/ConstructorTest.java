package practice;

public class ConstructorTest {

	String str;
	int x;

	public ConstructorTest(String str, int x) {

		this.str = str;

		this.x = x;

	}

	public void display() {
		System.out.println(str + "=" + x);
	}

	private int salary(int y) {
		x = y * 12;
		return x;

	}

	public static void main(String[] args) {

		ConstructorTest cs = new ConstructorTest("sema", 25);

		cs.display();
		int semaSalary = cs.salary(15000);
		System.out.println(semaSalary);
	}

}
