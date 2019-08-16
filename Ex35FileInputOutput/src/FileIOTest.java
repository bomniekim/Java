import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//원본파일의 경로와 파일명, 확장자!
		String srcPath = "D:/files/abc.txt";
		
		try {
			//원본파일을 읽어들일 FileInputStream객체 생성
			FileInputStream fis = new FileInputStream(srcPath); //파일객체 또는 String
			
			//읽어들인 데이터를 저장할 파일의 경로와 파일명 지정
			File dstPath = new File("D:/copy"); //경로만 먼저 확인(지정) : 폴더가 없으면 파일이 만들어지지 않으므로
			if( !dstPath.isDirectory() ) { //경로가 존재하지 않는다면 
				dstPath.mkdirs(); //만들어주세요
				
				//여기까지 왔다면 무조건 copy폴더가 존재한다고 확신할 수 있음.
				//파일명까지 포함한 File객체를 생성
				File dstFile = new File(dstPath, "bbb.txt"); //경로 + 파일명,확장자 - 안정적
				
				//만들어진 목적지 파일까지 연결하는 Stream객체 생성
				FileOutputStream fos = new FileOutputStream(dstFile);
				
				//abc.txt에서 1byte씩 데이터를 읽어와서 곧바로 bbb.txt에 저장!
				while(true) {
					byte b = (byte)fis.read();
					if(b == -1) break;
				
					
					//읽어들인 1byte를 곧바로 목적지 파일로 저장!
					fos.write(b); //1byte씩 쓰기
				}
				
				//파일쓰기가 잘 안될수도 있음.
				fos.flush(); //OutputStream에 남아있는 찌꺼기 내려보내기
				
				//복사가 잘 끝났다!
				fis.close();
				fos.close();
				
				System.out.println("복사가 완료되었습니다.");
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("복사 중에 오류가 발생했습니다.");
		}
		
	}

}
