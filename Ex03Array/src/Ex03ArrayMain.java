/*
import java.util.*;
public class Ex03ArrayMain {

	public static void main(String[] args) {
		//★Java에서의 배열은 객체다!★
		
		//int형 3칸짜리 배열객체 생성
		//객체는 heap메모리에만 만들어짐-> new 키워드로 생성해야한다.
		//객체=변수+함수(method)
		
		//객체를 다루는 방법: 참조변수가 객체를 가리키게 함

		String p= new String( "Hello" );
		Random rnd = new Random();
	
		//앞의 세 가지가 참조변수
		
		int[] arr = new int[3]; //int형 배열 객체를 가리키는 참조변수[] arr
		
		System.out.println(  arr  );
		//배열이름 - 참조변수명 출력 .toString()메소드가 자동실행
		
		System.out.println( arr[0] ); //값을 안 넣으면 배열 객체의 값은 0
		System.out.println( arr[1]);
		System.out.println( arr[2]);
		//System.out.println( arr[3] ); 인덱스 범위를 벗어나면 error로 처리 -> 쓰레기값X
		
		//배열의 요소에 값을 대입
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		
		for(int i=0; i<arr.length ; i++) //()가 없으면 int형 변수를 말하는 것
			System.out.println(  arr[i] );
		
		
		int[] arr1 = new int[3]; //가장 많이 사용, 가급적 권장
		int [] arr2 = new int[3]; //OK
		int arr3[]=new int[3]; //OK
		
		int[] arr4; //int[] 참조변수만 먼저 선언 가능 -> 쓰레기 위치를 가리키고 있음
		arr4=new int[3];//int[] 객체를 생성하여 대입하기	
		//arr5= arr; //배열 참조변수끼리의 대입도 가능!
				}

	//배열의 초기화
	int[] ar1 = new int[] {10, 20, 30};	//권장
	// int[] ar2 = new int[3] {10, 20, 30}; //error : 초기화하면 개수 명시 불가!
	// int[] ar3 = new int[]; //error : 초기화 없이 개수명시 안하면
	
	//초기화의 약식표기법
	int[] ar4 = {10,20,30}; // new int[] 생략가능 - > 자동 new
	
	
	
	//배열의 길이(인덱스의 개수)를 변수로 지정하는 것이 가능
	//키보드입력으로 배열의 개수를 받는 것이 가능함
	Scanner sc=new Scanner(System.in);
	
	//int k=sc.nextInt();
	//int k=5;
	int[] array = new int[5];
	
	for(int i=0; i<array.length; i++);{
		System.out.println(array[i]+",");
	}
	System.out.println();
	
	
	
	//배열의 요소 개수가 0개인 배열도 만들 수 있음
	int[] arr6 = new int[0];
	System.out.println( arr6.length); //0
	
	int[] arr7=new int[] {}; //개수 0개짜리 배열의 초기화	
	
	
	
	
	//초기화할때 변수값으로 값 설정 가능
	int n=10;
	int[] arr8 = new int[] {n, n+1, n+2};
	for(int j=0; j<arr8.length; i++) {
		System.out.print(arr8[j]+",");
	}
	System.out.println(); //10, 11, 12 //C언어보다 유연성이 좋음
	
	
	
	
	
	//배열 참조변수끼리의 대입
	double[] ar2=new double[] {1.1, 2.2, 3.3};
	double[] ar3;// 4byte의 배열참조변수 생성 
	ar3=ar2; //같은 배열 객체를 공유 - 주소를 복사
	
	for (int k=0; k<ar2.lentgth; k++) {
		System.out.print(ar2[i]+",");
	}
	System.out.println();
	
	
	for (int k1=0; k1<ar3.lentgth; k1++) {
		System.out.print(ar3[k1]+",");
	}
	System.out.println();
	//다른 참조변수에 의해 값변경 영향!
	
	ar3[1]=3.14; //ar2[1]에 영향
	
	
	for (int z=0; z<ar2.lentgth; z++) {
		System.out.print(ar2[z]+",");
	}
	System.out.println(); // 1.1, 3.14, 3.3, 
	

	
	//배열객체의 copy (배열요소값들의 대입)
	int[] arr9= new int[] {5,6,7};
	int[] arr10= new int[arr9.length];
	
	
	for(int i1=0; i1<arr9.length; i1++)
		arr10[i1]=arr9[i1];
	
	//arr10의 객체와 arr9의 객체는 서로 다른 객체임!
	
	
}*/


import java.util.*;
public class Ex03ArrayMain {

	public static void main(String[] args) {
		//★Java에서의 배열은 객체다!★
		
//기본형 변수의 배열
	int a,b,c;
	int[] arr11= new int[3];
	
	//참조형 변수의 배열
	String s1, s2, s3; //지역변수이므로 각각 쓰레기값을 가지고 있음
	
	s1= new String("aaa");
	s2=new String("bbb");
	s3="ccc"; //자동 new String()
	
	String[] arr12= new String[3]; //String 참조변수 3개를 가진 배열 객체를 만들고 그것을 가리키는 참조변수 arr12를 만든 것
	System.out.println( arr12[0] ); //arr12[0]는 참조변수 -> null 값을 가리킴: 초기값의 개념
	System.out.println( arr12[1] );
	System.out.println( arr12[2] );
	
	arr12[0]= new String("Hello"); //String 객체가 만들어짐
	arr12[1]= new String("Nice");
	arr12[2]= "World"; //자동 new String()
	
	System.out.println( arr12[0] ); // .toString 자동 -> 참조변수가 가진 주소가 나오는 것이 아니라  Hello가 찍힘

	System.out.println( arr12[0].length() ); // 5 (Hello의 길이)
	System.out.println( arr12[1].length() ); // 4
	System.out.println( arr12[2].length() ); // 7
	
	
	char ch = arr12[0].charAt(2);
	System.out.println( ch ); // l
	
	
	ch = arr12[2].charAt(3);
	System.out.println( ch ); // r
	
	int[] arr13 = new int[] {10,20,30}; //초기화할때는 배열의 인덱스 값을 쓰면 안된다!
//	int[] arr13 = {10,20,30};

	
	//참조변수도 배열의 초기화
	String[] arr14 = new String[] { new String("Hello"), new String("Nice"), new String("Android") };
	String[] arr15 = new String[] { "Hello", "Nice", "Android"};
	String[] arr16 = { "Hello", "Nice", "Android"};
	
	//또 다른 참조형들도 배열 사용 가능
	Random[] arr17 =new Random[3];
	System.out.println( arr17[0] );
	
	//각 배열의 요소(Random 참조변수)에 객체 대입
	arr17[0] = new Random();
	int m =arr17[0].nextInt(14); //0~13까지의 10개의 랜덤수 지정
	//m =arr17[0].nextInt(14); //NullPointException
	
	
	
	
	
	//배열 초기화
	Random[] arr18 = new Random[] { new Random(), new Random(), new Random() };
	Random[] arr19 = {new Random() , new Random(), new Random() };
	System.out.println( arr19.length); 
	
	//Scanner 참조변수를 3개 가진 배열객체 생성
	Scanner[] aaa= new Scanner[3];
	aaa[0] = new Scanner(System.in);
	aaa[1] = new Scanner(System.in);
	aaa[2] = new Scanner(System.in);
	
	//사용자 정의 class를 배열로...
	Student stu = new Student(); //객체 생성
	stu.kor=80;
	stu.eng=70;
	stu.aver=75;
	
	
	Student stu2= new Student();
	stu2.kor=70;
	
	Student[] stus = new Student[5]; //Student 참조변수 5개 배열로 생성 [ Student 객체 생성한 것이 아님]
	//stus[0].kor=80;// error
	stus[0] = new Student();
	stus[1] = new Student();
	
	
	
	
	
	//확장형 for문 ... for each문
	int[] nums = new int[3]; 
	nums[0] = 10;
	nums[1] = 20;
	nums[2] = 30;
	
	
	//배열요소값 출력
	System.out.println(nums[0]);
	System.out.println(nums[1]);
	System.out.println(nums[2]);
	
	//반복문으로 요소값 출력
	for(int i=0; i<nums.length; i++) {
		int t= nums[i]; //임시로 변수를 만들어 놓음
		
		System.out.println( t );
		
		}
	
	// 위의 반복문을 간략하게 쓰는 문법 - for each문 (확장된 for문)
	for( int t : nums ) { //배열의 값을 0번부터 하나씩 넣어줌
		System.out.println(t);
	}
	
	//for each문을 참조형변수 배열 객체에 적용 가능
	String[] strs = new String[3]; //참조변수형 배열 객체(참조변수 3개)를 가리키는 4byte짜리 참조변수
	strs[0]= new String("Hello");
	strs[1] =new String("Nice");
	strs[2]= "Android"; //자동 new String -> 약식
	
	System.out.println(strs[0]);
	System.out.println(strs[1]);
	System.out.println(strs[2]);
	
	for(int i=0; i<strs.length; i++) {
		String t= strs[i];
		
		
		System.out.println(t.length());
		
		
	// 위의 반복문을 간략하게 쓰는 문법 - for each문 (확장된 for문)
	for( String t : strs ) 
		System.out.println(t+"  ");
		System.out.println(t.length());
		}
	}
	
	
	
	
	
	
	}//main 메소드...
	
	

//Ex03ArrayMain 클래스...


//사용자 정의 class
class Student{
	
	int kor;
	int eng;
	double aver;
}


