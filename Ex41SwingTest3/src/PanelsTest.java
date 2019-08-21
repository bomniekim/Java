import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelsTest extends JFrame {

	//������ �޼ҵ�
	
	public PanelsTest() {
		// TODO Auto-generated constructor stub
	
		this.setTitle("Panel Test");
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //JFrame.���� ����
		
		//���� ū �г�
		JPanel rootPanel = new JPanel();
		GridLayout gridLayout = new GridLayout(0, 2);
		gridLayout.setHgap(10);
		rootPanel.setLayout(gridLayout);
		
		//�����г�
		JPanel panelA = new JPanel();
		panelA.setBackground(Color.PINK);
		panelA.setLayout( new FlowLayout() );
		panelA.add( new JButton("A") );
		panelA.add( new JButton("B") );
		panelA.add( new JButton("C") );
		panelA.add( new JButton("D") );
		panelA.add( new JButton("E") );
		panelA.add( new JButton("F") );
		
		
		//�������г�
		JPanel panelB = new JPanel();
		panelB.setBackground(Color.ORANGE);
		panelB.setLayout( new BorderLayout() );
		panelB.add( new JButton("A"), BorderLayout.NORTH );
		panelB.add( new JButton("B"), BorderLayout.SOUTH );
		panelB.add( new JButton("C"), BorderLayout.CENTER );
		
		
		//�����г��� rootPanel�� �߰�
		rootPanel.add(panelA);
		//�������г��� rootPanel�� �߰�
		rootPanel.add(panelB);
		//â ���� ����!
		
		
		rootPanel.setBackground(Color.RED);
		
		add(rootPanel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new  PanelsTest();
		
	}//main

}//JFrame
