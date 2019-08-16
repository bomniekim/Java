import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�о� �� ������ ���ϸ��� ������ �ִ� File��ü����
		File file = new File("aaa.txt");
		
		//���ϰ� �����ϴ� �������ε�(Stream)
		
		try {
			//������ �������� ������ �ڵ� ���� ����! (OutputStream�� �ٸ� ��!) -> ���ܹ߻�!
			FileInputStream fis = new FileInputStream(file);
			
			//���Ͽ��� ������ �о����!
//			byte b = (byte)fis.read(); //���Ͽ��� 1byte�� �о��->�ݺ��� �ʿ�
//			while( b!=-1 ) { //������ read()�� �� �о� �� �����Ͱ� ���ٸ�? -1��
//				System.out.println( (char)b );
//				b= (byte)fis.read(); //���� ����Ʈ �о����
//			}
//			System.out.println();
//			
			//�� ����� �ƽ�Ű�ڵ�� ���� �б⿡ ����ڰ� �ƴ� ���ڴ� �ùٸ��� �о����� ����
			
			//1byte�� ���� ���� ����Ʈ�迭(�����͵��) ������ �о���̴� ��� ��ȣ
			//�о���� �����͸� ������ �� ����Ʈ�迭�� ���� �غ��� ���ƾ� ��.
			byte[] bytes = new byte[100]; // �� ũ�� �� ���� �����!
			fis.read(bytes); //�Ķ���ͷ� ���޵� �迭 �ȿ� �о�� ������ �־���
			
			//�о�� ����Ʈ�迭�� String���� ��ȯ
			String s= new String(bytes);
			System.out.println( s );
			
			
			
			//�� �۾��� ������ �б��۾��� �Ϸ�� ���̹Ƿ�
			System.out.println("���Ϸε尡 �Ϸ�Ǿ����ϴ�.");
			
			//��Ʈ�� �ݱ�
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�б� ���� �� ������ �߻��߽��ϴ�.");	
		}
	}		
}
