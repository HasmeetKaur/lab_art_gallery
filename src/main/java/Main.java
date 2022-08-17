public class Main {

    public static void main(String[] args) {

        Artist leonardoDaVinci = new Artist("Leonardo DaVinci");
        Artist vincentVanGogh = new Artist("Vincent Van Gogh");

        Artwork monaLisa = new Artwork("Mona Lisa", leonardoDaVinci, 100000, "98afds889gsd");
        Artwork starryNight = new Artwork("Starry Night", vincentVanGogh, 500000, "fahkjo09912");
        Artwork theLastSupper = new Artwork("The Last Supper", leonardoDaVinci, 300000,"kjhasjh0012" );

        Gallery impossibleArtwork = new Gallery("Impossible Artwork", 300);

        impossibleArtwork.addArtwork(monaLisa);
        impossibleArtwork.addArtwork(starryNight);
        impossibleArtwork.addArtwork(theLastSupper);

        System.out.println("The total value of all the gallery's artwork is " + impossibleArtwork.stockTake());

        Customer mary = new Customer("Mary", 500000);

        mary.buyArtwork(impossibleArtwork, monaLisa);

        System.out.println("The total value of all the gallery's artwork is " + impossibleArtwork.stockTake());

        impossibleArtwork.collection.forEach(artwork -> {
            System.out.println("Impossible Artwork's collection includes " + artwork.getTitle());
        });

        mary.collection.forEach(artwork -> {
            System.out.println("Mary's collection includes " + artwork.getTitle());
        });

    }
}
