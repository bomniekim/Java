/*
 * ���̰� 25�� ������ �迭�� ������. �׸��� �� �迭�� �� ��ҿ� 1���� 25���� 25���� ��������
Random�ϰ� ����ǵ��� ���α׷��� �Ͻÿ�. ��, �迭�ȿ� ����� Random���� �ߺ��� ���ڰ�
������ �ȵȴ�. ������ ����� ���ԵǾ� �ִ��� �˾ƺ��� ���� 1�ٿ� 5���� 5�ٷ� �� �迭�� ��Ҹ�
�ε��� ������� ����غ���.
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
//�� �ٸ� �������鵵 �迭 ��� ����
	Random[] arr17 =new Random[3];
	System.out.println( arr17[0] );
	
	//�� �迭�� ���(Random ��������)�� ��ü ����
	arr17[0] = new Random();
	int m =arr17[0].nextInt(14); //0~13������ 10���� ������ ����
	//m =arr17[0].nextInt(14); //NullPointException
	*/