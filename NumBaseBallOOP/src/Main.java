import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 상대방 게이머인 컴퓨터 객체 생성
		Computer com = new Computer();

		// 컴퓨터 객체에게 정답값을 랜덤하게 만들어 내라
		com.makeRnd();

		// 키보드 입력을 받는 기능을 가진 객체 생성
		Scanner sc = new Scanner(System.in);

		while (true) {

			// 키보드로 숫자 입력받기
			String userNum = sc.next(); // 문자열입력

			// 컴퓨터 객체에게 내가 입력받은 값을 전달해주고 결과응답을 출력하도록!
			boolean result = com.checkAnswer(userNum);
			
			//정답이면 while문 종료
			if(result) break;
		}

	}//

}
