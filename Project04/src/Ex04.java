import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ex04 extends JFrame {

	Container ct;
	JPanel panel;
	JCheckBox[] check = new JCheckBox[8];
	JTextField[] field = new JTextField[10];
	JLabel[] label = new JLabel[10];
	JButton btn;

//	각 텍스트 필드 및 라벨의 인덱스 상수 선언
//	Integer.MAX_VALUE는 int형으로 표현 가능한 최대값 (2147483647 = 약 21억)
	int[] num = { Integer.MAX_VALUE, 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };

	public Ex04() {
		this.setTitle("Money Changer with CheckBox");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		ct = this.getContentPane();
		ct.setLayout(null);				// 컨테이너의 레이아웃을 null로 세팅
		ct.setBackground(Color.PINK);	// 컨테이너의 백그라운드 컬러를 핑크색으로 세팅

		panel = new JPanel();			// 체크박스들을 add하는 용도의 패널 객체 생성
		panel.setBounds(250, 72, 21, 196);
		panel.setLayout(new GridLayout(8, 1, 0, 4));	// 8행, 1열, 가로 여백 0px, 세로 여백 4px
		panel.setOpaque(false);			// 패널의 백그라운드를 투명하게 세팅

		btn = new JButton("계산");
		btn.setBounds(250, 30, 75, 25);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = text2num(field[0].getText());	// 사용자가 입력한 값
				int result, div, mod = num[0];			// Integer.MAX_VALUE를 mod의 초기값으로 세팅

				for (int i = 1; i < 10; i++) {
//					만약 현재 인덱스의 체크박스에 체크가 안되어 있으면 현재 인덱스의 텍스트 필드에 "0"을 쓰고 컨티뉴				
					if (i != 9 && !check[i - 1].isSelected()) {
						field[i].setText("0");
						continue;
					}
					div = num[i];		// 현재 인덱스 상수를 div에 대입
					result = (n % mod) / div;			// 사용자가 입력한 값을 mod로 나눈 나머지를 div로 나눈 몫
					field[i].setText(Integer.toString(result));	// 결과 값을 현재 인덱스의 텍스트 필드에 삽입
					mod = num[i];		// 다음에 쓸 용도로 현재 인덱스 상수를 mod에 대입
				}
			}
		});

		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				label[i] = new JLabel("금액");
				label[i].setBounds(50, 30, 50, 25);
				field[i] = new JTextField();
				field[i].setBounds(125, 30, 100, 25);
			} else {
				if (i != 9) {
					check[i - 1] = new JCheckBox();
					check[i - 1].setSelected(true);		// 체크박스들을 체크상태로 초기화
					check[i - 1].setOpaque(false);		// 체크박스들의 백그라운드를 투명하게 세팅
					panel.add(check[i - 1]);
				}
//				label[1]~label[9]에 각각 대응되는 인덱스 상수에 "원"을 붙여서 삽입
				label[i] = new JLabel(Integer.toString(num[i]).concat("원"));
				label[i].setBounds(75, 45 + (i * 25), 50, 25);
				field[i] = new JTextField("0");
				field[i].setBounds(150, 45 + (i * 25), 75, 25);
				field[i].setEditable(false);			// field[1]~field[9]는 사용자가 수정하지 못하게 세팅
			}
//			라벨들은 우측 정렬로 세팅, 텍스트 필드들은 가운데 정렬로 세팅
			label[i].setHorizontalAlignment(JLabel.RIGHT);
			field[i].setHorizontalAlignment(JTextField.CENTER);
			ct.add(label[i]);
			ct.add(field[i]);
		}

		ct.add(btn);
		ct.add(panel);

//		프레임 테두리의 너비 및 높이 : (16px, 38px)
//		실질적인 컨테이너의 사이즈는 (350px, 350px)
		this.setSize(350 + 16, 350 + 38);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex04();
	}

//	인수로 받은 문자열이 모두 숫자로 이루어져 있는지 체크하는 메소드
	private boolean isNum(String str) {
		if (!str.equals("")) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) < '0' || str.charAt(i) > '9') {
					return false;
				}
			}
			return true;
		}
		return false;
	}

//	인수로 받은 문자열이 모두 숫자로 이루어져 있으면 정수형으로 변환하여 반환하고 아니면 0을 반환하는 메소드
	private int text2num(String str) {
		int num = 0;
		if (isNum(str)) {
			num = Integer.parseInt(str);
		}
		return num;
	}

}
