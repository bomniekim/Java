import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		f.setSize(300, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("�µ���ȯ��");
		
		JPanel panel = new JPanel();
		
		JLabel l1 = new JLabel("ȭ�� �µ�");		
		JTextField tf1 = new JTextField(15);
		System.out.println();
		JLabel l2 = new JLabel("���� �µ�");
		JTextField tf2 = new JTextField(15);
		
		JButton btn = new JButton("��ȯ");
		
		panel.add(l1);
		panel.add(l2);
		panel.add(tf1);
		panel.add(tf2);
		panel.add(btn);
		
		f.add(panel);
		
		f.setVisible(true);
	}

}
