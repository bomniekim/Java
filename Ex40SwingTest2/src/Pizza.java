import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pizza extends JFrame {
	
	public Pizza() {
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel panel= new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		panel.setBackground(Color.BLACK);
		p1.setBackground(Color.YELLOW);
		p2.setBackground(Color.PINK);
		
		
		JLabel label1 = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ���� ������ �����Ͻʽÿ�.");
		p1.add(label1);
		
		JButton b1 = new JButton("�޺� ����");
		JButton b2 = new JButton("�Ұ�� ����");
		JButton b3 = new JButton("�������� ����");
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		
		
		
		JLabel label2 = new JLabel("����");
		JTextField tf = new JTextField(10);
		p2.add(label2);
		p2.add(tf);

		
		panel.add(p1);
		panel.add(p2);
		add(panel);
		
	}

}

