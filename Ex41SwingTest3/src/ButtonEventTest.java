import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ButtonEventTest extends JFrame {

	//가급적 Component들의 참조변수는 멤버변수로 작성하는 것을 권장
	JLabel label; //멤버 참조변수
	JButton btn; 
	
	public ButtonEventTest() {
		// TODO Auto-generated constructor stub
		setTitle("Button Click Event");
		setSize(500, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		JPanel panel = new JPanel();
		add(panel);

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // 수직배치

		//JLabel label = new JLabel("Hello"); //지역변수
		label = new JLabel("Hello"); //멤버변수에 대입
		label.setAlignmentX(Component.CENTER_ALIGNMENT); // 가운데정렬

		btn = new JButton("Button"); //멤버변수에 대입
		btn.setAlignmentX(Component.CENTER_ALIGNMENT);// 버튼도 가운데정렬

		panel.add(label);
		panel.add(btn);

		// 버튼의 이벤트(click)를 듣는 리스너(스토커)객체 생성 및 버튼에 달기!
		// ActionListener listener= new ActionListener();
		//error : ActionListener는 interface여서 직접 객체생성 불가
		// 인터페이스를 사용하려면 인터페이스를 구현한(implements) 클래스를 정의하고 이를 객체로 만들어야 함
		ClickListener listener = new ClickListener();
		btn.addActionListener(listener);

		//위 방식처럼 새로운 클래스(ClickListener)를 만드는 작업은 
		//생각보다 번거롭고 가독성이 떨어짐
		//위 방식을 대신해서 객체를 생성하면서 클래스를 정의하는
		//익명클래스를 사용함 (Anonymous class)
		ActionListener listener1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("익명리스너로 바꾸기");
			}
		};
		
		btn.addActionListener(listener);
		
	}//constructor

	// 이너 클래스 - 아우터클래스만 이 클래스를 사용할 수 있음///////
	// 이너클래스 안에서는 아우터의 멤버를 마음대로 사용할 수 있음
	class ClickListener implements ActionListener {

		// 버튼이 클릭되면 자동으로 실행되는 메소드 : 콜백메소드(call back)
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("clicked!!!");
			System.out.println("a");
			// label.setText(); //error: label이 지역변수라서 못 알아들어
			
			//멤버변수로 된 label은 이너클래스에서 사용이 가능하므로
			label.setText("Nice to meet you");
		}

	}//////////////////////////////////////////////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonEventTest();
	}

}//class