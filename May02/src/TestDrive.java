import java.util.Scanner;

public class TestDrive {
	private static void title() {
		System.out.println("========== ���� ���α׷� ==========\n");
	}

	private static void menu() {
		System.out.println("1. ���� ����");
		System.out.println("2. �� ����");
		System.out.println("3. �ʱ�ȭ");
		System.out.println("4. ���� ����");
		System.out.println("5. ���� ����");
		System.out.println("6. ���� ����");
		System.out.println("7. ������ ����");
		System.out.println("8. ������ ����");
		System.out.println("9. ��� ��");
		System.out.println("0. ����");
		System.out.print("��ȣ�� �Է��Ͻÿ� : ");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator temp, calc = new Calculator();
		int user, max = 0;
		boolean repeat = true;
		title();
		while (repeat) {
			menu();
			user = scan.nextInt();
			switch (user) {
			case 1:
				temp = calc;
				for (int i = 0; i < max; i++) {
					temp = temp.next;
				}
				System.out.print("�ʱⰪ�� �Է��Ͻÿ�(reset=0) : ");
				user = scan.nextInt();
				if (user == 0) {
					temp.next = new Calculator();
				} else {
					System.out.print("0 �̿��� ���� �Է��Ͻÿ� : ");
					temp.next = new Calculator(user, scan.nextInt());
				}
				max++;
				System.out.println(max + "�� ���⸦ �����Ͽ����ϴ�.");
				break;
			case 2:
				System.out.print("���� ��ȣ�� �Է��Ͻÿ�(default=0) : ");
				user = scan.nextInt();
				if (user > max) {
					break;
				} else {
					temp = calc;
				}
				for (int i = 0; i < user; i++) {
					temp = temp.next;
				}
				System.out.print("�ʱⰪ�� �Է��Ͻÿ�(default=0) : ");
				user = scan.nextInt();
				System.out.print("0 �̿��� ���� �Է��Ͻÿ� : ");
				if (user == 0) {
					temp.set(scan.nextInt());
				} else {
					temp.set(user, scan.nextInt());
				}
				break;
			case 3:
				System.out.print("���� ��ȣ�� �Է��Ͻÿ�(default=0) : ");
				user = scan.nextInt();
				if (user > max) {
					break;
				} else {
					temp = calc;
				}
				for (int i = 0; i < user; i++) {
					temp = temp.next;
				}
				temp.reset();
				System.out.println(user + "�� ���⸦ �ʱ�ȭ�Ͽ����ϴ�.");
				break;
			case 4:
				System.out.print("���� ��ȣ�� �Է��Ͻÿ�(default=0) : ");
				user = scan.nextInt();
				if (user > max) {
					break;
				} else {
					temp = calc;
				}
				for (int i = 0; i < user; i++) {
					temp = temp.next;
				}
				System.out.println("��� : " + temp.add());
				break;
			case 5:
				System.out.print("���� ��ȣ�� �Է��Ͻÿ�(default=0) : ");
				user = scan.nextInt();
				if (user > max) {
					break;
				} else {
					temp = calc;
				}
				for (int i = 0; i < user; i++) {
					temp = temp.next;
				}
				System.out.println("��� : " + temp.sub());
				break;
			case 6:
				System.out.print("���� ��ȣ�� �Է��Ͻÿ�(default=0) : ");
				user = scan.nextInt();
				if (user > max) {
					break;
				} else {
					temp = calc;
				}
				for (int i = 0; i < user; i++) {
					temp = temp.next;
				}
				System.out.println("��� : " + temp.mul());
				break;
			case 7:
				System.out.print("���� ��ȣ�� �Է��Ͻÿ�(default=0) : ");
				user = scan.nextInt();
				if (user > max) {
					break;
				} else {
					temp = calc;
				}
				for (int i = 0; i < user; i++) {
					temp = temp.next;
				}
				System.out.println("��� : " + temp.div());
				break;
			case 8:
				System.out.print("���� ��ȣ�� �Է��Ͻÿ�(default=0) : ");
				user = scan.nextInt();
				if (user > max) {
					break;
				} else {
					temp = calc;
				}
				for (int i = 0; i < user; i++) {
					temp = temp.next;
				}
				System.out.println("��� : " + temp.mod());
				break;
			case 9:
				System.out.print("���� ��ȣ�� �Է��Ͻÿ�(default=0) : ");
				user = scan.nextInt();
				if (user > max) {
					break;
				} else {
					temp = calc;
				}
				for (int i = 0; i < user; i++) {
					temp = temp.next;
				}
				System.out.print("�Է��� ���� ������ �Է��Ͻÿ� : ");
				user = scan.nextInt();
				int[] arrs = new int[user];
				System.out.print("���� �Է��Ͻÿ� : ");
				for (int i = 0; i < user; i++) {
					arrs[i] = scan.nextInt();
				}
				System.out.println("��� : " + temp.average(arrs));
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				repeat = false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
			System.out.println();
		}
		scan.close();
	}

}
