package worksheets;

public class Adder {
	public static void main(String[] args) {
		Worksheetone test = new Worksheetone();
		test.setNums(32, 21);
		test.add();
		test.print();

		test.setNums(15, 8);
		test.add();
		test.print();
	}
}
