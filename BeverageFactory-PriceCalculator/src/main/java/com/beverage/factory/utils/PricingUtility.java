package com.beverage.factory.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.beverage.factory.drinks.enums.MenuItems;

public class PricingUtility {
	
	private static final Map<String, Double> ingredientsPrices = new HashMap<String, Double>(){
		{
			put("milk", 1d);
			put("sugar", 0.5d);
			put("soda", 0.5d);
			put("mint", 0.5d);
			put("water", 0.5d);
			put("coffee", 3d);
			put("tea", 2d);
			put("banana", 4d);
			put("strawberries", 5d);
			put("lemon", 5d);
		}};
		
		
	public static Map<String, Double> getIngredientsprices() {
		return ingredientsPrices;
	}
	
	
	public static MenuItems fetchMenuItemFromEnum(String item){
		
		return Arrays.stream(MenuItems.values()).filter(menuItem -> menuItem.getValue().equalsIgnoreCase(item)).findAny().get();
	}

}
