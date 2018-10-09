package demo.cooking.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sastojci")
public class Sastojci {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "naziv_sastojka")
    private String naziv_sastojka;

    @OneToMany(mappedBy = "sastojci")
    private List<Koliko> koliko;

    @Override
    public String toString() {
        return "Sastojci{" +
                "id=" + id +
                ", naziv_sastojka='" + naziv_sastojka + '\'' +
                ", koliko=" + koliko +
                '}';
    }

    public Sastojci() {
    }


    public Sastojci(String naziv_sastojka, List<Koliko> koliko) {
        this.naziv_sastojka = naziv_sastojka;
        this.koliko = koliko;

    }


    public List<Koliko> getKoliko() {

        return koliko;
    }

    public void setKoliko(List<Koliko> koliko) {
        this.koliko = koliko;
    }


    public String getNaziv_sastojka() {
        return naziv_sastojka;
    }

    public void setNaziv_sastojka(String naziv_sastojka) {
        this.naziv_sastojka = naziv_sastojka;
    }

}
