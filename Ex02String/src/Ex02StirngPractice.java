/*
public class Ex02StirngMemoEx {

	public static void main(String[] args) {
		
	String proverb=new String("A Barking dog");
	String s1, s2, s3, s4; // 참조 변수로서 메소드에서 반환된 참조값을 받는다. 
	
	System.out.println("문자열의 길이 = "+proverb.length() );
	
	s1 = proverb.concat(" never Bites!");
	s2 = proverb.replace('B','b');
	s3 = proverb.substring(2,5);
	s4 = proverb.toUpperCase();
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	

	}
}*/

/*
// 사용자에게 문자열을 받아서 문자열이 www로 시작하는지를 검사하는 프로그램
// 사용자가 quit을 입력하면 프로그램 종료
import java.util.Scanner;
public class Ex02StirngMemoEx {

	public static void main(String[] args) {
	
		String str;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열을 입력하세요> ");
			
			str=scan.next();
			if (str.equals("quit")==true)
			break;
			
			if (str.startsWith("www")) 
			{
				System.out.println (str+"은 www로 시작합니다.");
			}
			else 
			{
				System.out.println (str+"은 www로 시작하지 않습니다.");
			}
			
		}
	}
}*/

/*프로그램 사용자로부터 하나의 영단어(String)를 입력 받아라. 그리고 이 입력된 단어를
한줄에 한문자(character)씩 출력시켜 보아라. 단, 출력할 때 각 문자에 1이 더해진 문자가
출력되도록 해보자.*/

/*
import java.util.Scanner;

public class Ex02StirngMemoEx {

	public static void main(String[] args) {

		String str;
		Scanner scan = new Scanner(System.in);

		str = scan.next();

		for (int i = 0; i < str.length(); i++) {
			System.out.println((char)(str.charAt(i) + 1));
		}

	}
}*/


/*2개의 String 참조변수를 선언해라. 그런다음 프로그램 사용자로부터 영단어를 입력 받아서
String변수 중 하나로 참조한다. 그 다음 남은 하나의 String 참조변수에 저장된 영단어를
역순으로 뒤집어서 String 객체를 만들어서 참조해보자.
뒤집고 나서는 제대로 뒤집혔는지 확인하기 위해서 출력해보자.
예를들어, "Hello" 를 입력하면 "olleH"가 출력되어야 한다.*/

/*
import java.util.Scanner;

public class Ex02StirngMemoEx {

	public static void main(String[] args) {
		
		String str1, str2="";
		
		Scanner scan = new Scanner(System.in);
		str1 = scan.next();
		
		for(int i=str1.length()-1;i>=0;i--) {
			str2+=str1.charAt(i);
		}
		
		System.out.println(str2);
		
		
	}
}*/



 /*프로그램 사용자로부터 영단어을 입력 받는다. 그리고 나서 입력 받은 영단어를 구성하는 
문자 중에서 아스키 코드의 값이 가장 큰 문자를 찾아서 출력하는 프로그램을 작성해보자.
예를 들어서 입력된 영단어가 "LOVE"라면 이 중에서 아스키 코드 값이 가장 큰 문자는 V
이므로 V가 출력되어야 한다.*/
/*
import java.util.Scanner;

public class Ex02StirngMemoEx {

	public static void main(String[] args) {
		
		String str;
		
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		
		int max=str.charAt(0);
		
		for(int i=0; i<str.length(); i++) {
		
			if(str.charAt(i)>max) max=str.charAt(i);
		}
		
		System.out.println((char)max);
		
	}
}*/


/*사용자로부터 문자열을 하나 입력받는다. 그리고 이 값을 출력하시오.
다만, 입력된 문자열에 공백문자가 있다면 제거하고 출력하시오.
문자열의 중간에 공백문자가 있어도 마찬가지로 제거해야한다.*/
/*
import java.util.Scanner;

public class Ex02StirngMemoEx {

	public static void main(String[] args) {
		
		String str;
		
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		
		System.out.println( str.trim().replace(" ", ""));
		
		
	}
}*/



/*
사용자로부터 전화번호를 입력받되 첫3자리, 두번째 3~4자리, 세번째 4자리 숫자를 따로따로
입력 받아서 하나의 문자열로 합쳐서 저장하고 출력하시오. 단, 사이에 '-'로 구분자를 갖도록 한다.

예)  
  첫번째 자리 입력(3자리) : 010
  두번째 자리 입력(3~4자리) : 12345
  [잘못 입력하셨습니다. 3~4자리의 숫자만 입력가능합니다.]
  두번째 자리 입력(3~4자리) : 1234
  세번째 자리 입력(4자리) : 567a
  [잘못 입력하셨습니다. 3~4자리의 숫자만 입력가능합니다.]
  세번째 자리 입력(4자리) : 5678 

  입력된 전화번호는 [ 010-1234-5678 ] 입니다.*/


import java.util.Scanner;

public class Ex02StirngPractice {

	public static void main(String[] args) {
		
		String str1, str2, str3, num;
		
		Scanner scan = new Scanner(System.in);
		str1 = scan.next();
		str2 = scan.next();
		str3 = scan.next();
		
		
		System.out.println("첫번째 자리 입력(3자리) : "+str1);
		
			for(int i=0; i<4; i++) {
			if(str2.charAt(i)<48 || str2.charAt(i)>57) {
				if(str2.length()>=5 || str2.length()<3)
					System.out.println("[잘못 입력하셨습니다. 3~4자리의 숫자만 입력가능합니다.]");
				continue;
			}
			}
	}
}














