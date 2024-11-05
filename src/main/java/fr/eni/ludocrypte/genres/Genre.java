package fr.eni.ludocrypte.genres;

import com.fasterxml.jackson.annotation.JsonIgnore;
import fr.eni.ludocrypte.jeux.Jeu;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String labelle;

    @ManyToMany(mappedBy = "genres")
    @JsonIgnore
    List<Jeu> listeJeu;



}
