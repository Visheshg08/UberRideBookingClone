package Services;

import Entities.Location;
import Entities.RideRequest;
import Entities.RideRequestResponse;
import Utils.NoDriverAvailableException;

public interface RideManagerService {


    public RideRequestResponse bookRide(RideRequest rideRequest) throws NoDriverAvailableException;
}
