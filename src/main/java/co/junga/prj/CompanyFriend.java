package co.junga.prj;

public class CompanyFriend extends Friend {

	public CompanyFriend(String name, String tel, String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	@Override
	public void friendPrint() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + tel);
		System.out.println("�ּ� : " + address);
		System.out.println("���� : ���嵿��");

	}

}