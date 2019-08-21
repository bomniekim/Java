//import java.awt.BorderLayout;
//import java.awt.CardLayout;
import java.awt.Color;
//import java.awt.Component;
//import java.awt.FlowLayout;
//import java.awt.GridLayout;
//
//import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f= new JFrame("LayoutManager Test");
		f.setBounds(600, 350, 500, 300);//location + size
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		
		//컴포넌트 배치에 가장 중요한 역할을 하는 배치관리자(LayoutManager)
		
		//LayoutManager를 상속받은 클래스들
		
		
		//1. FlowLayout : 가장 단순하게 옆으로 차례대로 컴포넌트를 배치 
		//한 줄에 더 이상 공간이 없다면 자동으로 다음 줄에 배치 [JPanel의 기본 배치 관리자]
		
//		FlowLayout flowLayout = new FlowLayout();
//		//배치관리자의 설정: 정렬과 간격 지정
//		flowLayout.setAlignment(FlowLayout.LEFT); //기본값: CENTER
//		//우리나라 기준 [LEADING==LEFT / TRAILING==RIGHT ]
//		flowLayout.setHgap(10); //horizontal 수평간격[기본값: 5]
//		flowLayout.setVgap(20); //vertical 수직간격[기본값: 5]
//		
//		
//		//FlowLayout을 JPanel의 배치관리자로 설정
//		panel.setLayout(flowLayout);
//	
//		
//		//FlowLayout의 생성자를 이용하여 생성하면서 설정값 지정 가능
//		panel.setLayout( new FlowLayout(FlowLayout.LEADING, 10, 15));
//		
//		
//		
//		//컴포넌트 추가
//		//컴포넌트의 사이즈는 컴포넌트 안의 내용물(Content) [버튼의 글씨]를 감쌀 정도의 사이즈로 자동 지정
//		//사이즈는 임의 변경이 불가
//		panel.add( new JButton("A") );
//		panel.add( new JButton("버튼") );
//		panel.add( new JButton("abcdefghijklmnopqrstuvwxyz") );
//		panel.add( new JButton("Btn2") );
//		panel.add( new JButton("Btn3") );
//		panel.add( new JButton("Btn4") );
//		panel.add( new JButton("Btn5") );
//		panel.add( new JButton("Btn6") );
//		panel.add( new JButton("Btn7") );
		
	
		//2. BorderLayout : 상 하 좌 우 중앙 [5개의 영역]으로 컴포넌트를 균등하게 배치
	
//		BorderLayout borderLayout = new BorderLayout();
//		//간격 설정
//		//set메소드 이용
//		borderLayout.setHgap(10);
//		borderLayout.setVgap(10);
//		panel.setLayout(borderLayout);
//		
//		//생성자메소드 이용
//		panel.setLayout( new BorderLayout(15, 15) );
//		
//		//컴포넌트 추가하기 
//		panel.add( new JButton("A"), BorderLayout.NORTH );
//		panel.add( new JButton("B"), BorderLayout.SOUTH );
//		panel.add( new JButton("C"), BorderLayout.WEST );
//		panel.add( new JButton("D"), BorderLayout.EAST );
//		panel.add( new JButton("E"), BorderLayout.CENTER );
//		panel.add( new JButton("F"), BorderLayout.CENTER ); //같은 영역에 배치 시 덮어쓰기
//		panel.add( new JButton("G")); //위치 지정 안하면 자동 CENTER
		

		//3. GridLayout : 균등하게 격자모양으로 배치
		
//		GridLayout gridLayout = new GridLayout(0, 3); //row(행), column(열)지정
//		//row에 맞추어서 column은 결정
//		//만약 column을 우선으로 하고 싶다면 row를 0으로 설정하고 column을 지정
//		
//		//간격설정
//		gridLayout.setHgap(10);
//		gridLayout.setVgap(10);
//		panel.setLayout(gridLayout);
//		
//		panel.add( new JButton("A") );
//		panel.add( new JButton("B") );
//		panel.add( new JButton("C") );
//		panel.add( new JButton("A") );
//		panel.add( new JButton("B") );
//		panel.add( new JButton("C") );
//		panel.add( new JButton("D") ); //개수가 많으면? row값이 우선!(2줄 이상 쓸 수 없으니 칸을 늘려)
		
		
		
		//4. BoxLayout : 가로 또는 세로 방향으로 컴포넌트 배치
//		BoxLayout boxLayout= new BoxLayout(panel, BoxLayout.Y_AXIS);//Y축배치 - 수직배치
//		panel.setLayout(boxLayout);
//			
//		panel.add(new JButton("btn1"));
//		panel.add(new JButton("btn2"));
//		panel.add(new JButton("btn3"));
//		panel.add(new JButton("btn4"));
//		panel.add(new JButton("btn5"));
//				
//		//정렬을 하려면 컴포넌트에 직접 정렬설정을 해야함
//		JButton btn1 = new JButton("A");
//		btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
//
//		JButton btn2 = new JButton("B");
//		btn2.setAlignmentX(Component.RIGHT_ALIGNMENT); //다른 컴포넌트의 정렬에 영향받음
//		
//		panel.add(btn1);
//		panel.add(btn2);
		
		
		//5. CardLayout : 컴포넌트를 겹쳐서 배치 (like 카드쌓기)
//		CardLayout cardLayout = new CardLayout();
//		panel.setLayout(cardLayout);
//		
//		panel.add( new JButton("A"), "1st" ); //가장 위에 
//		panel.add( new JButton("B"), "2nd" ); //A 밑으로 쌓음
//		panel.add( new JButton("C"), "3rd" ); 
//		panel.add( new JButton("D"), "4th" ); 
//		panel.add( new JButton("E"), "5th" ); 		
//		
//		//보여 줄 컴포넌트 변경하기
//		cardLayout.next(panel); //B가 가장 위에
//		cardLayout.next(panel); //C가 가장 위에
//		cardLayout.previous(panel); //B가 가장 위로
//		cardLayout.first(panel); //A가 가장 위에
//		cardLayout.last(panel); //E가 가장 위에
//		
//		cardLayout.show(panel, "4th"); //D가 가장 위에 ->원하는 페이지를 바로 보여줄 수 있음
		
		//위 작업은 원래는 버튼 처리로 하는 것이 일반적
		
		//6. Absolute Layout(절대위치) : 레이아웃 매니저를 설정하지 않는 것 -> null값 지정 / 내맘대로 원하는 지점에 픽셀로 지정
		//컴포넌트의 배치를 x, y 좌표값으로 위치 지정 (내가 원하는 위치에 배치 가능)
		panel.setLayout(null);
		
		JButton b1 = new JButton("A");
		b1.setSize(80, 30); //배치관리자가 없기 때문에 size도 직접 설정
		b1.setLocation(10, 20);
		panel.add(b1);
		
		
		JButton b2 = new JButton("B");
		b2.setBounds(100, 20, 150, 30);
		panel.add(b2);
		
		f.add(panel);
		f.setVisible(true);

		//프레임의 왼쪽 아래에 버튼 위치하기
		JButton b3 = new JButton("C");
		b3.setBounds(0, panel.getHeight()-30, 80, 30);		
		panel.add(b3);
		
		//컴포넌트가 겹쳐 보일 수 있음
		JButton b4 = new JButton("D");
		b4.setBounds(0, 0, 80, 30);		
		panel.add(b4);

	}

}
