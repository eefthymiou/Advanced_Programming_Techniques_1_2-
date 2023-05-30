package gr.upatras.ask1;

public class MyClass {
	public String subtraction(int x, int y) {
		int result = x-y;
		if (result>0) {
			return "POSITIVE";
		}
		else if (result<0) {
			return "NEGATIVE";
		}
		else {
			return "ZERO";
		}
	}
}
