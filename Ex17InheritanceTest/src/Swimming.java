

//Robot클래스의 변수와 메소드를 그대로 가져오고, 추가기능만 설계!
public class Swimming extends Robot{
	
	//이 로봇도 로봇의 기본적인 기능 필요
	//이미 Robot클래스에서 작성한 코드들을 또 다시 작성하기 번거로움
	//이것을 쉽게 하도록 한 것이 '상속(inheritance)'
	
	//상속을 받으면
	//아무것도 쓰지 않았지만 이미 Robot클래스의 멤버를 모두 보유한 상태가 됨

	//새로 추가할 변수와 메소드만 작성하면 됨
	void swimming() {
		System.out.println("음파음파");
	}
	
}








