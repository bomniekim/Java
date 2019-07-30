
public class Student {

	//멤버변수(필드)
	
	String name;
	int kor;
	int eng;
	
	
	//멤버메소드
	//멤버변수의 값을 출력하는 기능(Method) 정의
	
	void show() {
		System.out.println("이름: "+ name);
		System.out.println("국어: "+ kor);
		System.out.println("영어: "+ eng);
		System.out.println();
	}
	
	//멤버변수에 값을 대입하는 기능(Method) 정의
	//SetterMethod
	void setMembers(String n, int k, int e) {
		//매개변수로 전달받은 값을 멤버변수에 대입해주기!
		name= n;
		kor=k;
		eng=e;
	
	}
	
	//name멤버변수의 값 변경하는 기능
	void setName(String n) {
		//전달받은 매개변수의 값을 멤버변수에 대입
		name = n;
	}
	
	//kor 멤버변수의 값을 변경하는 기능
	void setKor(int k) {
		kor=k;
	}
	
	
	//eng 멤버변수 값 대입 가능
	void setEng(int e) {
		//잘못된 값의 대입을 막아줄 수 있음.
		if(e<0 || e>100 ) {
			System.out.println("잘못된 값의 입력입니다.");
			return;//함수종료
		}
		else eng = e;
	}
	
	//총점을 계산하여 리턴해주는 기능
	int calTotal() { //리턴하려는 total의 자료형을 리턴타입에 써줌
		//총점계산
		int total=kor+eng;
		return total;
	}
	
	//평균을 계산하여 리턴해주는 기능
	double calAver() {
		//평균계산
		double aver=(double)(kor+eng)/2;
		return aver;
	}
	
	//멤버메소드에서 다른 메소드를 호출할 수 있음
	double calAver2() {
		//평균계산
		int total = calTotal(); //토탈계산해주는 다른 메소드 호출
		double aver=(double)total/2;
		return aver;
	}
	
	//리턴 2개해주기!
//	void calTotalAndAver() {
//		int total=calTotal();
//		double aver=calAver();
//		
//		return total, aver;
//	}
	
	
	//멤버변수의 값을 리턴해주는 기능! (set~의 반대기능)
	//GetterMethod
	 String getName() {
		return name;
	}
	 
	 int getKor() {
		 return kor;
	 }
	 
	 int getEng() {
		 return eng;
	 }
	 
	 //멤버변수의 숫자만큼 Getter & Setter Method를 만들게 됨
}

