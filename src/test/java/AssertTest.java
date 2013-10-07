import static org.junit.Assert.*;

import java.util.Collections;

import org.junit.Test;

/**
 * @author JeongInn
 */
public class AssertTest {
	@Test
	public void should_pass_when_boolean_value_and_suffix_of_assert_method_name_is_same() throws Exception {
		assertTrue(true);
		assertFalse(1 != 1);
		assertFalse(false);
	}
	
	@Test
	public void should_pass_when_objects_have_same_value() throws Exception {
		assertEquals(100L, 100L);
		assertEquals(0,  Collections.emptyList().size());
		// assertEquals("Expected Result", "Actual Result");
		assertEquals("Actual Result", "Actual Result");
	}
	
	@Test
	public void should_pass_when_objects_are_same_not_only_value() throws Exception {
		Object o1 = new Object();
		Object o2 = o1;
		assertSame(o1, o2);
	}
	
	@Test
	public void should_pass_when_objects_are_differ() throws Exception {
		Object o1 = new Object();
		assertNotSame(o1, new Object());
	}
	
	@Test
	public void should_pass_when_null() throws Exception {
		assertNull(null);
		Object o = null;
		assertNull(o);
	}
	
	@Test
	public void should_pass_when_not_null() throws Exception {
		assertNotNull(new Object());
	}
	
	@Test
	public void should_show_message_with_failure() throws Exception {
		assertEquals("0과 1은 같다.", 0, 0);
	}
}
