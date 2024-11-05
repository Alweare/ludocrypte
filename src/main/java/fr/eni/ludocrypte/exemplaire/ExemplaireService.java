package fr.eni.ludocrypte.exemplaire;

import fr.eni.ludocrypte.service.ResponseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExemplaireService
{

    private ExemplaireRepository exemplaireRepository;

    public ResponseService<Exemplaire> addExemplaire(Exemplaire exemplaire){
        return ResponseService.buildResponse("201", "Exemplaire créé avec succès", exemplaireRepository.save(exemplaire));
    }

    public ResponseService<Exemplaire> findByNoCodeBarre(String noCodeBarre){
        Exemplaire foundExemplaire = exemplaireRepository.findByNoCodeBarre(noCodeBarre);
        if(foundExemplaire == null){
            return ResponseService.buildResponse("701", "L'exemplaire n'exitse pas ", null);
        }

        return ResponseService.buildResponse("201", "Voici votre Exemplaire", exemplaireRepository.findByNoCodeBarre(noCodeBarre));
    }
}
