import java.util.Scanner;

/*
 * 배열을 이용하여 간단한 극장 예약 시스템을 작성하여 보자. 아주 작은 극장이라서 좌석이
10개밖에 안 된다. 사용자가 예약을 하려고 하면 먼저 좌석 배치표를 보여준다. 즉, 예약이
끝난 좌석은 1로, 예약이 안된 좌석은 0으로 나타낸다.


 좌석을 예약하시겠습니까( 1(Y) 또는 0(N) )?  1

 현재의 예약 상태는 다음과 같습니다.
 -----------------------
 좌석 번호 :  1  2  3  4  5  6  7  8  9  10
 -----------------------
 예약 상태 :  0  0  0  0  0  1  1  1  0   1

 
 몇번째 좌석을 예약하시겠습니까? 6
 죄송합니다. 이미 예약된 좌석입니다. 다른 좌석을 선택해 주세요.
 
 몇번째 좌석을 예약하시겠습니까? 1
 1번 좌석 예약되었습니다.

 좌석을 예약하시겠습니까( 1(Y) 또는 0(N) )?  0
 예약을 종료합니다. 
 */

import java.util.Scanner;
public class Ex03ArrayMemo_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final int size = 10;
		int[] seats = new int[size];
		
		while(true) {
		System.out.print("좌석을 예약하시겠습니까? ( 1(Y) 또는 0(N) ) ");
		int a = scan.nextInt();
		
		if(a==1) {
			System.out.println("\n현재의 예약 상태는 다음과 같습니다.");
			System.out.println("-----------------------------");
			System.out.print("좌석번호: ");
			
			for (int i=0; i<size; i++){
				System.out.print(i+1 + " ");
				}
				
			System.out.println("\n-----------------------------");
			System.out.print("예약상태: ");
			
			for (int k=0; k<size; k++){
				System.out.print(seats[k] + " ");} 
			System.out.println("\n-----------------------------\n\n");
				
		
			
			System.out.print("몇번째 좌석을 예약하시겠습니까? ");
			int b = scan.nextInt();
			if(seats[b-1]==0) {
				seats[b-1]=1;
				System.out.println(b+"번 좌석이 예약되었습니다.\n");
				continue;
			
			}
			else {
			System.out.println("죄송합니다. 이미 예약된 좌석입니다. 다른 좌석을 선택해 주세요. \n");
			continue;
			
			} 
		}
		else System.out.println("예약을 종료합니다. "); break;
	}
	}
}
			
	
			
	
