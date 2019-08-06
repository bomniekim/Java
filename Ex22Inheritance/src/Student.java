
public class Student extends Normal {

	//이미 name과 age를 보유한 상태 - 상속
	private String major; //전공
	
	public Student() {
		super();
		major="";
	}
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major=major;
	}
	
	public void show() {
		super.show();
		System.out.println("major: "+major);
	}
	
}
