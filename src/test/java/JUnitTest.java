import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author JeongInn
 */
public class JUnitTest {
	@Test
	public void should_normally_pass() {
		System.out.println("pass!!");
	}
	
	@Test(expected = ArithmeticException.class)
	public void should_throwing_exception_when_devide_by_zero() throws Exception {
		System.out.println(0 / 0);
	}
	
	@Test(timeout = 1000)
	public void should_executed_in_1sec() throws Exception {
		Thread.sleep(999);
	}
	
	@Ignore
	@Test
	public void should_not_be_run() throws Exception {
		fail();
	}
}

