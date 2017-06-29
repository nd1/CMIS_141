import static org.junit.Assert.*;

import org.junit.Test;

public class SwitchDemoTest {

	@Test
	public void test() {
		String nameOfMonth = SwitchDemo.extractMonthString();
		assertTrue(nameOfMonth=="August");
		fail("Not yet implemented");
	}

}
