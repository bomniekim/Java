
public class Ex05ClassTestThird {
	//클래스는 멤버변수(필드)와 멤버함수(메소드)로 구성
	
	//멤버변수(클래스 안에)
	int a;
	
	//멤버함수
	void show() {
		System.out.println("Third Show!");
		
		int k; //멤버변수X, (메소드 안에 있는 지역변수) 
		
		//메소드 안에 클래스 작성하기...
		//Embedded Class(내장클래스)
		class Nice {
			int z;
			void aaa() {
				
			}//Nice Class.. 지역성을 가지고 있음
		}
		
		class World{
			
		}
		
		//내장클래스의 활용의 예
		//익명 Inner Class
		new Test() {
			@Override
			void show() {
				System.out.println("Hello show");
			}
		};	
	}//show method..
}
	
	//클래스 안에 클래스 작성하기 ////////
	//Inner Class
	class Hello {
		
	}
	//////////////////////////////
//Third class..


//하나의 .java문서 안에 2개 이상의 class 작성 가능함
//다른 class로 인식 (Amazing!) 


//단, 하나의 .java문서 안에는 public class가 1개만 있어야 함!
//그리고 .java문서의 파일명은 public class명과 같아야만 함
class Test {
	void show() {
		System.out.println("Test Show!");
	}
}
//Test가 Third 안에 있다고 인식하지 않음