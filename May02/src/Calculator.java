
public class Calculator {
	private int memory, value;
	private boolean clear;
	public Calculator next;

	public Calculator() {
		this.memory = 0;
		this.value = 0;
		this.clear = true;
		next = null;
	}

	public Calculator(int memory, int value) {
		this();
		if (value != 0) {
			this.memory = memory;
			this.value = value;
			this.clear = false;
		}
	}

	public void reset() {
		this.memory = 0;
		this.value = 0;
		this.clear = true;
	}

	public void set(int memory, int value) {
		if (value != 0) {
			this.memory = memory;
			this.value = value;
			this.clear = false;
		}
	}

	public void set(int value) {
		if (value != 0) {
			this.value = value;
			this.clear = false;
		}
	}

	public int add() {
		if (!clear) {
			memory += value;
			clear = true;
		}
		return memory;
	}

	public int sub() {
		if (!clear) {
			memory -= value;
			clear = true;
		}
		return memory;
	}

	public int mul() {
		if (!clear) {
			memory *= value;
			clear = true;
		}
		return memory;
	}

	public int div() {
		if (!clear) {
			memory /= value;
			clear = true;
		}
		return memory;
	}

	public int mod() {
		if (!clear) {
			memory %= value;
			clear = true;
		}
		return memory;
	}

	public int average(int[] arrs) {
		for (int arr : arrs) {
			memory += arr;
		}
		memory /= arrs.length;
		return memory;
	}
}
