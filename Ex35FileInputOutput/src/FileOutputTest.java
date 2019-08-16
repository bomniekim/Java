import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputTest { // Stream: ���� ������ �������ٸ�

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����ڷκ��� �����͸� �Է¹޾� File�� �����ϴ� ���α׷�

		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������ �Է�: ");
		String data = sc.next();
		sc.close();

		
		// �����͸� ������ ������ ��ο� ���ϸ�, Ȯ���ڱ��� �������ִ� ��ü ����
		// FileŬ����: File���� �� File�� ���� [����]�� �����ϴ� Ŭ����
		// �����θ� �������� ������ �⺻������ �� Java������ �ִ� ������Ʈ ������ ��ΰ� ������
		File file = new File("aaa.txt");
		
		//Ư������ ������ ���� ��ġ�� ������ �� ����
		//������ ��� �����ڴ� �ü������ �ٸ�
		//windows�� ��������(\)�� �ǰ� ������(/)�� ����
		//������, macOS�� ������(/)�� ������
		//��� �ü������ ���α׷��� ������ �� �ֵ��� ������(/)��ȣ
		
		file = new File("kkk\\aaa.txt"); //�������� �ϳ��� escape���ڷ� �ν� -> \\�� �����
		file = new File("kkk/aaa.txt");
		
		//������ �ڵ����� �������� ����(���丮)�� �ڵ����� ����� ���� ����
		//��, kkk��� ������ ������ error
		
		//���α׷��� ���� ������ ����� �޶�� ��û�� �� ����
		//�켱, ���������� File��ü�� �����
		File path = new File("kkk");
		if( !path.isDirectory() ) { //�� ������ ����?
			//���ٸ� ���丮�� �����(make)
			path.mkdirs(); //���������� �����Ѵٸ� �� ������������ ��� �������.
		}
		
		//������ ���� ��ο� ���ϸ��� �����Ͽ� ���ο� File��ü ����
		file = new File(path, "aaa.txt"); //��� ����/ ���ϸ� ���� �� ����
		
		//�� ������Ʈ�� �ƴ� Ư�������� ���� �ٷ� ������ �� ����
		file = new File("D:/aaa.txt");
		
		//��θ� �Ѳ�����!
		
		path = new File("D:/files/kkk");
		if( !path.isDirectory() ) {
			path.mkdirs();
		}
		
		file = new File(path, "hello.txt");
		
		// ���ϰ�ü�� ���� ���Ͽ� �����͸� ������ ���� �������ε�(Stream) ����
		// Stream�߿��� �������� ������ Output Stream�� ���

		
		// �� �߿��� ���Ͽ� �������� �ɷ��� ���� FileOutputStreamŬ������ ��ü�� ����

		
		try {
			// ���� aaa.txt������ ���ٸ� �ڵ����� ����! ��, ������ �ڵ����� �������� ����
			//FileOutputStream fos = new FileOutputStream(file); // ���� ������ file��ü�� �޾ƿ�
			//�⺻������ FileOutputStream�� ����Ⱑ ��(���� ���ϸ� �����ϸ� �� �� ������ �����)
			FileOutputStream fos = new FileOutputStream(file, true); //�� ��° �Ķ���� : append����[true, false]
			//true�� ���� �̾��, false�� �����
			
			
			// ��Ʈ���� ���� �����͸� ���Ͽ� �ۼ�(��������)
			fos.write(65); // �����Ϳ� ���� �����ڵ� ���� ����
			
//			fos.write(data.charAt(0));
//			fos.write(data.charAt(1));
//			fos.write(data.charAt(2));
//			fos.write(data.charAt(3));
//			fos.write(data.charAt(4));
			//�� ����� 1����Ʈ�� �����͸� ������ ������ �ݺ����� �ʿ� 
			
			//�׷��� ����Ʈ �迭(byte[])�� �����͵���� ������ ����� ��ȣ��
			//String��ü�� ���� ���ڿ� �����͸� ����Ʈ�迭�� ��ȯ���ִ� �޼ҵ尡 ����
			//String->byte[]�� ��ȯ
			
			byte[] bytes = data.getBytes(); //���� ���� ���ڿ��� ����Ʈ �迭�� �ٲپ���
			fos.write(bytes); //����Ʈ���� �� �濡 ������!
			
			
			
			fos.flush(); //Stream���ۿ� ��Ⱑ �������� �� �־ ��쵵�� �� ������!
			
			//������ ��Ʈ�� �۾��� ������ ��Ʈ���� �ݴ� �۾� ����
			fos.close();
			
			//�ڡڡ�[write->flush->close]�ڡڡ�
			
			//������� Ŀ���� �Դٸ� ������ �����ٴ� ���� �ǹ���
			//������ ���ܰ� �־��ٸ� catch������ ��������..
			System.out.println("���� ���� ����!");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("���� �۾� �� ������ �߻��߽��ϴ�.");

		}
		
		//FileŬ���� ��ü�� �ֿ� �޼ҵ�
		System.out.println( file.getName() ); //���ϸ��� �˷���
		System.out.println( file.getPath() ); //���ϰ��(�����)�� �˷���
		System.out.println( file.getAbsolutePath() ); //������
		
	}

}
