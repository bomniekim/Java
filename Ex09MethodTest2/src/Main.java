import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Student 객체 생성
		Student stu = new Student();
		stu.name = "Sam";
		stu.kor = 80;
		stu.eng = 70;
		
		stu.show();
		
		Student stu2 = new Student();
		//값을 일일이 대입하는 것이 너무 짜증!
		
		//Robin, 100, 50 값들을 한번에 입력하는 기능이 있다면?
		//기능(method)를 호출하면서 값을 전달할 때 사용하는 것이 '파라미터'
		//stu2.입력기능("robin", 100, 50); // Student 클래스에 기능설계
		stu2.setMembers("Robin", 100, 50);
		stu2.show();
		
		Student stu3 = new Student();
		stu3.setMembers("Hong", 80, 40);
		stu3.show();
		
		//멤버변수 중에서 하나만 값 대입하기!
		stu3.eng=60; //이 문법이 불가한 경우도 있음!
		//접근제하자를 배우면 위 문법이 불가능
		//자바에서는 가급적 접근제한자를 사용하도록 권장..
		//그러므로 멤버값 하나만 변경하는 기능을 만들어야한 경우가 많음
		//멤버값 하나를 변경하는 기능도 만들어 두는 것이 좋음
		stu3.setName("Kim");
		
		//멤버값을 일일이 대입하는 기능 사용하기.
		Student stu4 = new Student();
		stu4.name("Lee");
		stu4.kor(80);
		//stu4.eng= 700; //오류의 가능성이 많음
		stu4.setEng(700); //잘못된 값의 대입을 막아주게끔 할 수 있다.
		stu4.setEng(70);
		
		stu4.show();
		
		//학생성적의 총점을 출력하기
		int total= stu4.kor+stu4.eng;
		System.out.println("총점: "+total);
		
		//total = stu3.kor + stu4.eng; //실수여지 많음
		System.out.println("총점: "+total);
		
		//총점계산도 Student 객체에게 기능으로 있으면 실수의 여지가 줄어든다.
		total= stu4.calTotal(); //총점을 계산해서 리턴해주는 기능 호출 -> 실수의 여지가 적어짐! 메소드를 쓰는 이유
		System.out.println("총점: "+total);
		
		//사실 return을 받는 형태의 메소드 호출은 익숙함
		Random rnd = new Random();
		int n = rnd.nextInt();
		
		//평균을 계산하는 기능!
		//double aver=(double)stu4.calTotal()/2; 코드가 혼동스러움
		double aver=stu4.calAver();
		System.out.println("평균: "+aver);
		
		aver=stu3.calAver2();
		System.out.println("평균: "+aver);
		
		
		
		//총점과 평균을 모두 계산하여 리턴해주는 기능? 가능할까?
		//즉, 2개값  return이 가능할까? NO!
		//리턴 2개 이상은 불가능!
		
		//멤버변수 하나의 값만 리턴해주는 기능!
		//즉, 멤버변수 하나 값만 대입하는 기능(set~)의 반대 기능을 가진 메소드
		
		
		//name 변수에 stu4객체의  name멤버변수 값 대입하기
		//if 접근제한자를 배우면 불가능해질 수 있음.
		String name = stu4.getName();
		int kor = stu4.getKor();
		int eng = stu4.getEng();
		
		
		//정리하면 객체는 변수+메소드를 가진 녀석을 지칭함.
		//메소드만 있는 클래스도 존재할 수 있음(사실 많음.)
		
		
	}
}
