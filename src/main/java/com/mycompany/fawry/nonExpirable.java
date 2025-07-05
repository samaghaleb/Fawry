
package com.mycompany.fawry;

public class nonExpirable extends Product {

    public nonExpirable(String name, double price, double quantity) {
        super(name, price, quantity);
    }

    @Override
    public boolean isExpired() {
    return false;
}
}
