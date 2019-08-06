
public class PolyMain { //다형성: 모양은 같으나 결과가 다른

	public static void main(String[] args) {
		
		//First f = new Second(); // 객체의 내부가 같더라도 클래스가 다르면 다른 자료형
		
		First f = new First(); //제대로 된 캐스팅
		Second s= new Second(); //제대로 된 캐스팅
		
		//다른 class의 캐스팅은 안되는 것이 정상
		//하지만, 상속관계의 클래스라면?
		f= new Second(); //error가 안나! 부모 참조 변수로 자식 객체를 참조할 수 있다. 
		//s= new First();//자식 참조 변수로는 부모 객체를 참조할 수 없다.
		//why? 
		//자식객체에는 무조건 부모객체의 멤버를 가지고 있으므로  --> 업 캐스팅(size기준): 작은 것이 큰 것을 붙잡았다
		//부모객체에는 자식객체의 멤버를 가지고 있지 않으므로     --> 다운 캐스팅 
		
		//부모참조변수로 자식객체를 참조할 수는 있지만, 부모객체의 멤버만 제어할 수 있음.
		f.a=10;
		f.showFirst();
		//자식객체(Second)의 멤버는 마음대로 사요할 수 없음.
		//f.showSecond(); error
		
		
		//그럼에도 자식객체의 멤버를 사용하고 싶다면? !명시적 형변환!
		//Second클래스의 참조변수가 새로 필요함.
		f = new Second(); // 업 캐스팅 [ 묵시적 형변환 ] f = (First)new Second()
		Second s2; //자식참조변수
		s2 = (Second)f; //참조변수의 주소를 복사해주기 (자식참조변수에 부모참조변수를 대입)
		//자식이 부모를 참조한 것으로 해석됨 -> 다운 캐스팅 [ 명시적 형변환 필수 ]
		//Second가 First를 못 받겠다고 하니깐 형변환으로 Second가 맞다고 알려주는 것
		
		s2.showFirst();
		s2.showSecond();
		
		First f2 = new First(); //제대로 된 캐스팅
		Second s3; //자식참조변수
		//s3= (Second)f2; //명시적 형변환 - 다운 캐스팅? : 자식이 부모를 참조? : error //실제 First 객체에 showSecond가 없음.
		//다운 캐스팅은 한번이라도 업 캐스팅이 되었을때만 가능함
		//s3.showSecond(); //error
		
		//심지어 이런 경우의 에러도 발생
		Second s4= new Second();
		First f4 = s4; // 업 캐스팅 (묵시적 형변환)
		f4.showFirst();
		//f4.showSecond(); //error
		
		//그럼 왜 업캐스팅을 사용할까?
		//혹시 오버라이드 메소드가 있다면? 어찌될까?
		//show() 오버라이드..
		
		Second s5 = new Second(); //제대로 된 캐스팅
		s5.show(); //Second의 show
		
		//업캐스팅 되었을 때! [부모->자식 참조]
		First f5 = new Second();
		f5.show(); //실제 참조하는 객체의 오버라이드된 메소드가 실행 - second의 show메소드
		
		
		System.out.println("==========");
		//그럼 이 기술이 뭐에 유용한것인가?
		//부모참조변수 하나로 자식 모두 제어 가능
		First obj; //부모 참조변수 1개 - 쓰레기값
		
		obj=new First();
		obj.show(); //First의 show
		
		obj=new Second();
		obj.show(); //Second의 show
		
	
		//First를 상속한 Test클래스
		obj = new Test();
		obj.show(); //Test의  show
		
		
		//상속의 상속관계(조부모->손주)
		obj = new Third();
		obj.show(); //Third의 show
		
		
		//이렇게 obj.show()라는 글씨는 같은데 다른 결과를 보인다고 해서 "다형성"이라고 함
	
		
	}
}
