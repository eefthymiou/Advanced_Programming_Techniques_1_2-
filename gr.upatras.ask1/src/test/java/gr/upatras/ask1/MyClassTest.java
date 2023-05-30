package gr.upatras.ask1;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyClassTest {

	void testExceptionIsThrown() {
		MyClass tester = new MyClass();
		assertThrows(IllegalArgumentException.class, () -> tester.subtraction(15, 5));
	}

	@Test
	void testSubtraction() {
		MyClass tester = new MyClass();
		assertEquals("POSITIVE", tester.subtraction(10, 5), "The result of 15 - 5 must be POSITIVE");
		assertEquals("NEGATIVE", tester.subtraction(-10, 5), "The result of -10 - 5 must be NEGATIVE");
		assertEquals("ZERO", tester.subtraction(5, 5), "The result of 5 - 5 must be NEGATIVE");
	}
}
