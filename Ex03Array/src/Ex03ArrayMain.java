/*
import java.util.*;
public class Ex03ArrayMain {

	public static void main(String[] args) {
		//��Java������ �迭�� ��ü��!��
		
		//int�� 3ĭ¥�� �迭��ü ����
		//��ü�� heap�޸𸮿��� �������-> new Ű����� �����ؾ��Ѵ�.
		//��ü=����+�Լ�(method)
		
		//��ü�� �ٷ�� ���: ���������� ��ü�� ����Ű�� ��

		String p= new String( "Hello" );
		Random rnd = new Random();
	
		//���� �� ������ ��������
		
		int[] arr = new int[3]; //int�� �迭 ��ü�� ����Ű�� ��������[] arr
		
		System.out.println(  arr  );
		//�迭�̸� - ���������� ��� .toString()�޼ҵ尡 �ڵ�����
		
		System.out.println( arr[0] ); //���� �� ������ �迭 ��ü�� ���� 0
		System.out.println( arr[1]);
		System.out.println( arr[2]);
		//System.out.println( arr[3] ); �ε��� ������ ����� error�� ó�� -> �����ⰪX
		
		//�迭�� ��ҿ� ���� ����
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		
		for(int i=0; i<arr.length ; i++) //()�� ������ int�� ������ ���ϴ� ��
			System.out.println(  arr[i] );
		
		
		int[] arr1 = new int[3]; //���� ���� ���, ������ ����
		int [] arr2 = new int[3]; //OK
		int arr3[]=new int[3]; //OK
		
		int[] arr4; //int[] ���������� ���� ���� ���� -> ������ ��ġ�� ����Ű�� ����
		arr4=new int[3];//int[] ��ü�� �����Ͽ� �����ϱ�	
		//arr5= arr; //�迭 �������������� ���Ե� ����!
				}

	//�迭�� �ʱ�ȭ
	int[] ar1 = new int[] {10, 20, 30};	//����
	// int[] ar2 = new int[3] {10, 20, 30}; //error : �ʱ�ȭ�ϸ� ���� ��� �Ұ�!
	// int[] ar3 = new int[]; //error : �ʱ�ȭ ���� ������� ���ϸ�
	
	//�ʱ�ȭ�� ���ǥ���
	int[] ar4 = {10,20,30}; // new int[] �������� - > �ڵ� new
	
	
	
	//�迭�� ����(�ε����� ����)�� ������ �����ϴ� ���� ����
	//Ű�����Է����� �迭�� ������ �޴� ���� ������
	Scanner sc=new Scanner(System.in);
	
	//int k=sc.nextInt();
	//int k=5;
	int[] array = new int[5];
	
	for(int i=0; i<array.length; i++);{
		System.out.println(array[i]+",");
	}
	System.out.println();
	
	
	
	//�迭�� ��� ������ 0���� �迭�� ���� �� ����
	int[] arr6 = new int[0];
	System.out.println( arr6.length); //0
	
	int[] arr7=new int[] {}; //���� 0��¥�� �迭�� �ʱ�ȭ	
	
	
	
	
	//�ʱ�ȭ�Ҷ� ���������� �� ���� ����
	int n=10;
	int[] arr8 = new int[] {n, n+1, n+2};
	for(int j=0; j<arr8.length; i++) {
		System.out.print(arr8[j]+",");
	}
	System.out.println(); //10, 11, 12 //C���� �������� ����
	
	
	
	
	
	//�迭 �������������� ����
	double[] ar2=new double[] {1.1, 2.2, 3.3};
	double[] ar3;// 4byte�� �迭�������� ���� 
	ar3=ar2; //���� �迭 ��ü�� ���� - �ּҸ� ����
	
	for (int k=0; k<ar2.lentgth; k++) {
		System.out.print(ar2[i]+",");
	}
	System.out.println();
	
	
	for (int k1=0; k1<ar3.lentgth; k1++) {
		System.out.print(ar3[k1]+",");
	}
	System.out.println();
	//�ٸ� ���������� ���� ������ ����!
	
	ar3[1]=3.14; //ar2[1]�� ����
	
	
	for (int z=0; z<ar2.lentgth; z++) {
		System.out.print(ar2[z]+",");
	}
	System.out.println(); // 1.1, 3.14, 3.3, 
	

	
	//�迭��ü�� copy (�迭��Ұ����� ����)
	int[] arr9= new int[] {5,6,7};
	int[] arr10= new int[arr9.length];
	
	
	for(int i1=0; i1<arr9.length; i1++)
		arr10[i1]=arr9[i1];
	
	//arr10�� ��ü�� arr9�� ��ü�� ���� �ٸ� ��ü��!
	
	
}*/


import java.util.*;
public class Ex03ArrayMain {

	public static void main(String[] args) {
		//��Java������ �迭�� ��ü��!��
		
//�⺻�� ������ �迭
	int a,b,c;
	int[] arr11= new int[3];
	
	//������ ������ �迭
	String s1, s2, s3; //���������̹Ƿ� ���� �����Ⱚ�� ������ ����
	
	s1= new String("aaa");
	s2=new String("bbb");
	s3="ccc"; //�ڵ� new String()
	
	String[] arr12= new String[3]; //String �������� 3���� ���� �迭 ��ü�� ����� �װ��� ����Ű�� �������� arr12�� ���� ��
	System.out.println( arr12[0] ); //arr12[0]�� �������� -> null ���� ����Ŵ: �ʱⰪ�� ����
	System.out.println( arr12[1] );
	System.out.println( arr12[2] );
	
	arr12[0]= new String("Hello"); //String ��ü�� �������
	arr12[1]= new String("Nice");
	arr12[2]= "World"; //�ڵ� new String()
	
	System.out.println( arr12[0] ); // .toString �ڵ� -> ���������� ���� �ּҰ� ������ ���� �ƴ϶�  Hello�� ����

	System.out.println( arr12[0].length() ); // 5 (Hello�� ����)
	System.out.println( arr12[1].length() ); // 4
	System.out.println( arr12[2].length() ); // 7
	
	
	char ch = arr12[0].charAt(2);
	System.out.println( ch ); // l
	
	
	ch = arr12[2].charAt(3);
	System.out.println( ch ); // r
	
	int[] arr13 = new int[] {10,20,30}; //�ʱ�ȭ�Ҷ��� �迭�� �ε��� ���� ���� �ȵȴ�!
//	int[] arr13 = {10,20,30};

	
	//���������� �迭�� �ʱ�ȭ
	String[] arr14 = new String[] { new String("Hello"), new String("Nice"), new String("Android") };
	String[] arr15 = new String[] { "Hello", "Nice", "Android"};
	String[] arr16 = { "Hello", "Nice", "Android"};
	
	//�� �ٸ� �������鵵 �迭 ��� ����
	Random[] arr17 =new Random[3];
	System.out.println( arr17[0] );
	
	//�� �迭�� ���(Random ��������)�� ��ü ����
	arr17[0] = new Random();
	int m =arr17[0].nextInt(14); //0~13������ 10���� ������ ����
	//m =arr17[0].nextInt(14); //NullPointException
	
	
	
	
	
	//�迭 �ʱ�ȭ
	Random[] arr18 = new Random[] { new Random(), new Random(), new Random() };
	Random[] arr19 = {new Random() , new Random(), new Random() };
	System.out.println( arr19.length); 
	
	//Scanner ���������� 3�� ���� �迭��ü ����
	Scanner[] aaa= new Scanner[3];
	aaa[0] = new Scanner(System.in);
	aaa[1] = new Scanner(System.in);
	aaa[2] = new Scanner(System.in);
	
	//����� ���� class�� �迭��...
	Student stu = new Student(); //��ü ����
	stu.kor=80;
	stu.eng=70;
	stu.aver=75;
	
	
	Student stu2= new Student();
	stu2.kor=70;
	
	Student[] stus = new Student[5]; //Student �������� 5�� �迭�� ���� [ Student ��ü ������ ���� �ƴ�]
	//stus[0].kor=80;// error
	stus[0] = new Student();
	stus[1] = new Student();
	
	
	
	
	
	//Ȯ���� for�� ... for each��
	int[] nums = new int[3]; 
	nums[0] = 10;
	nums[1] = 20;
	nums[2] = 30;
	
	
	//�迭��Ұ� ���
	System.out.println(nums[0]);
	System.out.println(nums[1]);
	System.out.println(nums[2]);
	
	//�ݺ������� ��Ұ� ���
	for(int i=0; i<nums.length; i++) {
		int t= nums[i]; //�ӽ÷� ������ ����� ����
		
		System.out.println( t );
		
		}
	
	// ���� �ݺ����� �����ϰ� ���� ���� - for each�� (Ȯ��� for��)
	for( int t : nums ) { //�迭�� ���� 0������ �ϳ��� �־���
		System.out.println(t);
	}
	
	//for each���� ���������� �迭 ��ü�� ���� ����
	String[] strs = new String[3]; //���������� �迭 ��ü(�������� 3��)�� ����Ű�� 4byte¥�� ��������
	strs[0]= new String("Hello");
	strs[1] =new String("Nice");
	strs[2]= "Android"; //�ڵ� new String -> ���
	
	System.out.println(strs[0]);
	System.out.println(strs[1]);
	System.out.println(strs[2]);
	
	for(int i=0; i<strs.length; i++) {
		String t= strs[i];
		
		
		System.out.println(t.length());
		
		
	// ���� �ݺ����� �����ϰ� ���� ���� - for each�� (Ȯ��� for��)
	for( String t : strs ) 
		System.out.println(t+"  ");
		System.out.println(t.length());
		}
	}
	
	
	
	
	
	
	}//main �޼ҵ�...
	
	

//Ex03ArrayMain Ŭ����...


//����� ���� class
class Student{
	
	int kor;
	int eng;
	double aver;
}


