
public class MemberObjectMain {

	public static void main(String[] args) {

		//클래스 안에 멤버 변수로 다른 클래스의 참조변수가 있는 경우에 대한 고려사항에 관련한 학습
		Test t = new Test();
		System.out.println( t.a ); // 0
		System.out.println( t.p ); // null
		System.out.println();
		
		//멤버변수 값 설정
		t.a = 10;
		t.p = new Person(); //참조변수에 대입할 수 있는 것은 객체!
							//객체를 생성하여 참조변수에 대입
		
		
		System.out.println( t.a ); // 10
		System.out.println( t.p ); // 참조값 출력
		System.out.println();
		//멤버변수로 존재하는 또 다른 객체의 멤버변수 값 출력
		
		System.out.println( t.p.name ); // 기본값 null
		System.out.println( t.p.age );  // 기본값 0
		System.out.println();
		
		
		//결국 멤버변수로 존재하는 객체의 멤버값도 대입해주어야 올바른 데이터의 출력이 가능
		t.p.name = "Sam";
		t.p.age = 20;
		System.out.println( t.a );
		System.out.println( t.p.name ); 
		System.out.println( t.p.age );  
		System.out.println();
		
		//위처럼 출력하는 것은 좀 짜증..
		//Person객체의 멤버값을 Person이 알아서 출력했으면...
		//Person클래스에 멤버값 출력기능을 가진 메소드 생성
		System.out.println( t.a );
		t.p.show(); //자기값은 자기가 출력
		System.out.println();
		
		//그럼 Test 클래스도 출력기능이 있다면?
	
		t.show();
		System.out.println();
		
		
		
		//새로운 Test객체를 만들어도 어렵지 않게 멤버값 출력 가능
		Test t2 = new Test();
		t2.a=100;
		t2.p=new Person();
		
//		t2.p.name = "Robin";
//		t2.p.age = 23;
		//이런 식이면 객체의 멤버값 대입도 메소드를 이용하면 편해지지 않을까?
		t2.p.setMembers("Robin", 23);
		t2.show();
		
		//위 상황을 본다면 Test클래스도 입력기능이 있다면 더 편하게 대입이 가능하지 않을까?
		Test t3 = new Test();
		//Person객체가 있어야 멤버값의 대입이 가능
		Person p = new Person();
		p.setMembers("Kim", 30);
		
		t3.setMembers(1000, p);
		t3.show();
		System.out.println();
		
		//위를 보면 결국 Test클래스 객체의 멤버값을 줄 때 
		//a값과 더불어 name과 age까지 모두 대입해 주어야함 (멤버변수는 2개지만 값 대입은 3개)
		
		Test t4 = new Test();
		t4.setMembers(152, "Hong", 40);
		t4.show();
	
		
		//여기까지 보니까.. 객체생성 후 멤버값 대입을 위해
		//매번 .setMembers()메소드를 호출하는 코드를 써야함
		//객체를 생성(new)할 때 멤버값을 한 번에 대입해 줄 수 있으면 좋지 않을까?
		//객체 생성시 자동으로 한번 호출되는 특별한 메소드: 생성자(constructor) 메소드!
		
		Test t5=new Test();
		t5.show();
		System.out.println();
		
		Test t6=new Test(10, new Person("Choi", 25) );
		t6.show();
		System.out.println();
		
		Test t7 = new Test(20, new String ("Lee"), 55);
		t7.show();
		System.out.println();
		
		
		
	
		
		
	}

}
