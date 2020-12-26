package be.kuleuven.csa.domain;

import javax.persistence.*;

@Entity
public class Koopt {
    @Id
    @GeneratedValue
    private int kooptId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VerkooptId")
    private Verkoopt verkoopt;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KlantId")
    private Klant klant;

    public Koopt(Verkoopt verkoopt, Klant klant) {
        this.verkoopt = verkoopt;
        verkoopt.getKooptList().add(this);
        this.klant = klant;
        klant.getKooptList().add(this);
    }
}
