public class Artwork {

    private String title;
    private Artist artist;
    private float price;
    private String nft;

    public Artwork(String title, Artist artist, float price, String nft) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
    }

    public String getTitle() {
        return title;
    }

    public String getNft(){
        return nft;
    }

    public float getPrice() {
        return price;
    }
}
