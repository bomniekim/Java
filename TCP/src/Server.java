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
		
		//통신을 하려면 일단 IP주소를 알아야 함
		
		//자바에서 IP주소에 관련된 정보를 가지고 있는 클래스: InetAddress
		//본인의 IP주소를 확인할 수 있는 방법
		
		try {
			System.out.println(InetAddress.getLocalHost().getHostAddress() );
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//통신을 구현하려면 2가지 용어를 알아야 함.
		//1. IP주소 - 그 컴퓨터의 고유한 주소(숫자) : 42억개..
		//2. port번호 - 그 컴퓨터 안에서의 프로그램 분류번호(6.5만개) : 0~1024 사용X (기본 프로그램들이 쓰고 있는 중)
		//ex) -부산항(IP주소), 3번항구(port번호)
		
		//서버용 프로그램을 작성
		//1.[서버소켓]을 만들어 내는 작업
		
		try {
			ServerSocket serverSocket = new ServerSocket(10001); //10001는 포트번호
			//서버소켓 객체 생성
			System.out.println("서버소켓이 생성되었습니다.");
			
			//2. 클라이언트의 접속 기다리기
			System.out.println("클라이언트의 접속을 기다립니다...");
			Socket soc = serverSocket.accept(); //여기서 커서가 대기
			System.out.println( soc.getInetAddress().getHostAddress() + "클라이언트가 접속하셨습니다..");
			
			//3. 데이터를 주고 받을 Stream만들기
			//데이터를 입력받는 스트림 만들기 : Socket에게 Stream을 열어달라고 요청
			//연결된 client소켓과 다리 연결
			InputStream is = soc.getInputStream(); //바이트 스트림을
			InputStreamReader isr = new InputStreamReader(is); //문자스트림으로 변환
			BufferedReader reader = new BufferedReader(isr); //보조 문자 스트림으로 좀 더 쉽게 데이터 읽어오기
			
			//4. 클라이언트와 연결된 Stream을 통해 데이터를 읽어오기
			String msg = reader.readLine(); //클라이언트가 데이터를 보내면 한줄씩 읽어오기.. 여기서  클라이언트가 데이터를 보낼때까지 대기
			System.out.println("받은 데이터: +msg");
			
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
