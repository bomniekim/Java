
public class InheritanceMain {

	public static void main(String[] args) {

		// 러프하게 상속에 대해 알아보기

		Robot robot = new Robot();
		robot.attack();
		robot.move();
		System.out.println();
		
		//날아다니는 로봇도 있으면 좋겠음
		//즉, 나는 기능이 추가된 로봇!
		//기존의 Robot클래스에 나는 기능을 추가하면 기존에 있는 로봇들의 능력이 변경됨
		//새로운 클래스를 만들어 나는 기능을 추가해야 함
		
		Flying fbot = new Flying();
		fbot.attack();
		fbot.move();
		fbot.flying();
		System.out.println();
		
		//이번에는 수영하는 로봇도 필요
		//또 같은 작업을 하는 클래스를새로 만드로 추가로 swimming()기능 추가
		//이럴 때 사용하는 것이 java의 상속!
		Swimming sbot = new Swimming();
		sbot.attack();
		sbot.move();
		sbot.swimming(); 
		System.out.println();
		
		
		
	}
}
