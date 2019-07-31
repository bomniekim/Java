
public class Second {

	// 멤버변수(field) - private권장
	private int a;
	private int b;

	// 멤버변수를 초기화하는 생성자 메소드
	public Second(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("int, int");
	}
	
	//생성자 오버로딩을 요구 (실제론 멤버변수의 개수 +1만큼 존재)
	//목적: 자신이 원하는 값으로 초기화 가능 (!=0)
	public Second() {
//		this.a=10;
//		this.b=20;
		//위와 같이 일일이 멤버변수에 값을 대입하면 너무 번거로움!
		
		//값을 대입해주는 다른 생성자 이용하기~
		//다른 생성자 메소드 호출하기!
		//Second(10,20); error! 생성자는 new 키워드와 함께일 때만 호출 가능함
		//일반 메소드 호출하듯 호출하는 경우 error
		//본인 클래스의 생성자를 호출하는 키워드 this() 사용
		this(10, 20); //디스 생성자
		
	}
	public Second(int a) {
		//System.out.println("aaa");
		this(a,a); //절.대.규.칙! this 생성자는 반드시 첫번째 샐행문이어야 한다.  
		System.out.println("bbb");
		
	}
	
	
	//일반 메소드
	void aaa() {
		bbb(); //다른 메소드의 호출이 가능함.
		//즉, 생성자 메소드도 다른 생성자 메소드를 호출할 수 있음.
	}
	
	void bbb() {
		
	}
	
}
