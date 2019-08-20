import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTest {
	//�ֻ��� Container(JFrame)�� ���� ������Ʈ��(JButton, JLabel ��)�� �߰��ϴ� ����� ��ȣ���� ����
	//�Ϲ� Container�� JPanel(�г�)�� �̿�
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame("Panel Test");
		f.setSize(500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�����ӿ� ���Ե� �Ϲ� �����̳�(������Ʈ�� ���� �� �ִ�) ��ü ����
		JPanel panel= new JPanel();
		
		//�гο� ���� ������Ʈ ���� �� �߰�
		JButton btn = new JButton();
		btn.setText("A");
		
		JButton btn2 = new JButton("B");
		
		
		//�гο� ������Ʈ ���̱�
		//JPanel�� ������ ���� ���̵� �⺻������ ��ġ ������ (LayoutManager)�� FlowLayout��
		//JFrame�� �⺻ ��ġ �����ڰ� BorderLayout�� (���� �ٸ�!)
		panel.add(btn);
		panel.add(btn2);
		panel.add( new JButton("C") ); //add�ϸ鼭 �ٷ� new
		panel.add( new JButton("�ѱ۵� ����") ); //add�ϸ鼭 �ٷ� new
		panel.add( new JButton("��ư") ); //add�ϸ鼭 �ٷ� new
		panel.add( new JButton("Oh Shit It's Monday") ); //add�ϸ鼭 �ٷ� new
		//���� ���̺��� �������� �ڵ� �ٹٲ� ��ġ
		panel.add( new JButton("Button5") ); //add�ϸ鼭 �ٷ� new
		
		//�����ӿ� �г� ���̱�
		f.add(panel); 
		
		//���� �����ӿ� �� �ٸ� �г��� ���δٸ�?
		JPanel panel2 = new JPanel();
		panel2.add(new JButton("abc"));
		panel2.add(new JButton("def"));
		
		//�����ӿ� �ι�° �г� ���̱�
		f.add(panel2);
		//JFrame�� �⺻������ BorderLayout�̶�� �⺻ ��ġ �����ڸ� ����ϰ� �ֱ⿡ 
		//BorderLayout�� ������ �߰����� ��ġ������ ���ٸ� �ڵ� Center��ġ
		//�׷��� �� ���� �г�(panel�� panel2)�� �������� ��
		//�׷��� JFraem�� �⺻ ��ġ�����ڸ� �����غ���
		f.setLayout( new FlowLayout() );
		f.setLayout( new GridLayout(1, 2) ); //row(��), column(ĭ)

		
		//�г��� ���� ����
		panel.setBackground(Color.YELLOW);
		panel2.setBackground(Color.PINK);
		
		//ȭ���� �ٹ̴� �� �־ ���� �߿��� ���� ��ġ������!
		
		
		
		f.setVisible(true);
	}

}
