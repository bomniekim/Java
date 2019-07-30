
/*
  아래와 같이 학생들의 성적을 받아서 평균을 구하는 프로그램을 작성해보자.

실행결과 예시)

 학생의 수를 입력하시오 : 2

 학생 1의 성적을 입력하세요 : 20
 학생 2의 성적을 입력하세요 : 110
 잘못된 성적입니다. 다시 입력하시오.
 학생 2의 성적을 입력하세요 : 30
 
 성적 평균은 25.0 입니다.
 */

import java.util.Scanner;
public class Ex03ArrayMemo_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("학생의 수를 입력하시오 : ");
		int num = sc.nextInt();
		int sum=0;
		
		int[] scores = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("학생 "+ (i+1) +"의 성적을 입력하세요: ");
			scores[i]=sc.nextInt();
			
			if(scores[i]<0 || scores[i]>100) {
				System.out.println("잘못된 성적입니다. 다시 입력하시오. ");
				i--;
				continue;
			}
			
			sum = sum + scores[i];
		}
		
		System.out.println("성적 평균은 "+ (double) sum/num +"입니다.");
	}
}



