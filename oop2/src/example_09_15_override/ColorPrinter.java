package example_09_15_override;
/**
 * ������ �÷��� �μ��ϴ� ����� ������ Ŭ������.
 * @author ������
 *
 */
public class ColorPrinter extends Printer {
	/**
	 * �����Ǵ� ���� ��
	 */
	private int colors;
	/**
	 * ������ ���� ���� �����Ѵ�.
	 * @param colors
	 */
	public void setColors(int colors) {
		this.colors = colors;
	}
	/**
	 * ������ ������ �÷��� �μ��Ѵ�.
	 * @param document	����� ����
	 */
	public void printColor(String document) {
		System.out.println("["+ colors + "��][�÷��μ�]" + document);
	}
	
	
	
	
}
