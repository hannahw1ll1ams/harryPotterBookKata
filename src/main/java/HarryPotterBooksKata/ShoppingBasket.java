package HarryPotterBooksKata;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private List<ShoppingBasketItem> shoppingBasketItems;

    public ShoppingBasket(){
        shoppingBasketItems = new ArrayList<>();
    }

    public void addBookToBasketAndQuantify(HarryPotterBook harryPottersBook) {
        ShoppingBasketItem existingItem = null;

        for(ShoppingBasketItem item : shoppingBasketItems){
            if(item.getBook() == harryPottersBook){
                existingItem = item;
            }
        }
        if(existingItem != null){
            existingItem.changeQuantity(existingItem.getQuantity()+1);
        }
        else {
            ShoppingBasketItem newBook = new ShoppingBasketItem(harryPottersBook, 1);
            shoppingBasketItems.add(newBook);
        }
    }

    public double getSubtotal() {
        double totalCost = 0.0;
        int totalQuantity = 0;

        for(ShoppingBasketItem bookVolume : shoppingBasketItems){
            totalQuantity += bookVolume.getQuantity();
        }

        //if multiple copies of only 1 book, return full price
        if(shoppingBasketItems.size() == 1) {
            return 8 * shoppingBasketItems.get(0).getQuantity();
        }

        //if max of only one book of each type
        if(totalQuantity == shoppingBasketItems.size() && shoppingBasketItems.size() > 1 ){
            if (shoppingBasketItems.size() == 2){
                return 8 * shoppingBasketItems.size() * 0.95;
            }
            else if (shoppingBasketItems.size() == 3){
                return 8 * shoppingBasketItems.size() * 0.90;
            }
            else {
                return 8 * shoppingBasketItems.size() * 0.80;
            }
        }

        //if more than one copy of one book and multiple books in basket
        else {
            int fullPriceBooksToBuyCount = totalQuantity - shoppingBasketItems.size();
            totalCost = ((totalQuantity - fullPriceBooksToBuyCount) * 8 * 0.95) + (fullPriceBooksToBuyCount * 8);
        }
        return totalCost;
    }



}





//shopping basket is the only place that holds all the books to know what discounts can be applied, should it have calls to the bookshop

//is shopping basket just a empty metal basket and bookshop does calculations or can it be the place that does that, or it needs something extra like a till.



//    public String[] getSelectedBookNames() {
//        //if creating this string array, should the length of it be declared at start or the fact it might change?
//
//        int booksChosenCount = selectedBooks.size();
//        String[] chosenBookNames = new String[booksChosenCount];
//        for(int i = 0; i<booksChosenCount; i++){
//            chosenBookNames[i] = selectedBooks.get(i).checkBookName();
//        }
//        return chosenBookNames;
//    }
