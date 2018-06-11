package com.company;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        String continu="not done";
        while(!continu.equalsIgnoreCase("done")) {

            Scanner input = new Scanner(System.in);
            System.out.println("please Enter Item number");
            int itemNumber = input.nextInt();

            System.out.println("please Enter Item Discription");
            input.nextLine();
            String discription = input.nextLine();
            System.out.println("please Enter quantity purchased");
            int quantity = input.nextInt();

            System.out.println("please Enter price");
            double price = input.nextDouble();

            System.out.println("please Enter Item purchsed");
            String itemPurchased = input.nextLine();
            input.nextLine();

            LineItem item1;
            item1 = new LineItem(input, itemNumber, discription, quantity, price, itemPurchased);
            InvoiceMaker newInvoice= new InvoiceMaker();
            newInvoice.receipt(item1);
            System.out.printf("Item Quantity Description  %s %n Taxable Subtotal %d %n Untaxable Subtotal %d%n Tax;%d%n Grand Total %d%n ",
                    newInvoice.receipt(item1).getQuantityDiscr(),newInvoice.receipt(item1).getTaxableSubTotal(),
                    newInvoice.receipt(item1).getUntaxableSubTotal(),newInvoice.receipt(item1).getTax(),newInvoice.receipt(item1).getGrandTotal());
             System.out.println("ARE YOU FINISHED WITH YOUR PURCHASE ?");
              continu= input1.nextLine();
        }

    }
}
//
//    Item Quantity Description Price Total
//        J001  3  Java Book  45.00 135.00
//        C001 1 Cobol Book 50.00  50.00
//        Taxable subtotal: $185.00
//        Untaxable subtotal: $ 0
//        Tax: $9.25
//        Grand Total: $192.25
//

//
//    public LineItem(int itemNumber, String discription, int quantity, double price, String itemPurchase) {
//
//    }