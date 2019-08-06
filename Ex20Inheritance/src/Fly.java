
public class Fly extends Robot{

	//이미 attack(), move() 기능을 보유한 상태
	
	//새로운 기능만 추가
	void fly() {
		System.out.println("난다~!");
	}
	
	//기존 공격기능이 맘에 안들어 새로운 공격 기능 메소드를 만들기 
	//전혀 새로운 메소드를 만들면 나중에 사용할 때 불편
	//기존 메소드를 수정하는 것을 권장
	//->메소드 오버라이드(override)
	//부모 클래스의 멤버와 같은 이름과 같은 파라미터를 가진 메소드 생성
	void attack() {
		System.out.println("미사일 발사!");
	}
	
	//메소드 오버라이딩
	void move() {
		System.out.println("슝~~~~~~~~!");
	}
}
