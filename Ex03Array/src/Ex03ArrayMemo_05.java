/*
 * ù��° �迭 arr1�� {10, 20, 30, 40, 50}�� ������ ��Ұ��� ������ �ִ�.
�ι�° �迭 arr2�� { 1,  2 ,  3  ,  4 ,  5 }�� ������ ��Ұ��� ������ �ִ�.
����° �迭 arr3�� ��Ұ��� arr1�� ��ҿ� arr2�� ��Ұ��� ���ʷ� ������
����� �����ϵ��� ���α׷��� �غ���. �� arr2�� ��Ҵ� �������� ���������� ����.
��, arr1�� 0�� ��ҿ� arr2�� 4�� ��Ҹ� ���ؼ� arr3�� 0�� ��ҿ� �����ϵ��� �ؾ��Ѵ�.
arr3�� 1�� ��ҿ��� arr1�� 1�� ��ҿ� arr2�� 3�� ��Ұ� �������� �Ѵٴ� ���̴�.

�̷��� arr3�� ��Ұ��� ��� �����ϰ� �� ���� ���ʴ�� ����غ���.
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
