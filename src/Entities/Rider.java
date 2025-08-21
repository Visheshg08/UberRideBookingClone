package Entities;

import Services.RideManagerService;
import Services.RideManagerServiceImpl;
import Utils.NoDriverAvailableException;

public class Rider extends User {

    public Rider(UserInfo userInfo, Location location) {
        super(userInfo, location);
    }

    public RideRequestResponse requestRide(RideRequest rideRequest) throws NoDriverAvailableException {
        RideManagerService rideManagerService = new RideManagerServiceImpl();
        RideRequestResponse rideRequestResponse =  rideManagerService.bookRide(rideRequest);
        rideRequestResponse.setRiderName(this.getUserName());
        return rideRequestResponse;
    }


}
