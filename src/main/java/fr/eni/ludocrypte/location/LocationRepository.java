package fr.eni.ludocrypte.location;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository  extends JpaRepository<Location, Long> {
}
