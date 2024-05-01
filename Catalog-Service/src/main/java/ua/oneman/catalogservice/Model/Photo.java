package ua.oneman.catalogservice.Model;


import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
public class Photo {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int id;

        @ManyToOne
                @JoinColumn(name = "product_id", foreignKey = @ForeignKey(name = "FK_Product_Photo"))
        Product product;
        @Column(name = "photo_url")
        String photoURL;


        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public Product getProduct() {
                return product;
        }

        public void setProduct(Product product) {
                this.product = product;
        }

        public String getPhotoURL() {
                return photoURL;
        }

        public void setPhotoURL(String photoURL) {
                this.photoURL = photoURL;
        }
}
