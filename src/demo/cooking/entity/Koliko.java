package demo.cooking.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "koliko")
//@IdClass(KolikoIDD.class)
public class Koliko implements Serializable {

//
//    @Id
//    private Sastojci sastojci;
//
//
//    @Id
//    private Recepti recepti;



    public Koliko(){}



//    @MapsId("id_sastojci")
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_sastojci", referencedColumnName = "id")
//    private Sastojci sastojci;

//    @MapsId("id_recepti")
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_recepti", referencedColumnName = "id")


    @Id
    @ManyToOne()
    @JoinColumn(name = "id_sastojci")
    private Sastojci sastojci;

    @Id
    @ManyToOne()
    @JoinColumn(name = "id_recepti")
    private Recepti recepti;


    @Column(name = "kolicina")
    private int kolicina;



    public Koliko( Sastojci sastojci,Recepti recepti, int kolicina) {

        this.recepti = recepti;
        this.sastojci = sastojci;
        this.kolicina = kolicina;
    }
//    public int getId_sastojci() {
//        return id_sastojci;
//    }
//
//    public void setId_sastojci(int id_sastojci) {
//        this.id_sastojci = id_sastojci;
//    }
//
//    public int getId_recepti() {
//        return id_recepti;
//    }
//
//    public void setId_recepti(int id_recepti) {
//        this.id_recepti = id_recepti;
//    }


//    @EmbeddedId
//    private KolikoId id;
//
//    public KolikoId getId() {
//        return id;
//    }
//
//    public void setId(KolikoId id) {
//        this.id = id;
//    }

//    @Column(name = "id_sastojci")
//    private String id_sastojci;
//
//    @Column(name = "id_recepti")
//    private String id_recepti;


//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_recepti")
//    private Recepti recepti;
//
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_sastocji")
//    private Sastojci sastojci;


    public Recepti getRecepti() {
        return recepti;
    }

    public void setRecepti(Recepti recepti) {
        this.recepti = recepti;
    }

//    public String getId_sastojci() {
//        return id_sastojci;
//    }
//
//    public void setId_sastojci(String id_sastojci) {
//        this.id_sastojci = id_sastojci;
//    }
//
//    public String getId_recepti() {
//        return id_recepti;
//    }
//
//    public void setId_recepti(String id_recepti) {
//        this.id_recepti = id_recepti;
//    }

    public Sastojci getSastojci() {
        return sastojci;
    }

    public void setSastojci(Sastojci sastojci) {
        this.sastojci = sastojci;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    @Override
    public String toString() {
        return "Koliko{" +
                "recepti=" + recepti +
                ", sastojci=" + sastojci +
                ", kolicina='" + kolicina + '\'' +
                '}';
    }
}
