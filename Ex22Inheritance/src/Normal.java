
public class Normal {

	private String name;
	private int age;
	
	//������ �޼ҵ� :��ü ����(new)�� �� �� �ڵ����� ����Ǵ� �޼ҵ�
	public Normal() {
		name="no name";
		age=0;
	}
	
	//������ �����ε� - �Ķ���ͷ� �̸��� ���� ���� �޾� ��������� ����
	public Normal(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void show() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
	
}
