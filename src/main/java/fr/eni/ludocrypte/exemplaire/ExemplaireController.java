package fr.eni.ludocrypte.exemplaire;

import fr.eni.ludocrypte.service.ResponseService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class ExemplaireController {

    private ExemplaireService exemplaireService;

    @PostMapping("/exemplaires")
    public ResponseEntity<ResponseService<Exemplaire>> addExemplaire(@Valid @RequestBody Exemplaire exemplaire, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            StringBuilder errors = new StringBuilder("Erreurs de validation");

           bindingResult.getAllErrors().forEach(error -> errors.append(error.getDefaultMessage()));
           return ResponseEntity.badRequest().body(ResponseService.buildResponse("701", errors.toString(), null));


        }

        return ResponseEntity.ok(exemplaireService.addExemplaire(exemplaire));
    }

    @GetMapping("/exemplaires/{noCodeBarre}")
    public ResponseEntity<ResponseService<Exemplaire>> getExemplaireByNoCodeBarre(@PathVariable("noCodeBarre") String noCodeBarre) {
        Exemplaire retrieveExemplaire = exemplaireService.findByNoCodeBarre(noCodeBarre).getData();


        if (retrieveExemplaire == null ) {

            return ResponseEntity.badRequest().body(exemplaireService.findByNoCodeBarre(noCodeBarre));

        }
        return ResponseEntity.ok(exemplaireService.findByNoCodeBarre(noCodeBarre));
    }
}
