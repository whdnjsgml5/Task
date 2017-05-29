import honam.inc.opp.chap06.app.GoodCalc;
import honam.inc.oop.chap06.lib.Calculator;

public class TestDrive0529 {

	public static void main(String[] args) {
		Calculator mycal = new GoodCalc();
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(mycal.add(10, 5));
		System.out.println(mycal.subtract(10, 5));
		System.out.println(mycal.average(input));
	}

}
