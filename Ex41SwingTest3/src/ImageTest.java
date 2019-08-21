import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageTest extends JFrame {

	//������ ������Ʈ�� ���������!
	JLabel label; 
	
	int index=12; //�̹�����ȣ
	
	
	public ImageTest() {
		// TODO Auto-generated constructor stub
		setTitle("Image Test");
		setSize(350, 500);
		setLocation(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		
		//Swing���� �̹����� �����ִ� ������Ʈ�� ���
		//JLabel�� ������ �����ִ� ����� ��� �����
		
		label = new JLabel();
		//�̹����� ������ �ִ� Image��ü�� �ְ� Image��ü�� ����
		//ImageIcon��ü�� ������ JLabel�� �����ִ� ���� ����
		ImageIcon icon = new ImageIcon("images/dao.png");
		
		//�̹����� ���������� ������� ��������⿡
		//���ϴ� ������� resizing!
		
//		Image img = icon.getImage(); //�̹�����ü �̾ƿ���
//		img = img.getScaledInstance(256, 256, Image.SCALE_SMOOTH);//�� �������� ������
//		icon = new ImageIcon(img); //���� �ִ��� ������ ���ο� ��ü�� ����Ű�Բ�

		//�� �����ϰ�
		icon = new ImageIcon(icon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));

		label.setIcon(icon);
		panel.add(label);
		
		//��ư�� �̹��� ������ �߰��ϱ�!
		JButton btn = new JButton("�̹��� ��ư");
		ImageIcon btnIcon = new ImageIcon("images/button blue alt.png");
		btn.setIcon(btnIcon);
		
		//��ư�� �̹����� ���̰� �ϰ� �ʹٸ�? ��ư�� ��� �̹����� ���ֱ�
		btn.setContentAreaFilled(false); //������ ������ ä���� �ʰڴ�! �׶��̼� ���ֱ�
		btn.setBorder( BorderFactory.createEmptyBorder() ); //��輱 ����
		
		panel.add(btn);
		
		
		//��ư Ŭ���� �����ϴ� Listener�߰�
		btn.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//�̹��� �����ϱ�
				index++;
				if(index>21) index=12;
				
				ImageIcon icon = new ImageIcon("images/ms"+ index + ".png");
				icon = new ImageIcon(icon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
				label.setIcon(icon);
				
			}
		});
		
		
		
		add(panel);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageTest();
	}

}
