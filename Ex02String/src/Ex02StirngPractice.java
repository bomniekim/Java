/*
public class Ex02StirngMemoEx {

	public static void main(String[] args) {
		
	String proverb=new String("A Barking dog");
	String s1, s2, s3, s4; // ���� �����μ� �޼ҵ忡�� ��ȯ�� �������� �޴´�. 
	
	System.out.println("���ڿ��� ���� = "+proverb.length() );
	
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
// ����ڿ��� ���ڿ��� �޾Ƽ� ���ڿ��� www�� �����ϴ����� �˻��ϴ� ���α׷�
// ����ڰ� quit�� �Է��ϸ� ���α׷� ����
import java.util.Scanner;
public class Ex02StirngMemoEx {

	public static void main(String[] args) {
	
		String str;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("���ڿ��� �Է��ϼ���> ");
			
			str=scan.next();
			if (str.equals("quit")==true)
			break;
			
			if (str.startsWith("www")) 
			{
				System.out.println (str+"�� www�� �����մϴ�.");
			}
			else 
			{
				System.out.println (str+"�� www�� �������� �ʽ��ϴ�.");
			}
			
		}
	}
}*/

/*���α׷� ����ڷκ��� �ϳ��� ���ܾ�(String)�� �Է� �޾ƶ�. �׸��� �� �Էµ� �ܾ
���ٿ� �ѹ���(character)�� ��½��� ���ƶ�. ��, ����� �� �� ���ڿ� 1�� ������ ���ڰ�
��µǵ��� �غ���.*/

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


/*2���� String ���������� �����ض�. �׷����� ���α׷� ����ڷκ��� ���ܾ �Է� �޾Ƽ�
String���� �� �ϳ��� �����Ѵ�. �� ���� ���� �ϳ��� String ���������� ����� ���ܾ
�������� ����� String ��ü�� ���� �����غ���.
������ ������ ����� ���������� Ȯ���ϱ� ���ؼ� ����غ���.
�������, "Hello" �� �Է��ϸ� "olleH"�� ��µǾ�� �Ѵ�.*/

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



 /*���α׷� ����ڷκ��� ���ܾ��� �Է� �޴´�. �׸��� ���� �Է� ���� ���ܾ �����ϴ� 
���� �߿��� �ƽ�Ű �ڵ��� ���� ���� ū ���ڸ� ã�Ƽ� ����ϴ� ���α׷��� �ۼ��غ���.
���� �� �Էµ� ���ܾ "LOVE"��� �� �߿��� �ƽ�Ű �ڵ� ���� ���� ū ���ڴ� V
�̹Ƿ� V�� ��µǾ�� �Ѵ�.*/
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


/*����ڷκ��� ���ڿ��� �ϳ� �Է¹޴´�. �׸��� �� ���� ����Ͻÿ�.
�ٸ�, �Էµ� ���ڿ��� ���鹮�ڰ� �ִٸ� �����ϰ� ����Ͻÿ�.
���ڿ��� �߰��� ���鹮�ڰ� �־ ���������� �����ؾ��Ѵ�.*/
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
����ڷκ��� ��ȭ��ȣ�� �Է¹޵� ù3�ڸ�, �ι�° 3~4�ڸ�, ����° 4�ڸ� ���ڸ� ���ε���
�Է� �޾Ƽ� �ϳ��� ���ڿ��� ���ļ� �����ϰ� ����Ͻÿ�. ��, ���̿� '-'�� �����ڸ� ������ �Ѵ�.

��)  
  ù��° �ڸ� �Է�(3�ڸ�) : 010
  �ι�° �ڸ� �Է�(3~4�ڸ�) : 12345
  [�߸� �Է��ϼ̽��ϴ�. 3~4�ڸ��� ���ڸ� �Է°����մϴ�.]
  �ι�° �ڸ� �Է�(3~4�ڸ�) : 1234
  ����° �ڸ� �Է�(4�ڸ�) : 567a
  [�߸� �Է��ϼ̽��ϴ�. 3~4�ڸ��� ���ڸ� �Է°����մϴ�.]
  ����° �ڸ� �Է�(4�ڸ�) : 5678 

  �Էµ� ��ȭ��ȣ�� [ 010-1234-5678 ] �Դϴ�.*/


import java.util.Scanner;

public class Ex02StirngPractice {

	public static void main(String[] args) {
		
		String str1, str2, str3, num;
		
		Scanner scan = new Scanner(System.in);
		str1 = scan.next();
		str2 = scan.next();
		str3 = scan.next();
		
		
		System.out.println("ù��° �ڸ� �Է�(3�ڸ�) : "+str1);
		
			for(int i=0; i<4; i++) {
			if(str2.charAt(i)<48 || str2.charAt(i)>57) {
				if(str2.length()>=5 || str2.length()<3)
					System.out.println("[�߸� �Է��ϼ̽��ϴ�. 3~4�ڸ��� ���ڸ� �Է°����մϴ�.]");
				continue;
			}
			}
	}
}














