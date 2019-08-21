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
		
		//������Ʈ ��ġ�� ���� �߿��� ������ �ϴ� ��ġ������(LayoutManager)
		
		//LayoutManager�� ��ӹ��� Ŭ������
		
		
		//1. FlowLayout : ���� �ܼ��ϰ� ������ ���ʴ�� ������Ʈ�� ��ġ 
		//�� �ٿ� �� �̻� ������ ���ٸ� �ڵ����� ���� �ٿ� ��ġ [JPanel�� �⺻ ��ġ ������]
		
//		FlowLayout flowLayout = new FlowLayout();
//		//��ġ�������� ����: ���İ� ���� ����
//		flowLayout.setAlignment(FlowLayout.LEFT); //�⺻��: CENTER
//		//�츮���� ���� [LEADING==LEFT / TRAILING==RIGHT ]
//		flowLayout.setHgap(10); //horizontal ���򰣰�[�⺻��: 5]
//		flowLayout.setVgap(20); //vertical ��������[�⺻��: 5]
//		
//		
//		//FlowLayout�� JPanel�� ��ġ�����ڷ� ����
//		panel.setLayout(flowLayout);
//	
//		
//		//FlowLayout�� �����ڸ� �̿��Ͽ� �����ϸ鼭 ������ ���� ����
//		panel.setLayout( new FlowLayout(FlowLayout.LEADING, 10, 15));
//		
//		
//		
//		//������Ʈ �߰�
//		//������Ʈ�� ������� ������Ʈ ���� ���빰(Content) [��ư�� �۾�]�� ���� ������ ������� �ڵ� ����
//		//������� ���� ������ �Ұ�
//		panel.add( new JButton("A") );
//		panel.add( new JButton("��ư") );
//		panel.add( new JButton("abcdefghijklmnopqrstuvwxyz") );
//		panel.add( new JButton("Btn2") );
//		panel.add( new JButton("Btn3") );
//		panel.add( new JButton("Btn4") );
//		panel.add( new JButton("Btn5") );
//		panel.add( new JButton("Btn6") );
//		panel.add( new JButton("Btn7") );
		
	
		//2. BorderLayout : �� �� �� �� �߾� [5���� ����]���� ������Ʈ�� �յ��ϰ� ��ġ
	
//		BorderLayout borderLayout = new BorderLayout();
//		//���� ����
//		//set�޼ҵ� �̿�
//		borderLayout.setHgap(10);
//		borderLayout.setVgap(10);
//		panel.setLayout(borderLayout);
//		
//		//�����ڸ޼ҵ� �̿�
//		panel.setLayout( new BorderLayout(15, 15) );
//		
//		//������Ʈ �߰��ϱ� 
//		panel.add( new JButton("A"), BorderLayout.NORTH );
//		panel.add( new JButton("B"), BorderLayout.SOUTH );
//		panel.add( new JButton("C"), BorderLayout.WEST );
//		panel.add( new JButton("D"), BorderLayout.EAST );
//		panel.add( new JButton("E"), BorderLayout.CENTER );
//		panel.add( new JButton("F"), BorderLayout.CENTER ); //���� ������ ��ġ �� �����
//		panel.add( new JButton("G")); //��ġ ���� ���ϸ� �ڵ� CENTER
		

		//3. GridLayout : �յ��ϰ� ���ڸ������ ��ġ
		
//		GridLayout gridLayout = new GridLayout(0, 3); //row(��), column(��)����
//		//row�� ���߾ column�� ����
//		//���� column�� �켱���� �ϰ� �ʹٸ� row�� 0���� �����ϰ� column�� ����
//		
//		//���ݼ���
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
//		panel.add( new JButton("D") ); //������ ������? row���� �켱!(2�� �̻� �� �� ������ ĭ�� �÷�)
		
		
		
		//4. BoxLayout : ���� �Ǵ� ���� �������� ������Ʈ ��ġ
//		BoxLayout boxLayout= new BoxLayout(panel, BoxLayout.Y_AXIS);//Y���ġ - ������ġ
//		panel.setLayout(boxLayout);
//			
//		panel.add(new JButton("btn1"));
//		panel.add(new JButton("btn2"));
//		panel.add(new JButton("btn3"));
//		panel.add(new JButton("btn4"));
//		panel.add(new JButton("btn5"));
//				
//		//������ �Ϸ��� ������Ʈ�� ���� ���ļ����� �ؾ���
//		JButton btn1 = new JButton("A");
//		btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
//
//		JButton btn2 = new JButton("B");
//		btn2.setAlignmentX(Component.RIGHT_ALIGNMENT); //�ٸ� ������Ʈ�� ���Ŀ� �������
//		
//		panel.add(btn1);
//		panel.add(btn2);
		
		
		//5. CardLayout : ������Ʈ�� ���ļ� ��ġ (like ī��ױ�)
//		CardLayout cardLayout = new CardLayout();
//		panel.setLayout(cardLayout);
//		
//		panel.add( new JButton("A"), "1st" ); //���� ���� 
//		panel.add( new JButton("B"), "2nd" ); //A ������ ����
//		panel.add( new JButton("C"), "3rd" ); 
//		panel.add( new JButton("D"), "4th" ); 
//		panel.add( new JButton("E"), "5th" ); 		
//		
//		//���� �� ������Ʈ �����ϱ�
//		cardLayout.next(panel); //B�� ���� ����
//		cardLayout.next(panel); //C�� ���� ����
//		cardLayout.previous(panel); //B�� ���� ����
//		cardLayout.first(panel); //A�� ���� ����
//		cardLayout.last(panel); //E�� ���� ����
//		
//		cardLayout.show(panel, "4th"); //D�� ���� ���� ->���ϴ� �������� �ٷ� ������ �� ����
		
		//�� �۾��� ������ ��ư ó���� �ϴ� ���� �Ϲ���
		
		//6. Absolute Layout(������ġ) : ���̾ƿ� �Ŵ����� �������� �ʴ� �� -> null�� ���� / ������� ���ϴ� ������ �ȼ��� ����
		//������Ʈ�� ��ġ�� x, y ��ǥ������ ��ġ ���� (���� ���ϴ� ��ġ�� ��ġ ����)
		panel.setLayout(null);
		
		JButton b1 = new JButton("A");
		b1.setSize(80, 30); //��ġ�����ڰ� ���� ������ size�� ���� ����
		b1.setLocation(10, 20);
		panel.add(b1);
		
		
		JButton b2 = new JButton("B");
		b2.setBounds(100, 20, 150, 30);
		panel.add(b2);
		
		f.add(panel);
		f.setVisible(true);

		//�������� ���� �Ʒ��� ��ư ��ġ�ϱ�
		JButton b3 = new JButton("C");
		b3.setBounds(0, panel.getHeight()-30, 80, 30);		
		panel.add(b3);
		
		//������Ʈ�� ���� ���� �� ����
		JButton b4 = new JButton("D");
		b4.setBounds(0, 0, 80, 30);		
		panel.add(b4);

	}

}
