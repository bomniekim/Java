
public class Second extends First{
	
	private int b;
	
	public void show() {
		showFirst();
		System.out.println("b : "+b);
		System.out.println();
	}
	
	//생성자메소드 : 객체가 생성될 때 한번 호출되는 메소드
	public Second() {
		//부모클래스의 생성자를 호출하는 작업이 자동 실행됨
		System.out.println("Second 객체 생성!");
	}
	
	//생성자 오버로딩
	public Second(int a, int b) {
		//전달받은 파라미터 값을 멤버변수에 전달
		//super.a=a;//왜 error? 부모의 private은 접근 불가
		
		//부모객체를 생성하면서 a값을 전달하도록 하기!
		//부모클래스 생성자에 a값을 전달
		//First(a); //error 이런 문법없음.. 생성자는 new키워드와 함께 사용하는 것
		//this()생성자 호출문법이 존재하듯이
		
		//부모생성자를 호출하는 문법이 별도로 존재함 -> super()
		super(a); //슈퍼 생성자 (자식 클래스에서 부모 클래스의 생성자를 명시적으로 호출할 때)
		//슈퍼생성자도 메소드의 첫번째 문장으로 있어야함

		
		this.b=b;
		System.out.println("Second 객체 생성! int, int");
		
		
		//여러클래스를 동시에 상속받기(다중 상속)는 안됨!
		//자바언어는 다중상속을 허용하지 않음.
		//Test, Second 동시 상속받는 Nice 클래스 만들어보기
		
		
	}
}
	
