package com.beverage.factory;

import java.util.Arrays;

import com.beverage.factory.drinks.enums.MenuItems;
import com.beverage.factory.utils.PricingUtility;
import com.beverage.factory.utils.ValidationUtility;

public class PricingCalculator 
{
	
	/*
	 * Menu Order (space separated) to be taken from input String args
	 */
    public static void main( String[] args )
    {
    	ValidationUtility.checkForValidInput(args);
    	
    	Arrays.stream(args).forEach(item -> {
    		System.out.println("Price For MenuItem - "+ item +" is " + computePricing(item) + "$");
    	});

    }
    
    public static double computePricing( String item ) {
    	
        //Validation Check
    	ValidationUtility.checkForValidations(item);
    	
		String[] splitIngredients = item.split(",");
		
		MenuItems menu = PricingUtility.fetchMenuItemFromEnum(splitIngredients[0]);
		double priceForItem = menu.getPrice();
		if (splitIngredients.length > 1) {
			for (int i = 1; i < splitIngredients.length; i++) {
				priceForItem = priceForItem - PricingUtility.getIngredientsprices().get(ValidationUtility.getStringTrimmedValue(splitIngredients[i]));
			}
		}
			return priceForItem;
    	
    }
    
}
