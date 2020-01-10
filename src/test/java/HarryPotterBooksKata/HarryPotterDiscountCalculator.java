package HarryPotterBooksKata;



import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class HarryPotterDiscountCalculator {
    @Test
    public void one_copy_of_any_of_the_five_books_costs_8_EUR(){
        HarryPotterBook harryPotterBookOne = new HarryPotterBook(8, "book1");
        Assert.assertEquals(8, harryPotterBookOne.getPrice());
    }

    @Test
    public void two_different_books_gets_discount_of_() {
    }
}
