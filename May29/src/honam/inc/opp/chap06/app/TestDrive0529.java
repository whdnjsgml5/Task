package honam.inc.opp.chap06.app;

import honam.inc.oop.chap06.lib.Calculator;

public class TestDrive0529 {

	public static void main(String[] args) {
		Calculator c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] { 2, 3, 4 }));
	}

}
