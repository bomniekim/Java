import java.util.Random;

public class ObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Object class : 모든 클래스의 부모클래스(최상위 클래스)

		// Java언어에 존재하는 모든 클래스들은 extends의 명시여부와 상관없이
		// 무조건 Object클래스를 상속받은 상태로 만들어진다.
		// 명시적으로 다른 클래스를 상속받았더라도 Object클래스는 상속됨 (다중상속의 개념OK)

		Test t = new Test();
		// Test클래스는 명시적으로 아무것도 상속하지 않았지만
		// 기본적으로 Object클래스를 상속받은 상태임

		// Object클래스의 주요 메소드들
		// 1. toString() - 객체를 소개하는 문자열을 리턴하는 메소드
		// 2. equals(Object obj) - 전달받은 obj와 같은 객체인지 여부 리턴[true, false]
		// 3. hashCode() - 객체의 해쉬코드를 반환 [리턴타입 int]
		// 4. getClass() - 클래스의 정보를 리턴 [리턴타입 Class]
		// 5. finalize() - 소멸자 (생성자의 반대)
		// 6. wait(), notify(), notifyAll() - 이건 Thread수업 후

		// 이 중에서 그나마 사용하는 것은 toString(), hashCode(), getClass()

		// 1. toString()메소드 : 객체에 대한 소개 문자열 리턴
		String s = t.toString();
		System.out.println(s); // default: "클래스명@해시코드"
		// 해쉬코드: 메모리의 물리주소를 상대주소로 표현한 코드(자바에서의 주소) : ex)물류창고에서 물품번호 같은 느낌

		Test t2 = new Test();
		String s2 = t2.toString();
		System.out.println(s2);

		Random rnd = new Random();
		String s3 = rnd.toString();
		System.out.println(s3); // default: "패키지명.클래스명@해시코드" //java.util.Random@해시코드

		// toString()의 특이한 결과
		String str = new String("Hello");
		String s4 = str.toString();
		System.out.println(s4); // Hello

		// 상속받은 toString()메소드의 기능변경 가능 - override
		// 즉, 객체 소개글을 내 마음대로 변경하고 싶다면? ex) 멤버변수 값 출력하기
		// toString() 오버라이드 해서 사용하기
		First f = new First();
		String s5 = f.toString();
		System.out.println(s5);

		// 대표적으로 사용한 클래스가 String클래스임!

		First f2 = new First();
		System.out.println(f2.toString());

		// 위 System.out.println()메소드의 특이한 기능은
		// 파라미터로 객체가 전달되면 자동으로 toString을 해준다.
		System.out.println(f2);
		System.out.println(f2.toString());
		// 위 두줄은 같은 결과를 보여줌. why? 자동 toString()이 호출되기 때문에

		// 2. equals(Object obj) : 같은 객체인지를 확인하는 메소드
		Test t3 = new Test();
		Test t4 = new Test();
		System.out.println(t3.equals(t4));// false

		Test t5 = t3;
		System.out.println(t3.equals(t5));// true

		// 사람들은 잘 안씀....왜?? 그냥 참조변수끼리 비교하면 되니까..
		System.out.println(t3 == t4); // false
		System.out.println(t3 == t5); // true

		// 특이하게.. String클래스가 equals()를 오버라이드해서
		// String의 객체비교가 아니라..보유한 문자열값의 비교를 하도록 수정하여 사용.
		
		
		//3. getClass() : 클래스의 정보를 가진 Class객체 리턴
		Test t6= new Test();
		Class c=t6.getClass();
		System.out.println( c.getName() );
		System.out.println( c.getSuperclass() );
		System.out.println( c.getPackage() );
		System.out.println( c.getFields() );
		
		
		// 4. hashCode() : 자바에서의 주소값(숫자)
		Test t7 = new Test();
		int hc = t7.hashCode();
		System.out.println( hc );
		
		Test t8 = new Test();
		hc = t8.hashCode();
		System.out.println( hc ); //서로 다른 주소
		
		
		
		// 5. finalize() - 소멸자 : 생성자의 반대
		//객체가 소멸될 때 자동 호출
		Sample sample = new Sample();
		sample = null; //참조변수가 더이상 객체를 참조하지 않도록 
		//그렇게 되면 GC(Garbage Collector)가 자동으로 객체를 소멸시킴
		
		
		
		//Object참조변수는 모든 클래스의 부모이므로..
		//어떤 객체든 참조할 수 있음
		//만능 참조변수 같은 느낌
		Object obj= null;
		obj= new Test(); //부모->자식 참조가능
		obj= new First(); //업 캐스팅
		obj= new Sample();
		obj= new String();
		obj= new Random();
		
		//대표적으로 사용한 곳 - 메소드의 파라미터로 어떤 객체든 받고 싶을 때! [리턴타입도 마찬가지]
		//System.out.println();
		System.out.println( new Random().toString() );
		System.out.println( new String() );
		System.out.println( new Test() );
		
		
		//별외//////////////////////////////
		// |(비트)와 ||(논리) 연산자의 차이
		int age=15;
		if(age<2 || age>10) System.out.println("aaa"); // aaa
		if(age<2 | age>10) System.out.println("aaa"); // aaa : error아님
		
		String k=""; //null이 아님
		int len=k.length();
		
		
		if( k.length()==0 || k==null ) { //안드로이드에서 많이 쓰이는 코드
			System.out.println("문자열이 없음.");
		}
		
		
		if( k==null | k.length()==0 ) {
			System.out.println("문자열이 없음.");
		}
		
	}
	
	

}
