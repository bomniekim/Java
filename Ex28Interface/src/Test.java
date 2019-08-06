//인터페이스의 정의 모습 : 클래스 정의 모습과 동일함
//인터페이스는 객체 생성 불가!
public interface Test { //abstract 대신에 interface

	//interface의 특징들
	
	//1. 인터페이스 안에서는 인스턴스변수, static변수, 인스턴스 메소드를 만들 수 없다.
	//2. 인터페이스 안에서는 추상메소드, static메소드, 멤버필드는 public static final만 가능함.
	//3. 인터페이스 안에 있는 멤버는 전원 자동 public임.
	//4. 인터페이스는 기능(메소드)구현이 완성된 것이 아니기에 그냥 사용할 수는 없고 반드시 기능을 구현해야만 사용 가능함.
	//5. 인터페이스를 사용하려면 새로운 클래스를 정의하면서 implements키워드로 구현해야만 한다. 
	//6. 인터페이스도 일종의 상속개념이므로 업 캐스팅이 가능
	
	//7. 인터페이스도 클래스의 일종이므로 이너클래스를 가질 수 있으며.. 자동으로 public static이 된다. 	
	
	//8. 인터페이스는 다중구현(다중상속)이 가능함.//AAA, BBB인터페이스 -> Sample클래스에서 구현
		//9. 인터페이스도 다른 인터페이스를 상속할 수 있음.//kkk인터페이스를 상속한 SSS인터페이스를 구현한 Nice클래스...
	
	//멤버변수 사용불가!
	//int a; 
	//static int b;
	
	
	//멤버변수 중에는 final변수 사용 가능
	public static final int a=10; //final은 만들면서 값을 줘야함
	int b=2; //자동으로 public static final (단, 명시적 초기화가 되어 있을때만) 
	
	//접근제한자는 오직 public만 됨.
	//private static final int c=5;// error
	//protected static final int d=5;
	
	
	
	//인스턴스 메소드: 일반적인 메소드
//	void show() {
//		//error
//	}
	//상속을 해주는 것이 목적이기 때문에
	
	
	//접근제한자는 무조건 public만 가능함 : 안써도 자동 public (default X)
	//추상메소드: 이름만 있는 메소드
	public abstract void aaa();
	void bbb(); //자동 public abstract가 됨
	
	//protected abstract void ccc(); //error: 접근제한자는 public만 가능
	
	//static메소드(JDK 1.8 부터 가능) : 자동 public
	static void ccc() {
		System.out.println("ccc");
	}
	
	
	//이너클래스 설계가능 : 자동 public static
	class Hello{
		void show() {
			System.out.println("Hello show!");
		}
	}
	
	
	
}//Test Interface...
