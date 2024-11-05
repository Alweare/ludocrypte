package fr.eni.ludocrypte.genres;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GenreService {
    private GenreRepository genreRepository;

    public Genre getGenre(Long id){
        return genreRepository.findById(id).orElse(null);
    }

}
