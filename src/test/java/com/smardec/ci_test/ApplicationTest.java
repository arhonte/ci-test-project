package com.smardec.ci_test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gwhite 28.07.2016.
 */

public class ApplicationTest {

    @Test
    public void testDoVoid() {
        Application app = new Application();
        app.doVoid();
    }

    @Test
    public void testSum() {
        Application app = new Application();

        Assert.assertNull(app.doSum(null, null));
        Assert.assertEquals(new Integer(12), app.doSum(12, null));
        Assert.assertEquals(new Integer(21), app.doSum(null, 21));
        Assert.assertEquals(new Integer(33), app.doSum(12, 21));
    }

    @Test
    public void testDoBoolean() {
        Application app = new Application();

        Assert.assertNull(app.doOrBoolean(null, null));
        Assert.assertEquals(Boolean.TRUE, app.doOrBoolean(Boolean.TRUE, null));
        Assert.assertEquals(Boolean.TRUE, app.doOrBoolean(Boolean.TRUE, Boolean.FALSE));
        Assert.assertEquals(Boolean.TRUE, app.doOrBoolean(null, Boolean.TRUE));
        Assert.assertEquals(Boolean.TRUE, app.doOrBoolean(Boolean.FALSE, Boolean.TRUE));
        Assert.assertEquals(Boolean.FALSE, app.doOrBoolean(Boolean.FALSE, null));
        Assert.assertEquals(Boolean.FALSE, app.doOrBoolean(null, Boolean.FALSE));
        Assert.assertEquals(Boolean.FALSE, app.doOrBoolean(Boolean.FALSE, Boolean.FALSE));
    }
}
