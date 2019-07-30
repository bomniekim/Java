/*
public class Ex02StringMain {

	public static void main(String[] args) {
		//java������ ���ڿ�(string)�� ��ü�� ������
		//��, java������ ���ڿ��� ��ü��!
		//[���ڿ� ��ü]
		
		//��ü�� �ּҸ� �����ϴ� ���� �ʿ� : �������� 
		String str; //string��ü�� �����ϴ� ���� ���� - str:��������
		
		//�������� str�� "Hello"��ü�� '�ּ�'�� ����
		str = "Hello"; //literal ���ڿ� ��� ��ü�� ������ �� (�ܼ��� ������X)
		//��ü�� �ڷ��� _������
		

	}

}*/




/*
public class Ex02StringMain {

	public static void main(String[] args) {
		
		
		String str = new String("Hello");
		String str2= "Hello";
		
		System.out.println(str);
		System.out.println(str2);
		
		//�������������� �񱳿����� [�ּ�]������ ������ �ǹ���
		System.out.println(str==str2); //���� ���ڿ��� ������ �ִ��� �ٸ� �ּҸ� �����ϹǷ� false
		
		
		String str01 = "Hello";
		String str02 = "Hello";

		System.out.println(str01==str02); //���� ���ڿ��� �����ϰ� �����Ƿ� true
	}

}*/







import java.util.*;
/*
public class Ex02StringMain {

	public static void main(String[] args) {

		String str= null; //�������� 4byte-> ���� �����Ⱚ(��������) �װ� ������ null(�ƹ��͵� ����Ű�� ���� �ʴ´�.) �ҹ���
		System.out.println(str); //null�� ���� ����
		
		str = new String("Hello"); //String ��ü�� �ּҸ� �ִ� ��
		//�ڹ��� ���������� ��ü�� ����Ŵ (�⺻�� ������ ����Ű���� ����)
		
		System.out.println(str);
		
		//"println"�� ���������� �ָ� ���������� ���� �ּҸ� ����ϴ°� �ƴ϶� ����Ű�� ��ü�� ���� ����ϴ� .toString()�� ����� ������ ���� 
		//System.out.println(str.toString());�� �����Ų �� -> ������� ���� ���ڿ��� ��������
		
		Random rnd = new Random(); //Random ��ü����
		System.out.println(rnd); //-> System.out.println(rnd.toString());
*/	
		
		
		
		



public class Ex02StringMain {

public static void main(String[] args) {


		String str = new String("Hello");
		
		//1. ���ڿ� ����Ƽ�� ����(���ڼ�)�� �������ִ� ���(Method)	str.length
		int len= str.length();
		System.out.println(len);
		
		
		
		
		//2. ���ڿ����� �� str.equals
		System.out.println( str.equals("Hello"));//true ���� ���ٴ� ��
		System.out.println( str.equals(new String("Hello")));//true
		String s1="Hello";
		System.out.println(str.equals(s1)); //true���� ��
		
		System.out.println( str=="Hello"); //false �ֳ��ϸ� �ּ� ��
		
		
		//2-1. ��ҹ��� �� str.equalsIgnoreCase
		System.out.println(str.equals("hello")); //false �����ڵ��� ���� �ٸ�
		System.out.println(str.equalsIgnoreCase("hello")); //true uppercase or lowercase �������
		
		
		
		
		//3. ���ڿ����� Ư�� char ������! str.charAt
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
		
		//Scanner�� �̿��ؼ� �� ����(char) �Է¹ޱ�
		//string���� �Է¹ް� charAt���� �޾ƿ���
		Scanner scan = new Scanner(System.in);
		String s2 =scan.next(); //���ڿ� �Է¹ޱ�
		char c= s2.charAt(0); 
		System.out.println(c);

		
		
		
		//4. ���ڿ� �ȿ� Ư�� ���ڰ� ���° �ڸ��� �ִ��� str.indexOf(char)
		int index = str.indexOf('l'); //�ߺ��� �ִ� ��쿡�� �� ���� �ִ� �� -> 2����
		System.out.println(index);
		System.out.println(str.lastIndexOf('l')); //�ڿ������� �˻� -> 3����
		
		
		//���ڿ� �˻��� ����
		System.out.println(str.indexOf("eo")); // -1: ���ٴ� �� //������ ���� �� ���� ����
		System.out.println(str.indexOf("ell")); // 1 : �����ϴ� ���� ��ȣ
		
		//���°���� �˻����� ������ ����
		System.out.println(str.indexOf('e', 2)); //2������� �˻���! -> -1 : ����
		
		
		
		
		//5. �Ķ���ͷ� ���޵� ���ڿ��� �� ���ڿ� �ȿ� ���ԵǾ� �ִ°�?
		//Ư���ܾ ���ԵǾ� �ִ��� Ȯ��
		String s= "Hello World! Hello Android! Nice World!";
		boolean b = s.contains("world");
		System.out.println(b); //true
		
		
		
		
		//6. ���ڿ� ����
		//java������ ���ڿ�(string)�� ��ü�� ������
		//��, java������ ���ڿ��� ��ü��!
		//java�� String��ü�� �۾��� �����ϴ� ���� �Ұ���!
		
		String s3 = s.concat("nice android!"); //���� ������ �ƴ� ���ο� ���ڿ��� ����
		
		
		System.out.println(s); //������ �״��..!
		System.out.println(s3); 
		
		//concat()�� �� ������. why? + �����ڰ� �ֱ� ����! 
		//s4=s+"aaa";
		//System.out.println(s4);
		
		
		
		
		
		//7. Ư�����ڿ��� ���۵Ǵ°�?
		System.out.println(s.startsWith("Hello")); // true
		System.out.println(s.startsWith("https")); // false
		
		//7-1. Ư�����ڿ��� ����Ǵ°�?
		System.out.println(s.endsWith("Hello")); // false
		System.out.println(s.endsWith("World!")); // true
		
		
		
		
		
		//8. ��ҹ��� �ڵ� ��ȯ
		System.out.println( s.toUpperCase() ); // HELLO WORLD! HELLO ANDROID! NICE WORLD!
		System.out.println( s.toLowerCase() ); // hello world! hello android! nice world!
		System.out.println( s ); //������ ���� �ٲ��� ����!
		
		
		
		
		//9. ���ڿ��� �糡�� ���鹮�ڸ� �����ϱ�! (�߰� ���鹮�ڴ� ���� ����)
		s=" Hello        ";
		System.out.println( "["+s+"]" ); //[ Hello        ]
		System.out.println( s.equals("Hello") ); // false ���鹮�� ������!
		System.out.println( s.trim().equals("Hello") );
		
		
		s=s.trim();
		System.out.println( "["+s+"]" ); // [Hello]
		System.out.println( s.equals("Hello") ); // true
		
		
		
		
		
		//10. Ư������ �ٲ�ġ��
		s= "Hello world! Hello Android! Nice World!";
		System.out.println( s.replace('H', 'K') ); // Kello world! Kello Android! Nice World
		System.out.println( s.replace("Android", "ios") );
		//�߰����鵵 ������ �� ����.
		System.out.println( s.replace(" ", ""));
		
		
		
		
		
		//11. ���ڿ� �߶󳻱�!
		String s4 =s.substring(6);
		System.out.println( s4 ); // world! Hello Android! Nice World!
		
		String s5=s.substring(6, 12); //12�� �ٷ� ������ -> 6������ 11������ : for(i=6;i<12;i++)
		System.out.println(s5); // world!
		
		
		
		
		
		//12. ���ڿ����� ��Һ� <-����
		char ch1='a';
		char ch2='b';
		System.out.println(ch1 > ch2); // 97�� 98�� �� -> false
		
		String s6="aaa";
		String s7="aac";
		
		//System.out.println( s6 > s7 ); //error : �ּҳ����� �񱳴ϱ� 
		System.out.println( s6.compareTo(s7) ); // ���� -2��ŭ �� �۴�
		System.out.println( s7.compareTo(s6) ); // ���� 2��ŭ �� ũ��  	//�����  0�̸� ���ٴ� ��
		
		
		
		
		
		//13. ���ڿ� �и�(���ڿ��� �и��ؼ� �迭�� ����� �ִ� ���)
		s= "android:ios:nice:windows";
		String[] arr=s.split(":"); //String �迭�� ���� (':'�� �������� �߶�)
		System.out.println(arr[0]); // android
		System.out.println(arr[1]); // ios
		System.out.println(arr[2]); // nice
		System.out.println(arr[3]); // windows
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	
		//String class�� static Method��..
		//static method: ��ü ���� ���� �ٷ� ����� �� �ִ� �޼ҵ� [ Ŭ������.�޼ҵ��()] //������ [����������.�޼ҵ��()]
		
		//1. ������ ����� like ...printf()
		int hour=10;
		int minute=15;
		int sec=32;
		System.out.println(hour+":"+minute+":"+sec);
		System.out.printf("%02d:%02d:%02d \n", hour, minute, sec);
		//�ܼ�â�� ������..
		
		//Ư�� ����(���ڿ� ���)���� ������ִ� ��� �ʿ�
		String s10=String.format("%02d:%02d:%02d", hour, minute, sec);
		System.out.println( s10 );
		
		
		//�⺻ �ڷ���(8����) �ڷ����� String ��ü�� ��ȯ ����
		int num=100;
		String s11=String.valueOf(num);
		System.out.println(s11.length());
		
		//������ |String.valueOf()�� �� ������� ����
		s11 = 10+"";
		s11=3.14+"";
		s11=true+"";
		
		//�ݴ��, String�� �⺻������..(Integer, Double, Float, Byte, Boolean ...)
		//Wrapper Ŭ���� (�⺻���� ����������... �����ִ� Ŭ����)
		//int n= Integer.parseInt("100"); //String�� int�� ��ȯ
		//double d= Double.parseDouble("3.14"); //String�� double�� ��ȯ
		
}
}

		
