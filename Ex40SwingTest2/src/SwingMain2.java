import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SwingMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Frame만드는 방법 3가지
		//방법1. 객체를 생성 후 직접 메소드들을 호출해서 설정하는 방식!
		JFrame f = new JFrame();
		int garo=300;
		int sero=200;
		f.setSize(garo, sero);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//방법2. JFrame을 상속받은 별도의 클래스를 정의하고 이를 객체로 만들어서 
		//그 클래스의 생상자 안에 설정작업을 완료!
		
		//TestFrame fr = new TestFrame(); //new할때 생성자 메소드 실행됨
		
		
		//방법3. main()메소드를 보유한 Main class도 클래스니깐 활용해보자!
		//JFrame을 상속받고 main()메소드도 보유한 MyFrame생성
		//[가장 많이 선호되는 방식]

		
		
		//<JFrame의 유용한 메소드들>
		
		//1. x버튼 클릭 시의 프로그램 종료 설정
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JFrame.HIDE_ON_CLOSE: 기본값 - 종료 시 프레임만 숨겨지고 프로그램은 끝나지 않음
		//JFrame.DO_NOTHING_ON_CLOSE: 아무 반응 없는 것 (AWT의 Frame)
		//JFrame.EXIT_ON_CLOSE: 프레임 종료 시 프로그램도 종료
		//JFrame.DISPOSE_ON_CLOSE: 프레임 종료와 프로그램 종료가 별개로 됨
			
		//2. 프레임이 화면에 나타나는 위치 
		f.setLocation(700, 200); //프레임의 좌상단 좌표
		
		//2-1. 프레임을 화면의 정가운데로 정렬 (고려할 점: 모니터의 사이즈)
		
		//모니터 해상도 얻어오기
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //Toolkit객체 얻어오기(new아니야!):OS의 능력을 사용할 수 있는 대리인
		Dimension screenSize = toolkit.getScreenSize();
		
		int width = (int)screenSize.getWidth();//getWidth의 자료형이 double이므로 int로 형 변환
		int height = (int)screenSize.getHeight();//getWidth의 자료형이 double이므로 int로 형 변환

		System.out.println(width+" * "+height); // 1920 * 1080
		
		f.setLocation(width/2-garo/2, height/2-sero/2); //정가운데에 위치 
		
		
		//3. Location + Size 한 번에 설정
		f.setBounds(150, 250, 500, 300); //x, y, Width, Height
		
		//4. 프레임의 사이즈 조절 허용여부
		f.setResizable(false); //사이즈 고정 - 기본:true
		
		//5. 프레임이 가려지지 않도록 제일 앞으로 배치
		f.setAlwaysOnTop(true); 
		
		
		//6. 프레임 타이틀(제목)
		f.setTitle("JFrame Test");
		
		//7. 프레임 아이콘 변경
		Image img = toolkit.getImage("images/uni.png");
		f.setIconImage(img);
		
		
		//8. 컴포넌트 추가
		JButton btn = new JButton("Button");
		f.add(btn);
		
		f.setVisible(true);
		
		//2초 후에 컴포넌트 제거되도록
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//9. 컴포넌트 제거
		f.remove(btn);
		
		//10. 컴포넌트의 변경을 적용하려면 화면을 갱신하는 기능 필요
		//f.repaint(); //다시 그려!
		SwingUtilities.updateComponentTreeUI(f);
		//컴포넌트 트리구조의 변경을 업데이트하는 메소드로서 repaint()와 같은 효과를 가짐
		
		
		//최상위 Container(JFrame)에 직접 컴포넌트들(JButton, JLabel 등)을 추가하는 방식은 선호되지 않음
		//일반 Container인 JPanel(패널)을 이용
		
	}

}//Main class


class TestFrame extends JFrame{
	
	//생성자 메소드
	public TestFrame() {
		
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		//this.은 생략가능
	}
}