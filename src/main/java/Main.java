public class Main {

    public static void main(String[] args) {

        Artist leonardoDaVinci = new Artist("Leonardo DaVinci");
        Artist vincentVanGogh = new Artist("Vincent Van Gogh");

        Artwork monaLisa = new Artwork("Mona Lisa", leonardoDaVinci, 100000, "98afds889gsd");
        Artwork starryNight = new Artwork("Starry Night", vincentVanGogh, 500000, "fahkjo09912");
        Artwork theLastSupper = new Artwork("The Last Supper", leonardoDaVinci, 300000,"kjhasjh0012" );

        Gallery impossibleArtwork = new Gallery("Impossible Artwork", 300);

        //add artwork to collection
    }
}
