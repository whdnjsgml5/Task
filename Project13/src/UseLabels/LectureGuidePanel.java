package UseLabels;

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LectureGuidePanel extends JPanel implements Runnable {

	JLabel title;
	JLabel[][] grade = new JLabel[4][3];
	int[][] num = { { 0, 345, 440 }, { 345, 95, 80 } };

	public LectureGuidePanel() {
		setLayout(null);
		title = new JLabel("강의 안내");
		title.setBounds(0, 0, 620, 70);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setFont(new Font("고딕", Font.PLAIN, 50));
		title.setForeground(Color.WHITE);
		add(title);
		for (int i = 0; i < grade.length; i++) {
			for (int j = 0; j < 3; j++) {
				grade[i][j] = new JLabel();
				grade[i][j].setBounds(num[0][j], (i + 1) * 70, num[1][j], 70);
				grade[i][j].setFont(new Font("고딕", Font.PLAIN, 30));
				grade[i][j].setForeground(Color.WHITE);
				add(grade[i][j]);
			}
		}
	}

	public void run() {
		while (true) {
			try {
				int h = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
				int m = Calendar.getInstance().get(Calendar.MINUTE);
				int w = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
				int t = (((h - 9) * 60) + m) / 30;
				int j = ((w - 2) * 21) + t;
				if (t >= 0 && t <= 20 && w >= 2 && w <= 6) {
					for (int i = 0; i < grade.length; i++) {
						String[] sb = TimeTable.sb[i][j];
						String text = (i + 1) + "학년 : ";
						for (int k = 0; k < 3; k++) {
							text += sb[k];
							grade[i][k].setText(text);
							text = "";
						}
					}
				} else {
					for (int i = 0; i < grade.length; i++) {
						String text = (i + 1) + "학년 : ";
						for (int k = 0; k < 3; k++) {
							text += "";
							grade[i][k].setText(text);
							text = "";
						}
					}
				}
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
