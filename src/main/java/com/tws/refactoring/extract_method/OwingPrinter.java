package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        double outstanding = getOutstanding(orders);
        print(name, outstanding);
    }

    private void print(String name, double outstanding) {
        System.out.println(String.format(
                    "*****************************\n" +
                    "****** Customer totals ******\n" +
                    "*****************************\n" +
                    "name: %s\n" +
                    "amount: %.1f"
        , name, outstanding));
    }

    private double getOutstanding(List<Order> orders) {
        return orders.stream().mapToDouble(Order::getAmount).sum();
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
