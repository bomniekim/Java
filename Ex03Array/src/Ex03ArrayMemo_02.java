
/*
  �Ʒ��� ���� �л����� ������ �޾Ƽ� ����� ���ϴ� ���α׷��� �ۼ��غ���.

������ ����)

 �л��� ���� �Է��Ͻÿ� : 2

 �л� 1�� ������ �Է��ϼ��� : 20
 �л� 2�� ������ �Է��ϼ��� : 110
 �߸��� �����Դϴ�. �ٽ� �Է��Ͻÿ�.
 �л� 2�� ������ �Է��ϼ��� : 30
 
 ���� ����� 25.0 �Դϴ�.
 */

import java.util.Scanner;
public class Ex03ArrayMemo_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�л��� ���� �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		int sum=0;
		
		int[] scores = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("�л� "+ (i+1) +"�� ������ �Է��ϼ���: ");
			scores[i]=sc.nextInt();
			
			if(scores[i]<0 || scores[i]>100) {
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��Ͻÿ�. ");
				i--;
				continue;
			}
			
			sum = sum + scores[i];
		}
		
		System.out.println("���� ����� "+ (double) sum/num +"�Դϴ�.");
	}
}



