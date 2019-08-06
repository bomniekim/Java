
public class Person {

	String name;
	int age;
	
	//멤버값 출력기능
	void show() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
	
	//멤버값 입력기능
	void setMembers(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//생성자 메소드(기본형)
	public Person() {
		name="익명";
		age=0;
	}
	
	//생성자 메소드 오버로딩
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
}
