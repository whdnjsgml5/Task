package UseLabels;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SnowPanel extends JPanel implements Runnable {

	ArrayList<SnowObject> snowList;

	public SnowPanel(ArrayList<SnowObject> snowList) {
		this.snowList = snowList;
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		for (SnowObject snow : snowList) {
			Point p = snow.getPoint();
			int size = snow.size;
			g.setColor(snow.color);
			g.fillOval(p.x - size / 2, p.y - size / 2, size, size);
		}
	}

	public void run() {
		try {
			Thread.sleep(500);
			while (true) {
				changeSnowPosition();
				repaint();
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void changeSnowPosition() {
		for (SnowObject snow : snowList) {
			Point point = snow.getPoint();
			point.x += snow.offsetX;
			point.y += snow.offsetY;
			if (point.y > getHeight()) {
				point.x = (int) (Math.random() * getWidth());
				point.y = 0;
				snow.setOffset();
			} else if (point.x < 0) {
				point.x = getWidth();
			} else if (point.x > getWidth()) {
				point.x = 0;
			}
		}
	}

}
