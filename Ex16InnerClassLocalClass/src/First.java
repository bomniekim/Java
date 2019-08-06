
public class First {
	
	int a=10;
	static int b=20;
	
	Hello h;
	
	//static 이너클래스 : 아웃터객체생성없이 다른 곳에서 객체생성 가능함!
	// static 이너클래스는 아웃터의 static멤버만을 마음대로 사용할 수 있다.
	public static class Hello{
		
		void show() {
			System.out.println("Hello.. show");
			//a=50; //error //아웃터의 인스턴스변수는 사용불가!
			b=50; //static멤버는 사용 가능
		}
		
	}

}

