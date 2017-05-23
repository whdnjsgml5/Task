import java.util.Scanner;

public class TestDrive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DObject head = null, temp = null;
		boolean repeat = true;
		int user, max = -1;

		while (repeat) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			user = scan.nextInt();
			switch (user) {
			case 1:
				System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>>");
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
					System.out.println("잘못된 입력입니다.");
					max--;
					break;
				}
				break;
			case 2:
				System.out.print("삭제할 도형의 위치(head:0)>>");
				user = scan.nextInt();
				if (user > max-- || user < 0) {
					System.out.println("삭제할 수 없습니다.");
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
					System.out.println("리스트가 비어있습니다.");
				} else {
					temp = head;
					while (temp != null) {
						temp.draw();
						temp = temp.next;
					}
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				repeat = false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		scan.close();
	}

}
