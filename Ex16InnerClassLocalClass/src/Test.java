
//Outer class
public class Test {
	
	int a; //멤버변수
	Nice n = new Nice(); //가능
	
	//멤버메소드
	void show() {
		System.out.println("Test..."+a);
	}
	
	
	//Inner클래스를 만들어주는 기능 메소드 - main으로부터 의뢰받음
	Nice makeInnerClassObject() {
		//이너클래스 객체 생성 가능
		Nice n = new Nice();
		return n; //Nice객체를  return해주는 메소드
	}
	
	
	//Inner class : 클래스 안에 다른 클래스의 설계를 정의
	//이너클래스의 특징
	//1. 외부(다른 클래스)에서 Outer클래스명 없이는 인식이 불가
	//2. 외부에서 Outer명을 이용하여 인식하더라도 객체 생성은 불가
	//3. Inner클래스는 Outer클래스 안에서만 생성할 수 있음!
	
	//4. 이너클래스안에서는 아웃터의 멤버를 마음대로 사용할 수 있음.
	//4-1. 아웃터는 이너의 멤버를 마음대로 쓸 수 없음.
	
	
	
	//이너클래스의 객체를 안전하게 만들기 위한 목적
	//즉, 외부에서 마음대로 객체 생성하는 것을 막기 위한 목적
	
	class Nice {
		int k=10;// 멤버변수
		
		//멤버메소드
				void aaa() {
					a=50; //아웃터의 멤버변수..마음대로 사용
					System.out.println("Nice...."+ k);
					System.out.println("Nice...."+ a);
					
					//아웃터의 멤버메소드도 마음대로(내것인양) 사용가능
					show();			
				}
				
			}//Nice class...

		}//Test class...

