package example_09_24_abstract_template;

public class TransferJob extends AbstractBankingJob{
	// AbstractBankingJob�� �߻�ȭ�Ǿ� �ִ� job()�� �����Ѵ�.
	@Override
	public void job() {
		System.out.println("ī�带 �����ϼ���.");
		System.out.println("���� ���¹�ȣ�� �Է��ϼ���: 110-11-100001");
		System.out.println("��ü�ݾ��� �Է��ϼ���: 2,000,000��");
		System.out.println("��й�ȣ�� �Է��ϼ���: *****");
		System.out.println("��üó�� �� .....");
		System.out.println("��üó���� �Ϸ�Ǿ����ϴ�.");
	}
	
	
}
