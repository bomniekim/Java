
public class Calculator {

	// 멤버메소드

	// 더하기기능
	int sum(int x, int y) {
		return x + y;
	}

	// 빼기기능
	int subtract(int x, int y) {
		return x - y;
	}

	// 곱셈기능
	int multi(int x, int y) {
		return x * y;
	}

	// 나눗셈기능
	int divide(int x, int y) {
		return x / y;
	}

	// 실수형 숫자들의 사칙연산 메소드

	// 메소드의 이름은 같고 파라미터는 다른(개수 or 자료형) 메소드의 오버로딩(Overloading)
	// 리턴타입은 무관
	double sum(double x, double y) {
		return x + y;
	}

	double subtract(double x, double y) {
		return x - y;
	}

	double multi(double x, double y) {
		return x * y;
	}

	double divide(double x, double y) {
		return x / y;
	}

	// 문자열데이터의 산술 덧셈기능
	int sum(String x, String y) {
		// 문자열을 int로 변환하기!! (Wrapper클래스 이용)
		int n1 = Integer.parseInt(x);
		int n2 = Integer.parseInt(y);

		return n1 + n2;
	}

}
