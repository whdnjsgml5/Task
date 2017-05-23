
public abstract class DObject {
	public DObject next;

	public DObject() {
		next = null;
	}

	abstract public void draw();
}
