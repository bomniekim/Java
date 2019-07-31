package mycounter;

public class MyCounterTest {

	public static void main(String[] args) {
		
		MyCounter obj1 = new MyCounter(); 
		MyCounter obj2 = new MyCounter();
		//new될 때 생성자 호출 - 객체가 생성될 때 객체를 초기화하는 특수 메소드
		
		System.out.println("객체 1의 counter = "+ obj1.cnt);
		System.out.println("객체 2의 counter = "+ obj2.cnt);

		//생성자 메소드의 오버로딩
		MyCounter obj3 = new MyCounter(100); 
		MyCounter obj4 = new MyCounter(200);
		
		System.out.println("객체 3의 counter = "+ obj3.cnt);
		System.out.println("객체 4의 counter = "+ obj4.cnt);
	}

}
