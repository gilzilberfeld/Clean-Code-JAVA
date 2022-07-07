package testingil.cleancode.arch;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

// Define entities with properties and methods
// Separate application from external sources through adapters
@RestController
@RequestMapping("/navigator")
public class NavigationController {

    DistanceProvider distProvider = new DistanceProvider();
    private Location startingPoint;
    private Location endPoint;

    @PostMapping("/startpoint")
    public void setStartPoint(@RequestBody Location location) {
        startingPoint = location;
    }

    @PostMapping("/destination")
    public void setDestination(@RequestBody Location location) {
        endPoint = location;
    }

    @GetMapping(value = "/distance")
    public int getDistance() {
        return (int) (distProvider.getDistance(startingPoint, endPoint)*1.6);
    }
}
