package HarryPotterBooksKata;

import java.util.ArrayList;
import java.util.List;

public class BookShop {
    private List<ShoppingBasket> allCurrentShoppingBaskets;
    private List<HarryPotterBook> allBookChoices;

    public BookShop(){
        allCurrentShoppingBaskets = new ArrayList<>();
        allBookChoices = new ArrayList<>();
    }

}



// bookshop holds information like customers, all the shopping baskets ever made, deals on offer etc,
//bookshop should hold all the books as harryPotterBook objects, something added in test first, because each needs to hold price, author etc.


//other options
//    private String[] allBooksAvailable = {"harryPotterOne", "harryPotterTwo", "harryPotterThree", "harryPotterFour", "harryPotterFive"};
//    private HarryPotterBook[] allHPBooks;
//    this last one, how do you add to it?