
//interface == abstract class 와 비슷한 문법
public class InterfaceMain {

	public static void main(String[] args) {
	
		//인터페이스 interface
		//[추상메소드만 가진 추상클래스 같은 것]
		//인터페이스는 직접 new 객체생성 불가!
		//Test t= new Test(); //error
		
		//사용하려면? 인터페이스를 상속하여 새로운 클래스를 만들고 이를 객체로 생성해야만 함.
		First f = new First();
		f.aaa();
		f.bbb();
		
		//Test인터페이스를 구현한 Second클래스는
		//★★★★★무조건 aaa(), bbb()를 오버라이드해서 구현했다는 확신이 있음★★★★★
		Second s = new Second();
		s.aaa();
		s.bbb();
		
		Test t; //인터페이스의 참조변수(부모참조변수)
		t= new First(); //가능: 업 캐스팅
		t.aaa(); //First aaa...
		t.bbb(); //First bbb...
		
		t= new Second();
		t.aaa(); //Second aaa...
		t.bbb(); //Second bbb...
		
		
		//Test인터페이스 안에 있는 이너클래스(Hello) 객체 생성
		//Hello h; //error 아우터클래스가 없어서!
		Test.Hello h = new Test.Hello(); //static inner클래스는 아우터객체 없이 생성 가능
		h.show();
		
		
		
		
	}
}
