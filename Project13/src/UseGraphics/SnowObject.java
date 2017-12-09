package UseGraphics;

import java.awt.Color;
import java.awt.Point;

public class SnowObject {

	private Point point;
	public Color color;
	public int size, offsetX, offsetY;

	public SnowObject(Point point, Color color, int size) {
		this.point = point;
		this.color = color;
		this.size = size;
		this.setOffset();
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public void setOffset() {
		int dir = Math.random() < 0.5 ? -1 : 1;
		this.offsetX = (int) (Math.random() * 3) * dir;
		this.offsetY = (int) (Math.random() * 3) + 4;
	}

}
