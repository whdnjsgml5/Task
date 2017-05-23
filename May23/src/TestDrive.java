import java.util.Scanner;

public class TestDrive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DObject head = null, temp = null;
		boolean repeat = true;
		int user, max = -1;

		while (repeat) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			user = scan.nextInt();
			switch (user) {
			case 1:
				System.out.print("���� ���� Line(1), Rect(2), Circle(3)>>");
				user = scan.nextInt();
				max++;
				switch (user) {
				case 1:
					if (head == null) {
						head = new Line();
					} else {
						temp = head;
						while (temp.next != null) {
							temp = temp.next;
						}
						temp.next = new Line();
					}
					break;
				case 2:
					if (head == null) {
						head = new Rect();
					} else {
						temp = head;
						while (temp.next != null) {
							temp = temp.next;
						}
						temp.next = new Rect();
					}
					break;
				case 3:
					if (head == null) {
						head = new Circle();
					} else {
						temp = head;
						while (temp.next != null) {
							temp = temp.next;
						}
						temp.next = new Circle();
					}
					break;
				default:
					System.out.println("�߸��� �Է��Դϴ�.");
					max--;
					break;
				}
				break;
			case 2:
				System.out.print("������ ������ ��ġ(head:0)>>");
				user = scan.nextInt();
				if (user > max-- || user < 0) {
					System.out.println("������ �� �����ϴ�.");
					max++;
				} else if (user == 0) {
					head = head.next;
				} else {
					temp = head;
					for (int i = 1; i < user; i++) {
						temp = temp.next;
					}
					temp.next = temp.next.next;
				}
				break;
			case 3:
				if (head == null) {
					System.out.println("����Ʈ�� ����ֽ��ϴ�.");
				} else {
					temp = head;
					while (temp != null) {
						temp.draw();
						temp = temp.next;
					}
				}
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				repeat = false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
		scan.close();
	}

}
