package be.kuleuven.csa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private int productId;
    @Column
    private String naam;
    @Column
    private String soort;

    public Product(String naam, String soort) {
        this.naam = naam;
        this.soort = soort;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public int getProductId() {
        return productId;
    }

    public String getNaam() {
        return naam;
    }

    public String getSoort() {
        return soort;
    }
}
