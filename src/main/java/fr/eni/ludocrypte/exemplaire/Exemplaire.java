package fr.eni.ludocrypte.exemplaire;

import fr.eni.ludocrypte.jeux.Jeu;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Entity
@Data

public class Exemplaire {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false,length = 13)
    private String noCodeBarre;
    private boolean louable;

    @ManyToOne
    @JoinColumn(name = "jeu_id")
    private Jeu jeu;


}
