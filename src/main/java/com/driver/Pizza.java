package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public boolean extraCheese = false;
    public boolean extraTopping = false;
    public boolean isTakeaway = false;
    static final int vegPizzaPrice = 300;
    static final int nonVegPizzaPrice = 400;
    static final int extraCheesePrice = 80;
    static final int extraVegToppingPrice = 70;
    static final int extraNonVegToppingPrice = 120;
    static final int paperBagPrice = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price = (isVeg) ? 300 : 400;
    }

    public int getPrice(){
        return this.price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void addExtraCheese(){
        // your code goes here
        this.extraCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        this.extraTopping = true;
    }

    public void addTakeaway(){
        // your code goes here
        this.isTakeaway = true;
    }

    public String getBill(){
        // your code goes here
        String billStatement = "";
        int totalBill = 0;
        if(isVeg) {
            billStatement += "Veg pizza base price: 300\n";
            totalBill += vegPizzaPrice;
        }
        else {
            billStatement += "Non-veg pizza base price: 400\n";
            totalBill += nonVegPizzaPrice;
        }

        if(extraCheese) {
            billStatement += "Extra Cheese Price: 80\n";
            totalBill += extraCheesePrice;
        }
        if(extraTopping) {
            if(isVeg) {
                billStatement += "Extra Toppings Added: 70\n";
                totalBill += extraVegToppingPrice;
            }else {
                billStatement += "Extra Toppings Added: 120\n";
                totalBill += extraNonVegToppingPrice;
            }
        }
        if(isTakeaway) {
            billStatement += "Paperbag Added: 20\n";
            totalBill += paperBagPrice;
        }

        billStatement += "Total Price: " + totalBill;
        this.bill = billStatement;
        return this.bill;
    }
}
