package se.lexicon.kevin;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest

{

    @Test
    public void addition()
    {
        //Arange
        double num1 = 5.3;
        double num2 = 6;

        //Act
        double result = App.add(num1,num2);

        //Assert
       Assert.assertEquals (11.3,result,1);


    }
    @Test
    public void subtraction()
    {
        //arange
        double num1 = 10.5;
        double num2 = 5;

        //Act
        double result = App.sub(num1,num2);


        //Assert
        Assert.assertEquals(4.5,result,1);
    }
    @Test
    public void multiplication()
    {
        //arange
        double num1 = 3;
        double num2 = 3;


        //Act
        double result = App.mult(num1,num2);


        //Assert
        Assert.assertEquals(9,result,0);


    }
    @Test
    public void division()
    {
        //arange
        double num1 = 3;
        double num2 = 0;

        //Act
        double result = App.div(num1,num2);

        //Assert
        Assert.assertEquals(0,result,0);
    }




}

