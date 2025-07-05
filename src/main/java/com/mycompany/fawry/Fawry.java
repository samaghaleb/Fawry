

package com.mycompany.fawry;

import java.time.LocalDate;

public class Fawry {

    public static void main(String[] args) {
        Product cheese = new expirable( LocalDate.of(2025, 7, 15) , "cheese", 100.0, 5.0);
        Product biscuits = new expirable(LocalDate.of(2025, 8, 1), "biscuits", 150.0, 2.0 );
        Product tv = new nonExpirable("TV", 3000.0, 3.0);
        Product scratchCard = new nonShipProduct(LocalDate.of(2025, 8, 15), "Scratch Card", 50.0, 100.0);
        customer Customer = new customer("Sama", 1000.0);
        Customer.addToCart(cheese, 2);     
        Customer.addToCart(biscuits, 1);     
        Customer.addToCart(scratchCard, 1);  
        Customer.addToCart(tv, 5);           
        Customer.addToCart(cheese, 10);
        Customer.checkout();
        
    }
}
