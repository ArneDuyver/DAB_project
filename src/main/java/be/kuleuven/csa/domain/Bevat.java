package be.kuleuven.csa.domain;

import javax.persistence.*;
@Entity
public class Bevat {
    @Id
    @GeneratedValue
    private int behoortTotId;
    @Column
    private String eenheid;
    @Column
    private int hoeveelheid;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PakketInhoudId")
    private PakketInhoud pakketInhoud;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductId")
    private Product product;

    public Bevat(String eenheid, int hoeveelheid, PakketInhoud pakketInhoud, Product product) {
        this.eenheid = eenheid;
        this.hoeveelheid = hoeveelheid;
        this.pakketInhoud = pakketInhoud;
        this.product = product;
        pakketInhoud.getBevatList().add(this);
        product.getBevatList().add(this);
    }
}
