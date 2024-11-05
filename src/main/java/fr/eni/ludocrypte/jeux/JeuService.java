package fr.eni.ludocrypte.jeux;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JeuService {

    private final JeuRepository jeuRepository;



    public List<Jeu> getAll(){
        return jeuRepository.findAll();
    }

    public Jeu getById(Long id){
        return jeuRepository.findById(id).orElse(null);
    }

    public Jeu save(Jeu jeu){
        return jeuRepository.save(jeu);
    }




}
