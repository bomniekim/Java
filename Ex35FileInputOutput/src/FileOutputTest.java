import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputTest { // Stream: 한쪽 방향의 무지개다리

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 사용자로부터 데이터를 입력받아 File에 저장하는 프로그램

		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 데이터 입력: ");
		String data = sc.next();
		sc.close();

		
		// 데이터를 저장할 파일의 경로와 파일명, 확장자까지 관리해주는 객체 생성
		// File클래스: File생성 및 File에 대한 [정보]를 관리하는 클래스
		// 저장경로를 지정하지 않으면 기본적으로 이 Java문서가 있는 프로젝트 폴더로 경로가 지정됨
		File file = new File("aaa.txt");
		
		//특정폴더 안으로 파일 위치를 지정할 수 있음
		//파일의 경로 구분자는 운영체제마다 다름
		//windows는 역슬래시(\)도 되고 슬래시(/)도 가능
		//리눅스, macOS는 슬래시(/)가 구분자
		//모든 운영체제에서 프로그램이 동작할 수 있도록 슬래시(/)선호
		
		file = new File("kkk\\aaa.txt"); //역슬래시 하나는 escape문자로 인식 -> \\로 써야함
		file = new File("kkk/aaa.txt");
		
		//파일은 자동으로 만들지만 폴더(디렉토리)는 자동으로 만들어 주지 않음
		//즉, kkk라는 폴더가 없으면 error
		
		//프로그램을 통해 폴더를 만들어 달라고 요청할 수 있음
		//우선, 폴더명만으로 File객체를 만들기
		File path = new File("kkk");
		if( !path.isDirectory() ) { //그 폴더가 없어?
			//없다면 디렉토리를 만들기(make)
			path.mkdirs(); //하위폴더가 존재한다면 그 하위폴더까지 모두 만들어줌.
		}
		
		//위에서 만든 경로와 파일명을 결합하여 새로운 File객체 생성
		file = new File(path, "aaa.txt"); //경로 따로/ 파일명 따로 후 결합
		
		//내 프로젝트가 아닌 특정폴더를 직접 바로 지정할 수 있음
		file = new File("D:/aaa.txt");
		
		//경로를 한꺼번에!
		
		path = new File("D:/files/kkk");
		if( !path.isDirectory() ) {
			path.mkdirs();
		}
		
		file = new File(path, "hello.txt");
		
		// 파일객체가 가진 파일에 데이터를 보내기 위해 무지개로드(Stream) 생성
		// Stream중에서 내보내는 방향의 Output Stream을 사용

		
		// 그 중에서 파일에 내보내는 능력을 가진 FileOutputStream클래스를 객체로 생성

		
		try {
			// 만약 aaa.txt문서가 없다면 자동으로 생성! 단, 폴더는 자동으로 생성되지 않음
			//FileOutputStream fos = new FileOutputStream(file); // 위에 생성한 file객체를 받아옴
			//기본적으로 FileOutputStream은 덮어쓰기가 됨(같은 파일명에 저장하면 그 전 내용이 사라짐)
			FileOutputStream fos = new FileOutputStream(file, true); //두 번째 파라미터 : append여부[true, false]
			//true를 쓰면 이어쓰기, false면 덮어쓰기
			
			
			// 스트림을 통해 데이터를 파일에 작성(내보내기)
			fos.write(65); // 데이터에 대한 유니코드 값을 전달
			
//			fos.write(data.charAt(0));
//			fos.write(data.charAt(1));
//			fos.write(data.charAt(2));
//			fos.write(data.charAt(3));
//			fos.write(data.charAt(4));
			//위 방식은 1바이트씩 데이터를 보내기 때문에 반복문이 필요 
			
			//그래서 바이트 배열(byte[])로 데이터덩어리를 보내는 방식을 선호함
			//String객체가 가진 문자열 데이터를 바이트배열로 변환해주는 메소드가 존재
			//String->byte[]로 변환
			
			byte[] bytes = data.getBytes(); //내가 가진 문자열을 바이트 배열로 바꾸어줌
			fos.write(bytes); //바이트들을 한 방에 보내기!
			
			
			
			fos.flush(); //Stream버퍼에 찌꺼기가 남아있을 수 있어서 비우도록 물 내리기!
			
			//언제나 스트림 작업이 끝나면 스트림을 닫는 작업 수행
			fos.close();
			
			//★★★[write->flush->close]★★★
			
			//여기까지 커서가 왔다면 에러가 없었다는 것을 의미함
			//에러나 예외가 있었다면 catch문으로 빠졌겠지..
			System.out.println("파일 저장 성공!");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("쓰기 작업 중 오류가 발생했습니다.");

		}
		
		//File클래스 객체의 주요 메소드
		System.out.println( file.getName() ); //파일명을 알려줌
		System.out.println( file.getPath() ); //파일경로(상대적)를 알려줌
		System.out.println( file.getAbsolutePath() ); //절대경로
		
	}

}
