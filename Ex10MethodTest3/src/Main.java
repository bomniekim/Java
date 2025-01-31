
public class Main {

	public static void main(String[] args) {

		int a = 10;
		int b = 4;

		// 사칙연산을 해주는 계산기 객체 생성(메소드만 있는 클래스)
		Calculator cal = new Calculator();

		int sum = cal.sum(a, b);
		System.out.println(sum);

		int sub = cal.subtract(a, b);
		System.out.println(sub);

		int mul = cal.multi(a, b);
		System.out.println(mul);

		int div = cal.divide(a, b);
		System.out.println(div);

		// 실수형 숫자들의 사칙연산 의뢰
		double c = 3.5;
		double d = 4.6;

		System.out.println(cal.sum(c, d));
		System.out.println(cal.subtract(c, d));
		System.out.println(cal.multi(c, d));
		System.out.println(cal.divide(c, d));

		// 원한다면 문자열 데이터의 산술 덧셈 기능도 만들 수 있음.
		System.out.println("123" + "456"); // 123456
		System.out.println(cal.sum("123", "456"));// int형 덧셈 = 579

		// call by value, call by reference
		int n = 10;
		
		
		Cal ca = new Cal();
		// 전달한 값을 1 증가시키는 기능을 실행
		ca.increase(n); // call by value : 11
		//원본인 n의 값은 그대로 10
		//값만 날아가서 10+1 x=11
		System.out.println("main의 n값: "+n); // 10 값만 날아갔지 상자가 날아간것이 아님
		

		
		int[] arr = new int[] {10,20,30}; 
		ca.increase(arr);
		System.out.print("main의 arr값: ");
		
		//for(int i=0; i<arr.length; i++) {
		//int t= arr[i];
		
		for(int t : arr) { //for each문
			System.out.print(t+"  ");
		}
		System.out.println();
			
		
		//변수의 종류에 대해 알아보쟈
		//지역변수, 멤버변수, 매개변수, 정적변수
		//Variable.java파일 만들고 테스트

		
		
		
	}// main method

}// Main class



class Cal {

	// 전달받은 값을 1증가시키는 기능을 가진 클래스
	void increase(int x) {
		x++;
		System.out.println("x의 값: "+x);
	}
	
	//배열을 파라미터로 받는 메소드(매개변수로 배열참조변수 사용)
	//call by reference
	//배열요소값을 1씩 증가시키는 기능을 가진 메소드
	void increase(int[] a) {
		//요소값 1씩 증가
		for(int i=0; i<a.length; i++) {
			a[i]++;
			System.out.print(a[i]+"  ");
		}
		System.out.println();
	}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
