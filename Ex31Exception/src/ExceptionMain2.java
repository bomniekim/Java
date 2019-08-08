
import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// throws : 예외 떠넘기기

		try {
			int x = divide(10, 0); // divide()메소드에서 떠넘긴(throws) 예외를 대신 처리
			System.out.println(x);
		} catch (ArithmeticException e) {
			System.out.println("대신 예외객체 받아 처리..");
		}

		// 떠넘기는 throws하는 예외객체의 종류에 따라..강제성을 가질 수 있음.
		// 만약, throws하는 예외객체가 Checked Exception의 일종이면..
		// 이 메소드를 호출하는 쪽에서 반드시 try-catch문을 사용해야 함.
		try {
			aaa();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			ccc();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/// 두 수의 나눗셈연산을 하여 결과를 리턴하는 메소드
	// 이 메소드는 아무 문제 없어보이지만.. 위험해! why? 오류의 가능성이 있음 [0 나눗셈]

	// 예외처리 문법 사용[try-catch]

//		static int divide(int a, int b) {
//			
//			
//			try {
//				return a/b;
//			}catch(ArithmeticException e) {
//				return ??; //리턴값이 애매함
//			}
//			
//		}

	// 메소드 안에 코드가 예외가 발생할 여지가 있어서
	// 예외처리를 하는데 그 쓰임이 다소 애매한 경우가 있음 (위와 같은 경우)
	// 예외 처리, 즉, 예외객체를 메소드를 호출한 쪽으로 떠넘기는 기법(throws) 사용

	static int divide(int a, int b) throws ArithmeticException {
		return a / b;
	}

	// 강제성을 띄는 예외객체 throws하기
	static void aaa() throws MalformedURLException {
		bbb();
		System.out.println("aaa");
	}

	// throws의 전달의 전달..(폭탄 돌리기 같은 느낌)
	static void bbb() throws MalformedURLException {
		URL url = new URL("http://www.daum.net");
	}

	// 만안, throws에 최상위 Exception클래스를 명시하면..
	// 실제 발생한 Exception객체가 Checked인지, UnChecked인지 구별할 방법이 없어서..
	// 이 메소드를 호출하는 쪽에서는 무조건 try-catch를 해야만 함.
	static void ccc() throws Exception {

	}

	// 이런식으로 특정 예외클래스를 throws옆에 명시하는 기법
	void ddd() throws NullPointerException {

	}
	// 만약, ddd()메소드에서 NullPointerException아 아닌 예외가 발생하면? 다운됨

	// 여러 예외를 모두 떠넘기고 싶다면? : 멀티 예외던지기
	void eee() throws NullPointerException, ArithmeticException, NumberFormatException {

	}

	// 한방에 모든 예외던지기 적용 가능
	void fff() throws Exception {
	}

}
