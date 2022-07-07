package testingil.cleancode.solutions.archsolution;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/navigator")
public class NavigationController {

    @Autowired
    DistanceProvider distanceProvider;

    @Autowired
    DistanceAdapter distanceAdapter;

    @Autowired
    Navigator nav;

    @PostMapping("/startpoint")
    public void setStartPoint(@RequestBody Location location) {
        nav.setStartingPoint(location);
    }

    @PostMapping("/destination")
    public void setDestination(@RequestBody Location location) {
        nav.setDestination(location);
    }

    @GetMapping(value = "/distance", produces = MediaType.APPLICATION_JSON_VALUE)
    public Distance getDistance() {
        return nav.getDistanceFromDestination();
    }
}
