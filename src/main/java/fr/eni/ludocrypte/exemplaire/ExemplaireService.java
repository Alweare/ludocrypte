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
    public Exemplaire getExemplaireById(Long id){
        return exemplaireRepository.findById(id).orElse(null);
    }

}
