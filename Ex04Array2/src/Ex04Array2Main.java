import java.util.ArrayList;
import java.util.Scanner;

public class Ex04Array2Main {

	public static void main(String[] args) {

		//2차원 배열 - int형 배열(int[])을 참조하는 참조변수 배열
		//1차원 배열을 참조하는 참조변수를 여러개 묶어놓은 것
		int[][] aaa=new int[2][3]; // index 3개를 가진 int형 배열객체 2개를 각각 참조하는 참조변수의 배열
		
		//배열요소에 값 대입
		aaa[0][0]=10;
		aaa[0][1]=20;
		aaa[0][2]=30;
		
		aaa[1][0]=100;
		aaa[1][1]=200;
		aaa[1][2]=300;
		
		//배열요소값 출력
		int n=1;
		System.out.println( aaa[0][0] );
		System.out.println( aaa[0][n] );
		System.out.println( aaa[0][2] );
		System.out.println();
		
		System.out.println( aaa[n][0]);
		System.out.println( aaa[n][n]);
		System.out.println( aaa[n][2]);
		System.out.println();
		
		
		//배열의 길이값 알아보기
		System.out.println( aaa.length );   // 2
		System.out.println( aaa[0].length); // 3
		System.out.println( aaa[1].length); // 3
		
		
		//반복문 이용하여 배열요소값 출력
		for(int i=0; i<aaa.length; i++) {
			for(int k=0; k<aaa[i].length; k++) { //참조변수마다 가리키는 객체의 index수는 다양할 수 있음
				System.out.println( aaa[i][k] );
			}
			System.out.println();
			
			
			//각 층마다 다른 길이의 2차원 배열 만들기
			int[][] bbb= new int[3][]; //일단 참조변수가 3개짜리인 2차원 배열
			
			//각 층이 참조하는 1차원 배열객체를 생성하여 대입
			bbb[0]= new int[2];
			bbb[1]= new int[3];
			bbb[2]= new int[4];
			
			for(int i1=0; i1<bbb.length; i1++) {
				for(int k=0; k<bbb[i1].length; k++) {
					System.out.print(bbb[i1][k]+ "   ");
				}
				System.out.println();
			}
			
			
			
			
			//2차원배열의 초기화
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
			
			
			//확장된 for문 - for each문
			for( int[] t : ccc3 ) { //int형 배열 참조변수 t
				for( int a : t) { // t는 배열!
					System.out.print(a+"  ");
				}
				System.out.println();
			}
			System.out.println();
			
			
			
			//배열의 길이 값은 변수로 지정이 가능함
			int s=3;
			int[] arr = new int[s+1]; //4칸 1차원 배열
			
			//2차원 배열의 길이 값도 가능
			Scanner scan = new Scanner(System.in);
			
			System.out.print("층수입력: ");
			int a=scan.nextInt();
			int[][] ddd = new int[a][];
			
			for(int j=0; j<ddd.length; j++) {
				System.out.println("호수입력: ");
				int b=scan.nextInt();
				ddd[j]= new int[b];
			}
				
		/*
			System.out.print("호수입력: ");
			int b=scan.nextInt();
			ddd[0]=new int[b];
			
			System.out.print("호수입력: ");
			b=scan.nextInt();;
			ddd[1]=new int[b];*/
			
			for(int[] t : ddd ) {
				for(int z : t) {
					System.out.print(z+"   ");
					
				}
				System.out.println();
			}
			System.out.println();
			
			
			//3차원배열 .... 다차원 역시 같은 방식
			int[][][] abc=new int[2][][]; 
			//index 4를 가진 int형 1차원배열을 참조하는 index 3의 2차원배열 참조변수를 참조하는 index 2의 3차원배열 참조변수 
			
			
			abc[0]= new int[3][];
			//abc[1]=new int[4][];
			abc[1]=aaa; //다른 배열객체의 주소를 참조할 수 있음
			
			abc[0][0] = new int[5];
			abc[0][1] = new int[2];
			abc[0][2] = new int[3];
			
			abc[1][0] = new int[7];
			abc[1][1] = new int[4];
			abc[1][2] = new int[5];
			abc[1][3] = new int[8];
			
			
			
			//한번 만들어진 배열객체의 길이(index의 개수)는 변경 불가
			
			//유동적 배열 클래스: ArrayList
			ArrayList<String> arrList = new ArrayList<String>(); //제네릭 <클래스명>
			
			arrList.add( new String("Hello") );
			arrList.add( new String("Nice") );
			
			System.out.println("배열길이: "+ arrList.size() ); // 배열길이: 2
			System.out.println( arrList.get(0) ); // Hello 
			System.out.println( arrList.get(1) ); // Nice
			
			
			arrList.add("Android"); //String 객체
			System.out.println("배열길이: "+ arrList.size() ); // 배열길이: 3
			
			//요소제거
			arrList.remove(1); // Nice 삭제
			System.out.println("배열길이: "+ arrList.size() ); // 배열길이: 2
			//차량번호가 바뀜 -> Android가 index 1로 바뀐다.
			
			
			for(int i4=0; i4<arrList.size(); i4++) {
				System.out.println( arrList.get(i4) );
			}
			
			
			//for each문으로도 가능
			for( String t : arrList) { //요소의 자료형을 쓰면 된다.
				System.out.println( t );
			}
			
			
			
			
			// ArrayList는 ★객체★만 끌고 다닐 수 있음. 즉, 기본형변수는 불가!
			//ArrayList<int> kkk = new ArrayList<int>(); // error
			
			//Wrapper Class 랩퍼클래스 : Integer, Double, Byte, Boolean... 
			int x=10; // int 기본형 변수
		
			Integer obj = new Integer(x); //기본형을 객체로 바꿔주는 문법
			
			Integer obj2 = 12; 
			// = new Integer(12); 와 같은 것
			//자동으로  Integer객체로 감싸서 만들어짐 : Auto Boxing
			//참조변수이지만 변수를 만드는것처럼 쓸 수 있음
			
			System.out.println(x);  // 10
			System.out.println(obj);// 10
			
			Integer obj3 = new Integer(100); // 100이라는 숫자를 integer로 감쌈
			int z = obj3; //역으로! Auto UnBoxing도 가능
			System.out.println(z); // 100
			
			int m= new Integer(50); // 이렇게도 가능
			
			
			
			ArrayList<Integer> eee = new ArrayList<Integer>(); //int를 가진 객체: Integer
			eee.add( new Integer(5) );
			eee.add( new Integer(20) );
			eee.add(30); //Auto Boxing이 실행된 상황 -> new Integer(30)가 자동으로 실행	
			
			
			System.out.println( eee.get(0) );
			System.out.println( eee.get(1) );
			
			
			
			
			Double obj5=new Double(3.14);
			System.out.println(obj5);
			
			ArrayList<Double> arrList3 = new ArrayList<Double>();
			arrList3.add( new Double(3.14));
			arrList3.add(5.55);
			
			
			
			
			//별외
			//Wrapper 클래스를 가장 많이 사용하는 경우
			// 문자열을 기본형으로 변환할 때 가장 빈번히 사용
			String ss="50";
			System.out.println( ss + 15 ); // 5015
			
			//문자열 ss("50")를 int형으로 변환하기!
			int q =  Integer.parseInt(ss); // 파싱!
			System.out.println( q + 15 ); // 65
			
			double w = Double.parseDouble("3.14");
			System.out.println( w + 1.1 ); // 숫자로 인식 -> 4.24
			
			
			
			
			
		}
		
		
	}

}
