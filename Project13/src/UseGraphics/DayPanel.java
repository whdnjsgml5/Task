package UseGraphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.Calendar;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DayPanel extends JPanel implements Runnable {

	String str = "";
	Font myFont = new Font("°íµñ", Font.PLAIN, 30);

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		FontMetrics metrics = g.getFontMetrics(myFont);
		int x = (getWidth() - metrics.stringWidth(str)) / 2;
		int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
		g.setFont(myFont);
		g.setColor(Color.WHITE);
		g.drawString(str, x, y);
	}

	public void run() {
		while (true) {
			try {
				int w = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
				str = String.format("%s", getWeek(w));
				repaint();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private String getWeek(int w) {
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
