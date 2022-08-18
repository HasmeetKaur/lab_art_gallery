import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainTest {

    private Customer customer;
    private Artwork artwork;
    private Gallery gallery;

    @BeforeEach
    public void setUp() {
        this.customer = new Customer("Mary", 50000);
        this.artwork = new Artwork("Painting", new Artist("Someone"), 500, "h73fua3f");
        this.gallery = new Gallery("Gallery", 400);
    }

    @Test // expected test to succeed
    public void canBuyArtwork() {
        //Given
        gallery.addArtwork(artwork);

        //When
        customer.buyArtwork(gallery, artwork);

        //Then
        float tillExpected = 900;
        float walletExpected = 49500;
        assertThat(customer.getWallet()).isEqualTo(walletExpected);
        assertThat(gallery.getTill()).isEqualTo(tillExpected);

        int galleryCollectionExpected = 0;
        int customerCollectionExpected = 1;
        assertThat(gallery.collection.size()).isEqualTo(galleryCollectionExpected);
        assertThat(customer.collection.size()).isEqualTo(customerCollectionExpected);

    }

    @Test // expected test to fail
    public void cantBuyArtwork() {
        //Given
        gallery.addArtwork(artwork);

        //When
        customer.buyArtwork(gallery, artwork);

        //Then
        float tillExpected = 500;
        float walletExpected = 40000;
        assertThat(customer.getWallet()).isEqualTo(walletExpected);
        assertThat(gallery.getTill()).isEqualTo(tillExpected);

        int galleryCollectionExpected = 1;
        int customerCollectionExpected = 0;
        assertThat(gallery.collection.size()).isEqualTo(galleryCollectionExpected);
        assertThat(customer.collection.size()).isEqualTo(customerCollectionExpected);

    }
}
