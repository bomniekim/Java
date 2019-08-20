import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����� �Ϸ��� �ϴ� IP�ּҸ� �˾ƾ� ��
		
		//�ڹٿ��� IP�ּҿ� ���õ� ������ ������ �ִ� Ŭ����: InetAddress
		//������ IP�ּҸ� Ȯ���� �� �ִ� ���
		
		try {
			System.out.println(InetAddress.getLocalHost().getHostAddress() );
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//����� �����Ϸ��� 2���� �� �˾ƾ� ��.
		//1. IP�ּ� - �� ��ǻ���� ������ �ּ�(����) : 42�ﰳ..
		//2. port��ȣ - �� ��ǻ�� �ȿ����� ���α׷� �з���ȣ(6.5����) : 0~1024 ���X (�⺻ ���α׷����� ���� �ִ� ��)
		//ex) -�λ���(IP�ּ�), 3���ױ�(port��ȣ)
		
		//������ ���α׷��� �ۼ�
		//1.[��������]�� ����� ���� �۾�
		
		try {
			ServerSocket serverSocket = new ServerSocket(10001); //10001�� ��Ʈ��ȣ
			//�������� ��ü ����
			System.out.println("���������� �����Ǿ����ϴ�.");
			
			//2. Ŭ���̾�Ʈ�� ���� ��ٸ���
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�...");
			Socket soc = serverSocket.accept(); //���⼭ Ŀ���� ���
			System.out.println( soc.getInetAddress().getHostAddress() + "Ŭ���̾�Ʈ�� �����ϼ̽��ϴ�..");
			
			//3. �����͸� �ְ� ���� Stream�����
			//�����͸� �Է¹޴� ��Ʈ�� ����� : Socket���� Stream�� ����޶�� ��û
			//����� client���ϰ� �ٸ� ����
			InputStream is = soc.getInputStream(); //����Ʈ ��Ʈ����
			InputStreamReader isr = new InputStreamReader(is); //���ڽ�Ʈ������ ��ȯ
			BufferedReader reader = new BufferedReader(isr); //���� ���� ��Ʈ������ �� �� ���� ������ �о����
			
			//4. Ŭ���̾�Ʈ�� ����� Stream�� ���� �����͸� �о����
			String msg = reader.readLine(); //Ŭ���̾�Ʈ�� �����͸� ������ ���پ� �о����.. ���⼭  Ŭ���̾�Ʈ�� �����͸� ���������� ���
			System.out.println("���� ������: +msg");
			
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
