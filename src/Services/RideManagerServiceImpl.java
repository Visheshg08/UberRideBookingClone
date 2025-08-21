package Services;

import Entities.*;
import Utils.NoDriverAvailableException;
import Utils.RideManagerUtils;

public class RideManagerServiceImpl implements  RideManagerService{

    @Override
    public RideRequestResponse bookRide(RideRequest rideRequest) throws NoDriverAvailableException {
        Double rideDistance = RideManagerUtils.getInstance().calculateDistance(rideRequest.getSource(), rideRequest.getDestination());
        DriverManagerService driverManagerService = new DriverManagerServiceImpl();
        PricingService pricingService = new PricingServiceImplementation();
        try {
            Driver driver = driverManagerService.findClosestDriverForRide(rideRequest.getSource());
            Double rideFare = pricingService.calculateFair(rideDistance);
            driver.setDriverStatus(DriverStatus.UNAVAILABLE);
            return new RideRequestResponse.Builder()
                    .rideStatus(RideStatus.IN_PROGRESS)
                    .from(rideRequest.getSource())
                    .to(rideRequest.getDestination())
                    .distance(rideDistance)
                    .fare(rideFare)
                    .driver(driver.getUserName())
                    .build();
        } catch (NoDriverAvailableException e){
            return new RideRequestResponse.Builder()
                    .rideStatus(RideStatus.DRIVER_UNAVAILABLE)
                    .from(rideRequest.getSource())
                    .to(rideRequest.getDestination())
                    .distance(rideDistance)
                    .build();
        }


    }
}
