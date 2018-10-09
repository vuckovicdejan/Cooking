//package demo.cooking.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Embeddable;
//import javax.persistence.EmbeddedId;
//import java.io.Serializable;
//import java.util.Objects;
//
//@Embeddable
//public class KolikoId implements Serializable {
//
//
//
//    @Column(name = "id_sastojci")
//    private Integer id_sastojci;
//
//    @Column(name = "id_users")
//    private Integer id_users;
//
//    public KolikoId(){}
//
//
//
//    public KolikoId(Integer id_sastojci, Integer id_users){
//
//            this.id_sastojci=id_sastojci;
//            this.id_users=id_users;
//
//    }
//
//    public Integer getId_sastojci() {
//        return id_sastojci;
//    }
//
//    public Integer getId_users() {
//        return id_users;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof KolikoId)) return false;
//        KolikoId that = (KolikoId) o;
//        return Objects.equals(getId_sastojci(), that.getId_sastojci()) &&
//                Objects.equals(getId_users(), that.getId_users());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId_sastojci(), getId_users());
//    }
//
//
//}
