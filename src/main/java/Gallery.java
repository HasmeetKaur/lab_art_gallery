import java.util.ArrayList;

public class Gallery {

    private String name;
    private float till;
    private ArrayList<Artwork> collection;

    public Gallery(String name, float till){
        this.name = name;
        this.till = till;
        this.collection = new ArrayList<> ();
    }

    public void addArtwork(Artwork artwork) {
        this.collection.add(artwork);
    }

//     public void sellArt(Artwork artwork){
//
//
//
//     }
}

