import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���������� ��ο� ���ϸ�, Ȯ����!
		String srcPath = "D:/files/abc.txt";
		
		try {
			//���������� �о���� FileInputStream��ü ����
			FileInputStream fis = new FileInputStream(srcPath); //���ϰ�ü �Ǵ� String
			
			//�о���� �����͸� ������ ������ ��ο� ���ϸ� ����
			File dstPath = new File("D:/copy"); //��θ� ���� Ȯ��(����) : ������ ������ ������ ��������� �����Ƿ�
			if( !dstPath.isDirectory() ) { //��ΰ� �������� �ʴ´ٸ� 
				dstPath.mkdirs(); //������ּ���
				
				//������� �Դٸ� ������ copy������ �����Ѵٰ� Ȯ���� �� ����.
				//���ϸ���� ������ File��ü�� ����
				File dstFile = new File(dstPath, "bbb.txt"); //��� + ���ϸ�,Ȯ���� - ������
				
				//������� ������ ���ϱ��� �����ϴ� Stream��ü ����
				FileOutputStream fos = new FileOutputStream(dstFile);
				
				//abc.txt���� 1byte�� �����͸� �о�ͼ� ��ٷ� bbb.txt�� ����!
				while(true) {
					byte b = (byte)fis.read();
					if(b == -1) break;
				
					
					//�о���� 1byte�� ��ٷ� ������ ���Ϸ� ����!
					fos.write(b); //1byte�� ����
				}
				
				//���Ͼ��Ⱑ �� �ȵɼ��� ����.
				fos.flush(); //OutputStream�� �����ִ� ��� ����������
				
				//���簡 �� ������!
				fis.close();
				fos.close();
				
				System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("���� �߿� ������ �߻��߽��ϴ�.");
		}
		
	}

}
