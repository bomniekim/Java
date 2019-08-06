
public class Main {

	public static void main(String[] args) {
		
		//어떤 대학의 정보제공 앱 제작 - 회원가입 기능
		//회원종류: 일반회원, 학생, 교수, 근로학생
		
		//1. 일반회원: 이름, 나이
		//2. 학      생: 이름, 나이, 전공
		//3. 교      수: 이름, 나이, 연구과제
		//4. 근로학생: 이름, 나이, 전공, 업무
		
		//일반회원
		Normal p = new Normal("Sam", 20);
		p.show();
		System.out.println();
		
		//학생
		Student stu = new Student("Robin", 23, "android");
		stu.show();
		System.out.println();
		
		//교수
		Professor pro= new Professor("Kim", 45, "mobile optimization");
		pro.show();
		System.out.println();
		
		//근로학생
		Work alba = new Work("Hong", 22, "Java", "PC Manager");
		alba.show();
		System.out.println();
		
	}
	
	

}
