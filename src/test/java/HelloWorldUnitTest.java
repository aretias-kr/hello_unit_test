import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author JeongInn
 */
public class HelloWorldUnitTest {
	@Test
	public void hello_unit_tests() {
		String helloWorld = "Hello" + " World!";
		assertEquals("Hello World!", helloWorld);
	}
}
