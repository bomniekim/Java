
public class Test {

	final int num=20; //final 멤버변수
	//final int age; //error: 멤버변수는 final하면서 명시적으로 초기화를 반드시 해주어야 함 
	
	void aaa() {
		//num=30; //error: final 멤버변수는 값 변경이 불가
		bbb(10);
	}
	
	void bbb(final int k) { //매개변수에도 final 가능
		System.out.println(k);
		//k=50; //error
	}
	
	//메소드에 final키워드 적용 : 오버라이드(override) 불가
	//Test를 상속한 Sample클래스 설계해보기!
	final void show() {
		System.out.println("Test!");
	}
}

