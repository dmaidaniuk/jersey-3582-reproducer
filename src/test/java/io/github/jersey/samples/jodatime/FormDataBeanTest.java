package io.github.jersey.samples.jodatime;

import org.junit.Assert;
import org.junit.Test;

public class FormDataBeanTest {
    
    private FormDataBean instance;
    
    @Test
    public void testConvert() {
        instance = new FormDataBean();
        instance.setName("Test");
        String actualValue = instance.convert();
        Assert.assertEquals("<div class=\"paragraph\">\n"
                + "<p>Writing AsciiDoc is easy, Test!</p>\n"
                + "</div>", actualValue);
    }

}
