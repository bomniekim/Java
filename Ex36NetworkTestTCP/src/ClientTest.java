import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ŭ���̾�Ʈ�� ������ IP�ּ�, port��ȣ�� �˾ƾ� ���� ����
		
		String serverIP = "192.168.0.202";
		//serverIP="127.0.0.1"; //���� PC�� ��Ī�ϴ� Ư���� IP�ּ� (���������� ����)
		//serverIP="localhost"; //���� PC�� ��Ī�ϴ� Ư���� IP�ּ� (���������� ����)
		
		//Ŭ���̾�Ʈ �۾�
		
		//1. ������ �����ϴ� Socket����(ip�ּ�, port��ȣ)
		try {
			Socket socket = new Socket(serverIP, 10001);
			System.out.println("������ ������ �Ǿ����ϴ�.");
			
			
			//2. �����͸� �ֱ� ���� Stream�����
			//�����͸� �������� ��Ʈ��: ���Ӵ�(Socket)��ü���� �������ε�(Stream)�� �����ּ���!
			OutputStream os = socket.getOutputStream(); //���� ��Ʈ�� �̿��Ͽ� �� ���� ������ �ۼ��ϱ�
			PrintWriter writer = new PrintWriter(os); //���� ���� ��Ʈ��
			System.out.println("��Ʈ�� �����۾� ����!..������ ������ ������ �����Դϴ�.");
			
			//���� �����͸� Ű����� �Է¹ޱ�
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �޼����� �Է� : ");
			String msg = sc.nextLine(); //�� �� �Է�(���� ����)
			
			//3. ��Ʈ���� ���� �����͸� ����!
			writer.println(msg);
			writer.flush();
			writer.close();
			sc.close();
			
			System.out.println("�޼��� ������ �Ϸ�Ǿ����ϴ�.");
			
			
		} catch (UnknownHostException e) { 
			//�ּҸ� �𸣰����� error
			System.out.println("������ ��ġ�� ã�� �� �����ϴ�.");
		} catch (IOException e) { //��Ź��� error
			System.out.println("������ ����� �Ұ����մϴ�.");
		}
		
		
	}

}
