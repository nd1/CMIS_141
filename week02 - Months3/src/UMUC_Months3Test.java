import static org.junit.Assert.*;

import org.junit.Test;

public class UMUC_Months3Test {

	@Test
	public void test() {
		int numOfDays = UMUC_Months3.daysInMonth();
		assertTrue(numOfDays==31);
	}

}
