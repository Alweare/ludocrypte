package fr.eni.ludocrypte.exemplaire;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ExemplaireController {

    private ExemplaireService exemplaireService;

    @PostMapping("/exemplaires")
    public Exemplaire getExemplaire(@RequestBody Exemplaire exemplaire) {
        return exemplaireService.addExemplaire(exemplaire);
    }
}
