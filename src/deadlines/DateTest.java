package deadlines;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

	@Test
	void testGetDay() {
		Date date = new Date(5, 2);
		assertEquals(date.getDay(), 5, "The output is supposed to be 5");
	}
	
	@Test
	void testGetDayOfYear() {
		Date date = new Date(3, 1);
		assertEquals(date.getDayOfYear(), 3, "The outpust is supposed to be 3");
	}
	
	@Test
	void testToString() {
		Date date = new Date(6, 4);
		assertEquals("6/4/2025", date.ToString());
	}

}
