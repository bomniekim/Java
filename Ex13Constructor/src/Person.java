
public class Person {
	
	//��������� private�� ����
	//��ü�� �⺻���� 0�� �ش��ϴ� ���� �ο���
	private String name; // �⺻�� �ο�: null 
	private int age;	 // �⺻�� �ο�: 0
	
	
	//��������� ���� �����ϴ� �޼ҵ尡 �ʿ��� - ������ �޼ҵ�� public�� ����
	public void setMembers(String name, int age) {
		//���޹��� �Ķ���͸� ��������� �����ϴ� �۾�
		this.name = name;
		this.age=age;
	}
	
	//��������� ���� ����ϴ� �޼ҵ�
	public void show() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println();
	}
	
	//default ���������� ������ �޼ҵ�
//	Person() {
//		System.out.println("Person ��ü ����");
//	}
	
	public Person() {
		System.out.println("Person ��ü ����");
		//������� ���� �ʱ�ȭ - �������� ���� ����
		name = "�͸�";
		age =0;
	}
	
	//������ �޼ҵ� �����ε�
	public Person(String name, int age) {
		//���޹��� ������ ��������� ���� ����(���� setMembers() �޼ҵ��� ���� )
		//new�� �� �ڵ����� 
		this.name = name;
		this.age=age;
		System.out.println("Person ��ü ����, String, int");
	}
	
	//�޼ҵ� �����ε��� ���������� �����Ƿ� �Ǵٸ� ������ �޼ҵ� �����ε�! (name)
	public Person(String name) {
		this.name=name;
		this.age=0; //���ϴ� �ʱⰪ �ƹ��ų�
		System.out.println("Person ��ü ����, String");
	}
	
	
	//������ �޼ҵ� �����ε� (age)
	public Person(int age) {
		this.name = "�͸�";
		this.age=age;
		System.out.println("Person ��ü ����, int");
	}
		
	
	
	
	
	
	
}
