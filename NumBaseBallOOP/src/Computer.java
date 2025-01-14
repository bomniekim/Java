import java.util.Random;

public class Computer {

	// 컴퓨터가 가질 정답값의 각 자리수의 숫자를 저장하는 멤버변수
	int com100, com10, com1;

	// 정답값(랜덤값)을 만들어내는 기능(단, 중복되지 않은 3개의 숫자)
	void makeRnd() {
		Random rnd = new Random();

		while (true) {

			com100 = rnd.nextInt(10); // 0~9
			com10 = rnd.nextInt(10); // 0~9
			com1 = rnd.nextInt(10); // 0~9

			if (com100 != com10 && com100 != com1 && com10 != com1)
				break;

		}
	}// makeRnd Method

	// 전달받은 값이 정답인지 체크하는 기능
	boolean checkAnswer(String answer) {

		if (answer.length() != 3) {
			System.out.println("잘못 입력하셨습니다.");
			return false;
		}

		// 사용자 입력값을 자리수별로 분리
		int user100 = answer.charAt(0) - 48;
		int user10 = answer.charAt(1) - 48;
		int user1 = answer.charAt(2) - 48;

		int strike = 0, ball = 0;

		if (user100 == com100)
			strike++;
		else if (user100 == com10 || user100 == com1)
			ball++;

		if (user10 == com10)
			strike++;
		else if (user10 == com100 || user10 == com1)
			ball++;

		if (user1 == com1)
			strike++;
		else if (user1 == com100 || user1 == com10)
			ball++;

		// 계산결과를 출력
		if (strike == 3) {
			System.out.println("정답입니다!");
			return true;
		}

		System.out.println(strike + "strike, " + ball + "ball");
		return false;

	}

}// Computer class
