package co.junga.prj;

import java.util.Scanner;



public class DoWhileTest {
	private Scanner sc = new Scanner(System.in);

	private void mainMenu() {

		System.out.println("================");
		System.out.println("=== 1.입력하기 ===");
		System.out.println("=== 2.수정하기 ===");
		System.out.println("=== 3.조회하기 ===");
		System.out.println("=== 4.종료하기 ===");
		System.out.println("================");
		System.out.println("원하는 작업 번호를 입력하세요.");
	}

	private void firstMenu() {
		System.out.println("========여기는 입력 화면입니다.=======");

		int choice = ScanUtil.readInt("[선택] 1.학교친구 2.직장동료");
		String name = ScanUtil.readStr("이름");
		String tel = ScanUtil.readStr("연락처");
		String address = ScanUtil.readStr("주소");
		SchoolFriend friend = null;
		CompanyFriend friend2 = null;

		if (choice == 1) {
			friend = new SchoolFriend(name, tel, address);

		} else if (choice == 2) {
			friend2 = new CompanyFriend(name, tel, address);
		}
		
		System.out.println("메인 메뉴로 돌아가려면 아무 키나 누르세요.");
		sc.nextLine();
	}

	private void secondMenu() {
		System.out.println("========여기는 수정 화면입니다.=======");
		int num = ScanUtil.readInt("수정할 사람 선택");		
		
		
		System.out.println("메인 메뉴로 돌아가려면 아무 키나 누르세요.");
		sc.nextLine();
	}

	private void thirdMenu() {
		System.out.println("================================");
		System.out.println("========여기는 조회 화면입니다.=======");
		System.out.println("메인 메뉴로 돌아가려면 아무 키나 누르세요.");
		System.out.println("================================");
		sc.nextLine();
	}

	private void endMenu() {
		System.out.println("============GOOD BYE============");
	}

	private void doWhileMenu() {
		boolean b = true; // 초기에 false로 설정하고

		do {
			mainMenu();
			int key = sc.nextInt();
			sc.nextLine(); // 버퍼 클리어 역할
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

		} while (b); // 비교인자에 !b를 넣는 것이 보통의 관례

	}

	public void run() {
		doWhileMenu();
		sc.close();
	}

}
