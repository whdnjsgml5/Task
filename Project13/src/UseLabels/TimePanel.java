package UseLabels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TimePanel extends JPanel implements Runnable {

	JLabel label;

	public TimePanel() {
		setLayout(new BorderLayout());
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("°íµñ", Font.PLAIN, 50));
		label.setForeground(Color.WHITE);
		add(label);
	}

	public void run() {
		while (true) {
			try {
				int h = Calendar.getInstance().get(Calendar.HOUR);
				int m = Calendar.getInstance().get(Calendar.MINUTE);
				int s = Calendar.getInstance().get(Calendar.SECOND);
				int check = Calendar.getInstance().get(Calendar.AM_PM);
				label.setText(String.format("%02d : %02d : %02d %s", h, m, s, getAM_PM(check)));
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public String getAM_PM(int check) {
		String temp;
		switch (check) {
		case Calendar.AM:
			temp = "AM";
			break;
		case Calendar.PM:
			temp = "PM";
			break;
		default:
			temp = "";
			break;
		}
		return temp;
	}

}
