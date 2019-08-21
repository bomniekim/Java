import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ButtonEventTest extends JFrame {

	//������ Component���� ���������� ��������� �ۼ��ϴ� ���� ����
	JLabel label; //��� ��������
	JButton btn; 
	
	public ButtonEventTest() {
		// TODO Auto-generated constructor stub
		setTitle("Button Click Event");
		setSize(500, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		JPanel panel = new JPanel();
		add(panel);

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // ������ġ

		//JLabel label = new JLabel("Hello"); //��������
		label = new JLabel("Hello"); //��������� ����
		label.setAlignmentX(Component.CENTER_ALIGNMENT); // �������

		btn = new JButton("Button"); //��������� ����
		btn.setAlignmentX(Component.CENTER_ALIGNMENT);// ��ư�� �������

		panel.add(label);
		panel.add(btn);

		// ��ư�� �̺�Ʈ(click)�� ��� ������(����Ŀ)��ü ���� �� ��ư�� �ޱ�!
		// ActionListener listener= new ActionListener();
		//error : ActionListener�� interface���� ���� ��ü���� �Ұ�
		// �������̽��� ����Ϸ��� �������̽��� ������(implements) Ŭ������ �����ϰ� �̸� ��ü�� ������ ��
		ClickListener listener = new ClickListener();
		btn.addActionListener(listener);

		//�� ���ó�� ���ο� Ŭ����(ClickListener)�� ����� �۾��� 
		//�������� ���ŷӰ� �������� ������
		//�� ����� ����ؼ� ��ü�� �����ϸ鼭 Ŭ������ �����ϴ�
		//�͸�Ŭ������ ����� (Anonymous class)
		ActionListener listener1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("�͸����ʷ� �ٲٱ�");
			}
		};
		
		btn.addActionListener(listener);
		
	}//constructor

	// �̳� Ŭ���� - �ƿ���Ŭ������ �� Ŭ������ ����� �� ����///////
	// �̳�Ŭ���� �ȿ����� �ƿ����� ����� ������� ����� �� ����
	class ClickListener implements ActionListener {

		// ��ư�� Ŭ���Ǹ� �ڵ����� ����Ǵ� �޼ҵ� : �ݹ�޼ҵ�(call back)
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("clicked!!!");
			System.out.println("a");
			// label.setText(); //error: label�� ���������� �� �˾Ƶ��
			
			//��������� �� label�� �̳�Ŭ�������� ����� �����ϹǷ�
			label.setText("Nice to meet you");
		}

	}//////////////////////////////////////////////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonEventTest();
	}

}//class