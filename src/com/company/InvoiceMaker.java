package com.company;

public class InvoiceMaker {

    final double taxAmount= .06;


    public double getTaxAmount() {
        return taxAmount;
    }

    public InvoiceReceipt receipt(LineItem lineItem){
        InvoiceReceipt receipt=new InvoiceReceipt();

        receipt.setTax(lineItem.getPrice()*lineItem.getQuantity()*taxAmount);
        receipt.setGrandTotal(lineItem.getPrice() + lineItem.getPrice()*lineItem.getQuantity()*taxAmount);
        receipt.setTaxableSubTotal(lineItem.getPrice());
        receipt.setUntaxableSubTotal(0.0);
        receipt.setQuantityDiscr(lineItem.getDiscription());
        return receipt;

    }
}
