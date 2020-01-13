package HarryPotterBooksKata;



import org.junit.Assert;
import org.junit.Test;


public class HarryPotterDiscountCalculator {

    @Test
    public void one_copy_of_any_of_the_five_books_costs_8_EUR() {
        HarryPotterBook harryPotterBookOne = new HarryPotterBook(8.0, "book1");
        Assert.assertEquals(8, harryPotterBookOne.checkBookPrice(), 0.001);
    }

    @Test
    public void one_book_in_shopping_basket_outcomes_8_EUR(){

        ShoppingBasket shoppingBasket = new ShoppingBasket();
        HarryPotterBook harryPotterBookOne = new HarryPotterBook(8.0, "book1");
        shoppingBasket.addBookToBasketAndQuantify(harryPotterBookOne);
        Assert.assertEquals(8, shoppingBasket.getSubtotal(), 0.001);
    }

        @Test
    public void two_of_the_same_book_costs_full_none_discounted_price() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        HarryPotterBook harryPotterBookOne = new HarryPotterBook(8.0, "book1");
        shoppingBasket.addBookToBasketAndQuantify(harryPotterBookOne);
        shoppingBasket.addBookToBasketAndQuantify(harryPotterBookOne);
        Assert.assertEquals(16.0, shoppingBasket.getSubtotal(), 0.001);
    }

    @Test
    public void two_different_books_gets_discount_of_5_percent() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        HarryPotterBook harryPotterBookOne = new HarryPotterBook(8.0, "book1");
        HarryPotterBook harryPotterBookTwo = new HarryPotterBook(8.0, "book2");
        shoppingBasket.addBookToBasketAndQuantify(harryPotterBookOne);
        shoppingBasket.addBookToBasketAndQuantify(harryPotterBookTwo);
        Assert.assertEquals(15.2, shoppingBasket.getSubtotal(), 0.001);
    }

    @Test
    public void three_copies_of_three_different_books_gets_10_percent_discount() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        HarryPotterBook harryPotterBookOne = new HarryPotterBook(8.0, "book1");
        HarryPotterBook harryPotterBookTwo = new HarryPotterBook(8.0, "book2");
        HarryPotterBook harryPotterBookThree = new HarryPotterBook(8.0, "book3");
        shoppingBasket.addBookToBasketAndQuantify(harryPotterBookOne);
        shoppingBasket.addBookToBasketAndQuantify(harryPotterBookTwo);
        shoppingBasket.addBookToBasketAndQuantify(harryPotterBookThree);
        Assert.assertEquals(21.60, shoppingBasket.getSubtotal(), 0.001);
    }

    @Test
    public void four_different_books_and_you_get_20_percent_discount() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        HarryPotterBook harryPotterBookOne = new HarryPotterBook(8.0, "book1");
        HarryPotterBook harryPotterBookTwo = new HarryPotterBook(8.0, "book2");
        HarryPotterBook harryPotterBookThree = new HarryPotterBook(8.0, "book3");
        HarryPotterBook harryPotterBookFour = new HarryPotterBook(8.0, "book4");
        shoppingBasket.addBookToBasketAndQuantify(harryPotterBookOne);
        shoppingBasket.addBookToBasketAndQuantify(harryPotterBookTwo);
        shoppingBasket.addBookToBasketAndQuantify(harryPotterBookThree);
        shoppingBasket.addBookToBasketAndQuantify(harryPotterBookFour);
        Assert.assertEquals(25.60, shoppingBasket.getSubtotal(), 0.001);
    }

    @Test
    public void three_books_containing_two_different_titles_gives_5_percent_discount_on_only_those_two_books_and_third_costs_full_8_EUR() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        HarryPotterBook harryPotterBookOne = new HarryPotterBook(8.0, "book1");
        HarryPotterBook harryPotterBookTwo = new HarryPotterBook(8.0, "book2");
        shoppingBasket.addBookToBasketAndQuantify(harryPotterBookOne);
        shoppingBasket.addBookToBasketAndQuantify(harryPotterBookTwo);
        shoppingBasket.addBookToBasketAndQuantify(harryPotterBookTwo);
        Assert.assertEquals(23.20, shoppingBasket.getSubtotal(), 0.001);
    }

    @Test
    public void four_books_to_buy_containing_3_different_titles_gives_10_percent_discount_on_3_books_alone_and_full_price_fourth() {

    }
}
