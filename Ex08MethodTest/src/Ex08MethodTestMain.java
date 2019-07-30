
import java.util.Scanner;

public class Ex08MethodTestMain {

	//int a; 클래스 안에 있는 변수 : 멤버변수(필드) 기본이 0
	
	public static void main(String[] args) {
		
		//학생 성적 관리 프로그램
		//이름, 국어, 영어, 평균 (4가지 데이터 저장)
		
		//지역변수 - 기본값이 쓰레기
		String name;
		int kor;
		int eng;
		double aver;
		
		name = "Sam"; // new String "Sam"
		kor=80;
		eng=70;
		aver=(double)(kor+eng)/2;
		
		//학생이 여러명인 경우
		//위와 같이 변수들을 하나씩 나열하는 것은 불편
		//여러개의 자료를 한꺼번에 관리하는 배열?! 이용하기
		
		String[] arrName= new String[4];
		int[] arrKor= new int[4];
		int[] arrEng= new int[4];
		double[] arrAver = new double[4];
		
		arrName[0] = "Sam";
		arrKor[0] = 80;
		arrEng[0] = 70;
		arrAver[0] = (double)(arrKor[0]+arrEng[0])/2;
		
		//위처럼 같은 자료형끼리 묶어서 사용하는 방식은 적합하지 않음 - 학생 1명의 데이터가 분산되어 있어서
		//몇번 칸의 데이터가 누구 것인지 알 수 없음
		
		//그래서 연관있는 데이터끼리 (이름, 국어, 영어, 평균) 묶어서 관리하는 것이 더 효과적
		
		//연관있는 데이터끼리의 묶음을 설계하는 것을 'Class'라고 함
		//새로운 클래스를 정의(설계)하려면 새로운 .java파일에 작성 권장!
		
		
		//새로 설계된 Student 클래스로 객체를 생성!
		
		StudentData stu = new StudentData();
		//System.out.println(stu);//객체의 주소출력 (실제 물리주소는 아님)
		stu.name="Sam";
		stu.kor = 80;
		stu.eng=70;
		stu.aver=(double)(stu.kor+stu.eng)/2;
		
		
		StudentData stu2 = new StudentData();
		stu2.name="Robin";
		stu2.kor = 100;
		stu2.eng=80;
		stu2.aver=(double)(stu2.kor+stu2.eng)/2;
		
		
		//화면출력
		System.out.println("이름: "+stu.name);
		System.out.println("국어: "+stu.kor);
		System.out.println("영어: "+stu.eng);
		System.out.println("평균: "+stu.aver);
		System.out.println();
		
		System.out.println("이름: "+stu2.name);
		System.out.println("국어: "+stu2.kor);
		System.out.println("영어: "+stu2.eng);
		System.out.println("평균: "+stu2.aver);
		System.out.println(); 
		
		//객체 멤버값 변경
		int ko=50;
		stu2.kor= ko;
		System.out.println("변경된 국어성적: "+stu2.kor);
		System.out.println();
		
		//사용자(키보드) 입력으로 객체의 멤버값을 대입
		
		//키보드입력 기능을 가진 객체를 생성
		Scanner sc = new Scanner(System.in);
		
		StudentData stu3 = new StudentData();
		stu3.name= sc.next(); //nextLine은 띄어쓰기 받아들임
		stu3.kor= sc.nextInt();
		stu3.eng= sc.nextInt();
		stu3.aver=(double)(stu3.kor+stu3.eng)/2;
		
		//객체의 멤버값 출력..
		System.out.println("이름: "+stu3.name);
		System.out.println("국어: "+stu3.kor);
		System.out.println("영어: "+stu3.eng);
		System.out.println("평균: "+stu3.aver);
		System.out.println();
		//이런 식으로 객체의 값들을 출력하는 방식은 너무 짜증!
		
		//이런식으로 출력을 할 수 만 있다면?
		//stu3.출력해!(); //이런식의 기능이 있다면?
		//다시말해, 객체가 기능도 있다면.. 더 편하게 프로그래밍이 가능!
		
		//자바는 클래스 안에 기능(함수/메소드)도 가질 수 있도록 되어 있음.
		//StudentData 클래스 안에 기능 추가해보기!
		
		
		stu2.show(); //기능(메소드)을 호출
		
		//show()처럼 기능을 호출할 수 있으니
		//멤버변수의 값을 출력하는 기능도 만들어 호출할 수 있겠죠?
		stu3.output();
		
		//이런식이면 평균계산을 하는 기능도 가능하겟죠
		//평균계산을 해주는 기능을 만들면 더 편하지 않을까요?
		StudentData stu4 = new StudentData();
		stu4.name = "Hong";
		stu4.kor=70;
		stu4.eng=75;
		stu4.calAver; //평균계산 기능호출!
		
		stu4.output();
		
		//위처럼 메소드를 잘 사용하면 코드가 훨씬 간결하고 가독성도 좋아짐.
		
		//멤버값들을 하나씩 입력하는 기능도 역시 만들 수 있음
		//즉 한 줄에 멤버값을 입력하는 기능
		
		//stu4.입력해("lee", 100, 50); //이런식의 기능이 있다면 더 간결..
		//즉, 메소드의 파라미터에 값을 전달하는 기능!
		
		
		//이런식으로..
		//Student stu5= new Student();
		//stu5.입력기능("park", 100, 50);
		//stu5.출력기능();
		
		
		
		
		
	

	}

}
