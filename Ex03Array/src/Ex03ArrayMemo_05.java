/*
 * 첫번째 배열 arr1은 {10, 20, 30, 40, 50}의 정수형 요소값을 가지고 있다.
두번째 배열 arr2은 { 1,  2 ,  3  ,  4 ,  5 }의 정수형 요소값을 가지고 있다.
세번째 배열 arr3의 요소값은 arr1의 요소와 arr2의 요소값을 차례로 덧셈한
결과를 저장하도록 프로그래밍 해보자. 단 arr2의 요소는 역순으로 더해지도록 하자.
즉, arr1의 0번 요소와 arr2의 4번 요소를 더해서 arr3의 0번 요소에 대입하도록 해야한다.
arr3의 1번 요소에는 arr1의 1번 요소와 arr2의 3번 요소가 더해져야 한다는 것이다.

이렇게 arr3의 요소값을 모두 대입하고 그 값을 차례대로 출력해보자.
 */

public class Ex03ArrayMemo_05 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {10,20,30,40,50};
		int[] arr2 = new int[] {1,2,3,4,5};
		int[] arr3 = new int[5];
		
		for(int i=0; i<arr3.length; i++) {
			arr3[i]=arr1[i]+arr2[(arr2.length-1)-i];
		}
		
		System.out.print("arr3 = ");
		for(int k=0; k<arr3.length; k++) {
			System.out.print(arr3[k]+" ");
			
		}
	}
}
