package org.example.SOLID.SingleResponsiblity;

public class Invoice {
    private String product;
    private double amount;

    public Invoice(String product, double amount) {
        this.product = product;
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }
    public double getAmount() {
        return amount;
    }
}
