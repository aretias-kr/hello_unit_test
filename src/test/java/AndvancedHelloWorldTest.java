import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author JeongInn
 */
public class AndvancedHelloWorldTest {
	@Test
	public void should_return_hello_world() throws Exception {
		String helloMessage = new HelloWorld().hello();
		assertEquals("Hello World!", helloMessage);
	}
}
