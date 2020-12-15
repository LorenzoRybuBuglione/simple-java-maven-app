package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAppConstructor() {
        try {
            new Calculadora();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void testCalculadora()
    {
        int sum, minus, mult, div;

        sum = Calc.op(7,'+',3);
        minus = Calc.op(4,'-',2);
        mult = Calc.op(2,'*',3);
        div = Calc.op(6,'/',2);

        try {
            assertEquals(10, sum);
        } catch (AssertionError e) {
            fail("Resultado da soma não é 10");
        }
        try {
            assertEquals(2, minus);
        } catch (AssertionError e) {
            fail("Resultado da subtração não é 2");
        }
        try {
            assertEquals(6, mult);
        } catch (AssertionError e) {
            fail("Resultado da multiplicação não é 6");
        }
        try {
            assertEquals(3, div);
        } catch (AssertionError e) {
            fail("Resultado da divisão não é 3");
        }
    }
 
    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
