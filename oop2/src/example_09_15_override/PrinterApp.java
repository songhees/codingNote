package example_09_15_override;

public class PrinterApp {
	public static void main(String[] args) {
		
	
		Printer printer = new Printer();	// Printer��ü�� �����ϴ� printer���������� ���� 
	
		ColorPrinter colorPrinter = new ColorPrinter();	// ColorPrinter��ü�� �����ϴ� colorPrinter������ ����
		colorPrinter.setColors(256);	// colorPrinter�����ϴ� ��ü�� color������ 256���� ����
		
		PhotoPrinter photoPrinter = new PhotoPrinter(); // PhotoPrinter��ü�� �����ϴ� photoPrinter������ ����
		photoPrinter.setColors(256);	// photoPrinter�� ������ PhotoPrinter�� �θ�ü ColorPrinter�� �޼ҵ�
		//setColors�� ������� colors ������ 256�� �����Ѵ�.
		photoPrinter.setWidth(3);	// photoPrinter�� ������ PhotoPrinter��ü�� setWidth�޼ҵ带 ������� width������ 3�� ���� 
		photoPrinter.setHeight(4);	// photoPrinter�� ������ PhotoPrinter��ü�� setHeight�޼ҵ带 ������� height������ 4�� ����
		
		System.out.println("### Print��ü�� ��±�� ����ϱ�");
		printer.printBlackAndWhite("�ް���û��.hwp");		
		
		System.out.println("### ColorPrint��ü�� ��±�� ����ϱ�");
		colorPrinter.printBlackAndWhite("�����û��.hwp");		//colorPrinter�� �����ϴ� ��ü�� ���� ��ü�� printBlackAndWhite�޼ҵ带 ����
		//�Ͽ� �÷�����Ʈ�� ����� ���
		colorPrinter.printColor("������Ʈ��ǥ�ڷ�.ppt");
		// �÷�����Ʈ�� �÷����
		
		System.out.println("### PhotoPrint��ü�� ��±�� ����ϱ�");
		photoPrinter.printBlackAndWhite("8��������������.xlsx");
		//���������ͷ� ������
		photoPrinter.printColor("8����������.ppt");
		//���������ͷ� �÷����
		photoPrinter.printPhoto("�������.png");
		//���������ͷ� �������
	}	
}
