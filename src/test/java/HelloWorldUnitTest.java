import static org.junit.Assert.*;

import org.junit.Test;

/*
 * @(#)HelloWorldUnitTest.java $version 2013. 10. 7.
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

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
