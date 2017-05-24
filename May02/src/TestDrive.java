import java.util.Scanner;

public class TestDrive {
	private static void title() {
		System.out.println("========== 계산기 프로그램 ==========\n");
	}

	private static void menu() {
		System.out.println("1. 계산기 생성");
		System.out.println("2. 값 세팅");
		System.out.println("3. 초기화");
		System.out.println("4. 덧셈 연산");
		System.out.println("5. 뺄셈 연산");
		System.out.println("6. 곱셈 연산");
		System.out.println("7. 나눗셈 연산");
		System.out.println("8. 나머지 연산");
		System.out.println("9. 평균 값");
		System.out.println("0. 종료");
		System.out.print("번호를 입력하시오 : ");
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
				System.out.print("초기값을 입력하시오(reset=0) : ");
				user = scan.nextInt();
				if (user == 0) {
					temp.next = new Calculator();
				} else {
					System.out.print("0 이외의 값을 입력하시오 : ");
					temp.next = new Calculator(user, scan.nextInt());
				}
				max++;
				System.out.println(max + "번 계산기를 생성하였습니다.");
				break;
			case 2:
				System.out.print("계산기 번호를 입력하시오(default=0) : ");
				user = scan.nextInt();
				if (user > max) {
					break;
				} else {
					temp = calc;
				}
				for (int i = 0; i < user; i++) {
					temp = temp.next;
				}
				System.out.print("초기값을 입력하시오(default=0) : ");
				user = scan.nextInt();
				System.out.print("0 이외의 값을 입력하시오 : ");
				if (user == 0) {
					temp.set(scan.nextInt());
				} else {
					temp.set(user, scan.nextInt());
				}
				break;
			case 3:
				System.out.print("계산기 번호를 입력하시오(default=0) : ");
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
				System.out.println(user + "번 계산기를 초기화하였습니다.");
				break;
			case 4:
				System.out.print("계산기 번호를 입력하시오(default=0) : ");
				user = scan.nextInt();
				if (user > max) {
					break;
				} else {
					temp = calc;
				}
				for (int i = 0; i < user; i++) {
					temp = temp.next;
				}
				System.out.println("결과 : " + temp.add());
				break;
			case 5:
				System.out.print("계산기 번호를 입력하시오(default=0) : ");
				user = scan.nextInt();
				if (user > max) {
					break;
				} else {
					temp = calc;
				}
				for (int i = 0; i < user; i++) {
					temp = temp.next;
				}
				System.out.println("결과 : " + temp.sub());
				break;
			case 6:
				System.out.print("계산기 번호를 입력하시오(default=0) : ");
				user = scan.nextInt();
				if (user > max) {
					break;
				} else {
					temp = calc;
				}
				for (int i = 0; i < user; i++) {
					temp = temp.next;
				}
				System.out.println("결과 : " + temp.mul());
				break;
			case 7:
				System.out.print("계산기 번호를 입력하시오(default=0) : ");
				user = scan.nextInt();
				if (user > max) {
					break;
				} else {
					temp = calc;
				}
				for (int i = 0; i < user; i++) {
					temp = temp.next;
				}
				System.out.println("결과 : " + temp.div());
				break;
			case 8:
				System.out.print("계산기 번호를 입력하시오(default=0) : ");
				user = scan.nextInt();
				if (user > max) {
					break;
				} else {
					temp = calc;
				}
				for (int i = 0; i < user; i++) {
					temp = temp.next;
				}
				System.out.println("결과 : " + temp.mod());
				break;
			case 9:
				System.out.print("계산기 번호를 입력하시오(default=0) : ");
				user = scan.nextInt();
				if (user > max) {
					break;
				} else {
					temp = calc;
				}
				for (int i = 0; i < user; i++) {
					temp = temp.next;
				}
				System.out.print("입력할 값의 갯수를 입력하시오 : ");
				user = scan.nextInt();
				int[] arrs = new int[user];
				System.out.print("값을 입력하시오 : ");
				for (int i = 0; i < user; i++) {
					arrs[i] = scan.nextInt();
				}
				System.out.println("결과 : " + temp.average(arrs));
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				repeat = false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			System.out.println();
		}
		scan.close();
	}

}
