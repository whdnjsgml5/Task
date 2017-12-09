package UseGraphics;

import java.awt.Color;
import java.awt.Container;
import java.awt.Insets;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JFrame;

@SuppressWarnings({ "serial" })
public class MainActivity extends JFrame {

	Container ct;
	AnalogClockPanel acPanel;
	DatePanel datePanel;
	TimePanel timePanel;
	DayPanel dayPanel;
	LectureGuidePanel lgPanel;
	DeptLogoPanel dlPanel;
	SnowPanel snowPanel;
	ArrayList<SnowObject> snowList = new ArrayList<SnowObject>();

	public MainActivity() {
		this.setTitle("Prohect13");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		ct = this.getContentPane();
		ct.setLayout(null);
		ct.setBackground(Color.BLACK);

		this.generateSnow();
		snowPanel = new SnowPanel(snowList);
		snowPanel.setBounds(150, 90, 900, 900);
		snowPanel.setOpaque(false);

		acPanel = new AnalogClockPanel();
		acPanel.setBounds(150, 90, 900, 900);
		acPanel.setOpaque(false);

		datePanel = new DatePanel();
		datePanel.setBounds(1150, 90, 620, 50);
		datePanel.setOpaque(false);
		timePanel = new TimePanel();
		timePanel.setBounds(1150, 140, 620, 74);
		timePanel.setOpaque(false);
		dayPanel = new DayPanel();
		dayPanel.setBounds(1150, 214, 620, 50);
		dayPanel.setOpaque(false);

		lgPanel = new LectureGuidePanel();
		lgPanel.setBounds(1150, 300, 620, 350);
		lgPanel.setOpaque(false);

		dlPanel = new DeptLogoPanel();
		dlPanel.setBounds(1150, 654, 620, 336);
		dlPanel.setOpaque(false);

		ct.add(snowPanel);
		ct.add(acPanel);
		ct.add(datePanel);
		ct.add(timePanel);
		ct.add(dayPanel);
		ct.add(lgPanel);
		ct.add(dlPanel);

		new Thread(snowPanel).start();
		new Thread(acPanel).start();
		new Thread(datePanel).start();
		new Thread(timePanel).start();
		new Thread(dayPanel).start();
		new Thread(lgPanel).start();
		new Thread(dlPanel).start();

		this.setVisible(true);
		Insets i = this.getInsets();
		System.out.println(i);
		this.setResizable(false);
		this.pack();
		this.setSize(1920 + i.left + i.right, 1080 + i.top + i.bottom);
	}

	public static void main(String[] args) {
		new MainActivity();
	}

	public void generateSnow() {
		for (int i = 0; i < 300; i++) {
			int x, y, size, alpha;
			x = (int) (Math.random() * 900);
			y = (int) (Math.random() * 900);
			size = (int) (Math.random() * 5) + 5;
			alpha = (int) (Math.random() * 64) + 128;
			Point point = new Point(x, y);
			Color color = new Color(255, 255, 255, alpha);
			SnowObject snow = new SnowObject(point, color, size);
			snowList.add(snow);
		}
	}

}
