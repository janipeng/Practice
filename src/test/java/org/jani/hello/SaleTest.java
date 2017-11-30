package org.jani.hello;

import org.junit.Assert;
import org.junit.Test;

public class SaleTest {

    @Test
    public void test_item_lines() throws Exception {
        FakeDisplay display = new FakeDisplay();
        Sale sale = new Sale(display);

        sale.scan("001");

        Assert.assertEquals("Apple $10.0", display.getLastLine());
    }
}