import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Error(����) : ����Ұ�
		// 2. Exception(����) : ���� ��(Runtime)

		// Exception�� ��ǥ���� ��:
		// 1) ����ڰ� �߸��� �����͸� �Է��ϴ� ���: ���� �Է� ��Ȳ���� �����Է� ���� �Է�
		// 2) ������ �����̳� ����� �߸��� ���: �迭�� �ε��� ��ȣ ����/ 0���� ������
		// 3) ��Ʈ��ũ�� �ϵ���� ���� (�ϵ��ũ�� �������� ���� / Ư������Ʈ ���� ���� : url�̽�, ����Ʈ���� �ҷ�)
		// 4) �������� �����Ͽ� ���� ����(�𵵽� ����) : �ذ��� �����!

		System.out.println("����ó���� ���� �˾ƺ��ô�");
		// ���� ��Ȳ �������� �����

		// ���� ���ܻ�Ȳ�鿡 �����ϴ� ���� �Ұ� [����ó��]
//		int a=0;
//		System.out.println(10/a);
		// ���ܰ� �߻��ϸ� �� ���� ���α׷��� �����߿� �ٿ�
		// �̸� ������ �ʿ䰡 ����.. ��, ������ ����� �� �κи� �������� �ʰ� ���� �ڵ带 ����
		// �ٽ� ���� �ٿ���� �ʵ��� �� ��ǥ����
		// if�� �̿��ؼ� a���� 0������ �˻��غ��� �������� ������ �� ���θ� �����ϵ��� �� �� ����.
		// ��쿡 ���󼭴� �ϴ� �õ��� �غ��� ����(Exception)�� �߻��ϸ� �׿� �����ϵ��� �ؾ� �ϴ� ��쵵 ����
		// ��) ���ͳ� ����Ʈ�� �����ϴ� ���(www.daum.net): ������ �غ����� �� ����Ʈ�� ���������� ������ �ȵǴ� ���!
		// �̷� ��� ����ó�� ������ �ſ� ������! ���α׷��ӵ鿡�Դ� �ʼ� ���!

		
		
		// 1) 0���� ������...
		int n = 2;
		int m = 0;

		try {
			System.out.println(10 / m); // ���ܹ߻��� �� �ִ� �ڵ�
		} catch (ArithmeticException e) { // ����� ����
			// �� try ���� �ȿ��� ���ܰ� �߻��ϸ� �� ���� �����
			// ������ �߻����� �� ������ �ڵ��..
			System.out.println("������ �߻��߽��ϴ�.");
			System.out.println("�����޼��� :" + e.getMessage());
			System.out.println("�����޼��� Ǯ����: " + e.toString());
		}
		
		
		

		// 2) �迭�� �ε��� ��ȣ ��� ����
		int[] arr = new int[5];

		try {
			// ������ �߻��� ������ �ִ� �ڵ�..�� try �ȿ� �ۼ�
			for (int i = 0; i < 6; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����!");
		}
		
		

		// 3) null���������� ��ü�� �޼ҵ� ��� (���� ���� �߻�)
		String s = null;

		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("null error! ��ü����!");
		}

		
		
		
		// 4) �߸��� �����͸� �Է�
		Scanner scan = new Scanner(System.in);

		int k;

		try {
			k = scan.nextInt();
			System.out.println("n: " + n); // try�ۿ� ������ ������ ����Ǵϱ� �ȿ� �־�!
		} catch (InputMismatchException e) {
			System.out.println("������ �Է���!");
		}

		
		
		// 5) ���ڷ� �ٲ� �� ���� �����͸� ���ڷ� �ٲٰ��� �� ��
		// String str= scan.next(); //���ڿ� �Է�

		// ���ڿ��� int������ ��ȯ�ϱ�
		try {
			// int num= Integer.parseInt(str);
			// System.out.println("num : "+num);
		} catch (NumberFormatException e) {
			System.out.println("������ ���ڿ��� �ƴϾ ��ȯ �Ұ�!");
		}

		// ##����! ����ó���� ���α׷��� �ٿ���� �ʵ��� �ϴ� ���� ##

		// ���ܰ� �ѹ��� �������� �߻��ϴ� ��쵵 ����
		// ��) �� ���� �Է¹޾� �������� �ϴ� ���α׷�..
		// ���� �ȿ� ��ø���� ����ó�� �ʿ�...
		int c, d;

		try {
//			c = scan.nextInt();
//			d = scan.nextInt();
//
//			try {
//				System.out.println(c / d); // d�� 0�� ������ ����
//			} catch (ArithmeticException e) {
//				System.out.println("������ ����: 0 ������");
//			}	

		} catch (InputMismatchException e) {
			System.out.println("������ �ƴ� �� �Է� ����!");
		}

		
		//��ø�� ��ø... ��ø... �̰� �� ¥����
		//if else���� ��ø ��ſ� if else if��..
		//���� catch�������� �����ϰ� ...ó���ϱ�
		
		
		try {
			
//			c=scan.nextInt();
//			d=scan.nextInt();
//			
//			System.out.println(c/d);
			
		}catch(InputMismatchException e) {
			System.out.println("������ �ƴ� ���� �Է�"); //���� �߿�
		}catch(ArithmeticException e) {
			System.out.println("������ ����: 0 ������");
		} 
		
		//��Ƽcatch���� ���������� ����
		//���� ���� ��Ȳ���� ��ó�� ������ �Ȱ��ٸ�
		//���� ���� ���� catch���� �ۼ��ϴ� ���� ����!
		//�� ���ܰ�ü���� �ֻ��� Ŭ������ ExceptionŬ������ ���������� ��� ������ Exception��ü���� catch�� �� ����
		try {
			c=scan.nextInt();
			d=scan.nextInt();
			
			System.out.println(c/d);
		}catch(Exception e) {
			System.out.println("error!");
		}
//		catch( ArithmeticException e) {
//			
//		} //ù��°���� ������ ��� ��ұ� ������ ����� �� ���� �ڵ� -> error
		
		
		//���ܹ߻� ���ο� ������� ������ �� �� �ִٸ�?
		//���� ��) �޸� �����ϰų� �ܺ�(����, ����)�� ������� �����Ű�� �ڵ��...�ۼ�!
		
		int x=0;
		
		try {
			System.out.println(10/x);
			System.out.println("��꼺��");
		}catch(ArithmeticException e ) {
			System.out.println("������!");
		}finally {
			//����� �������ο� ������� ������ ����Ǵ� ����!
			System.out.println("���� ������ ����!");
		}
		
		//���� ����..finally �Ƚᵵ ������ catch{} �ۿ� ���� �ٿ� �ڵ带 ���� ������ �����
		//�׷� ������ ������ ����Ǵ� �ڵ� �ۼ� ������
		//�׷��� finally �ۿ� ���� try-catch���� ������� �ڵ��� ��ó�� �νĵ� ���ɼ��� ����
		
		
		//finally�� ���� �Ǹ� catch���� ������ �� ����
		try {
			
		}finally {
			
		}
		
		 
		//Exception�� 2���� ����!
		//1. Checked Exception : ����ó���� ���ϸ� ������ �߻��Ͽ� ���������� ���ϴ� ���ܵ�!
		//2. Unchecked Exception : ����ó��(try��)�� �ص� �ǰ� ���ص� �Ǵ� ���ܵ�! - ���ݱ��� �ô� �� ���� ���ܵ�!
		
		//Checked Exception�� ��ǥ���� �͵�.. �ݵ�� ����ó���� �ؾ߸�  
		
		try {
			//URL url= new URL("http://www.naver.com");
			URL url= new URL("www.naver.com");//�ּҿ��� : http://���..
			
			System.out.println("���� ����!");		
		}catch(MalformedURLException e) {
			System.out.println("�����ּҿ� �̻��� �ֽ��ϴ�.");
		}
		
		
		File file= new File("D://aaa.txt");		
		
		try {
			//����ó���� ���ϸ� ������ ���� �ڵ�!
			FileInputStream fis= new FileInputStream(file);
			
			System.out.println("�������� ����");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("�������� ����. ������ ã�� �� �����ϴ�.");
		}
		
		
		
		System.out.println();
		System.out.println("aaaaa");
	
	}

}