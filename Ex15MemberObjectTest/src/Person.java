
public class Person {

	String name;
	int age;
	
	//����� ��±��
	void show() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
	
	//����� �Է±��
	void setMembers(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//������ �޼ҵ�(�⺻��)
	public Person() {
		name="�͸�";
		age=0;
	}
	
	//������ �޼ҵ� �����ε�
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
}
