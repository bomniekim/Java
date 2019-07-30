import java.util.Scanner;

/*
public class Ex03ArrayPractice {

	public static void main(String[] args) {

		int[] s = new int[10];
		
		for(int i=0; i<s.length; i++) {
			s[i]=i;
		}
		
		for(int i=0; i<s.length; i++) {
			System.out.print(s[i]+" ");
		}
	}

}*/

/*
import java.util.Scanner;

public class Ex03ArrayPractice {

	public static void main(String[] args) {
		
		final int student = 5;
		Scanner scan = new Scanner(System.in);
		
		int[] scores = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.print("성적을 입력하시오. ");
			scores[i]=scan.nextInt();
		}
		
		int sum=0;
		
		for(int i=0; i<5; i++) {
			sum+=scores[i];
		}
		
		System.out.println("평균 성적은"+ sum / student+"입니다." );
	}
	
}*/

/*
public class Ex03ArrayPractice {

	public static void main(String[] args) {
	
		String[] pizza = new String[] {"Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon"};
		
		for (int i=0; i<pizza.length; i++) {
			System.out.println(pizza[i]);
		}
*/		

/*
public class Ex03ArrayPractice {

	public static void main(String[] args) {
		
		int[] prices = new int[] {18,12,3,9,6,18,8,4,2,19};
		int min;
		
		min=prices[0];
		
		for (int i=0; i<prices.length; i++) {
			if (prices[i]<min)
				min=prices[i];}
		
		System.out.println("최소값은"+min+"입니다.");
	}
}*/

/*
import java.util.Scanner;

public class Ex03ArrayPractice {

	public static void main(String[] args) {
		
		int[] s = new int[] {0, 10, 20, 30, 40 ,50,60,70,80,90};
		int val, index=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 값을 입력하시오. ");
		val = sc.nextInt();
		
		for (int i=0; i<s.length; i++) {
			if(s[i]==val)
				index = i;
		}
		
		if(index<s.length && index>=0)
			System.out.println(val+"값은 "+index+"의 위치에 있습니다.");
		
		
	}
}*/

public class Ex03ArrayPractice {

	public static void main(String[] args) {
		final int size = 10;
		int[] seats = new int[size];
		
		while(true) {
			System.out.println("------------------------------------");
			for (int i=0; i<size; i++){
				System.out.print(i+1 + " ");}
			
			System.out.println("\n----------------------------------");
			for (int i=0; i<size; i++){
				System.out.print(seats[i] + " ");} 
			System.out.println("\n----------------------------------");
			
			System.out.print("원하시는 좌석의 번호를 입력하세요 (종료는 -1): ");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			
			if(a==-1) break;
			if(seats[a-1]==0) {
				seats[a-1] = 1;
				System.out.println("예약되었습니다.");			
			}
			else System.out.println("이미 예약된 자리입니다.");
			}
			
		}
}



		
		
		
		
		
		
		
		
		
		
		

		




