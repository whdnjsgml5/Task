package UseLabels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DayPanel extends JPanel implements Runnable {

	JLabel label;

	public DayPanel() {
		setLayout(new BorderLayout());
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("°íµñ", Font.PLAIN, 30));
		label.setForeground(Color.WHITE);
		add(label);
	}

	public void run() {
		while (true) {
			try {
				int w = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
				label.setText(String.format("%s", getWeek(w)));
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public String getWeek(int w) {
		String temp;
		switch (w) {
		case Calendar.SUNDAY:
			temp = "Sunday";
			break;
		case Calendar.MONDAY:
			temp = "Monday";
			break;
		case Calendar.TUESDAY:
			temp = "Tuesday";
			break;
		case Calendar.WEDNESDAY:
			temp = "Wednesday";
			break;
		case Calendar.THURSDAY:
			temp = "Thursday";
			break;
		case Calendar.FRIDAY:
			temp = "Friday";
			break;
		case Calendar.SATURDAY:
			temp = "Saturday";
			break;
		default:
			temp = "";
			break;
		}
		return temp;
	}

}
