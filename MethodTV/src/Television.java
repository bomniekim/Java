
public class Television {


	int channel; //ä�ι�ȣ
	int volume;  //����
	boolean onOff; //��������
	
	void print() {
		System.out.println("ä���� "+channel+"�̰� ������ "+volume+"�Դϴ�.");

	}
	
	int getChannel() {
		return channel;
	}
	
	int getVolume() {
		return volume;
	}
	
	void setChannel(int cha) {
		channel =cha;
	}
}

