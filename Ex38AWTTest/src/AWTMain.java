import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ֻ��� �����̳� ��ü ����
		Frame f = new Frame("AWT GUI");
		f.setSize(500, 400);
		
		
		//x��ư�� Ŭ���ص� �ڵ����� ������ ����
		//X��ư�� ������ �� �����ϴ� �ڵ�
		
		
		WindowAdapter adapter = new WindowAdapter() {
			//Frame�� x��ư�� Ŭ���ϸ� �ڵ����� ����Ǵ� �޼ҵ� : �ݹ�޼ҵ�
			@Override
			public void windowClosing(WindowEvent e) {
				//�� ������(f)�� ���ֱ�!
				f.dispose();
			}
		};
		
		
		f.addWindowListener(adapter); //�������� ���¸� ��� �޼ҵ�
		
		//�����̳� �ȿ� ������ component(�������)���� �߰��ϱ�
		
		//������Ʈ ����
		Button btn = new Button("Ȯ��");
		Button btn2 = new Button("���");
		Button btn3 = new Button("Hello World");
		//btn3�� Ŭ������ �� ��ư�� �����ִ� �۾� �����غ���!
		//btn3 ��ü�� Ŭ���Ǿ��� ���� �ٶ󺸰�(���) �ִ� ��ü ���� �� �ٿ��ֱ� 
		btn3.addActionListener( new ActionListener() {
			
			//��ư�� Ŭ���Ǹ� �ڵ����� ȣ��Ǵ� �޼ҵ� : �ݹ�޼ҵ�
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btn3.setLabel("Nice Java");
			}
		});
		
		
		//������Ʈ ��ġ�� ��� �� �� �����ϴ� LayoutManager(��ġ������)��ü ����
		FlowLayout fl = new FlowLayout(); //������Ʈ�� ���ʷ� ������ ��ġ
		f.setLayout(fl);
		
		
		
		//������� ��ư�� �����̳�(Frame)�� �߰�!
		f.add(btn);
		f.add(btn2);
		f.add(btn3);
		
		
		
		
		//ȭ�鿡 �����ִ� �ɷ��� ����
		f.setVisible(true);
	}

}
