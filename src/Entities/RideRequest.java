package Entities;

public class RideRequest {

    private Location source;
    private Location destination ;

    public RideRequest(Location source, Location destination) {
        this.source = source;
        this.destination = destination;
    }

    public void setSource(Location source) {
        this.source = source;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public Location getSource() {
        return source;
    }

    public Location getDestination() {
        return destination;
    }
}
