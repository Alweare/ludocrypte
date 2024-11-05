package fr.eni.ludocrypte.location;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class LocationController {
    private  LocationService locationService;


    @PostMapping("/locations")
    public Location addLocation(@RequestBody Location location) {
        return locationService.add(location);
    }

    @PatchMapping("/locations")
    public Location updateLocation(@RequestBody Location location) {
        return locationService.retour(location);
    }
}
