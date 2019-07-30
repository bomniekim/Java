/*
 길이가 5인 int형 배열을 선언해서 프로그램 사용자로부터 총 5개의 정수를 입력 받자.
그리고 입력이 끝나면 다음의 내용을 출력하도록 예제를 작성해보자.
  - 입력된 정수 중에서 최대값
  - 입력된 정수 중에서 최소값
  - 입력된 정수의 총 합

단, 반드시 입력을 완료한 상태에서 '최대값'과 '최소값' 그리고 '총합'을 계산해야 한다.
 */

import java.util.Scanner;
public class Ex03ArrayMemo_01 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("5개의 정수를 입력하시오. ");
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}

		int min = arr[0];
		int max = arr[0];
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) min=arr[i];
			if(arr[i]>max) max=arr[i];
			
			sum+= arr[i];
		}
		
		System.out.println("최대값은 "+max+"입니다.");
		System.out.println("최소값은 "+min+"입니다.");
		System.out.println("총합은 "+sum+"입니다.");
		
	}

}
