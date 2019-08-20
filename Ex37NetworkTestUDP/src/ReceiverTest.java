import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			//1. Datagram(우편)을 받을 우체통(DatagramSocket) 준비하기
			DatagramSocket socket = new DatagramSocket(10003);
			
			//2. 보내진 우편물의 내용(데이터)을 담을 수 있는 박스(Datagram)
			//빈 박스로 만들기
			byte[] buf = new byte[100]; //100칸짜리 빈 통
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			
			System.out.println("메세지를 기다립니다.");
			socket.receive(packet); //메세지를 받아서 packet안의 buf안에 넣어줌. 메세지를 받을 때까지 커서가 여기서 대기
			
			//byte[] (buf)를 String으로 변환
			String s = new String(buf);
			System.out.println("받은 메세지 : "+s);
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
