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

		
		//문자열 데이터를 한 줄씩 또는 한 단어씩 읽거나 쓰려면? 특히, 읽어들일 때
		//기존 바이트 스트림 방식은 InputStream을 통해서 몇 바이트를 읽어야 할 지 파악하기 어려움
		//그래서 조금 더 편한게 문자열 단위로 데이터의 IO를 수행하기 위해서 
		//문자 스트림 방식을 더 선호 (Reader, Writer)
		
		//사용자 입력을 받아 그 데이터를 파일에 지속적으로 저장하는 프로그램
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("저장할 단어 입력(단, no를 입력하면 종료): ");
			String str= scan.next();
			
			if(str.equalsIgnoreCase("no")) {//대소문자 구별없이!
				System.out.println("입력이 종료됩니다.");
				break;
			}
			
			//입력된 문자열 저장을 위해 File객체 생성
			//목표위치:"본인프로젝트폴더/files/data.txt"
			File path = new File("files"); //폴더명만!
			if( !path.exists() ) path.mkdirs();
			
			//경로 + 파일명.확장자
			File file = new File(path, "data.txt");
			
			
			//파일과 연결할 스트림[문자스트림]
			//내 데이터(프로그램)를 파일쪽으로 내보내기 위한 스트림 필요(OutputStream 대신에 Writer)
			//자바문서와 data.txt문서 사이에 무지개로드(FileWriter클래스) 객체 생성
			
			try {
				FileWriter fileWriter = new FileWriter(file, true);
				fileWriter.write(str); //저장은 되지만 단어구분이나 특정 Format으로 저장시키는 것이 까다로움                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
				fileWriter.flush();
				fileWriter.close(); //보조스트림을 닫으면 문자스트림도 같이 close
				
				
				//FileWriter를 바로 사용하기 보다 좀 더 사용하기 편한 방식
				//마치 콘솔창에 데이터 출력하듯, 즉, System.out.print() 이렇게 쓰듯이..
				//할 수 있도록 보조 문자 스트림 클래스가 준비되어 있음
				PrintWriter writer = new PrintWriter(fileWriter);
				writer.println(str);
				writer.flush();
				
				writer.close(); //보조 스트림을 닫으면 문자스트림도 같이 close()됨
				
			} catch (IOException e) {
				System.out.println("파일이 존재하지 않습니다.");

			}
			
		}//while
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("저장된 파일의 데이터들을 화면에 출력합니다.");
		System.out.println("--------------------------------");
		System.out.println();
		
		
		//한 줄에 한 단어씩 저장되어 있으니 읽어들인 단어를 ArrayList에 추가시키기..
		ArrayList<String> data = new ArrayList<String>();
		
		//읽어올 File객체 생성
		File file = new File("files/data.txt");
		
		//읽어올 파일과 스트림 연결 작업의 시작
		
		try {
			FileReader fr = new FileReader(file);
			
			//int a = fr.read(); //한 글자씩 읽기: 영어면 1byte, 한글은 2~3byte가 읽어짐. 언어마다 알아서 바이트 수 결정되어 읽어짐.
			//System.out.println(a);
			//위 방법은 반복문이 필요하여 불편
			
			//그래서 읽어들이기 편하게 보조 문자 스트림 클래스들이 존재함.
			//그 중에서 가장 많이 사용되는 BufferedReader를 사용!
			BufferedReader reader = new BufferedReader(fr);
			//한 줄씩 읽어들이기
			String line = reader.readLine();
			while(line!=null) {
				//읽어 온 데이터를 ArrayList에 추가
				data.add(line);
				
				line= reader.readLine();
			}
			
			System.out.println("파일 읽기 종료!");
			
			//ArrayList에 있는 데이터들(문자열들)을 차례로 출력하기!
			for(int i=0; i<data.size(); i++) {
				System.out.println(i+" : "+data.get(i));
			}
			
			
			//문자스트림 닫기
			reader.close();
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("문서가 존재하지 않습니다.");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("읽는 중에 오류가 발생했습니다.");
		} 
	
		
	}//Main

}//class
