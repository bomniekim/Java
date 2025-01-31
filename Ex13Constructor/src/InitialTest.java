
public class InitialTest {
	
	//1.기본값 초기화 - 0에 해당하는 값
	int a; //0
	int b=10; //2. 명시적 초기화 
	
	//3.1 Static 초기화 블럭
	//InitialTest 객체가 처음 사용될 때 딱 한번만 실행되는 초기화 블럭
	
	static
	{
		System.out.println("static 초기화 블럭");
	}
	
	
	
	
	//3.2 인스턴스 초기화 블럭(Region: 영역) //중괄호
	//프로그래밍적으로 초기화를 할 수 있다는 장점
	{
		a=20;
		//명시적 초기화의 단점 - 값의 대입 밖에 되지 않고 연산이 불가능
		//실행문을 적용할 수 없음. a++ 같은 것
		//초기화 블럭은 이런 것을 보완
		a++; //초기화값: 21
		
		//심지어 이런 것도 가능함
		if(a<25) {
			a--; //20
		}
		System.out.println("초기화 블럭");
	}
	
	//4. 생성자 메소드를 이용한 초기화 - 파라미터의 전달이 가능, 또한 실행문을 이용한 초기화도 가능
	public InitialTest() {
		a=50;
		System.out.println("생성자 메소드");
	}
}
