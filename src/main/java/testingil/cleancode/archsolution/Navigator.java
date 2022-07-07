package testingil.cleancode.archsolution;

public class Navigator {

    private DistanceAdapter distAdapter;
    private Location startingPoint;
    private Location endPoint;

    public Navigator(DistanceAdapter distanceAdapter) {
        this.distAdapter = distanceAdapter;
    }

    public Distance getDistanceFromDestination()	{
        return distAdapter.getDistance(startingPoint, endPoint).inKm();
    }

    public void setDestination(Location dest) {
        this.endPoint = dest;
    }

    public void setStartingPoint(Location startingPoint) {
        this.startingPoint = startingPoint;
    }

}
