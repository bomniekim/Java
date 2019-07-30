import java.util.ArrayList;
import java.util.Scanner;

public class Ex04Array2Main {

	public static void main(String[] args) {

		//2���� �迭 - int�� �迭(int[])�� �����ϴ� �������� �迭
		//1���� �迭�� �����ϴ� ���������� ������ ������� ��
		int[][] aaa=new int[2][3]; // index 3���� ���� int�� �迭��ü 2���� ���� �����ϴ� ���������� �迭
		
		//�迭��ҿ� �� ����
		aaa[0][0]=10;
		aaa[0][1]=20;
		aaa[0][2]=30;
		
		aaa[1][0]=100;
		aaa[1][1]=200;
		aaa[1][2]=300;
		
		//�迭��Ұ� ���
		int n=1;
		System.out.println( aaa[0][0] );
		System.out.println( aaa[0][n] );
		System.out.println( aaa[0][2] );
		System.out.println();
		
		System.out.println( aaa[n][0]);
		System.out.println( aaa[n][n]);
		System.out.println( aaa[n][2]);
		System.out.println();
		
		
		//�迭�� ���̰� �˾ƺ���
		System.out.println( aaa.length );   // 2
		System.out.println( aaa[0].length); // 3
		System.out.println( aaa[1].length); // 3
		
		
		//�ݺ��� �̿��Ͽ� �迭��Ұ� ���
		for(int i=0; i<aaa.length; i++) {
			for(int k=0; k<aaa[i].length; k++) { //������������ ����Ű�� ��ü�� index���� �پ��� �� ����
				System.out.println( aaa[i][k] );
			}
			System.out.println();
			
			
			//�� ������ �ٸ� ������ 2���� �迭 �����
			int[][] bbb= new int[3][]; //�ϴ� ���������� 3��¥���� 2���� �迭
			
			//�� ���� �����ϴ� 1���� �迭��ü�� �����Ͽ� ����
			bbb[0]= new int[2];
			bbb[1]= new int[3];
			bbb[2]= new int[4];
			
			for(int i1=0; i1<bbb.length; i1++) {
				for(int k=0; k<bbb[i1].length; k++) {
					System.out.print(bbb[i1][k]+ "   ");
				}
				System.out.println();
			}
			
			
			
			
			//2�����迭�� �ʱ�ȭ
			int[][] ccc1 = new int[][] {new int[] {10,20}, new int[] {100,200,300} };
			int[][] ccc2 = new int[][] {{10,20},{100,200,300} };
			int[][] ccc3 = {
					{10,20},
					{100,200,300,400,500},
					{50,80,40}
					};
			
			for (int i2=0; i2<ccc3.length; i2++) {
				for (int k=0; k<ccc3[i2].length; k++) {
					System.out.print(ccc3[i2][k]+ "   ");
				}
				System.out.println();
			}
			System.out.println();
			
			
			//Ȯ��� for�� - for each��
			for( int[] t : ccc3 ) { //int�� �迭 �������� t
				for( int a : t) { // t�� �迭!
					System.out.print(a+"  ");
				}
				System.out.println();
			}
			System.out.println();
			
			
			
			//�迭�� ���� ���� ������ ������ ������
			int s=3;
			int[] arr = new int[s+1]; //4ĭ 1���� �迭
			
			//2���� �迭�� ���� ���� ����
			Scanner scan = new Scanner(System.in);
			
			System.out.print("�����Է�: ");
			int a=scan.nextInt();
			int[][] ddd = new int[a][];
			
			for(int j=0; j<ddd.length; j++) {
				System.out.println("ȣ���Է�: ");
				int b=scan.nextInt();
				ddd[j]= new int[b];
			}
				
		/*
			System.out.print("ȣ���Է�: ");
			int b=scan.nextInt();
			ddd[0]=new int[b];
			
			System.out.print("ȣ���Է�: ");
			b=scan.nextInt();;
			ddd[1]=new int[b];*/
			
			for(int[] t : ddd ) {
				for(int z : t) {
					System.out.print(z+"   ");
					
				}
				System.out.println();
			}
			System.out.println();
			
			
			//3�����迭 .... ������ ���� ���� ���
			int[][][] abc=new int[2][][]; 
			//index 4�� ���� int�� 1�����迭�� �����ϴ� index 3�� 2�����迭 ���������� �����ϴ� index 2�� 3�����迭 �������� 
			
			
			abc[0]= new int[3][];
			//abc[1]=new int[4][];
			abc[1]=aaa; //�ٸ� �迭��ü�� �ּҸ� ������ �� ����
			
			abc[0][0] = new int[5];
			abc[0][1] = new int[2];
			abc[0][2] = new int[3];
			
			abc[1][0] = new int[7];
			abc[1][1] = new int[4];
			abc[1][2] = new int[5];
			abc[1][3] = new int[8];
			
			
			
			//�ѹ� ������� �迭��ü�� ����(index�� ����)�� ���� �Ұ�
			
			//������ �迭 Ŭ����: ArrayList
			ArrayList<String> arrList = new ArrayList<String>(); //���׸� <Ŭ������>
			
			arrList.add( new String("Hello") );
			arrList.add( new String("Nice") );
			
			System.out.println("�迭����: "+ arrList.size() ); // �迭����: 2
			System.out.println( arrList.get(0) ); // Hello 
			System.out.println( arrList.get(1) ); // Nice
			
			
			arrList.add("Android"); //String ��ü
			System.out.println("�迭����: "+ arrList.size() ); // �迭����: 3
			
			//�������
			arrList.remove(1); // Nice ����
			System.out.println("�迭����: "+ arrList.size() ); // �迭����: 2
			//������ȣ�� �ٲ� -> Android�� index 1�� �ٲ��.
			
			
			for(int i4=0; i4<arrList.size(); i4++) {
				System.out.println( arrList.get(i4) );
			}
			
			
			//for each�����ε� ����
			for( String t : arrList) { //����� �ڷ����� ���� �ȴ�.
				System.out.println( t );
			}
			
			
			
			
			// ArrayList�� �ڰ�ü�ڸ� ���� �ٴ� �� ����. ��, �⺻�������� �Ұ�!
			//ArrayList<int> kkk = new ArrayList<int>(); // error
			
			//Wrapper Class ����Ŭ���� : Integer, Double, Byte, Boolean... 
			int x=10; // int �⺻�� ����
		
			Integer obj = new Integer(x); //�⺻���� ��ü�� �ٲ��ִ� ����
			
			Integer obj2 = 12; 
			// = new Integer(12); �� ���� ��
			//�ڵ�����  Integer��ü�� ���μ� ������� : Auto Boxing
			//�������������� ������ ����°�ó�� �� �� ����
			
			System.out.println(x);  // 10
			System.out.println(obj);// 10
			
			Integer obj3 = new Integer(100); // 100�̶�� ���ڸ� integer�� ����
			int z = obj3; //������! Auto UnBoxing�� ����
			System.out.println(z); // 100
			
			int m= new Integer(50); // �̷��Ե� ����
			
			
			
			ArrayList<Integer> eee = new ArrayList<Integer>(); //int�� ���� ��ü: Integer
			eee.add( new Integer(5) );
			eee.add( new Integer(20) );
			eee.add(30); //Auto Boxing�� ����� ��Ȳ -> new Integer(30)�� �ڵ����� ����	
			
			
			System.out.println( eee.get(0) );
			System.out.println( eee.get(1) );
			
			
			
			
			Double obj5=new Double(3.14);
			System.out.println(obj5);
			
			ArrayList<Double> arrList3 = new ArrayList<Double>();
			arrList3.add( new Double(3.14));
			arrList3.add(5.55);
			
			
			
			
			//����
			//Wrapper Ŭ������ ���� ���� ����ϴ� ���
			// ���ڿ��� �⺻������ ��ȯ�� �� ���� ����� ���
			String ss="50";
			System.out.println( ss + 15 ); // 5015
			
			//���ڿ� ss("50")�� int������ ��ȯ�ϱ�!
			int q =  Integer.parseInt(ss); // �Ľ�!
			System.out.println( q + 15 ); // 65
			
			double w = Double.parseDouble("3.14");
			System.out.println( w + 1.1 ); // ���ڷ� �ν� -> 4.24
			
			
			
			
			
		}
		
		
	}

}
