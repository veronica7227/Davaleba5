package calculator.service.impl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorServiceImplTest {

    @Test
    public void sum() {
        CalculatorServiceImpl calcs = new CalculatorServiceImpl();
        Assert.assertEquals(calcs.sum(2,3),55);
    }

    @Test
    public void prod() {
        CalculatorServiceImpl calcs = new CalculatorServiceImpl();
        Assert.assertEquals(calcs.prod(10,5),50);
    }
}