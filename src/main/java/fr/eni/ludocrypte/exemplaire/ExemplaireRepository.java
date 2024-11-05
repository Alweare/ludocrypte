package fr.eni.ludocrypte.exemplaire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExemplaireRepository extends JpaRepository<Exemplaire, Long> {
    Exemplaire findByNoCodeBarre (String noCodeBarre);
}
