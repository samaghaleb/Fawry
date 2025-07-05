
package com.mycompany.fawry;

import java.time.LocalDate;

public class shipProduct extends Product implements shippable {
    public double weight;
    public LocalDate expireDate;

    public shipProduct(double weight, LocalDate expireDate, String name, double price, double quantity) {
        super(name, price, quantity);
        this.weight = weight;
        this.expireDate = expireDate;
    }
    
    @Override
    public boolean isExpired() {
        return expireDate != null && expireDate.isBefore(LocalDate.now());
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
