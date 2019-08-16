import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StringIOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//���ڿ� �����͸� �� �پ� �Ǵ� �� �ܾ �аų� ������? Ư��, �о���� ��
		//���� ����Ʈ ��Ʈ�� ����� InputStream�� ���ؼ� �� ����Ʈ�� �о�� �� �� �ľ��ϱ� �����
		//�׷��� ���� �� ���Ѱ� ���ڿ� ������ �������� IO�� �����ϱ� ���ؼ� 
		//���� ��Ʈ�� ����� �� ��ȣ (Reader, Writer)
		
		//����� �Է��� �޾� �� �����͸� ���Ͽ� ���������� �����ϴ� ���α׷�
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("������ �ܾ� �Է�(��, no�� �Է��ϸ� ����): ");
			String str= scan.next();
			
			if(str.equalsIgnoreCase("no")) {//��ҹ��� ��������!
				System.out.println("�Է��� ����˴ϴ�.");
				break;
			}
			
			//�Էµ� ���ڿ� ������ ���� File��ü ����
			//��ǥ��ġ:"����������Ʈ����/files/data.txt"
			File path = new File("files"); //������!
			if( !path.exists() ) path.mkdirs();
			
			//��� + ���ϸ�.Ȯ����
			File file = new File(path, "data.txt");
			
			
			//���ϰ� ������ ��Ʈ��[���ڽ�Ʈ��]
			//�� ������(���α׷�)�� ���������� �������� ���� ��Ʈ�� �ʿ�(OutputStream ��ſ� Writer)
			//�ڹٹ����� data.txt���� ���̿� �������ε�(FileWriterŬ����) ��ü ����
			
			try {
				FileWriter fileWriter = new FileWriter(file, true);
				fileWriter.write(str); //������ ������ �ܾ���̳� Ư�� Format���� �����Ű�� ���� ��ٷο�                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
				fileWriter.flush();
				fileWriter.close(); //������Ʈ���� ������ ���ڽ�Ʈ���� ���� close
				
				
				//FileWriter�� �ٷ� ����ϱ� ���� �� �� ����ϱ� ���� ���
				//��ġ �ܼ�â�� ������ ����ϵ�, ��, System.out.print() �̷��� ������..
				//�� �� �ֵ��� ���� ���� ��Ʈ�� Ŭ������ �غ�Ǿ� ����
				PrintWriter writer = new PrintWriter(fileWriter);
				writer.println(str);
				writer.flush();
				
				writer.close(); //���� ��Ʈ���� ������ ���ڽ�Ʈ���� ���� close()��
				
			} catch (IOException e) {
				System.out.println("������ �������� �ʽ��ϴ�.");

			}
			
		}//while
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("����� ������ �����͵��� ȭ�鿡 ����մϴ�.");
		System.out.println("--------------------------------");
		System.out.println();
		
		
		//�� �ٿ� �� �ܾ ����Ǿ� ������ �о���� �ܾ ArrayList�� �߰���Ű��..
		ArrayList<String> data = new ArrayList<String>();
		
		//�о�� File��ü ����
		File file = new File("files/data.txt");
		
		//�о�� ���ϰ� ��Ʈ�� ���� �۾��� ����
		
		try {
			FileReader fr = new FileReader(file);
			
			//int a = fr.read(); //�� ���ھ� �б�: ����� 1byte, �ѱ��� 2~3byte�� �о���. ���� �˾Ƽ� ����Ʈ �� �����Ǿ� �о���.
			//System.out.println(a);
			//�� ����� �ݺ����� �ʿ��Ͽ� ����
			
			//�׷��� �о���̱� ���ϰ� ���� ���� ��Ʈ�� Ŭ�������� ������.
			//�� �߿��� ���� ���� ���Ǵ� BufferedReader�� ���!
			BufferedReader reader = new BufferedReader(fr);
			//�� �پ� �о���̱�
			String line = reader.readLine();
			while(line!=null) {
				//�о� �� �����͸� ArrayList�� �߰�
				data.add(line);
				
				line= reader.readLine();
			}
			
			System.out.println("���� �б� ����!");
			
			//ArrayList�� �ִ� �����͵�(���ڿ���)�� ���ʷ� ����ϱ�!
			for(int i=0; i<data.size(); i++) {
				System.out.println(i+" : "+data.get(i));
			}
			
			
			//���ڽ�Ʈ�� �ݱ�
			reader.close();
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("������ �������� �ʽ��ϴ�.");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�д� �߿� ������ �߻��߽��ϴ�.");
		} 
	
		
	}//Main

}//class
