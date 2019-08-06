
public class Main {

	public static void main(String[] args) {

		Robot robot = new Robot();
		robot.attack();
		robot.move();
		System.out.println();
		
		Fly fbot = new Fly();
		fbot.attack();
		fbot.move();	//기존의 상속받은 기능 사용 가능
		fbot.fly();
		System.out.println();
		
		Swim sbot = new Swim();
		sbot.attack(); //기존의 상속받은 기능 사용 가능
		sbot.move();   //기존의 상속받은 기능 사용 가능
		sbot.swim();
		
		//위 예제는 원래기능(상속받은 메소드)이 완전히 맘에 안드는 상황이어서
		//메소드 안에 내용을 완전히 새롭게 작성한 경우임
		
		//하지만, 기존 메소드의 기능에 일부분 내용만 추가하고 싶은 경우도 있음!!
		//다음 프로젝트에서 학습해보기!
		
		}


}
