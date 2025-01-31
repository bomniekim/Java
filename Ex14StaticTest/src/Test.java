 
public class Test {

	public int a; // 멤버변수				  ----인스턴스된 객체마다 있으므로 --> 다른 말로: 인스턴스 변수
	public static int b; // 정적(static) 멤버변수 -- 클래스에 한개 있으므로  --> 다른 말로: 클래스 변수

	// 생성자 메소드: constructor - 객체가 생성될 때(new) 자동으로 한번 호출되는 메소드
	public Test() {
		a = 10;
		b = 20;
	}

	public Test(int a, int b) {
		this.a = a;
		this.b = b;
	}

	
	//static을 변수에 붙일 수 있듯이.. //static은 객체가 없어도 메모리에 존재
	//static 메소드도 가능함
	static void show() {
		//static 메소드 안에서는 인스턴스 변수는 사용이 불가능
		
		//System.out.println("멤버변수 a: "+ a); //객체를 만들어야지만 존재하는 a(인스턴스 변수)를 출력하라고 하니깐 error 
		System.out.println("멤버변수 b: "+ b); //static변수는 사용 가능
	}
	
	//일반 메소드 - 객체가 인스턴스되어야만(만들어야만) 사용가능 : 인스턴스 메소드
		void aaaaa() {
			System.out.println("멤버변수 a: "+ a);
			System.out.println("멤버변수 b: "+ b);
		}
	
}
