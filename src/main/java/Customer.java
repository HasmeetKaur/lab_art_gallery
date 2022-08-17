public class Customer {

    private String name;
    private float wallet;

    public Customer(String name, float wallet){
        this.name = name;
        this.wallet = wallet;
    }

    public void buyArtwork(Gallery gallery){

        gallery.sellArt(Artwork);

        this.wallet -= artwork.getPrice();

    }
}
