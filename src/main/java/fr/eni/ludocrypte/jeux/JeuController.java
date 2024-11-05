package fr.eni.ludocrypte.jeux;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class JeuController {

    private final JeuService jeuService;



    @GetMapping("/jeux")
    public List<Jeu> jeu() {
        return jeuService.getAll();
    }

    @GetMapping("/jeux/{id}")
    public Jeu jeu(@PathVariable("id") Long id) {
        return  jeuService.getById(id);
    }

    @PostMapping("/jeux")
    public Jeu jeu(@RequestBody Jeu jeu) {
        return  jeuService.save(jeu);
    }





}
