//인터페이스는 extends로 상속하지 않고 implements로 구현(상속)함
public class First implements Test {
	//Test라는 인터페이스를 구현하다
	//인터페이스는 추상메소드를 가지고 있기 때문에 반드시 추상메소드를 오버라이드 해야 함
	
	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("First aaa...");
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("First bbb...");
		
	} 
	
	
}
