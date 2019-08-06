
public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal[] anis = new Animal[5];

		anis[0] = new Dog();
		anis[1] = new Pig();
		anis[2] = new Cat();
		anis[3] = new Dog();
		anis[4] = new Cat();

		anis[0].say();
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();
		System.out.println();

		// 만들면 안되는 Animal 객체를 생성
		// Animal ani = new Animal();//error

		// 추상클래스는 곧바로 객체 생성 불가!!
		// Test t= new Test();
		// ★★★★★★추상클래스 그냥 사용하는 것이 아니라 상속해서 사용함★★★★★★
		// Test클래스를 상속한 AAA클래스 만들고 사용해보기!!
		AAA obj = new AAA();
		obj.aaa();
		obj.show();
		Test.bbb(); // static메소드든 객체명이 아니라 클래스명으로 접근

		Test t = null; // 부모참조변수

		t = new AAA(); // 업 캐스팅
		t.aaa();

		t = new BBB(); //업 캐스팅
		t.aaa();
		

		//Test같은 추상클래스는 항상 사용할 때마다 
		//상속을 받아야 하기에 새로운 Class를 만들어야만 한다.
		//이런식으로 하다보면.. 나중에 class이름 명명하는 것이 매우 짜증
		//클래스명 없이 새로운 클래스를 만드는 문법 제공
		//이름 없는 클래스 만들기! [상속받는 클래스일 때만 가능한]
		
		
		
		//Test를 상속한 이름없는 새로운 class를 선언하면서 객체를 생성한 것
		//이름이 없는 클래스: 익명클래스(Anonymous Class)
		
		//객체를 만들면서 클래스를 설계!
		t= new Test() { //익명클래스를 참조하고 있는 것 (업 캐스팅) - 익명 객체 안에 Test객체가 있음

			@Override
			void aaa() {
				// TODO Auto-generated method stub
				System.out.println("익명클래스의 aaa()");
			}

			@Override
			void ccc() {
				// TODO Auto-generated method stub
				
			} //클래스 작성 선언문
		
			
		};
		t.aaa(); //익명클래스의 aaa()
		
		//익명클래스는 1회용 객체를 만들 때 많이 사용
		
		
	}// main method..
	

}// Main class...


class BBB extends Test {

	@Override
	void aaa() {
		// TODO Auto-generated method stub
		System.out.println("BBB aaa()");
	}

	@Override
	void ccc() {
		// TODO Auto-generated method stub
		
	}
	
}



// 추상클래스를 상속하는 클래스
class AAA extends Test {
	// 추상메소드를 가진 추상클래스를 상속받으면...
	// 기능이 구현되지 않은 메소드가 있다는 것이므로..그냥 객체를 생성하도록 하면
	// 기능없는 메소드를 보유하는 상태가 되므로..이는 자바에서 허용하지 않음!!
	// 반드시 추상메소드는 오버라이드를 해야만 함!!!
	@Override
	void aaa() {
		// TODO Auto-generated method stub
		System.out.println("AAA aaa()");
	}

	@Override
	void ccc() {
		// TODO Auto-generated method stub

	}

	// 생성자메소드
	public AAA() {
		System.out.println("AAA 생성자!!");
	}

}

//추상클래스 : 객체생성이 안되는 클래스
abstract class Animal { // public class는 하나만! - 파일명과 같아야 함
	// 상속용 메소드
	// 내용은 없고 이름만 존재하는 메소드
	abstract void say(); // 추상메소드
	// 추상메소드는 자식클래스에서 [반드시] 오버라이드 해야만 함(강제성)

}

class Dog extends Animal {
	// 오버라이드
	void say() {
		System.out.println("멍멍!");
	}
}

class Cat extends Animal {
	// 오버라이드
	void say() {
		System.out.println("야옹~");
	}
}

class Pig extends Animal {
	// 오버라이드
	void say() {
		System.out.println("꿀꿀!");
	}
}

class Duck extends Animal {
	// 추상메소드는 반드시 오버라이드 해야만 한다.
	@Override
	void say() {
		// TODO Auto-generated method stub
		System.out.println("꽥!꽥!");
	}
}
