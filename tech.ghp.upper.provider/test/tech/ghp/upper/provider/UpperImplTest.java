package tech.ghp.upper.provider;

import junit.framework.TestCase;

/*
 * 
 * 
 * 
 */

public class UpperImplTest extends TestCase {
	
	/*
	 * 
	 * 
	 * 
	 */
	public void testSimple() throws Exception {
		UpperImpl text = new UpperImpl();
		
		String str1 = new String("POPOVICI");
		String str2 = new String(text.upper("Popovici"));
		assertEquals(str1,str2);
	
	}
}
