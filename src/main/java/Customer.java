import java.util.ArrayList;

public class Customer {

    private String name;
    private float wallet;
    public ArrayList<Artwork> collection;

    public Customer(String name, float wallet){
        this.name = name;
        this.wallet = wallet;
        this.collection = new ArrayList<> ();
    }

    public float getWallet() {
        return wallet;
    }

    public void buyArtwork(Gallery gallery, Artwork artwork){
        if (this.wallet >= artwork.getPrice()){
            gallery.sellArt(artwork);
            this.wallet -= artwork.getPrice();
            this.collection.add(artwork);
        } else {
            System.out.println("Sorry get a loan.");
        }
    }
}
