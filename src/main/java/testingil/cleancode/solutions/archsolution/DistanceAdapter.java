package testingil.cleancode.solutions.archsolution;

public class DistanceAdapter {

    private final DistanceProvider distProvider;

    public DistanceAdapter(DistanceProvider distProvider)    {
        this.distProvider = distProvider;
    }
    public Distance getDistance(Location startingPoint, Location endPoint) {
        Distance distance = new Distance(0);
        // Use distProvder to get distance
        // Translate into Distance object
        return distance;
    }

}
