package demo.cooking.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "recepti")
public class Recepti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "naziv")
    private String naziv;
    @Column(name = "opis")
    private String opis;
    @Column(name = "kratak_naziv")
    private String kratakNaziv;
    @Column(name = "naziv_Slike")
    private String nazivSlike;

    public Recepti() {
    }

    public Recepti(int id, String naziv, String opis, String kratakNaziv, String nazivSlike, cooking users, List<Koliko> koliko) {
        this.naziv = naziv;
        this.opis = opis;
        this.kratakNaziv = kratakNaziv;
        this.nazivSlike = nazivSlike;
        this.users = users;
        this.koliko = koliko;
        this.id = id;
    }

    public List<Koliko> getKoliko() {

        return koliko;
    }


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_users")
    private cooking users;

    @OneToMany(mappedBy = "recepti")
    private List<Koliko> koliko;

    public cooking getUsers() {
        return users;
    }

    public void setUsers(cooking users) {
        this.users = users;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getKratakNaziv() {
        return kratakNaziv;
    }

    public void setKratakNaziv(String kratakNaziv) {
        this.kratakNaziv = kratakNaziv;
    }

    public String getNazivSlike() {
        return nazivSlike;
    }

    public void setNazivSlike(String nazivSlike) {
        this.nazivSlike = nazivSlike;
    }

    public void setKoliko(List<Koliko> koliko) {
        this.koliko = koliko;
    }

    public Koliko getKolikoByRecipeID(int id) {
        return this.koliko.get(id - 1);
    }




}
