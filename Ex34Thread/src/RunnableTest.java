
public class RunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Thread를 만드는 방법은 2가지가 있음.
		//1. Thread클래스를 상속한(extends) 클래스를 정의하여 사용하는 방법
		//2. Runnable인터페이스를 구현한(implements) 클래스를 정의하여 사용하는 방법
		
		//왜 2가지 방법이 존재할까??
		//다중 상속의 효과를 보고 싶어서!
		//Person클래스의 능력을 가지면서 동시에 스레드의 능력도 보유한 객체를 생성
		PersonThread pt = new PersonThread();
		
		//Thread실행은 start()메소드로! run()은 직접 호출하면 안됨!
		//run()을 직접 호출하면 그건 별도의 Thread가 아닌 run()을 호출한 Main Thread가 실행시키는 상황이 됨.
		//pt.run();
		//pt.start();//error : Runnable인터페이스에는 start()메소드가 없음.
		
		//Runnable객체(pt)를 실행시켜주는 별도의 trigger용 Thread가 필요함!
		Thread t= new Thread(pt);//생성자에 Runnable객체를 전달해 줌.
		t.start(); //전달받은 Runnable객체의 start()를 대신 해줌!
		
		System.out.println("princess");
		
		
		
		//Runnable인터페이스의 사용모습의 다른 형태!
		//익명클래스 적용해보기
		Runnable r= new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runnable!");
			}
		};
		
		//Runnable객체를 실행하려면...새로운 Thread 객체가 필요
		Thread t2= new Thread(r);
		t2.start();
		
		//위 모습을 더 줄여서 작성하기도 함
		Thread t3= new Thread( new Runnable() {
			public void run() {
				System.out.println("익명클래스 사용");
			}
		} );
		t3.start();
		

	}

}

//Person의 멤버능력을 가지면서 Thread의 능력도 있었으면 하는 클래스 생성
class PersonThread extends Person implements Runnable { //java.lang에 있는 것은 자동으로 import
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0; i<5; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println("name : "+name+" age : "+age+"["+threadName+"]");
			
			try {
				Thread.sleep(1000);
			}catch (Exception e) {}
		}
		
	}
}


class Person{
	String name;
	int age;
}

