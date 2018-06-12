package com.company;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        String continu="not done";
        InvoiceReceipt receptHolder=new InvoiceReceipt();
        while(!continu.equalsIgnoreCase("done")) {
            LineItem item1;
            item1 = new LineItem();

            Scanner input = new Scanner(System.in);
            System.out.println("please Enter Item number");
            int itemNumber = input.nextInt();
            item1.setItemNumber(itemNumber);


            System.out.println(" please Enter Item purchsed");
            input.nextLine();
            String  itemPurchased = input.nextLine();
            item1.setItemPurchase(itemPurchased);
            System.out.println("please Enter quantity purchased");
            int quantity = input.nextInt();
            item1.setQuantity(quantity);

            System.out.println("please Enter price");
            double price = input.nextDouble();
            item1.setPrice(price);

            System.out.println("please Enter Item Discription");
            input.next();
            String  discription = input.nextLine();

            item1.setDiscription(discription);
            InvoiceMaker newInvoice= new InvoiceMaker();
            receptHolder.listOfItems.add(newInvoice.receipt(item1));




             System.out.println("IF YOU FINISHED WITH YOUR PURCHASE , YOU MAY TYPE DONE OR PRESS ANY KEY TO CONTINUE PURCHASIING ?");
              continu= input1.nextLine();
        }


        for(int i=0;i<receptHolder.listOfItems.size();i++){
            System.out.printf("Item Quantity Description:  %s %n Taxable Subtotal: %.2f %n Untaxable Subtotal: %.2f%n Tax:%.2f%n Grand Total: %.2f" +
                            "%n=============================================================================%n ",
                    receptHolder.listOfItems.get(i).getQuantityDiscr(),receptHolder.listOfItems.get(i).getTaxableSubTotal(),
                   receptHolder.listOfItems.get(i).getUntaxableSubTotal(),receptHolder.listOfItems.get(i).getTax(),receptHolder.listOfItems.get(i).getGrandTotal());
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