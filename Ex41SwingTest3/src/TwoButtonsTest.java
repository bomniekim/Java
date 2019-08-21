import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TwoButtonsTest extends JFrame {

	JLabel label;
	JButton btn1;
	JButton btn2;

	public TwoButtonsTest() {
		// TODO Auto-generated constructor stub
		setTitle("Two Button Event Test");
		setBounds(100, 50, 300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		add(panel);

		label = new JLabel("This is Label....");
		label.setForeground(Color.RED);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setPreferredSize(new Dimension(200, 50));
		panel.add(label, BorderLayout.NORTH);

		btn1 = new JButton("btn1");
		btn2 = new JButton("btn2");

		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout());
		btnPanel.add(btn1);
		btnPanel.add(btn2);

		panel.add(btnPanel, BorderLayout.CENTER);

		// ��ư�鿡 ������ ���̱�!
//		btn1.addActionListener( new ActionListener() {			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				label.setText("Hello world!!");
//			}
//		} );
//		
//		btn2.addActionListener( new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				label.setText("Nice to meet you");
//			}
//		});

		// ��ư�鿡 ������ ��ü�� 1���� �ٿ��� �����ϱ�
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);

	}// constructor

	// Ŭ���� �ȿ� �������
	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Clicked!");

			// � ��ư�� ���������� �˾ƾ� ��ư���� �ٸ� ��� ������ ����

			// �� �޼ҵ��� �Ķ����(�Ű�����)�� ���޵�
			// ActionEvent��ü(�̺�Ʈ�� ������ ������ ����)���� �����
			// �̺�Ʈ�� �߻���Ų Component�� ��������?
			// source���� ������? ��ư�� �����ּҰ� ����

			// JButton btn = (JButton)e.getSource(); //�ٿ�ĳ���� -> ����: return���� Button�� �ƴҼ��� !
			Object obj = e.getSource();

			if (obj instanceof JButton) {
				JButton btn = (JButton) obj; // �ٿ�ĳ����

				// ��ư�� ���ִ� �۾��� ������
				String s = btn.getText();

				if (s.equals("btn1")) {
					label.setText("Hello World");

				} else if (s.equals("btn1")) {
					label.setText("Nice to meet you");
				}
			}

		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TwoButtonsTest();
	}

}
