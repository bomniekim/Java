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

		// 버튼들에 리스너 붙이기!
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

		// 버튼들에 리스너 객체를 1개만 붙여서 공유하기
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);

	}// constructor

	// 클래스 안에 멤버변수
	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Clicked!");

			// 어떤 버튼이 눌러졌는지 알아야 버튼마다 다른 명령 실행이 가능

			// 이 메소드의 파라미터(매개변수)로 전달된
			// ActionEvent객체(이벤트의 정보를 가지고 있음)에게 물어보기
			// 이벤트를 발생시킨 Component가 누구인지?
			// source원이 누구야? 버튼의 참조주소가 리턴

			// JButton btn = (JButton)e.getSource(); //다운캐스팅 -> 위험: return값이 Button이 아닐수도 !
			Object obj = e.getSource();

			if (obj instanceof JButton) {
				JButton btn = (JButton) obj; // 다운캐스팅

				// 버튼에 써있는 글씨를 얻어오기
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
