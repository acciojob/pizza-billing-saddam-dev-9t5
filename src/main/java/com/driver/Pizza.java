package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public boolean isDeluxe = false;

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
        this.price = (isVeg) ? vegPizzaPrice : nonVegPizzaPrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese) {
            int getCurrentPrice = this.getPrice();
            this.setPrice(getCurrentPrice+extraCheesePrice);
        }
        this.extraCheese = true;
    }

    public void addExtraCheese(Boolean isDeluxe){
        this.isDeluxe = true;
        int getCurrentPrice = this.getPrice();
        this.setPrice(getCurrentPrice+extraCheesePrice);
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraTopping) {
            int getCurrentPrice = this.getPrice();
            getCurrentPrice += (isVeg) ? extraVegToppingPrice : extraNonVegToppingPrice;
            this.setPrice(getCurrentPrice);
        }
        this.extraTopping = true;
    }

    public void addExtraToppings(boolean isDeluxe){
        this.isDeluxe = true;
        int getCurrentPrice = this.getPrice();
        getCurrentPrice += (isVeg) ? extraVegToppingPrice : extraNonVegToppingPrice;
        this.setPrice(getCurrentPrice);
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway) {
            int getCurrentPrice = this.getPrice();
            this.setPrice(getCurrentPrice+paperBagPrice);
        }
        this.isTakeaway = true;
    }

    public String getBill(){
        // your code goes here
        String billStatement = "";
        int totalBill = 0;
        int basePrice = isVeg ? vegPizzaPrice : nonVegPizzaPrice;
//        if(isVeg) {
//            basePrice = (isDeluxe) ? (vegPizzaPrice+extraCheesePrice+extraVegToppingPrice) : vegPizzaPrice;
//        }else {
//            basePrice = (isDeluxe) ? (nonVegPizzaPrice+extraCheesePrice+extraNonVegToppingPrice) : nonVegPizzaPrice;
//        }
        billStatement += "Base Price Of The Pizza: " + basePrice + "\n";
        totalBill += basePrice;

        if(extraCheese) {
            billStatement += "Extra Cheese Added: " +extraCheesePrice+ "\n";
            totalBill += extraCheesePrice;
        }
        if(extraTopping) {
            if(isVeg) {
                billStatement += "Extra Toppings Added: " + extraVegToppingPrice + "\n";
                totalBill += extraVegToppingPrice;
            }else {
                billStatement += "Extra Toppings Added: " +extraNonVegToppingPrice+ "\n";
                totalBill += extraNonVegToppingPrice;
            }
        }
        if(isTakeaway) {
            billStatement += "Paperbag Added: " + paperBagPrice +"\n";
            totalBill += paperBagPrice;
        }

        billStatement += "Total Price: " + totalBill + "\n";
        this.bill = billStatement;
        return this.bill;
    }
}
