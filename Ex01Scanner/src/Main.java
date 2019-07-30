/*
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//키보드 입력받기 - 정수형 숫자
		
		int num=0;
		int a; //정수형변수 선언
		
		try {
			//System.out.println( a ); // 숫자건 문자건 유니코드 값을 읽어줌
			//System.out.println( a-'0' ) //숫자로 읽을 수 있게 만드는 방법
			
			a= System.in.read();
			a=a-'0';
			num += (a*100);
			
			a= System.in.read();
			a=a-'0';
			num += (a*10);
			
			a= System.in.read();
			a=a-'0';
			num += (a*1);
			
			System.out.println("num : "+num);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}*/

/*
import java.util.Scanner;
//C언어의 전처리기 같은 것


public class Main {

//Java에서 객체생성할 때의 절대규칙! 모든 객체는 오직 heap에만 생성이 가능 : 무조건 new키워드로 생성해야만 함
	public static void main(String[] args) {
		//키보드 입력받기 - 정수형숫자
		int num=0;
		
		//키보드입력을 자료형에 맞게 편하게 할 수 있는 기능을 객체생성 - Scanner
		//new키워드로 객체를 만들면 만들어진 메모리의 주소를 리턴함
		//참조변수(=포인터변수) p에 주소를 저장하여 객체를 제어함
		Scanner p=new Scanner(System.in); //Scanner 객체 생성! : 스캐너가 직접 입력을 받는것이 아니라 System.in이 입력받음
		
		num=p.nextInt(); //p는 가리키는 중! 역참조
		//nextInt의 값을 돌려준 것
		
		System.out.println("num :"+num);
	}
}
*/

/*
public class Main {

	//Java에서 객체생성할 때의 절대규칙! 모든 객체는 오직 heap에만 생성이 가능 : 무조건 new키워드로 생성해야만 함
		public static void main(String[] args) {
			
			 Scanner scan= new Scanner(System.in);
			 
			 int a, b;
			 
			 a= scan.nextInt();
			 b=scan.nextInt();
			 
			 System.out.println(a+b);
			 
			 double c;
			 c=scan.nextDouble();
			 
			 System.out.println("c: "+c);
			 
			 String s;
			 s=scan.next(); //scan.nextLine(); 한 줄 입력받는 것 (띄어쓰기 가능) - Enter를 쳐야 끝나는 것
			 
			 if(s.equals("kim")) { //문자열비교는 s=="kim" 불가 -> 이건 주소끼리의 비교
				 //값을 비교하는건 equals라는 문법?메소드?가 있음
				 System.out.println("김씨군요");
			 }else System.out.println("아니군요");
		}
}*/


import java.util.Random;

public class Main {

		public static void main(String[] args) {
			
			//랜덤값을 만들 수 있는 능력을 가진 클래스: Random
			//Random 클래스로 객체를 생성해서 그 객체가 가진 기능을 실행
			//참조변수 만들기(리모컨)
			
			
				
			Random rnd;
			//Random객체 생성
			rnd=new Random(); //()는 생성자 만들기
			int n=rnd.nextInt(10); //괄호 안에                                                                                                                                           정수 0~9
			int n=rnd.nextInt(10) + 5; 4~15
			
			double rnd = .nextDouble()*100;
			
			System.out.println("output: "+n);
		}
}
	














