package be.kuleuven.csa.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BehoortTot {
    @Id
    @GeneratedValue
    private int behoortTotId;
    @Column
    private int weekNummer;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VerkooptId")
    private Verkoopt verkoopt;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PakketInhoudId")
    private PakketInhoud pakketInhoud;
    @OneToMany(mappedBy = "behoortTot")
    private List<HaaltAf> haaltAfList;

    public BehoortTot(int weekNummer, Verkoopt verkoopt, PakketInhoud pakketInhoud) {
        this.weekNummer = weekNummer;
        this.verkoopt = verkoopt;
        verkoopt.getBehoortTotList().add(this);
        this.pakketInhoud = pakketInhoud;
        pakketInhoud.getBehoortTotList().add(this);
        this.haaltAfList= new ArrayList<>();
    }

    public List<HaaltAf> getHaaltAfList() {
        return haaltAfList;
    }
}
