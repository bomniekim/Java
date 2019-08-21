import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelsTest extends JFrame {

	//생성자 메소드
	
	public PanelsTest() {
		// TODO Auto-generated constructor stub
	
		this.setTitle("Panel Test");
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //JFrame.생략 가능
		
		//가장 큰 패널
		JPanel rootPanel = new JPanel();
		GridLayout gridLayout = new GridLayout(0, 2);
		gridLayout.setHgap(10);
		rootPanel.setLayout(gridLayout);
		
		//왼쪽패널
		JPanel panelA = new JPanel();
		panelA.setBackground(Color.PINK);
		panelA.setLayout( new FlowLayout() );
		panelA.add( new JButton("A") );
		panelA.add( new JButton("B") );
		panelA.add( new JButton("C") );
		panelA.add( new JButton("D") );
		panelA.add( new JButton("E") );
		panelA.add( new JButton("F") );
		
		
		//오른쪽패널
		JPanel panelB = new JPanel();
		panelB.setBackground(Color.ORANGE);
		panelB.setLayout( new BorderLayout() );
		panelB.add( new JButton("A"), BorderLayout.NORTH );
		panelB.add( new JButton("B"), BorderLayout.SOUTH );
		panelB.add( new JButton("C"), BorderLayout.CENTER );
		
		
		//왼쪽패널을 rootPanel에 추가
		rootPanel.add(panelA);
		//오른쪽패널을 rootPanel에 추가
		rootPanel.add(panelB);
		//창 분할 가능!
		
		
		rootPanel.setBackground(Color.RED);
		
		add(rootPanel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new  PanelsTest();
		
	}//main

}//JFrame
