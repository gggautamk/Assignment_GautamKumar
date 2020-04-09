package com.beverage.factory;

import com.beverage.factory.exception.ValidationException;

import junit.framework.TestCase;

/**
 * Unit test for PricingCalculator.
 */
public class PricingCalculatorTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PricingCalculatorTest( String testName )
    {
        super( testName );
    }

    /**
     * Positive Scenario 1
     */
    public void testForPositiveScenario_1()
    {
        assertEquals( 3.5d , PricingCalculator.computePricing("Chai,-sugar") );
    }
    
    /**
     * Positive Scenario 2
     */
    public void testForPositiveScenario_2()
    {
        assertEquals( 4d , PricingCalculator.computePricing("Chai") );
    }
    
    /**
     * Positive Scenario 3. Multiple Order
     */
    public void testForPositiveScenario_3()
    {
    	try {
        PricingCalculator.main(new String[]{new String("Chai,-sugar"), new String("Chai"), new String("Coffee,-milk")});
    	assertTrue("Proccessed Successfully", true);
    	}catch(ValidationException e) {
    		e.printStackTrace();
    		assertFalse(true);
    	}catch(Exception e) {
    		assertFalse("SomeThing Went Wrong", true);
    	}
    }
    
    /**
     * Negative Scenario 1.
     */
    public void testForNegativeScenario_1()
    {
    	try {
        PricingCalculator.main(new String[]{new String("Coffee,-sugar,-water,-tea")});
    	assertTrue("Proccessed Successfully", true);
    	}catch(ValidationException e) {
    		e.printStackTrace();
    		assertFalse(true);
    	}catch(Exception e) {
    		assertFalse("SomeThing Went Wrong", true);
    	}
    }
    
    /**
     * Negative Scenario 2.
     */
    public void testForNegativeScenario_2()
    {
    	try {
        PricingCalculator.main(new String[]{new String("Chai,-sugar,-water,-beer")});
    	assertTrue("Proccessed Successfully", true);
    	}catch(ValidationException e) {
    		e.printStackTrace();
    		assertFalse(true);
    	}catch(Exception e) {
    		assertFalse("SomeThing Went Wrong", true);
    	}
    }
    
    /**
     * Negative Scenario 3.
     */
    public void testForNegativeScenario_3()
    {
    	try {
        PricingCalculator.main(new String[]{new String("ColdDrink,-sugar,-water,-beer")});
    	assertTrue("Proccessed Successfully", true);
    	}catch(ValidationException e) {
    		e.printStackTrace();
    		assertFalse(true);
    	}catch(Exception e) {
    		assertFalse("SomeThing Went Wrong", true);
    	}
    }
    
    /**
     * Negative Scenario 4. Multiple Order
     */
    public void testForNegativeScenario_4()
    {
    	try {
        PricingCalculator.main(new String[]{new String("Chai,-sugar,-water,-milk,-tea"), new String("Chai"), new String("Coffee,-milk")});
    	assertTrue("Proccessed Successfully", true);
    	}catch(ValidationException e) {
    		e.printStackTrace();
    		assertFalse(true);
    	}catch(Exception e) {
    		assertFalse("SomeThing Went Wrong", true);
    	}
    }
}
