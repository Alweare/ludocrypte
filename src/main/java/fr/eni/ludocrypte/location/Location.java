package fr.eni.ludocrypte.location;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Entity

public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long noLocation;
    private LocalDateTime dateSortie;
    private LocalDateTime dateRetour;


    public LocalDateTime getDateSortie() {
        return dateSortie;
    }

    public LocalDateTime getDateRetour() {
        return dateRetour;
    }

    public void setDateSortie(LocalDateTime dateSortie) {
        this.dateSortie = dateSortie;
    }

    public void setDateRetour(LocalDateTime dateRetour) {
        this.dateRetour = dateRetour;
    }

    public Long getNoLocation() {
        return noLocation;
    }
}
