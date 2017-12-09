package UseLabels;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DeptLogoPanel extends JPanel implements Runnable {

	ImageIcon icon = new ImageIcon(this.getClass().getResource("whitelogo.png"));
	Image img = icon.getImage();
	int x, y, w, h;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, x, y, w, h, this);
	}

	public void run() {
		while (true) {
			try {
				double s = Calendar.getInstance().get(Calendar.SECOND);
				double ratio = (s + 1.0) / 60.0;
				int width = getWidth();
				int height = getHeight();
				w = (int) (ratio * width);
				h = (int) (ratio * height);
				x = (width - w) / 2;
				y = (height - h) / 2;
				repaint();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
