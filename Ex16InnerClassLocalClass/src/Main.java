
public class Main {

	public static void main(String[] args) {
		
		//일반적인 클래스들은 간단히 만들어짐
		Test t = new Test(); //일반 클래스는 그냥 인식됨
		
		//Inner클래스는 Outer클래스 밖에서는 인식이 되지 않음
		//Nice n; //error
		
		//Outer클래스명을 사용하면 인식가능
		Test.Nice n;
		
		//인식은 되지만 객체생성은 불가!
		//Test.Nice n2 = new Test.Nice(); //error
		
		
		//Inner클래스 사용하기! : Outer객체에게 Inner객체 생성을 의뢰하기! 
		Test.Nice n3 = t.makeInnerClassObject();
		n3.aaa();
		
		//개발자들이 선호하지 않는 이너객체 만드는 표기법
		Test.Nice n4= t.new Nice();
		
		
		//이너클래스에는 static키워드 적용 가능함.
		//아웃터객체없이 static 이너클래스객체 생성 가능함!
		First.Hello h= new First.Hello();
		h.show();
	}

}
