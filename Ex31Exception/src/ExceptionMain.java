import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Error(오류) : 실행불가
		// 2. Exception(예외) : 실행 중(Runtime)

		// Exception의 대표적인 예:
		// 1) 사용자가 잘못된 데이터를 입력하는 경우: 숫자 입력 상황에서 문자입력 등의 입력
		// 2) 개발자 로직이나 계산을 잘못한 경우: 배열의 인덱스 번호 오류/ 0으로 나눗셈
		// 3) 네트워크나 하드웨어 오류 (하드디스크의 파일제어 오류 / 특정사이트 접속 오류 : url미스, 사이트서버 불량)
		// 4) 악의적인 과부하에 의한 오류(디도스 공격) : 해결이 어려움!

		System.out.println("예외처리에 대해 알아봅시다");
		// 예외 상황 전까지는 실행됨

		// 위의 예외상황들에 대응하는 문법 소개 [예외처리]
//		int a=0;
//		System.out.println(10/a);
		// 예외가 발생하면 그 순간 프로그램은 진행중에 다운
		// 이를 방지할 필요가 있음.. 즉, 문제가 생기면 그 부분만 실행하지 않고 다음 코드를 실행
		// 다시 말해 다운되지 않도록 할 필표없음
		// if를 이용해서 a값이 0인지를 검사해보고 나눗셈을 실행할 지 여부를 결정하도록 할 수 있음.
		// 경우에 따라서는 일단 시도를 해보고 예외(Exception)이 발생하면 그에 대응하도록 해야 하는 경우도 있음
		// 예) 인터넷 사이트에 접속하는 경우(www.daum.net): 접속은 해보지만 그 사이트의 서버문제로 접속이 안되는 경우!
		// 이럴 경우 예외처리 문법이 매우 유용함! 프로그래머들에게는 필수 기술!

		
		
		// 1) 0으로 나눗셈...
		int n = 2;
		int m = 0;

		try {
			System.out.println(10 / m); // 예외발생할 수 있는 코드
		} catch (ArithmeticException e) { // 산술적 에러
			// 위 try 영역 안에서 예외가 발생하면 이 곳이 실행됨
			// 에러가 발생했을 때 실행할 코드들..
			System.out.println("에러가 발생했습니다.");
			System.out.println("에러메세지 :" + e.getMessage());
			System.out.println("에러메세지 풀버전: " + e.toString());
		}
		
		
		

		// 2) 배열의 인덱스 번호 사용 오류
		int[] arr = new int[5];

		try {
			// 에러가 발생할 여지가 있는 코드..를 try 안에 작성
			for (int i = 0; i < 6; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("에러!");
		}
		
		

		// 3) null참조변수로 객체의 메소드 사용 (가장 많이 발생)
		String s = null;

		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("null error! 객체없음!");
		}

		
		
		
		// 4) 잘못된 데이터를 입력
		Scanner scan = new Scanner(System.in);

		int k;

		try {
			k = scan.nextInt();
			System.out.println("n: " + n); // try밖에 있으면 무조건 실행되니깐 안에 넣어!
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력해!");
		}

		
		
		// 5) 숫자로 바꿀 수 없는 데이터를 숫자로 바꾸고자 할 때
		// String str= scan.next(); //문자열 입력

		// 문자열을 int형으로 변환하기
		try {
			// int num= Integer.parseInt(str);
			// System.out.println("num : "+num);
		} catch (NumberFormatException e) {
			System.out.println("정수형 문자열이 아니어서 변환 불가!");
		}

		// ##정리! 예외처리는 프로그램이 다운되지 않도록 하는 문법 ##

		// 예외가 한번에 여러가지 발생하는 경우도 있음
		// 예) 두 수를 입력받아 나눗셈을 하는 프로그램..
		// 예외 안에 중첩으로 예외처리 필요...
		int c, d;

		try {
//			c = scan.nextInt();
//			d = scan.nextInt();
//
//			try {
//				System.out.println(c / d); // d가 0인 문제가 있음
//			} catch (ArithmeticException e) {
//				System.out.println("수학적 오류: 0 나눗셈");
//			}	

		} catch (InputMismatchException e) {
			System.out.println("정수가 아닌 값 입력 에러!");
		}

		
		//중첩에 중첩... 중첩... 이거 좀 짜증남
		//if else문의 중첩 대신에 if else if문..
		//다중 catch문법으로 간결하게 ...처리하기
		
		
		try {
			
//			c=scan.nextInt();
//			d=scan.nextInt();
//			
//			System.out.println(c/d);
			
		}catch(InputMismatchException e) {
			System.out.println("정수가 아닌 값을 입력"); //순서 중요
		}catch(ArithmeticException e) {
			System.out.println("수학적 오류: 0 나눗셈");
		} 
		
		//멀티catch문은 개수제한이 없음
		//만약 에러 상황마다 대처할 내용이 똑같다면
		//굳이 여러 개의 catch문을 작성하는 것은 낭비!
		//각 예외객체들의 최상위 클래스인 Exception클래스의 참조변수로 모든 종류의 Exception객체들을 catch할 수 있음
		try {
			c=scan.nextInt();
			d=scan.nextInt();
			
			System.out.println(c/d);
		}catch(Exception e) {
			System.out.println("error!");
		}
//		catch( ArithmeticException e) {
//			
//		} //첫번째에서 에러를 모두 잡았기 때문에 실행될 수 없는 코드 -> error
		
		
		//예외발생 여부와 상관없이 무조건 할 일 있다면?
		//보통 예) 메모리 관리하거나 외부(서버, 파일)와 연결통로 종료시키는 코드들...작성!
		
		int x=0;
		
		try {
			System.out.println(10/x);
			System.out.println("계산성공");
		}catch(ArithmeticException e ) {
			System.out.println("계산실패!");
		}finally {
			//여기는 에러여부와 상관없이 무조건 실행되는 영역!
			System.out.println("여긴 무조건 실행!");
		}
		
		//가만 보니..finally 안써도 어차피 catch{} 밖에 다음 줄에 코드를 쓰면 무조건 실행됨
		//그럼 어차피 무조건 실행되는 코드 작성 가능함
		//그러나 finally 밖에 쓰면 try-catch문과 상관없는 코드인 것처럼 인식될 가능성이 많음
		
		
		//finally를 쓰게 되면 catch문을 생략할 수 있음
		try {
			
		}finally {
			
		}
		
		 
		//Exception의 2가지 종류!
		//1. Checked Exception : 예외처리를 안하면 에러가 발생하여 실행조차도 못하는 예외들!
		//2. Unchecked Exception : 예외처리(try문)를 해도 되고 안해도 되는 예외들! - 지금까지 봤던 저 위의 예외들!
		
		//Checked Exception의 대표적인 것들.. 반드시 예외처리를 해야만  
		
		try {
			//URL url= new URL("http://www.naver.com");
			URL url= new URL("www.naver.com");//주소오류 : http://없어서..
			
			System.out.println("접속 성공!");		
		}catch(MalformedURLException e) {
			System.out.println("서버주소에 이상이 있습니다.");
		}
		
		
		File file= new File("D://aaa.txt");		
		
		try {
			//예외처리를 안하면 에러가 나는 코드!
			FileInputStream fis= new FileInputStream(file);
			
			System.out.println("파일접속 성공");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일접속 실패. 파일을 찾을 수 없습니다.");
		}
		
		
		
		System.out.println();
		System.out.println("aaaaa");
	
	}

}