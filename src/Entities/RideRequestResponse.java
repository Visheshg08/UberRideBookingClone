package Entities;

public class RideRequestResponse {

    private String riderName;
    private String driverName;
    private Location from;
    private Location to;
    private Double distance;
    private Double fare;
    private RideStatus rideStatus;



    private RideRequestResponse(Builder builder) {
        this.rideStatus = builder.rideStatus;
        this.from = builder.from;
        this.to = builder.to;
        this.distance = builder.distance;
        this.driverName = builder.driverName;
        this.fare = builder.fare;
    }

    public static class Builder {
        private RideStatus rideStatus;
        private Location from;
        private Location to;
        private double distance;
        private String driverName;
        private double fare;

        public Builder rideStatus(RideStatus rideStatus) {
            this.rideStatus = rideStatus;
            return this;
        }

        public Builder from(Location from) {
            this.from = from;
            return this;
        }

        public Builder to(Location to) {
            this.to = to;
            return this;
        }

        public Builder distance(double distance) {
            this.distance = distance;
            return this;
        }

        public Builder fare(double fare) {
            this.fare = fare;
            return this;
        }

        public Builder driver(String driver) {
            this.driverName = driver;
            return this;
        }

        public RideRequestResponse build() {
            return new RideRequestResponse(this);
        }
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    @Override
    public String toString() {
        return "RideRequestResponse{" +
                "rideStatus=" + rideStatus + "\n"+
                ", from=" + from + "\n" +
                ", to=" + to + "\n" +
                ", distance=" + distance + "\n" +
                ", fare=" + fare + "\n"+
                ", driver=" + (driverName != null ? driverName : "null") + "\n" +
                '}';
    }
}
