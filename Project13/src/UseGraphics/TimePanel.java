package UseGraphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.Calendar;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TimePanel extends JPanel implements Runnable {

	String str = "";
	Font myFont = new Font("°íµñ", Font.PLAIN, 50);

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
				int h = Calendar.getInstance().get(Calendar.HOUR);
				int m = Calendar.getInstance().get(Calendar.MINUTE);
				int s = Calendar.getInstance().get(Calendar.SECOND);
				int check = Calendar.getInstance().get(Calendar.AM_PM);
				str = String.format("%02d : %02d : %02d %s", h, m, s, getAM_PM(check));
				repaint();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private String getAM_PM(int check) {
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
