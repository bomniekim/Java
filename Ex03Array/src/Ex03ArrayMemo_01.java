/*
 ���̰� 5�� int�� �迭�� �����ؼ� ���α׷� ����ڷκ��� �� 5���� ������ �Է� ����.
�׸��� �Է��� ������ ������ ������ ����ϵ��� ������ �ۼ��غ���.
  - �Էµ� ���� �߿��� �ִ밪
  - �Էµ� ���� �߿��� �ּҰ�
  - �Էµ� ������ �� ��

��, �ݵ�� �Է��� �Ϸ��� ���¿��� '�ִ밪'�� '�ּҰ�' �׸��� '����'�� ����ؾ� �Ѵ�.
 */

import java.util.Scanner;
public class Ex03ArrayMemo_01 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("5���� ������ �Է��Ͻÿ�. ");
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
		
		System.out.println("�ִ밪�� "+max+"�Դϴ�.");
		System.out.println("�ּҰ��� "+min+"�Դϴ�.");
		System.out.println("������ "+sum+"�Դϴ�.");
		
	}

}
