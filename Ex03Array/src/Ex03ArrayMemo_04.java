import java.util.Scanner;

/*
 * �迭�� �̿��Ͽ� ������ ���� ���� �ý����� �ۼ��Ͽ� ����. ���� ���� �����̶� �¼���
10���ۿ� �� �ȴ�. ����ڰ� ������ �Ϸ��� �ϸ� ���� �¼� ��ġǥ�� �����ش�. ��, ������
���� �¼��� 1��, ������ �ȵ� �¼��� 0���� ��Ÿ����.


 �¼��� �����Ͻðڽ��ϱ�( 1(Y) �Ǵ� 0(N) )?  1

 ������ ���� ���´� ������ �����ϴ�.
 -----------------------
 �¼� ��ȣ :  1  2  3  4  5  6  7  8  9  10
 -----------------------
 ���� ���� :  0  0  0  0  0  1  1  1  0   1

 
 ���° �¼��� �����Ͻðڽ��ϱ�? 6
 �˼��մϴ�. �̹� ����� �¼��Դϴ�. �ٸ� �¼��� ������ �ּ���.
 
 ���° �¼��� �����Ͻðڽ��ϱ�? 1
 1�� �¼� ����Ǿ����ϴ�.

 �¼��� �����Ͻðڽ��ϱ�( 1(Y) �Ǵ� 0(N) )?  0
 ������ �����մϴ�. 
 */

import java.util.Scanner;
public class Ex03ArrayMemo_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final int size = 10;
		int[] seats = new int[size];
		
		while(true) {
		System.out.print("�¼��� �����Ͻðڽ��ϱ�? ( 1(Y) �Ǵ� 0(N) ) ");
		int a = scan.nextInt();
		
		if(a==1) {
			System.out.println("\n������ ���� ���´� ������ �����ϴ�.");
			System.out.println("-----------------------------");
			System.out.print("�¼���ȣ: ");
			
			for (int i=0; i<size; i++){
				System.out.print(i+1 + " ");
				}
				
			System.out.println("\n-----------------------------");
			System.out.print("�������: ");
			
			for (int k=0; k<size; k++){
				System.out.print(seats[k] + " ");} 
			System.out.println("\n-----------------------------\n\n");
				
		
			
			System.out.print("���° �¼��� �����Ͻðڽ��ϱ�? ");
			int b = scan.nextInt();
			if(seats[b-1]==0) {
				seats[b-1]=1;
				System.out.println(b+"�� �¼��� ����Ǿ����ϴ�.\n");
				continue;
			
			}
			else {
			System.out.println("�˼��մϴ�. �̹� ����� �¼��Դϴ�. �ٸ� �¼��� ������ �ּ���. \n");
			continue;
			
			} 
		}
		else System.out.println("������ �����մϴ�. "); break;
	}
	}
}
			
	
			
	
