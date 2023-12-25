package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        addExtraCheese(); .
        addExtraToppings();
    }

    @Override
    public int getPrice() {
        int price = extraCheesePrice;
        if(super.getVeg()) {
            price += extraVegToppingPrice;
        }else {
            price += extraNonVegToppingPrice;
        }
        price += super.getPrice();
        return price;
    }
}
