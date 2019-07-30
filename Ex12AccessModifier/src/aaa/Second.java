package aaa;

public class Second {

	// 접근제한자가 부여된 멤버변수
	private int a;
	int b;
	protected int c;
	public int d;

	
	//메소드
	void aaa() {
		System.out.println("aaa");
		
		//같은 패키지의 default 접근 제한자의 class 사용가능
		Third t = new Third();
	}
	
	//public 접근제한자의 메소드
	public void bbb() {
		System.out.println("bbb");
	}
}
