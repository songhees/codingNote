package example_09_23_Interface;
/**
 * ��� �ڵ��� ��ü�� �ݵ�� ������ ����� �����ϴ� �������̽�. <br/>
 * ��� �ڵ����� ���, ����, �ӵ�����, �ӵ���ȸ ����� �־�� �Ѵ�.
 * @author ������
 *
 */
public interface Car {
	
	//  ��� �����ϱ�
	/*
	 *  ����� ������ �ʴ� ���� ����Ҵ�.
	 *  ����� public static final Ű���带 �����Ѵ�.
	 *	����� �̸��� ���� �빮�ڷ� ����, �� �ܾ��̻��� ���� _�� �����Ѵ�.
	 *	�������̽������� public static final�� ������ �� �ִ�.  
	 */
	/*public static final*/ int MIN_SPEED = 0;		//���� ����
	public static final int MAX_SPEED = 200;
	
	// �� �������̽��� �����ϴ� ����Ŭ������ �ݵ�� �������� ����� �߻�޼ҵ�� �����Ѵ�.
	
	// �����ΰ� ���� �߻�޼ҵ� �����ϱ�
	/*
	 * �߻�޼ҵ�� �����ΰ� ���� �޼ҵ��
	 * �߻�޼ҵ�� abstractŰ���带 �����ؾ� �Ѵ�.
	 * �������̽������� public abstract�� ������ �� �ִ�.
	 */
	public abstract void start();		//�߻� �޼ҵ�
	public abstract void stop();		
	/*public abstract*/ void speedUp();	//�������̽��� ��� �߻�޼ҵ��̱� ������ ��������
	/*public abstract*/ void speedDown();
	/*public abstract*/ int getCurrentSpeed();
	
	
	
}
