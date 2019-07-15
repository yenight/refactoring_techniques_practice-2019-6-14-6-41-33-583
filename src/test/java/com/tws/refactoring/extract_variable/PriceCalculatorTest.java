package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {

    @Test
    public void should_return_price_when_quantity_is_500_and_itemPrice_is_10() {
        //given
        PriceCalculator priceCalculator = new PriceCalculator();
        //when
        double result = priceCalculator.getPrice(500, 10);
        double expectedResult = 5100.00;
        //then
        assertEquals(expectedResult, result, 0.0);
    }

    @Test
    public void should_return_price_when_quantity_is_501_and_itemPrice_is_10() {
        //given
        PriceCalculator priceCalculator = new PriceCalculator();
        //when
        double result = priceCalculator.getPrice(501, 10);
        double expectedResult = 5109.50;
        //then
        assertEquals(expectedResult, result, 0.0);
    }

    @Test
    public void should_return_price_when_quantity_is_499_and_itemPrice_is_10() {
        //given
        PriceCalculator priceCalculator = new PriceCalculator();
        //when
        double result = priceCalculator.getPrice(499, 10);
        double expectedResult = 5090.0;
        //then
        assertEquals(expectedResult, result, 0.0);
    }
}