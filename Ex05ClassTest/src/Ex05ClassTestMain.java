import java.util.Random;

public class Ex05ClassTestMain {

	public static void main(String[] args) {
		
		//객체 지향 프로그래밍(OOP) - 객체 위주로 프로그래밍
		//객체? 고유한 기능(동작)과 값(데이터)를 가진 녀석 (변수[필드]+함수[메소드])
		//-Random: 임의의 값을 만들어내는 능력을 가진 녀석
		//-Scanner: 키보드의 입력을 받아들이는 능력을 가진 녀석
		//-String: 문자열을 관리하는 능력을 가진 녀석
		
		//위의 Random, Scanner, String이라는 객체의 능력을 구분하는 명칭을 클래스라 부른다
		//즉 객체의 종류를 클래스라고 부름(마치, 변수의 종류를 자료형이라고 하듯)
		
		//자바에서는 이런 클래스를 기능별로 약 4천여개 정도 이미 만들어 놓음
		//이 클래스를 사용하려면 객체를 만들어서 사용해야 함
		
		//Random객체 생성(클래스를 사용하는 것이 아니라..)
		Random rnd =  new Random();
		int n= rnd.nextInt();
		
		//결국 자바는 이런 객체들을 필요할 때 불러서 사용하는 방식으로 프로그래밍 하는 것
		//다시말해, 4천여개의 클래스를 얼마나 적재적소에 잘 사용하는가가 중요함
		//이런 클래스들을 Java System API 라고 부른다. (라이브러리 같은 것)
		
		
		//하지만, 자바에서 만들어준 클래스가 있더라도 내가 원하는 기능을 가진 녀석이 꼭 있다고 확신할 수 없음
		//실제로 그럴 수도 없음
		
		//예를 들어 게임을 만들 때 어떤 캐릭터가 이동과 공격기능이 있었으면 함.
		//그러나 문제는 기존의 4천여개의 클래스에는 이동과 공격기능을 가진 클래스가 존재하지 않음
		
		
		//결국, 4천여개 중에 없는 새로운 기능을 가진 클래스를 본인(프로그래머)이 직접 만들어서 사용해야 하는 경우가 많음!
		
		
		//사용자정의 class만들기!!
		//클래스를 만들엇다고 프로그래밍이 되는 것이 아님
		//만든 클래스로 객체를 생성하여 사용해야 객체지향
		
		Ex05ClassSecond second = new Ex05ClassSecond();
		second.show(); //그 객체의 기능 사용
		
		//class를 만드는(작성하는) 위치는 여러곳에서 가능!
		// 1) 별도의 .java 파일에 만들기
		// 2) 하나의 .java 파일에 여러 개 만들기 가능
		// 3) 다른 class안에 class를 설계(작성)
		// 4) 메소드(함수) 안에 class를 설계(작성)
		
		Ex05ClassTestThird third = new Ex05ClassTestThird();
		third.show();
		
		
		Test t = new Test();
		t.show();
		
		//Inner Class는 곧바로 객체를 만들 수 없음
		//Hello h = new Hello(); //error
		
		
		
		
		
		}
		
		
	
	}


