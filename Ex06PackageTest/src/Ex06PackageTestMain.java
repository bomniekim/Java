
import bbb.Student; //bbb 패키지 안의 Student 클래스를 편하게 사용하도록...
import bbb.Person;

//한번에 bbb 패키지 안에 있는 모든 클래스들을 import하기
import bbb.*;

public class Ex06PackageTestMain {

	public static void main(String[] args) {

		//class 정의 후 객체생성 및 사용
		Test t = new Test();
		t.a=10; //멤버변수 사용
		t.show(); //멤버메소드 사용
		
		//같은 이름의 class를 사용하는 문제가 생길 수 있음
		
		//사용자정의 클래스인 Student로 객체 생성하여 사용
		//[이름, 국어, 영어] 데이터 저장
		bbb.Student stu = new bbb.Student();
		stu.name="Sam";
		stu.kor=80;
		stu.eng=70;
		
		//[이름, 국어, 영어] 데이터 저장하는 객체 한 개 더 생성
		//퍀지명을 매번 추가하는 것이 불편
		//패키지명을 생략하는 기법 - import
		//bbb를 쓰지 않아도 알아들음
		Student stu3 = new Student();
		Student stu4 = new Student();
	
		java.util.Random rnd = new java.util.Random();
		//위 처럼 패키지명을 생략하기 위해 import java.util을 사용했던 것!
		
		
		//[이름, 나이, 주소] 데이터를 저장하는  Student 객체 생성
		//다른 패키지에 잇는 class를 사용하기
		aaa.Student.stu2 = new aaa.Student();
		
		//다른 패키지의 class로 객체를 만들면
		//객체의 멤버변수나 멤버메소드를 무조건 쓸 수 있다고 확신할 수 없음
		//객체의 멤버가 보호되어 있음 [접근제한자의 문제발생]
		
		stu2.name="Robin"; //public 멤버는 다른 패키지에서도 접근 가능
		//stu2.age=20; error: default멤버는 접근 불가
		
		
		//bbb 패키지 내의 Person Class 사용하기
		bbb.Person p = new bbb.Person();
		//패키지명 생략위해 import.bbb.Person
		Person p = new Person(); // 가능 
		
		
		//같은 이름을 가진 Student 클래스는 동시에 import는 불가
		
		//@@패키지명을 정할 때 권장사항@@
		// 패키지명은 가급적.을 구분으로 하는 두 단어 이상을 권장
		//ex) aaa.bbb, mrhi.dev.android.. 이런 식
		
		
		
		
	}

}
