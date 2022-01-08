package com.ricardogarfe.calculator;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    @Test
    public void testPing() {
        assertThat(new CalculatorService().ping(), containsString("Welcome to Java Maven Calculator Web App!!!"));
    }

    @Test
    public void testAdd() {
        assertEquals(34, new CalculatorService().Add(8, 26).getResult());
    }

    @Test
    public void testSub() {
        assertEquals(4, new CalculatorService().Sub(12, 8).getResult());
    }

    @Test
    public void testMul() {
        assertEquals(88, new CalculatorService().Mul(11, 8).getResult());
    }

    @Test
    public void testDiv() {
        assertEquals(1, new CalculatorService().Div(12, 12).getResult());
    }
}
