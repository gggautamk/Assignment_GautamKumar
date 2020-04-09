package com.beverage.factory.utils;

import java.util.Arrays;

import com.beverage.factory.drinks.enums.MenuItems;
import com.beverage.factory.exception.ValidationException;

public class ValidationUtility {

	public static void checkForValidations(String inputOrder) {

		String[] splitArray = inputOrder.split(",");

		if (!checkForValidOrderItem(splitArray[0]))
			throw new ValidationException("Invalid Menu Item - " + splitArray[0]);

		if (splitArray.length > 1) {
			for (int i = 1; i < splitArray.length; i++) {

				if (!checkForValidIngredients(splitArray[i]))
					throw new ValidationException("Invalid Indigrends - " + getStringTrimmedValue(splitArray[i]));

				if (!checkForValidItemAndIngredients(splitArray[0], splitArray[i]))
					throw new ValidationException("Indigrends - " + getStringTrimmedValue(splitArray[i])
							+ " selected for Menu - " + splitArray[0] + " doesn't exist");
			}

			if (!checkForValidIngredientsCount(splitArray[0], splitArray.length))
				throw new ValidationException("All Indigrends Cannot be removed from Menu - " + splitArray[0]);

		}
	}

	public static void checkForValidInput(String[] items) {

		if (items.length == 0)
			throw new ValidationException("Each order should have at least one menu item");

	}

	private static boolean checkForValidOrderItem(String item) {

		return Arrays.stream(MenuItems.values()).anyMatch(menuItem -> menuItem.getValue().equalsIgnoreCase(item));

	}

	private static boolean checkForValidIngredients(String ingredients) {

		return PricingUtility.getIngredientsprices().containsKey(getStringTrimmedValue(ingredients));

	}

	private static boolean checkForValidItemAndIngredients(String item, String ingredients) {

		MenuItems menu = PricingUtility.fetchMenuItemFromEnum(item);

		return Arrays.stream(menu.getIngredients().split(","))
				.anyMatch(ingredient -> ingredient.equalsIgnoreCase(getStringTrimmedValue(ingredients)));

	}

	private static boolean checkForValidIngredientsCount(String item, int length) {

		MenuItems menu = PricingUtility.fetchMenuItemFromEnum(item);

		return Arrays.stream(menu.getIngredients().split(",")).count() > length;

	}

	public static String getStringTrimmedValue(String value) {

		return value.replaceAll("-", "").trim().toLowerCase();
	}

}
