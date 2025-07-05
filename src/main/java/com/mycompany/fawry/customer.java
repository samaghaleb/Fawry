
package com.mycompany.fawry;

import java.util.ArrayList;
import java.util.List;

public class customer {
    public String name;
    public double balance;
    public List<CartItem> cart;

    public customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.cart = new ArrayList<>();
    }
    public void addToCart(Product product, double quantity){
        if (product.isExpired()){
            System.out.println("can't be added" +product.getName() + "product is expired");
            return;
        }
        if (quantity>product.getQuantity()){
            System.out.println("can't be added" +product.getName() + "not available");
            return;
        }
        cart.add(new CartItem(product, quantity));
        System.out.println("added to cart");
    }
    public List<CartItem> getCart() {
        return cart;
    }

    public double getBalance() {
        return balance;
    }
    public void checkout(){
        if (cart.isEmpty()){
            System.out.println("cart is empty");
            return;
        }
        double subtotal = 0.0;
        double shippingFee = 0.0;
        List<shippable> shippableItems = new ArrayList<>();

        for (CartItem item : cart){
            Product product = item.getProduct();
            if (product.isExpired()){
                System.out.println("product expired");
                return;
            }
            if (item.getQuantity() > product.getQuantity()){
                System.out.println("out of stock");
            }
            subtotal += product.getPrice()* item.getQuantity();
            if (product instanceof shippable) { // if product implements the shippable interface
                shippable Shippable = (shippable) product;
                shippableItems.add(Shippable);
                shippingFee += Shippable.getWeight() * 2.5;
        }
    }
         double total = subtotal + shippingFee;
         if (balance < total){
             System.out.println("insufficient balance");
             return;       
         }
          balance -= total;
          
       if (!shippableItems.isEmpty()) {
        ShippingService.Ship(shippableItems);
    }
        System.out.println("checkout completed");
        System.out.println("subtotal: "+ subtotal);
        System.out.println("shipping fee: "+ shippingFee);
        System.out.println("Total: "+ total);
        System.out.println("Current balance: "+ balance);
    }
    }
