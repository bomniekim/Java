
public class First {

	
	//객체가 생성될 때 딱 한 번 자동으로 실행되는 메소드
	//생성자 메소드 (Constructor)
	//생성자 메소드 만드는 규칙
	
	//1. 메소드의 이름은 클래스의 이름과 같다.
	//2. 리턴타입이 존재하지 않는다. (!=void)
	
	First() {
		System.out.println("First 생성자!");
	}
	
	//생성자도 메소드이므로 오버로딩이 가능
	First(int a) {
		System.out.println("First int 생성자! "+a);
	}
	
	
	
}










