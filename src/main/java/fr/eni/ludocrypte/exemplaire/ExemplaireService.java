package fr.eni.ludocrypte.exemplaire;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExemplaireService
{
    private ExemplaireRepository exemplaireRepository;

    public Exemplaire addExemplaire(Exemplaire exemplaire){
        return exemplaireRepository.save(exemplaire);
    }
    public Exemplaire getExemplaireById(Long id){
        return exemplaireRepository.findById(id).orElse(null);
    }

}
