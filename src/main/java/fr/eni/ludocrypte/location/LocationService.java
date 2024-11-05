package fr.eni.ludocrypte.location;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;

@Service
@AllArgsConstructor
public class LocationService {
    private LocationRepository locationRepository;

    public Location add(Location location) {
        if(location == null) {
            return null;
        }
        location.setDateSortie(LocalDateTime.now());


        return locationRepository.save(location);
    }

    public Location retour(Location location) {
        Location locationExist = locationRepository.findById(location.getNoLocation()).orElse(null);

        if(locationExist == null){
            return null;
        }
        locationExist.setDateRetour(LocalDateTime.now());

        return locationRepository.save(locationExist);

    }

}
