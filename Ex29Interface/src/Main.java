
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		//팀장이 인터페이스를 설계하고 추상메소드의 이름을 정하면
		//팀원들은 그 이름을 토대로 기능을 구현하여 클래스를 설계함
		
		//팀장: Unit 인터페이스 설계
		//팀원1: Marine클래스 정의 및 Unit 구현 - attack과 move라는 기본기능 구현 -> 메소드 이름 통일
		//팀원2: Tank클래스 정의 및 Unit 구현 - attack과 move라는 기본기능 구현 -> 메소드 이름 통일
		//팀원3: Race클래스 정의 및 Unit 구현 - attack과 move라는 기본기능 구현 -> 메소드 이름 통일
		
		// Marine, Tank, Race 객체는 attack(), move() 기능이 있음을 확신할 수 있음
		
		//팀장은 만들어진 클래스를 이용하여 객체생성 및 게임 알고리즘을 코딩
		
		//각 클래스의 참조변수를 사용하지 않고..
		//부모클래스의 역할인 Unit인터페이스의 참조변수를 이용하여
		//모든 유닛객체들을 제어하고자 함.
		
		//배열은 이미 유닛의 개수를 고정해야만 함(단점)
		//실제 게임은 유닛의 개수가 지속적으로 변경됨 (생성과 소멸의 반복)
		//Unit[] units = new Unit[200];
		
		//실제 게임이나 앱에서는 유동적 배열(기차같은 느낌) : ArrayList클래스 사용
		
		ArrayList<Unit> units = new ArrayList<Unit>(); //기차 뒤에 끌고 다니는 화물의 종류를 미리 정함
		
		//요소의 개수 알아내기!
		int num = units.size();
		System.out.println("유닛개수: "+num); //아직 만든게 없으니깐 유닛개수: 0
		
		//배열에 Unit객체들 생성하여 추가
		units.add(new Marine());
		units.add(new Tank());
		units.add(new Marine());
		units.add(new Race());
		
		System.out.println("유닛개수: "+units.size()); // 유닛개수: 4
		
		//유닛들의 기능을 사용하기
		for(int i=0; i<units.size(); i++) {
			Unit u = units.get(i); // Unit참조변수로 받기
			u.attack();
			u.move();
			System.out.println();
		}
	
		//for each문
		for(Unit unit : units) {
			unit.attack();
			unit.move();
			
			//레벨업기능 추가해서 사용
			//unit이 Marine과 Tank일때만 levelup기능 사용
		
//		if( unit instanceof Marine ) {
//			Marine m= (Marine)unit;
//			m.levelup();
//		}else if( unit instanceof Tank) {
//			((Tank) unit).levelup();
//		}
		//가만보니 Marine과 Tank가 모두 Levelupable의 자식이므로..
		if( unit instanceof Levelupable ) {
			Levelupable a= (Levelupable)unit;
			a.levelup();
		}
		
		System.out.println();
		
		}
		
			
		
		
	}
}
