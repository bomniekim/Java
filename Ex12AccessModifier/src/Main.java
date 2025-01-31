import member.Person;

public class Main {
	
	public static void main(String[] args) {
		
		//OOP에서는 객체의 멤버변수들이 외부로부터 보호되어 관리되는 것이 중요하다.
		//캡슐화, 정보은닉 - 라디오의 회로가 외부에 노출되어 있으면 오히려 안전하지 못하다고 보는 것과 비슷한 개념
		
		
		//멤버변수에 대한 접근을 제한하는 접근 제한자라는 개념의 발생
		//4가지 종류 (보안 강->약)
		// 1. private		: 본인 class 내부에서만 접근 가능
		// 2. (default)		: 같은 패키지에서는 외부에서 .연산자를 이용하여 접근이 가능, 다른 패키지에서는 .연산자로 접근 불가
		// 3. protected		: 같은 패키지에서는 접근간으하며 다른 패키지라도 상속관계의 클래스라면 접근 가능
		// 4. public		: 어느 곳에서든 .연산자로 멤버 접근 가능
		
		
		//같은 패키지의 클래스 객체 생성
		First f = new First();
		//f.a=50; //error: private은 외부에서 접근이 불가
		
		
		//같은 "패키지" 안에서는 private을 제외한 모든 접근제한자에 접근 가능 
		f.b=10;
		f.c=20;
		f.d=30;
		
		//객체의 메소드 안에서는 객체의 멤버에 접근할 때 접근제한자의 영향을 받지 않음
		
		f.aaa(); //같은 패키지면 default 메소드 접근 가능
		
		
		//다른 패키지의 클래스 객체 생성
		aaa.Second s = new aaa.Second();
		//s.a=20; //error : private
		//s.b=10; //error : default (다른 패키지라서 영향)
		//s.c=30; //error : protected
		
		s.d=40; //ok - 다른 패키지 클래스의 멤버는 public만 접근 가능
		//단, 다른 패키지라도 상속받은 protected도 접근 가능
		
		//메소드도 접근 제한자의 영향을 받음
		//s.aaa(); //다른 패키지의 default 메소드는 접근이 불가
		s.bbb(); //public - ok
		
		
		//클래스에도 접근 제한자 가능
		//다른 퍀지의 클래스가 public이 아니면  사용이 불가(패키지명을 써도 사용X)
		//aaa.Third t;//error - class가 default접근 제한자라서..
		
		
		//정리!
		//기본적으로 OOP에서는 정보은닉이 중요한 개념이어서
		//멤버변수(데이터:정보)를 외부에 노출하지 않도록 하는 것이 미덕(안전하게)
		//★★★★★★★멤버변수(Field)는 기본적으로 private으로 설정
		//★★★★★★★멤버메소드는 기본적으로 public으로 설정
		//ex) 앱 사용자 정보 저장 : 이름, 나이, 국적 등
		
		Person p = new Person();
		//p.name="Sam" 불가능! ->private이니깐
		//private멤버값은 어떻게 대입? 메소드를 이용
		p.setMembers("Sam", 20, "Ghana");
		p.show();
		
		
		//이름만 변경하고 싶은 경우
		//p.name="Robin"; //error -private
		//멤버값 하나만 변경하는 기능이 필요 - SetterMethod
		p.setName("Robin");
		p.setAge(21);
		p.setName("France");
		
		
		//멤버변수 중 하나를 사용하고 싶다면?
//		if(p.age<20) { //error - private
//			System.out.println("미성년자!!");
//		}
		
		
		//멤버 하나의 값을 읽어오는 기능 메소드를 이용
		//GetterMethod
		if(p.getAge() <20 ) {
			System.out.println("미성년자!!");
		}
	
	
	
	
	}
	
}
