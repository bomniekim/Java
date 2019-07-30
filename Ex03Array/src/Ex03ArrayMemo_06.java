/*
 * 길이가 25인 정수형 배열을 만들어라. 그리고 이 배열의 각 요소에 1부터 25까지 25개의 정수값이
Random하게 저장되도록 프로그래밍 하시오. 단, 배열안에 저장된 Random값은 중복된 숫자가
있으면 안된다. 값들이 제대로 대입되어 있는지 알아보기 위해 1줄에 5개씩 5줄로 각 배열의 요소를
인덱스 순서대로 출력해보자.
 */
import java.util.Random;
public class Ex03ArrayMemo_06 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] arr = new int[25];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]= new Random();
		}
	}

}

/*
//또 다른 참조형들도 배열 사용 가능
	Random[] arr17 =new Random[3];
	System.out.println( arr17[0] );
	
	//각 배열의 요소(Random 참조변수)에 객체 대입
	arr17[0] = new Random();
	int m =arr17[0].nextInt(14); //0~13까지의 10개의 랜덤수 지정
	//m =arr17[0].nextInt(14); //NullPointException
	*/