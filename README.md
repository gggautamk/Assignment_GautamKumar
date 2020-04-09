# Assignment_GautamKumar

Problem Statement:-

Beverage Factory:
We are the owners of a beverage factory which serves a variety of drinks, juices etc to the customers from its pre-defined set of menu Items.
We offer the customers a choice to customize their drinks in case they want to avoid some specific ingredients from their drinks,
e.g. a person ordering "Chai Latte" which has ingredients as "tea leaves, milk, water, sugar, condiments" a person can order a chai latter without sugar and condiments.
The order value is recalculated based on the actual price of the menu minus the price of the removed ingredient.
So if 1 Cup Chai costed 5 $ and sugar costed 0.5 $ and milk costed 1$ the order: "Chai, - sugar, -milk" would charge
5 - 0.5 - 1.0=3.5$ for the order.
The order to be placed to the shop is always a String concatenated by exclusions. 
1. "Chai, -sugar"
2. "Chai, -sugar, -milk"
3. "Chai"
4. ["Chai, -sugar", "Chai", "Coffee, -milk"] // Chai and Tea are menu items
are all valid orders.
As a part of this exercise you have to write a program should be able to compute the total price of the order placed. Remember the order can only be a String.

Below are the Menu Items with their respective ingredients and prices:
Coffee: "Coffee, milk, sugar, water" Price: 5$
Chai: "Tea, milk, sugar, water" Price: 4$
Banana Smoothie: "banana, milk, sugar, water" Price: 6$
Strawberry Shake: "Strawberries, sugar, milk, water" Price: 7 $
Mojito: "Lemon, sugar, water, soda, mint" Price 7.5 $
Ingredients prices:
Milk: 1 $
Sugar: 0.5 $
Soda: 0.5 $
mint: 0.5 $
water: 0.5 $


Solution:-
Project "BeverageFactory-PriceCalculator" is a standalone maven project.
EntryPoint to the application is from /BeverageFactory-PriceCalculator/src/main/java/com/beverage/factory/PricingCalculator.java
Class "PricingCalculator" accepts String aruguments as input in its main method for processing of Orders.
Multiple Orders can be supplied space seperated. Eg :- Chai,-sugar Chai Coffee,-milk
Unit Test for positive and negative scenarios can be found at /BeverageFactory-PriceCalculator/src/test/java/com/beverage/factory/PricingCalculatorTest.java 







