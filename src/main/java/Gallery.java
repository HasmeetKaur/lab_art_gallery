import java.util.ArrayList;

public class Gallery {

    private String name;
    private float till;
    public ArrayList<Artwork> collection;

    public Gallery(String name, float till){
        this.name = name;
        this.till = till;
        this.collection = new ArrayList<> ();
    }

    public String getName(){
        return name;
    }

    public float getTill(){
        return till;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTill(float till) {
        this.till = till;
    }

    public void addArtwork(Artwork artwork) {
        this.collection.add(artwork);
    }

    public void removeArtwork(Artwork artwork) {
        this.collection.remove(artwork);
    }

    public void sellArt(Artwork artwork){
        this.till += artwork.getPrice();
        this.collection.remove(artwork);
    }

    public float stockTake() {
        float totalCollectionValue = 0;
        for (Artwork artwork : collection) {
            totalCollectionValue += artwork.getPrice();
        }
        return totalCollectionValue;
    }
}

