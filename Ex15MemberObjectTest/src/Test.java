
public class Test {

	int a;
	Person p; //Ŭ������ ����ν� �ٸ� Ŭ������ ���������� ����ϴ� ���(����)
	
	//��±�� �޼ҵ�
	void show() {
		System.out.println("a: "+a);
//		System.out.println("name: "+p.name);
//		System.out.println("age: "+p.age);
		
		//����� �ִ� ��ü(Person p)�� ������� ������ ���� ������� �ʿ����.
		//�� ��ü�� ������ ������� ����ϴ� ����� �̹� ����
		
		p.show(); //�޼ҵ� �ȿ� �ٸ� Ŭ������ �޼ҵ�
			
	}
	
	//�Է±�� �޼ҵ�
	void setMembers(int a, Person p) {
		this.a=a;
		this.p=p;
	}
	
	//�Է±�ɿ� �޼ҵ� �����ε��� �ʿ�
	void setMembers(int a, String name, int age) {
		this.a=a;
//		this.p.name = name; // error
//		this.p.age = age;   // error
		
		//������� p�� ���� �����ϰ� �ִ� ��ü�� �����Ƿ�
		//������� �ٷ� �����ϸ� �� �ڵ�� error
		
		//���� Person��ü�� �����ϰ�
		this.p = new Person();
		//�Ŀ� �� ����
//		this.p.name = name; 
//		this.p.age = age;
	
		this.p.setMembers(name, age);
	
	}
	//������ �޼ҵ�: Constructor
	public Test() {
		a= 0;
		p= new Person(); // "�͸�", 0
		
	}
	
	public Test(int a, Person p) {
		this.a=a;
		this.p=p;
	}
	
	public Test(int a, String name, int age) {
		this.a=a;
		this.p = new Person();
//		this.p.name=name;
//		this.p.age=age;
		this.p.setMembers(name, age);
		//Person�� ��ü�� �����ϸ鼭 ���� �����ϴ� �����ڰ� ������ �� ����!
		this.p = new Person(name, age);
	}
	
	
	
	
	

}
