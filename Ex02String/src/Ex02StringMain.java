/*
public class Ex02StringMain {

	public static void main(String[] args) {
		//java에서는 문자열(string)을 객체로 관리함
		//즉, java에서는 문자열은 객체임!
		//[문자열 객체]
		
		//객체의 주소를 저장하는 변수 필요 : 참조변수 
		String str; //string객체를 참조하는 변수 선언 - str:참조변수
		
		//참조변수 str에 "Hello"객체의 '주소'를 대입
		str = "Hello"; //literal 문자열 상수 객체를 생성한 것 (단순한 데이터X)
		//객체의 자료형 _변수명
		

	}

}*/




/*
public class Ex02StringMain {

	public static void main(String[] args) {
		
		
		String str = new String("Hello");
		String str2= "Hello";
		
		System.out.println(str);
		System.out.println(str2);
		
		//참조변수끼리의 비교연산은 [주소]끼리의 연산을 의미함
		System.out.println(str==str2); //같은 문자열을 가지고 있더라도 다른 주소를 참조하므로 false
		
		
		String str01 = "Hello";
		String str02 = "Hello";

		System.out.println(str01==str02); //같은 문자열을 공유하고 있으므로 true
	}

}*/







import java.util.*;
/*
public class Ex02StringMain {

	public static void main(String[] args) {

		String str= null; //참조변수 4byte-> 현재 쓰레기값(지역변수) 그게 싫으면 null(아무것도 가리키고 있지 않는다.) 소문자
		System.out.println(str); //null의 값이 찍힘
		
		str = new String("Hello"); //String 객체의 주소를 주는 것
		//자바의 참조변수는 객체만 가리킴 (기본형 변수를 가리키지는 못함)
		
		System.out.println(str);
		
		//"println"에 참조변수를 주면 참조변수의 값인 주소를 출력하는게 아니라 가리키는 객체의 값을 출력하는 .toString()의 기능을 가지고 있음 
		//System.out.println(str.toString());를 실행시킨 것 -> 멤버변수 값을 문자열로 내보내줘
		
		Random rnd = new Random(); //Random 객체생성
		System.out.println(rnd); //-> System.out.println(rnd.toString());
*/	
		
		
		
		



public class Ex02StringMain {

public static void main(String[] args) {


		String str = new String("Hello");
		
		//1. 문자열 데어티의 길이(글자수)를 리턴해주는 기능(Method)	str.length
		int len= str.length();
		System.out.println(len);
		
		
		
		
		//2. 문자열값의 비교 str.equals
		System.out.println( str.equals("Hello"));//true 값이 같다는 것
		System.out.println( str.equals(new String("Hello")));//true
		String s1="Hello";
		System.out.println(str.equals(s1)); //true값을 비교
		
		System.out.println( str=="Hello"); //false 왜냐하면 주소 비교
		
		
		//2-1. 대소문자 비교 str.equalsIgnoreCase
		System.out.println(str.equals("hello")); //false 유니코드의 값이 다름
		System.out.println(str.equalsIgnoreCase("hello")); //true uppercase or lowercase 상관없이
		
		
		
		
		//3. 문자열에서 특정 char 얻어오기! str.charAt
		char ch= str.charAt(0);
		System.out.println(ch ); // H
		System.out.println(str.charAt(1)); // e
		System.out.println(str.charAt(2)); // l
		System.out.println(str.charAt(3)); // l
		System.out.println(str.charAt(4)); // o
		//System.out.println(str.charAt(5)); // error
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		//Scanner를 이용해서 한 문자(char) 입력받기
		//string으로 입력받고 charAt으로 받아오기
		Scanner scan = new Scanner(System.in);
		String s2 =scan.next(); //문자열 입력받기
		char c= s2.charAt(0); 
		System.out.println(c);

		
		
		
		//4. 문자열 안에 특정 문자가 몇번째 자리에 있는지 str.indexOf(char)
		int index = str.indexOf('l'); //중복이 있는 경우에는 더 먼저 있는 것 -> 2번방
		System.out.println(index);
		System.out.println(str.lastIndexOf('l')); //뒤에서부터 검사 -> 3번방
		
		
		//문자열 검색도 가능
		System.out.println(str.indexOf("eo")); // -1: 없다는 뜻 //음수는 나올 수 없기 때문
		System.out.println(str.indexOf("ell")); // 1 : 시작하는 방의 번호
		
		//몇번째부터 검색할지 설정도 가능
		System.out.println(str.indexOf('e', 2)); //2번방부터 검사해! -> -1 : 없음
		
		
		
		
		//5. 파라미터로 전달된 문자열이 내 문자열 안에 포함되어 있는가?
		//특정단어가 포함되어 있는지 확인
		String s= "Hello World! Hello Android! Nice World!";
		boolean b = s.contains("world");
		System.out.println(b); //true
		
		
		
		
		//6. 문자열 결합
		//java에서는 문자열(string)을 객체로 관리함
		//즉, java에서는 문자열은 객체임!
		//java의 String객체는 글씨를 변경하는 것이 불가능!
		
		String s3 = s.concat("nice android!"); //원본 변경이 아닌 새로운 문자열을 리턴
		
		
		System.out.println(s); //원본은 그대로..!
		System.out.println(s3); 
		
		//concat()은 잘 사용안함. why? + 연산자가 있기 때문! 
		//s4=s+"aaa";
		//System.out.println(s4);
		
		
		
		
		
		//7. 특정문자열로 시작되는가?
		System.out.println(s.startsWith("Hello")); // true
		System.out.println(s.startsWith("https")); // false
		
		//7-1. 특정문자열로 종료되는가?
		System.out.println(s.endsWith("Hello")); // false
		System.out.println(s.endsWith("World!")); // true
		
		
		
		
		
		//8. 대소문자 자동 변환
		System.out.println( s.toUpperCase() ); // HELLO WORLD! HELLO ANDROID! NICE WORLD!
		System.out.println( s.toLowerCase() ); // hello world! hello android! nice world!
		System.out.println( s ); //원본은 절대 바뀌지 않음!
		
		
		
		
		//9. 문자열의 양끝쪽 공백문자를 제거하기! (중간 공백문자는 제거 안함)
		s=" Hello        ";
		System.out.println( "["+s+"]" ); //[ Hello        ]
		System.out.println( s.equals("Hello") ); // false 공백문자 때문에!
		System.out.println( s.trim().equals("Hello") );
		
		
		s=s.trim();
		System.out.println( "["+s+"]" ); // [Hello]
		System.out.println( s.equals("Hello") ); // true
		
		
		
		
		
		//10. 특정문자 바꿔치기
		s= "Hello world! Hello Android! Nice World!";
		System.out.println( s.replace('H', 'K') ); // Kello world! Kello Android! Nice World
		System.out.println( s.replace("Android", "ios") );
		//중간공백도 제거할 수 있음.
		System.out.println( s.replace(" ", ""));
		
		
		
		
		
		//11. 문자열 잘라내기!
		String s4 =s.substring(6);
		System.out.println( s4 ); // world! Hello Android! Nice World!
		
		String s5=s.substring(6, 12); //12번 바로 전까지 -> 6번부터 11번까지 : for(i=6;i<12;i++)
		System.out.println(s5); // world!
		
		
		
		
		
		//12. 문자열값의 대소비교 <-정렬
		char ch1='a';
		char ch2='b';
		System.out.println(ch1 > ch2); // 97과 98의 비교 -> false
		
		String s6="aaa";
		String s7="aac";
		
		//System.out.println( s6 > s7 ); //error : 주소끼리의 비교니깐 
		System.out.println( s6.compareTo(s7) ); // 내가 -2만큼 더 작다
		System.out.println( s7.compareTo(s6) ); // 내가 2만큼 더 크다  	//결과가  0이면 같다는 뜻
		
		
		
		
		
		//13. 문자열 분리(문자열을 분리해서 배열로 만들어 주는 기능)
		s= "android:ios:nice:windows";
		String[] arr=s.split(":"); //String 배열로 리턴 (':'을 기준으로 잘라)
		System.out.println(arr[0]); // android
		System.out.println(arr[1]); // ios
		System.out.println(arr[2]); // nice
		System.out.println(arr[3]); // windows
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	
		//String class의 static Method들..
		//static method: 객체 생성 없이 바로 사용할 수 있는 메소드 [ 클래스명.메소드명()] //원래는 [참조변수명.메소드명()]
		
		//1. 포멧을 만드는 like ...printf()
		int hour=10;
		int minute=15;
		int sec=32;
		System.out.println(hour+":"+minute+":"+sec);
		System.out.printf("%02d:%02d:%02d \n", hour, minute, sec);
		//콘솔창만 가능함..
		
		//특정 포멧(문자열 모양)으로 만들어주는 기능 필요
		String s10=String.format("%02d:%02d:%02d", hour, minute, sec);
		System.out.println( s10 );
		
		
		//기본 자료형(8가지) 자료형을 String 객체로 변환 가능
		int num=100;
		String s11=String.valueOf(num);
		System.out.println(s11.length());
		
		//실제로 |String.valueOf()는 잘 사용하지 않음
		s11 = 10+"";
		s11=3.14+"";
		s11=true+"";
		
		//반대로, String을 기본형으로..(Integer, Double, Float, Byte, Boolean ...)
		//Wrapper 클래스 (기본형을 참조형으로... 감싸주는 클래스)
		//int n= Integer.parseInt("100"); //String을 int로 변환
		//double d= Double.parseDouble("3.14"); //String을 double로 변환
		
}
}

		
