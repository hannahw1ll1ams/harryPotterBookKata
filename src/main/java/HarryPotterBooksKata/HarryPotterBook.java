package HarryPotterBooksKata;

public class HarryPotterBook {

    public double price;
    public String bookVolume;


    public HarryPotterBook(double price, String bookVolume){
        this.price = price;
        this.bookVolume = bookVolume;
    }

    public double checkBookPrice() {
        return price;
    }


}


//book can know about its individual price but not its discounted price related to others.