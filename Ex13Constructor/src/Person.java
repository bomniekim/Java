
public class Person {
	
	//멤버변수는 private을 권장
	//객체의 기본값은 0에 해당하는 값이 부여됨
	private String name; // 기본값 부여: null 
	private int age;	 // 기본값 부여: 0
	
	
	//멤버변수의 값을 대입하는 메소드가 필연적 - 가급적 메소드는 public을 권장
	public void setMembers(String name, int age) {
		//전달받은 파라미터를 멤버변수에 대입하는 작업
		this.name = name;
		this.age=age;
	}
	
	//멤버변수의 값을 출력하는 메소드
	public void show() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println();
	}
	
	//default 접근제한자 생성자 메소드
//	Person() {
//		System.out.println("Person 객체 생성");
//	}
	
	public Person() {
		System.out.println("Person 객체 생성");
		//멤버변수 값을 초기화 - 생성자의 존재 이유
		name = "익명";
		age =0;
	}
	
	//생성자 메소드 오버로딩
	public Person(String name, int age) {
		//전달받은 값으로 멤버변수에 세팅 가능(위의 setMembers() 메소드의 역할 )
		//new할 때 자동으로 
		this.name = name;
		this.age=age;
		System.out.println("Person 객체 생성, String, int");
	}
	
	//메소드 오버로딩은 개수제한이 없으므로 또다른 생성자 메소드 오버로딩! (name)
	public Person(String name) {
		this.name=name;
		this.age=0; //원하는 초기값 아무거나
		System.out.println("Person 객체 생성, String");
	}
	
	
	//생성자 메소드 오버로딩 (age)
	public Person(int age) {
		this.name = "익명";
		this.age=age;
		System.out.println("Person 객체 생성, int");
	}
		
	
	
	
	
	
	
}
