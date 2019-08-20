import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. �ֻ��� �����̳� ����
		JFrame f = new JFrame("Swing GUI");
		f.setSize(500, 400);
		
		//�⺻������ JFrame���� BorderLayout�̶�� ��ġ�����ڰ� �����Ǿ� ����
		//But, ���� ����ϱ� ���� ���̾ƿ��Ŵ����� FlowLayout���� ����
		f.setLayout( new FlowLayout() );
		
		//2. ������Ʈ �߰��ϱ�
		JButton b1 = new JButton("A");
		JButton b2 = new JButton("B");
		JButton b3 = new JButton("C");
		
		//�����̳ʿ� �߰�
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		//JLabel :�۾��� �����ִ� ������Ʈ
		JLabel label = new JLabel("This is a Label");
		f.add(label);
		
		
		//JTextField: ����ڷκ��� �۾� �Է¹޴� ������Ʈ
		JTextField tf = new JTextField(20); //�ּ� 20�� ������(�̻��̾ ����! but �ٹٲ��� X)
		f.add(tf);
		
		//�̹��� :�̹����� ������Ʈ�� ����.
		//JLabel�� ������(�̹���)�� ������ �� �ִ� ����� ����-�̸� Ȱ��!
		
		//�̹���������(ImageIcon) ��ü ����
		ImageIcon icon = new ImageIcon("images/rabbit.png");
		
		//�̹��� ������¡
		//�̹��������� ��ü���� ���� �̹��������� ������ �ִ� Image��ü �̾ƿ���
		Image im = icon.getImage();
		//�̾� �� �̹��� ��ü�� ����� ���Ӱ� �����
		Image im2 =im.getScaledInstance(280, 280, Image.SCALE_SMOOTH);
		
		//������ �������� �̹���(im2)�� ������ ���ο� ImageIocn ��ü �ٽ� ����
		ImageIcon icon2 = new ImageIcon(im2);
		
//		JLabel img = new JLabel();
//		img.setIcon(icon);
		
		
		JLabel img = new JLabel();
		f.add(img);
		
		
		
		
		//��ü�� �̹����� �ٷ� ���� �� ��� JLabel������Ʈ�� ����ؼ�  add
		
		JLabel imgLabel = new JLabel();
		imgLabel.setIcon(icon);
		
		f.add(imgLabel);
		
		
		//swing�� frameâ�� x��ư�� ������ �ڵ����� ��������� ���α׷��� ������� ����
		//x��ư�� ������ ���α׷��� ���� ����ǵ��� ����!
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(700, 300); //�������� �»�� ��ǥ(��ġ) ����
		 
		//ȭ�鿡 ���̱�
		f.setVisible(true);
		
	}

}
