
public class StaticMain {

	public static void main(String[] args) {
		
		//static int a; //지역변수에는 static 사용 불가
		
		Test t1 = new Test(10,20); //어떤 클래스의 객체인가? Test클래스의 인스턴스다.
		Test t2 = new Test(30,40); //메모리에 만들어진 객체 = 인스턴스된 객체
		Test t3 = new Test(50,60);

		//위 3개의 실행문을 그림으로 확인!
		
		//t1 참조변수가 참조하는 객체의 멤버변수(a)를 변경해도
		//다른 객체의 a의 값은 변경되지 않음! 다른 변수니깐
		//즉, 일반 멤버변수는 객체마다 가지고 있는 변수!
		t1.a=100;
		System.out.println( tl.a ); //100
		System.out.println( t2.a ); //
		System.out.println( t3.a );
		System.out.println();
		
		//static변수는 객체마다 있는 것이 아니라 
		//1개만 존재하므로 어떤 객체를 이용해서 변경하든
		//나머지 객체에도 영향을 미칠 수 밖에 없음
		t2.b=200;
		System.out.println( t1.b );
		System.out.println( t2.b );
		System.out.println( t3.b );
		System.out.println();
		
		//그래서... static변수는 한 객체의 변수라고 보기에는 부적절
		//사용할 때 객체명을 이용하기보다는 클래스에 1개이므로
		//클래스명을 써서 접근하는 방식을 권장함
		Test.b=500;
		System.out.println( t1.b );
		System.out.println( t2.b );
		System.out.println( t3.b );
		System.out.println();
		
		
		
		//static변수 (클래스 변수) 왜 사용할까?
		//같은 클래스의 객체들이 모두 같은 값을 공유하고 싶을 때 사용
		//ex) First클래스의 객체가 몇개 만들어 졌는가?
		//-- 객체마다 변수를 가지지말고 별도로 First클래스가 변수 1개를 가지고 카운팅
		new First();
		new First();
		new First();
		new First();
		new First();
		new First();
		new First();
		new First();
		new First();
		
		
		
		//메소드도 static 키워드 적용가능
		//static 사용은 객체명이 아니라 클래스명 사용  : 클래스 메소드라고도 부름
		t1.show();
		Test.show(); //-객체생성 없이 클래스로 바로 호출이 가능! 그럴때 static키워드를 메소드 앞에 씀
		//Test.aaaaa(); //error : 일반메소드는 객체를 생성해야만 호출이 가능
		
		t1.aaaaa();
		
		
		//조금 더 복잡하게..
		//AAA.obj.show(); - 인스턴스 변수
		System.out.println();
		//위와 아래는 똑같은 구조
		
		AAA.obj.bb();
		//AAA.BBB.bb(); //error

		BBB.bb();
		
		
		//초기화블럭
		new Second();
		new Second();
		new Second();
		new Second();
		new Second();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
