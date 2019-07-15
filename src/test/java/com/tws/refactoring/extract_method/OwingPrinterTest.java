package com.tws.refactoring.extract_method;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
//        System.out.print("hello");
//        assertEquals("hello", outContent.toString());
    }

    @Test
    public void should_return_owing_when_order_have_two_and_name_is_a() {
        //given
        Order firstOrder = new Order(10.5);
        Order secondOrder = new Order(20.1);
        List<Order> orders = new ArrayList<>();
        orders.add(firstOrder);
        orders.add(secondOrder);

        OwingPrinter owingPrinter = new OwingPrinter();

        //when
        String expectedResult = "*****************************\r\n"
                + "****** Customer totals ******\r\n"
                + "*****************************\r\n"
                + "name: a\r\n" + "amount: 30.6\r\n";
        owingPrinter.printOwing("a", orders);
        //then
        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void should_return_owing_when_order_have_two_and_name_is_b() {
        //given
        Order firstOrder = new Order(0);
        List<Order> orders = new ArrayList<>();
        orders.add(firstOrder);

        OwingPrinter owingPrinter = new OwingPrinter();

        //when
        String expectedResult = "*****************************\r\n"
                + "****** Customer totals ******\r\n"
                + "*****************************\r\n"
                + "name: b\r\n" + "amount: 0.0\r\n";
        owingPrinter.printOwing("b", orders);
        //then
        assertEquals(expectedResult, outContent.toString());
    }
}