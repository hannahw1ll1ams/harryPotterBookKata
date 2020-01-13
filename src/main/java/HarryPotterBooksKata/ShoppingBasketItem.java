package HarryPotterBooksKata;

public class ShoppingBasketItem {
    private HarryPotterBook book;
    private int quantity;

    public ShoppingBasketItem(HarryPotterBook book, int quantity){
        this.book = book;
        this.quantity = quantity;
    }

    public HarryPotterBook getBook(){
        return book;
    }

    public int getQuantity(){
        return quantity;
    }

    public void changeQuantity(int quantity){
        this.quantity = quantity;
    }

}




//this is essentially a shopping counter. acting as a intermediary and checking them in.