package be.kuleuven.csa.domain;

import javax.persistence.*;

@Entity
public class Verkoopt {
    @Id
    @GeneratedValue
    private int verkooptId;
    @Column
    private int prijs;
    @Column
    private String startdatum;
    @ManyToOne
    @JoinColumn(name = "BoerderijId")
    private Boerderij boerderij;
    @ManyToOne
    @JoinColumn(name = "pakketBeschrijvingsId")
    private Pakketbeschrijving pakketbeschrijving;

    public Verkoopt(int prijs, String startdatum, Boerderij boerderij, Pakketbeschrijving pakketbeschrijving) {
        this.prijs = prijs;
        this.startdatum = startdatum;
        this.boerderij = boerderij;
        this.pakketbeschrijving = pakketbeschrijving;

        boerderij.getPakketbeschrijvingen().add(this);
        pakketbeschrijving.getBoerderijen().add(this);
    }


    public int getPrijs() {
        return prijs;
    }

    public String getStartdatum() {
        return startdatum;
    }

    public Boerderij getBoerderij() {
        return boerderij;
    }

    public Pakketbeschrijving getPakketbeschrijving() {
        return pakketbeschrijving;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    public void setStartdatum(String startdatum) {
        this.startdatum = startdatum;
    }

    public void setBoerderij(Boerderij boerderij) {
        this.boerderij = boerderij;
    }

    public void setPakketbeschrijving(Pakketbeschrijving pakketbeschrijving) {
        this.pakketbeschrijving = pakketbeschrijving;
    }
}
