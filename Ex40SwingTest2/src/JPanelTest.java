import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTest {
	//최상위 Container(JFrame)에 직접 컴포넌트들(JButton, JLabel 등)을 추가하는 방식은 선호되지 않음
	//일반 Container인 JPanel(패널)을 이용
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame("Panel Test");
		f.setSize(500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프레임에 포함될 일반 컨테이너(컴포넌트를 담을 수 있는) 객체 생성
		JPanel panel= new JPanel();
		
		//패널에 붙일 컴포넌트 생성 및 추가
		JButton btn = new JButton();
		btn.setText("A");
		
		JButton btn2 = new JButton("B");
		
		
		//패널에 컴포넌트 붙이기
		//JPanel은 별도의 설정 없이도 기본적으로 배치 관리자 (LayoutManager)가 FlowLayout임
		//JFrame은 기본 배치 관리자가 BorderLayout임 (서로 다름!)
		panel.add(btn);
		panel.add(btn2);
		panel.add( new JButton("C") ); //add하면서 바로 new
		panel.add( new JButton("한글도 가능") ); //add하면서 바로 new
		panel.add( new JButton("버튼") ); //add하면서 바로 new
		panel.add( new JButton("Oh Shit It's Monday") ); //add하면서 바로 new
		//가로 길이보다 많아지면 자동 줄바꿈 배치
		panel.add( new JButton("Button5") ); //add하면서 바로 new
		
		//프레임에 패널 붙이기
		f.add(panel); 
		
		//만약 프레임에 또 다른 패널을 붙인다면?
		JPanel panel2 = new JPanel();
		panel2.add(new JButton("abc"));
		panel2.add(new JButton("def"));
		
		//프레임에 두번째 패널 붙이기
		f.add(panel2);
		//JFrame은 기본적으로 BorderLayout이라는 기본 배치 관리자를 사용하고 있기에 
		//BorderLayout은 별도의 추가적인 위치지정이 없다면 자동 Center배치
		//그래서 두 개의 패널(panel과 panel2)이 겹쳐지는 것
		//그러면 JFraem의 기본 배치관리자를 변경해보자
		f.setLayout( new FlowLayout() );
		f.setLayout( new GridLayout(1, 2) ); //row(줄), column(칸)

		
		//패널의 배경색 설정
		panel.setBackground(Color.YELLOW);
		panel2.setBackground(Color.PINK);
		
		//화면을 꾸미는 데 있어서 가장 중요한 것은 배치관리자!
		
		
		
		f.setVisible(true);
	}

}
