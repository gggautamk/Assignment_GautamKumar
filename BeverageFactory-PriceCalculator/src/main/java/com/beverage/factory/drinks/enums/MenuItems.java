package com.beverage.factory.drinks.enums;

public enum MenuItems {
	
	COFFEE("Coffee", "coffee,milk,sugar,water", 5),
	CHAI("Chai", "tea,milk,sugar,water", 4),
	BANANA_SMOOTHIE("Banana Smoothie", "banana,milk,sugar,water", 6),
	STRAWBERRY_SHAKE("Strawberry Shake", "strawberries,sugar,milk,water", 7),
	MOJITO("Mojito", "lemon,sugar,water,soda,mint", 7.5);
	
    private String itemName;
    private String ingredients;
    private double price;
    
    
    MenuItems(String itemName, String ingredients, double price) {
        this.itemName = itemName;
        this.ingredients = ingredients;
        this.price = price;
    }
    
    public String getItemName() {
		return itemName;
	}

	public String getValue() {
        return itemName;
    }
    
    public String getIngredients() {
        return ingredients;
    }
    
    public double getPrice() {
        return price;
    }
    
    

}
