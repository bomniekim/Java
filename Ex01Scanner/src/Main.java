/*
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//Ű���� �Է¹ޱ� - ������ ����
		
		int num=0;
		int a; //���������� ����
		
		try {
			//System.out.println( a ); // ���ڰ� ���ڰ� �����ڵ� ���� �о���
			//System.out.println( a-'0' ) //���ڷ� ���� �� �ְ� ����� ���
			
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
//C����� ��ó���� ���� ��


public class Main {

//Java���� ��ü������ ���� �����Ģ! ��� ��ü�� ���� heap���� ������ ���� : ������ newŰ����� �����ؾ߸� ��
	public static void main(String[] args) {
		//Ű���� �Է¹ޱ� - ����������
		int num=0;
		
		//Ű�����Է��� �ڷ����� �°� ���ϰ� �� �� �ִ� ����� ��ü���� - Scanner
		//newŰ����� ��ü�� ����� ������� �޸��� �ּҸ� ������
		//��������(=�����ͺ���) p�� �ּҸ� �����Ͽ� ��ü�� ������
		Scanner p=new Scanner(System.in); //Scanner ��ü ����! : ��ĳ�ʰ� ���� �Է��� �޴°��� �ƴ϶� System.in�� �Է¹���
		
		num=p.nextInt(); //p�� ����Ű�� ��! ������
		//nextInt�� ���� ������ ��
		
		System.out.println("num :"+num);
	}
}
*/

/*
public class Main {

	//Java���� ��ü������ ���� �����Ģ! ��� ��ü�� ���� heap���� ������ ���� : ������ newŰ����� �����ؾ߸� ��
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
			 s=scan.next(); //scan.nextLine(); �� �� �Է¹޴� �� (���� ����) - Enter�� �ľ� ������ ��
			 
			 if(s.equals("kim")) { //���ڿ��񱳴� s=="kim" �Ұ� -> �̰� �ּҳ����� ��
				 //���� ���ϴ°� equals��� ����?�޼ҵ�?�� ����
				 System.out.println("�达����");
			 }else System.out.println("�ƴϱ���");
		}
}*/


import java.util.Random;

public class Main {

		public static void main(String[] args) {
			
			//�������� ���� �� �ִ� �ɷ��� ���� Ŭ����: Random
			//Random Ŭ������ ��ü�� �����ؼ� �� ��ü�� ���� ����� ����
			//�������� �����(������)
			
			
				
			Random rnd;
			//Random��ü ����
			rnd=new Random(); //()�� ������ �����
			int n=rnd.nextInt(10); //��ȣ �ȿ�                                                                                                                                           ���� 0~9
			int n=rnd.nextInt(10) + 5; 4~15
			
			double rnd = .nextDouble()*100;
			
			System.out.println("output: "+n);
		}
}
	














