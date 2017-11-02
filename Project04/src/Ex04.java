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

//	�� �ؽ�Ʈ �ʵ� �� ���� �ε��� ��� ����
//	Integer.MAX_VALUE�� int������ ǥ�� ������ �ִ밪 (2147483647 = �� 21��)
	int[] num = { Integer.MAX_VALUE, 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };

	public Ex04() {
		this.setTitle("Money Changer with CheckBox");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		ct = this.getContentPane();
		ct.setLayout(null);				// �����̳��� ���̾ƿ��� null�� ����
		ct.setBackground(Color.PINK);	// �����̳��� ��׶��� �÷��� ��ũ������ ����

		panel = new JPanel();			// üũ�ڽ����� add�ϴ� �뵵�� �г� ��ü ����
		panel.setBounds(250, 72, 21, 196);
		panel.setLayout(new GridLayout(8, 1, 0, 4));	// 8��, 1��, ���� ���� 0px, ���� ���� 4px
		panel.setOpaque(false);			// �г��� ��׶��带 �����ϰ� ����

		btn = new JButton("���");
		btn.setBounds(250, 30, 75, 25);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = text2num(field[0].getText());	// ����ڰ� �Է��� ��
				int result, div, mod = num[0];			// Integer.MAX_VALUE�� mod�� �ʱⰪ���� ����

				for (int i = 1; i < 10; i++) {
//					���� ���� �ε����� üũ�ڽ��� üũ�� �ȵǾ� ������ ���� �ε����� �ؽ�Ʈ �ʵ忡 "0"�� ���� ��Ƽ��				
					if (i != 9 && !check[i - 1].isSelected()) {
						field[i].setText("0");
						continue;
					}
					div = num[i];		// ���� �ε��� ����� div�� ����
					result = (n % mod) / div;			// ����ڰ� �Է��� ���� mod�� ���� �������� div�� ���� ��
					field[i].setText(Integer.toString(result));	// ��� ���� ���� �ε����� �ؽ�Ʈ �ʵ忡 ����
					mod = num[i];		// ������ �� �뵵�� ���� �ε��� ����� mod�� ����
				}
			}
		});

		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				label[i] = new JLabel("�ݾ�");
				label[i].setBounds(50, 30, 50, 25);
				field[i] = new JTextField();
				field[i].setBounds(125, 30, 100, 25);
			} else {
				if (i != 9) {
					check[i - 1] = new JCheckBox();
					check[i - 1].setSelected(true);		// üũ�ڽ����� üũ���·� �ʱ�ȭ
					check[i - 1].setOpaque(false);		// üũ�ڽ����� ��׶��带 �����ϰ� ����
					panel.add(check[i - 1]);
				}
//				label[1]~label[9]�� ���� �����Ǵ� �ε��� ����� "��"�� �ٿ��� ����
				label[i] = new JLabel(Integer.toString(num[i]).concat("��"));
				label[i].setBounds(75, 45 + (i * 25), 50, 25);
				field[i] = new JTextField("0");
				field[i].setBounds(150, 45 + (i * 25), 75, 25);
				field[i].setEditable(false);			// field[1]~field[9]�� ����ڰ� �������� ���ϰ� ����
			}
//			�󺧵��� ���� ���ķ� ����, �ؽ�Ʈ �ʵ���� ��� ���ķ� ����
			label[i].setHorizontalAlignment(JLabel.RIGHT);
			field[i].setHorizontalAlignment(JTextField.CENTER);
			ct.add(label[i]);
			ct.add(field[i]);
		}

		ct.add(btn);
		ct.add(panel);

//		������ �׵θ��� �ʺ� �� ���� : (16px, 38px)
//		�������� �����̳��� ������� (350px, 350px)
		this.setSize(350 + 16, 350 + 38);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex04();
	}

//	�μ��� ���� ���ڿ��� ��� ���ڷ� �̷���� �ִ��� üũ�ϴ� �޼ҵ�
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

//	�μ��� ���� ���ڿ��� ��� ���ڷ� �̷���� ������ ���������� ��ȯ�Ͽ� ��ȯ�ϰ� �ƴϸ� 0�� ��ȯ�ϴ� �޼ҵ�
	private int text2num(String str) {
		int num = 0;
		if (isNum(str)) {
			num = Integer.parseInt(str);
		}
		return num;
	}

}
