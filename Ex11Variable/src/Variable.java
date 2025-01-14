
public class Variable {

	//자바에서의 변수의 종류 [ 멤버변수, 지역변수, 매개변수, 정적(static)변수 ]
	
	//멤버변수(Field) - class {} 안에 선언된 변수
	//멤버변수는 객체가 생성될 때 만들어짐(new 될때!) -> 객체가 소멸시 멤버변수도 자동소멸
	int a; //멤버변수는 만들기만하면 자동 0 초기화
	int b;
	
	
	
	
	//지역변수 - 메소드 안에 변수 선언
	//지역변수는 메소드가 호출될 때 메모리에 만들어짐 -> 메소드가 종료되면 메모리에서 소멸
	void aaa() {
		
		int k; //지역변수 : 자동 초기화되지 않음
		
		System.out.println( a ); // 0
		//System.out.println( k ); //쓰레기값은 출력불가이므로 error
		
		c=50; //★★★멤버변수는 메소드가 실행되기 전에 먼저 존재하므로 error가 나지 않음★★★
		
		
		//다른 메소드 호출 가능
		bbb();
	}
	
	int c; //멤버변수 - 선언위치는 free
	
	
	
	//다른 메소드
	void bbb() {
		//멤버변수는 이 클래스 안에서는 어디서든 인식이 가능
		a=30;
		System.out.println( a ); //멤버변수 a 출력 :30
		
		//aaa()메소드의 지역변수는 다른 메소드에서는 인식불가능
		//k=30; //error
		
		//멤버변수와 같은 이름을 가진 지역변수 가능? YES!
		int a; //지역변수
		a=50; //지역변수
		
		System.out.println( a ); //지역변수 a 출력 : 50
		
	}
	
	
	//파라미터(매개변수)는 지역변수의 일종
	void ccc(int x, int a) { //멤버변수와 같은 이름을 가진 매개변수도 가능
		a=50; //매개변수 a를 의미
		int k; //지역변수
	}
	
	
	void ddd() {
		
		aaa(); //다른 메소드 호출가능
		
		ddd(); //본인 메소드를 다시 호출할 수도 있음 (재귀호출:Recursive call)
	}
	
	
	
	//this 키워드의 존재!
	void eee() {
		int a=5; //멤버변수와 같은 이름을 가진 지역변수 생성
		System.out.println( a ); //지역변수 a 출력 - 5
		
		//이 상황에서 멤버변수 a를 사용하고 싶다면?
		//이때 this 키워드 참조변수를 이용
		//this키워드는 이 클래스의 객체를 참조하고 있는 특별한 변수명
		System.out.println( this.a ); //멤버변수 a출력 - 0
		
		
	}
	
	
	int d; //여기에도 멤버변수 선언 가능 (클래스 안에서)
	
}//class

//클래스 밖의 변수 선언은 불가능!
//int e; //error - 자바에는 전역변수가 존재하지 않음


// 객체는 new로 생성되고 객체가 더 이상 필요없다고 판단될 때 자동소멸 (null)
// 소멸시켜주는 별도의 process 존재(in JRE) : 쓰레기수집가(Garbage Collector:GC)
// 프로그램을 실행시키면 옆에서 계속 참견

