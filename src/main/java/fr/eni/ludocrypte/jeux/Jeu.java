package fr.eni.ludocrypte.jeux;

import fr.eni.ludocrypte.genres.Genre;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data

public class Jeu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String reference;
    private int ageRequis;
    private String description;
    private int dureeMoyenne;
    private Float tarifJour;
    private int idGenre;

    @ManyToMany(cascade = CascadeType.MERGE
     )
            @JoinTable(
                    name = "jeu_genre",
                    joinColumns = @JoinColumn(name= "jeu_id"),
                    inverseJoinColumns = @JoinColumn(name = "genre_id")
            )
    List<Genre> genres;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitre() {
//        return titre;
//    }
//
//    public void setTitre(String titre) {
//        this.titre = titre;
//    }
//
//    public String getReference() {
//        return reference;
//    }
//
//    public void setReference(String reference) {
//        this.reference = reference;
//    }
//
//    public int getAgeRequis() {
//        return ageRequis;
//    }
//
//    public void setAgeRequis(int ageRequis) {
//        this.ageRequis = ageRequis;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public int getDureeMoyenne() {
//        return dureeMoyenne;
//    }
//
//    public void setDureeMoyenne(int dureeMoyenne) {
//        this.dureeMoyenne = dureeMoyenne;
//    }
//
//    public Float getTarifJour() {
//        return tarifJour;
//    }
//
//    public void setTarifJour(Float tarifJour) {
//        this.tarifJour = tarifJour;
//    }
//
//    public int getIdGenre() {
//        return idGenre;
//    }
//
//    public void setIdGenre(int idGenre) {
//        this.idGenre = idGenre;
//    }
//
//    @Override
//    public String toString() {
//        return "Jeu{" +
//                "id=" + id +
//                ", titre='" + titre + '\'' +
//                ", reference='" + reference + '\'' +
//                ", ageRequis=" + ageRequis +
//                ", description='" + description + '\'' +
//                ", dureeMoyenne=" + dureeMoyenne +
//                ", tarifJour=" + tarifJour +
//                ", idGenre=" + idGenre +
//                '}';
//    }
}
