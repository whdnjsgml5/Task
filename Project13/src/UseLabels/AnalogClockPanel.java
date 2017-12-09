package UseLabels;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import java.util.Calendar;

import javax.swing.JPanel;

@SuppressWarnings({ "serial", "unused" })
public class AnalogClockPanel extends JPanel implements Runnable {

	int scale = 185;// this value can control the size of clock. (inital value: 250)
	int xs, ys, xm, ym, xh, yh;// second, minute, hour needle length

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Coordinate origins are by default situated at the top left corner of the
		// component. So, for the convenience of drawing, we'll translate the coordinate
		// system to the center.
		Graphics2D g2d = (Graphics2D) g;
		g2d.translate(getWidth() / 2, getHeight() / 2);

		// select small value for side between width and height
		int side = getWidth() > getHeight() ? getHeight() : getWidth();
		g2d.scale(side / scale, side / scale);

		this.setAllRenderingHints(g2d);
		this.drawClockFace(g2d);
		this.drawClockHands(g2d);
		// this.drawLayout(g2d); //this method is using just for testing during programming.
	}

	@Override
	public void run() {
		while (true) {
			try {
				int s = Calendar.getInstance().get(Calendar.SECOND);
				xs = (int) (Math.cos(s * Math.PI / 30 - Math.PI / 2) * 80 + 0);
				ys = (int) (Math.sin(s * Math.PI / 30 - Math.PI / 2) * 80 + 0);

				int m = Calendar.getInstance().get(Calendar.MINUTE);
				xm = (int) (Math.cos(m * Math.PI / 30 - Math.PI / 2) * 75 + 0);
				ym = (int) (Math.sin(m * Math.PI / 30 - Math.PI / 2) * 75 + 0);

				int h = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
				xh = (int) (Math.cos((h * 30 + m / 2) * Math.PI / 180 - Math.PI / 2) * 60 + 0);
				yh = (int) (Math.sin((h * 30 + m / 2) * Math.PI / 180 - Math.PI / 2) * 60 + 0);

				repaint();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void setAllRenderingHints(Graphics2D g2d) {
		g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
		g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHint(RenderingHints.KEY_TEXT_LCD_CONTRAST, 100);
		g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
		g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
		g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
	}

	private void drawClockFace(Graphics2D g2d) {
		// �ð� �ܺ� circle
		 g2d.setPaint(Color.BLACK);
		 g2d.fill(new Arc2D.Double(-110, -110, 220, 220, 0, 360, Arc2D.CHORD));
		 g2d.setColor(Color.darkGray);
		 g2d.setStroke(new BasicStroke(4.0f));
		 g2d.draw(new Arc2D.Double(-110, -110, 220, 220, 0, 360, Arc2D.CHORD));

		// Next, we need to draw 60 second points on the circle,
		// each at an angular distance of 6 degrees. Because the rotate function of Java
		// Graphics takes a radian value as a parameter, we convert 6 degree to radians
		// by the formula (��/180 x 6.0).

		for (int i = 0; i < 60; i++) {
			if ((i % 5) != 0) {
				g2d.setStroke(new BasicStroke(1.0f));
				g2d.setColor(Color.darkGray);
				g2d.drawLine(92, 0, 96, 0);
			} else {
				g2d.setColor(new Color(255, 122, 110));
				g2d.setStroke(new BasicStroke(2.0f));
				g2d.drawLine(88, 0, 96, 0);
			}
			g2d.rotate((Math.PI / 180.0) * 6.0);
		}
	}

	private void drawClockHands(Graphics2D g2d) {
		g2d.setColor(new Color(220, 22, 10));
		g2d.setStroke(new BasicStroke(5.0f));
		g2d.drawLine(0, 0, xh, yh);

		g2d.setStroke(new BasicStroke(3.0f));
		g2d.drawLine(0, 0, xm, ym);

		g2d.setColor(Color.WHITE);
		g2d.setStroke(new BasicStroke(2.0f));
		g2d.drawLine(0, 0, xs, ys);

		// center outer circle
		g2d.setColor(Color.LIGHT_GRAY);
		g2d.fillOval(-5, -5, 10, 10);

		// center inner circle
		g2d.setColor(Color.WHITE);
		g2d.fillOval(-2, -2, 4, 4);
	}

	private void drawLayout(Graphics2D g2d) {
		g2d.setColor(Color.WHITE);
		g2d.drawRect(-getWidth() / 2, -getHeight() / 2, getWidth() - 1, getHeight() - 1);
		g2d.drawLine(-getWidth() / 2, 0, getWidth() / 2, 0);
		g2d.drawLine(0, -getHeight() / 2, 0, getHeight());
	}

}
