/*
 입력값들의 분포를 시각적으로 볼 수 있는 히스토그램을 만드는 프로그램을 작성하시오.
이 프로그램은 1부터 100이하의 정수 10개를 읽어야 하고, 1-10,11-20 등의 범위에 드는
값들의 횟수를 아래와 같이 출력하여야 한다.

  1 - 10 : ****
 11 - 20 : **
 21 - 30 : *
 31 - 40 : **
 ..........
 ..........
 */
import java.util.Scanner;

public class Ex03ArrayMemo_03 {
 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i]=sc.nextInt();
			
			for (int k=0; k<num.length; k++) {
				if(num>=10*k+1 && num<=10*(k+1))
		}
		//입력받은 값의 범위 찾기
		//num으로 받은 값을 배열에 저장하는 것이 아니라 입력받은 수에 맞는 범위의 값을 1씩 키우는 코드
		
		
		
		
	}
}
