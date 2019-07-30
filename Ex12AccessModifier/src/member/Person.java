package member;

public class Person {
	
	//�̸�, ����, ���� (��������)
	private String name;
	private int age;
	private String nation;
	
	//������� �����ϴ� ��� �޼ҵ� ����
	//�ٸ� ��Ű�������� ��밡���ϰ� �Ϸ��� public���� !
	
	public void setMembers(String name, int age, String nation) {
		//�Ű������� ���� ���� ��������� �������ֱ�!
		this.name = name;
		this.age=age;
		this.nation=nation;
		
	}
	
	//������� ������ִ� ����� ���� - �ܺο��� ������ public method
	public void show() {
		System.out.println(name+"  "+age+"  "+nation);
	}
	
	//��������� private�̱⿡ ���� �ϳ��� ���� �����ϴ� ����� ���� �޼ҵ�� �ʿ�
	//SetterMethod
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;	
	}
	
	public void setNation(String nation) { //set + ctrl + space ����Ű! -> ��Ŭ������ ���: SetterMethod
		this.nation = nation;
	}
	
	
	
	//Setter�� �ݴ��� GetterMethod
	//����� �ϳ��� �������ִ� ����� ���� �޼ҵ� �ʿ�
	public String getName() {
		return name;		
	}
	
	public int getAge() {
		return age;
	}
	
	public String getNation() { //get + ctrl + space ����Ű! -> ��Ŭ������ ���: GetterMethod
		return nation;
	}
	
	

	
	
	
	
	
}
