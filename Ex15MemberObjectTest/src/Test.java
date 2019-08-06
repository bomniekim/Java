
public class Test {

	int a;
	Person p; //클래스의 멤버로써 다른 클래스의 참조변수를 사용하는 경우(가능)
	
	//출력기능 메소드
	void show() {
		System.out.println("a: "+a);
//		System.out.println("name: "+p.name);
//		System.out.println("age: "+p.age);
		
		//멤버로 있는 객체(Person p)의 멤버변수 값까지 직접 출력해줄 필요없음.
		//그 객체는 스스로 멤버값을 출력하는 기능이 이미 존재
		
		p.show(); //메소드 안에 다른 클래스의 메소드
			
	}
	
	//입력기능 메소드
	void setMembers(int a, Person p) {
		this.a=a;
		this.p=p;
	}
	
	//입력기능에 메소드 오버로딩이 필요
	void setMembers(int a, String name, int age) {
		this.a=a;
//		this.p.name = name; // error
//		this.p.age = age;   // error
		
		//멤버변수 p는 현재 참조하고 있는 객체가 없으므로
		//멤버값을 바로 대입하면 위 코드는 error
		
		//먼저 Person객체를 생성하고
		this.p = new Person();
		//후에 값 대입
//		this.p.name = name; 
//		this.p.age = age;
	
		this.p.setMembers(name, age);
	
	}
	//생성자 메소드: Constructor
	public Test() {
		a= 0;
		p= new Person(); // "익명", 0
		
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
		//Person도 객체를 생성하면서 값을 대입하는 생성자가 있으면 더 간결!
		this.p = new Person(name, age);
	}
	
	
	
	
	

}
