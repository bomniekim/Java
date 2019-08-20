import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//UDP방식 : User Datagram Protocol - 마치 편지 보내기와 비슷한 방식
		
		
		try {
			//1. 우편 보낼 우체통 만들기
			DatagramSocket socket= new DatagramSocket();//보내는 쪽은 굳이 포트번호 안써도 됨
			
			// 보낼 데이터
			Scanner sc= new Scanner(System.in);
			System.out.print("보낼 데이터 : ");
			String msg= sc.nextLine();
			sc.close();
			
			//2. 데이터(msg)를 우편으로 보내기 위해 우편상자(DatagramPacket)에 동봉
			//그 상자에 받는 사람 주소(ip주소, port번호)를 작성
			InetAddress addr = InetAddress.getByName("192.168.0.202"); //받는 사람 주소로 InetAddress객체 생성
			DatagramPacket packet= new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, 10003);
			
			//3. 우체통에 우편박스를 보내기
			socket.send(packet);
			
			System.out.println("전송완료!");
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}







