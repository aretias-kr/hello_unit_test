import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author JeongInn
 */
public class LifeCycleTest {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("1 before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("4 after class");
	}
	
	@Before
	public void anotherBefore() {
		System.out.println("2 another before");
	}
	
	
	@Before
	public void before() {
		System.out.println("2 before");
	}
	
	@After
	public void after() {
		System.out.println("3 after");
	}

	@Test
	public void testRun() throws Exception {
		// do nothing
	}
}
