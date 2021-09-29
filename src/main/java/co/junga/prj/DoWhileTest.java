package co.junga.prj;

import java.util.Scanner;



public class DoWhileTest {
	private Scanner sc = new Scanner(System.in);

	private void mainMenu() {

		System.out.println("================");
		System.out.println("=== 1.�Է��ϱ� ===");
		System.out.println("=== 2.�����ϱ� ===");
		System.out.println("=== 3.��ȸ�ϱ� ===");
		System.out.println("=== 4.�����ϱ� ===");
		System.out.println("================");
		System.out.println("���ϴ� �۾� ��ȣ�� �Է��ϼ���.");
	}

	private void firstMenu() {
		System.out.println("========����� �Է� ȭ���Դϴ�.=======");

		int choice = ScanUtil.readInt("[����] 1.�б�ģ�� 2.���嵿��");
		String name = ScanUtil.readStr("�̸�");
		String tel = ScanUtil.readStr("����ó");
		String address = ScanUtil.readStr("�ּ�");
		SchoolFriend friend = null;
		CompanyFriend friend2 = null;

		if (choice == 1) {
			friend = new SchoolFriend(name, tel, address);

		} else if (choice == 2) {
			friend2 = new CompanyFriend(name, tel, address);
		}
		
		System.out.println("���� �޴��� ���ư����� �ƹ� Ű�� ��������.");
		sc.nextLine();
	}

	private void secondMenu() {
		System.out.println("========����� ���� ȭ���Դϴ�.=======");
		int num = ScanUtil.readInt("������ ��� ����");		
		
		
		System.out.println("���� �޴��� ���ư����� �ƹ� Ű�� ��������.");
		sc.nextLine();
	}

	private void thirdMenu() {
		System.out.println("================================");
		System.out.println("========����� ��ȸ ȭ���Դϴ�.=======");
		System.out.println("���� �޴��� ���ư����� �ƹ� Ű�� ��������.");
		System.out.println("================================");
		sc.nextLine();
	}

	private void endMenu() {
		System.out.println("============GOOD BYE============");
	}

	private void doWhileMenu() {
		boolean b = true; // �ʱ⿡ false�� �����ϰ�

		do {
			mainMenu();
			int key = sc.nextInt();
			sc.nextLine(); // ���� Ŭ���� ����
			switch (key) {
			case 1:
				firstMenu();
				break;
			case 2:
				secondMenu();

				break;
			case 3:
				thirdMenu();
				break;
			case 4:
				endMenu();
				b = false; // true
				break;
			}

		} while (b); // �����ڿ� !b�� �ִ� ���� ������ ����

	}

	public void run() {
		doWhileMenu();
		sc.close();
	}

}
