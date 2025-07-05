package com.mycompany.fawry;

public class CartItem {
    public Product product;
    public double quantity; 

    public CartItem(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }
    
    
}
