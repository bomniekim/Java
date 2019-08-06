//추상클래스 : 그냥 사용하는 것이 아니라 반드시 상속해서 사용해야 한다.
public abstract class Test {
	int a; //인스턴스 변수
	static int b=10; //static변수[클래스변수]
	
	//생성자메소드
	public Test() {
		System.out.println("Test 생성자!");
	}
	
	//인스턴스 메소드
	void show() {
		System.out.println("show!");
	}
	
	//추상 메소드 : 이름만 있고 내용이 없는 메소드
	//상속한 클래스에서 반드시 오버라이드를 해야만 한다. 
	abstract void aaa();
	abstract void ccc();
	
	//static 메소드
	static void bbb() {
		System.out.println("Test static..."+b);
	}
}

