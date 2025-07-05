
package com.mycompany.fawry;

import java.time.LocalDate;

public class nonShipProduct extends Product {
    public LocalDate expireDate;

    public nonShipProduct(LocalDate expireDate, String name, double price, double quantity) {
        super(name, price, quantity);
        this.expireDate = expireDate;
    }

    
    @Override
    public boolean isExpired() {
        return expireDate != null && expireDate.isBefore(LocalDate.now());
    }
}
