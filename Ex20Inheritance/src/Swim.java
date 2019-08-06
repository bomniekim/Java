
public class Swim extends Robot{

	//이미 attack(), move() 기능을 보유한 상태
	
	//새로운 기능만 추가
	void swim() {
		System.out.println("음파음파");
	}
	

	// 이미 있는 기능이 마음에 들지 않아 다시 정의하는 기술
	// Overriding(오버라이딩) : 기존(상속받은) 메소드와 같은 메소드를 다시 정의
	void attack() {
		System.out.println("어뢰 발사!!");
	}
	
	@Override
	void move() {
		System.out.println("첨벙첨벙!!!");		
	}
	
	

}










