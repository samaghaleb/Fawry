
package com.mycompany.fawry;

import java.time.LocalDate;

public class expirable extends Product {
    
   public LocalDate expireDate;

    public expirable(LocalDate expireDate, String name, double price, double quantity) {
        super(name, price, quantity);
        this.expireDate = expireDate;
    }

    @Override
    public boolean isExpired(){
      return expireDate.isBefore(LocalDate.now());
}
    
}
