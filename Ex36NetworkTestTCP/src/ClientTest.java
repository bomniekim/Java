import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//클라이언트는 서버의 IP주소, port번호를 알아야 접속 가능
		
		String serverIP = "192.168.0.202";
		//serverIP="127.0.0.1"; //본인 PC를 지칭하는 특별한 IP주소 (여러가지가 있음)
		//serverIP="localhost"; //본인 PC를 지칭하는 특별한 IP주소 (여러가지가 있음)
		
		//클라이언트 작업
		
		//1. 서버와 연결하는 Socket생성(ip주소, port번호)
		try {
			Socket socket = new Socket(serverIP, 10001);
			System.out.println("서버와 연결이 되었습니다.");
			
			
			//2. 데이터를 주기 위한 Stream만들기
			//데이터를 내보내는 스트림: 해임달(Socket)객체에게 무지개로드(Stream)를 열어주세요!
			OutputStream os = socket.getOutputStream(); //보조 스트림 이용하여 더 쉽게 데이터 작성하기
			PrintWriter writer = new PrintWriter(os); //보조 문자 스트림
			System.out.println("스트림 연결작업 성공!..데이터 전송이 가능한 상태입니다.");
			
			//보낼 데이터를 키보드로 입력받기
			Scanner sc = new Scanner(System.in);
			System.out.print("보낼 메세지를 입력 : ");
			String msg = sc.nextLine(); //한 줄 입력(띄어쓰기 가능)
			
			//3. 스트림을 통해 데이터를 전송!
			writer.println(msg);
			writer.flush();
			writer.close();
			sc.close();
			
			System.out.println("메세지 전송이 완료되었습니다.");
			
			
		} catch (UnknownHostException e) { 
			//주소를 모르겠을때 error
			System.out.println("서버의 위치를 찾을 수 없습니다.");
		} catch (IOException e) { //통신문제 error
			System.out.println("서버와 통신이 불가능합니다.");
		}
		
		
	}

}
