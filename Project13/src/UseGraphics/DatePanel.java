package UseGraphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.Calendar;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DatePanel extends JPanel implements Runnable {

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
				int y = Calendar.getInstance().get(Calendar.YEAR);
				int m = Calendar.getInstance().get(Calendar.MONTH);
				int d = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
				str = String.format("%s %02d %04d", getMonth(m), d, y);
				repaint();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private String getMonth(int m) {
		String temp;
		switch (m) {
		case Calendar.JANUARY:
			temp = "January";
			break;
		case Calendar.FEBRUARY:
			temp = "February";
			break;
		case Calendar.MARCH:
			temp = "March";
			break;
		case Calendar.APRIL:
			temp = "April";
			break;
		case Calendar.MAY:
			temp = "May";
			break;
		case Calendar.JUNE:
			temp = "June";
			break;
		case Calendar.JULY:
			temp = "July";
			break;
		case Calendar.AUGUST:
			temp = "August";
			break;
		case Calendar.SEPTEMBER:
			temp = "September";
			break;
		case Calendar.OCTOBER:
			temp = "October";
			break;
		case Calendar.NOVEMBER:
			temp = "November";
			break;
		case Calendar.DECEMBER:
			temp = "December";
			break;
		default:
			temp = "";
			break;
		}
		return temp;
	}

}
