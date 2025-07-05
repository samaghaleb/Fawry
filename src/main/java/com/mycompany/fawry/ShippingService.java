
package com.mycompany.fawry;

import java.util.List;

public class ShippingService {
    public static void Ship(List<shippable> items){
        System.out.println("shipping items");
        for (shippable item : items) {
            System.out.println("- " + item.getName() + " (" + item.getWeight() + " kg)");
        }
    }
}
