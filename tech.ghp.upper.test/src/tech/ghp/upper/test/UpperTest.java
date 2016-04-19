package tech.ghp.upper.test;

import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import tech.ghp.upper.api.Upper;

/**
 * 
 */

public class UpperTest {

    private final BundleContext context = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
    
    /*
     * 
     */
    @Test
    public void testUpper() throws Exception {
    	Assert.assertNotNull(context);
    	Assert.assertNotNull(getService(Upper.class));
    }
    
    @Test
    public void testText() throws Exception {
    	Assert.assertSame( new String("POPOVICI"), getService(Upper.class).upper("Popovici"));
    }
    
    <T> T getService(Class<T> clazz) throws InterruptedException {
    	ServiceTracker<T,T> st = new ServiceTracker<>(context, clazz, null);
    	st.open();
    	return st.waitForService(1000);
    }
    
}
