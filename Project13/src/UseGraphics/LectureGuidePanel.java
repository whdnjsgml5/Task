package UseGraphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.Calendar;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LectureGuidePanel extends JPanel implements Runnable {

	String[][] sb = new String[4][];
	Font myFont30 = new Font("°íµñ", Font.PLAIN, 30);
	Font myFont50 = new Font("°íµñ", Font.PLAIN, 50);
	int size = 70;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		String str = "°­ÀÇ ¾È³»";
		FontMetrics metrics = g.getFontMetrics(myFont50);
		int x = (getWidth() - metrics.stringWidth(str)) / 2;
		int y = ((size - metrics.getHeight()) / 2) + metrics.getAscent();
		g.setFont(myFont50);
		g.setColor(Color.WHITE);
		g.drawString(str, x, y);
		metrics = g.getFontMetrics(myFont30);
		g.setFont(myFont30);
		for (int i = 0; i < sb.length; i++) {
			str = (i + 1) + "ÇÐ³â : ";
			y = ((i + 1) * size) + ((size - metrics.getHeight()) / 2) + metrics.getAscent();
			for (int j = 0; j < 3; j++) {
				str += sb[i][j];
				x = (((j % 2) * 125) + 220) * j;
				g.drawString(str, x, y);
				str = "";
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
					for (int i = 0; i < sb.length; i++) {
						sb[i] = TimeTable.sb[i][j];
					}
				} else {
					for (int i = 0; i < sb.length; i++) {
						sb[i] = new String[] { "", "", "", "", "", "" };
					}
				}
				repaint();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
