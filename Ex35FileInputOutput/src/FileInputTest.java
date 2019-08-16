import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//읽어 올 파일의 파일명을 가지고 있는 File객체생성
		File file = new File("aaa.txt");
		
		//파일과 연결하는 무지개로드(Stream)
		
		try {
			//파일이 존재하지 않으면 자동 생성 안함! (OutputStream과 다른 점!) -> 예외발생!
			FileInputStream fis = new FileInputStream(file);
			
			//파일에서 데이터 읽어오기!
//			byte b = (byte)fis.read(); //파일에서 1byte를 읽어옴->반복문 필요
//			while( b!=-1 ) { //위에서 read()할 때 읽어 올 데이터가 없다면? -1임
//				System.out.println( (char)b );
//				b= (byte)fis.read(); //다음 바이트 읽어오기
//			}
//			System.out.println();
//			
			//위 방식은 아스키코드로 값을 읽기에 영어문자가 아닌 문자는 올바르게 읽어지지 않음
			
			//1byte씩 읽지 말고 바이트배열(데이터덩어리) 단위로 읽어들이는 방법 선호
			//읽어들인 데이터를 저장할 빈 바이트배열을 먼저 준비해 놓아야 함.
			byte[] bytes = new byte[100]; // 좀 크게 빈 통을 만들기!
			fis.read(bytes); //파라미터로 전달된 배열 안에 읽어온 값들을 넣어줌
			
			//읽어온 바이트배열을 String으로 변환
			String s= new String(bytes);
			System.out.println( s );
			
			
			
			//위 작업이 끝나면 읽기작업이 완료된 것이므로
			System.out.println("파일로드가 완료되었습니다.");
			
			//스트림 닫기
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("읽기 과정 중 오류가 발생했습니다.");	
		}
	}		
}
