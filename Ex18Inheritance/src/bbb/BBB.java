package bbb;

import aaa.AAA;
//��ӹ��� ���� �ٸ� ��Ű���� Ŭ������ ��Ű���� .�� �ؾ���
public class BBB extends AAA{

	//����� �޾����Ƿ� �̹� ��������� 4�� ������.
	
	void show() {
		//System.out.println(a); //��ӹ޾Ҵ��� �θ��� private����� ���Ұ�
		//System.out.println(b); //default ���� �����ڴ� �ٸ� ��Ű�������� ���Ұ�
		System.out.println(c); //protected�� ��Ű���� �޶� ��Ӱ����� ��밡��
		System.out.println(d); //public�� ������ ��� ����
	}
}
