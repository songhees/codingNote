package example_09_15_override;
/**
 * ���� �μ� ����� �����ϴ� Ŭ����
 * @param image
 */
public class PhotoPrinter extends ColorPrinter {
	/**
	 * ������ �ʺ�
	 */
	private int width;
	/**
	 * ������ ����
	 */
	private int height;
	/**
	 * ������ �ʺ� ������ �ʺ�� �����Ѵ�.
	 * @param width	������ ���ι��� ũ��
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * ������ ���̸� ������ ���̷� �����Ѵ�.
	 * @param height ������ ���ι��� ũ��
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * ������ �̹����� �������� ����Ѵ�.
	 * @param image �̹���
	 */
	public void printPhoto(String image) {
		System.out.println(width + "x" + height + "ũ�� [���� �μ�] " + image);
	}
}