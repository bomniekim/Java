
public class LocalClassTest {
	
	int g=10; //멤버변수
	
	//멤버 메소드
	void aaa() {
		final int a=50; //지역변수 : 다른 지역에서는 인식(사용)불가! / static 붙일 수 없음
		//final은 쉽게 말하면 복사본
		
		//AAA k = new AAA(); //error : 지역클래스는 정의한 후에만 사용 가능
		
		
		///////////////////////////////////
		//지역클래스(Local class) : 메소드 밖에서는 사용 불가
		class AAA{
			void show() {
				System.out.println("AAA..show"+g); //지역클래스 안에서 멤버변수는 사용 가능
				
				//지역클래스 안에서는 지역변수를 사용할 수 없음
				//단, final 지역변수는 사용 가능.. why? 메소드가 끝나도 final변수는 사라지지 않기 때문
				System.out.println("AAA..show"+a);
				//지역클래스에서 지역변수를 사용하면 그 지역변수를 자동 final시켜버림 (이클립스 자체에서)
				//단, 지역변수의 값을 변경한 이력이 있다면 자동 final되지 않음!
				
				
			}
		}//AAA class...
		///////////////////////////////////
		
		
		AAA obj= new AAA();
		obj.show();
		
		//지역클래스의 사용이유
		//1. 지역클래스는 그 메소드안에서만 잠깐 마치.1회용처럼 사용하는 객체를 만들고 싶을 때 사용함.
		//2. 나중에 배울 익명클래스라는 것을 사용할 때 지역클래스를 이용함
		
	}//aaa method...
	
	//다른 멤버메소드
	void bbb() {
		//aaa()메소드안에 작성한 지역클래스 AAA를 사용할 수 없음.
		AAA obj= new AAA(); //error
	}

}






