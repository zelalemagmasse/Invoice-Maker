package com.company;

import java.util.Scanner;

public class LineItem {

    private  String discription;
    private  int quantity ;
    private  double price;
    private String itemPurchase;
    private  int itemNumber;

    public LineItem(Scanner input, int itemNumber, String discription, int quantity, double price, String itemPurchased) {
    }




    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemPurchase() {
        return itemPurchase;
    }

    public void setItemPurchase(String itemPurchase) {
        this.itemPurchase = itemPurchase;
    }



    public LineItem(int itemNumber, String discription, int quantity, double price, String itemPurchase) {
        this.itemNumber = itemNumber;
        this.discription = discription;
        this.quantity = quantity;
        this.price = price;
        this.itemPurchase = itemPurchase;
    }
}
