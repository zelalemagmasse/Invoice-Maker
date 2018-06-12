package com.company;

import java.util.ArrayList;
import java.util.List;

public class InvoiceReceipt {
    private String quantityDiscr;
    private double taxableSubTotal;
    private double untaxableSubTotal;
    private double grandTotal;
    private double tax;
    List<InvoiceReceipt> listOfItems = new ArrayList<>();

    public String getQuantityDiscr() {
        return quantityDiscr;
    }

    public void setQuantityDiscr(String quantityDiscr) {
        this.quantityDiscr = quantityDiscr;
    }

    public double getTaxableSubTotal() {
        return taxableSubTotal;
    }

    public void setTaxableSubTotal(double taxableSubTotal) {
        this.taxableSubTotal = taxableSubTotal;
    }

    public double getUntaxableSubTotal() {
        return untaxableSubTotal;
    }

    public void setUntaxableSubTotal(double untaxableSubTotal) {
        this.untaxableSubTotal = untaxableSubTotal;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

}

//
////    Item Quantity Description Price Total
////        J001  3  Java Book  45.00 135.00
////        C001 1 Cobol Book 50.00  50.00
////        Taxable subtotal: $185.00
////        Untaxable subtotal: $ 0
////        Tax: $9.25
////        Grand Total: $192.25
////