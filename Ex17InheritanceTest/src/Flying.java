
public class Flying {

	// 이 로봇도 로봇이니 이름은 있겠지
	String name;
	int hp;
	int wing; // 새로 추가된 변수
	
	// 원래 로봇이 가지고 있는 기본기능인 공격, 이동 기능은 있어야 함
	void attack() {
		System.out.println("주먹발사!");
	}

	void move() {
		System.out.println("아장아장~");
	}
	
	//추가로 나는 기능만 정의
	void flying() {
		System.out.println("날아간다~");
	}
}













