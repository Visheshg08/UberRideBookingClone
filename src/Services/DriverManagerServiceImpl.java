package Services;

import Entities.Driver;
import Entities.DriverStatus;
import Entities.Location;

import Entities.UserInfo;
import Utils.NoDriverAvailableException;
import Utils.RideManagerUtils;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class DriverManagerServiceImpl implements DriverManagerService {

    private static List<Driver> drivers = Arrays.asList(
            new Driver(
                    new UserInfo("Driver 1", "D1", "driver1@example.com", "999990001"),
                    new Location(12.91, 77.60),
                    DriverStatus.AVAILABLE
            ),
            new Driver(
                    new UserInfo("Driver 2", "D2", "driver2@example.com", "999990002"),
                    new Location(12.95, 77.55),
                    DriverStatus.AVAILABLE
            ),
            new Driver(
                    new UserInfo("Driver 3", "D3", "driver3@example.com", "999990003"),
                    new Location(12.92, 77.58),
                    DriverStatus.AVAILABLE
            ),
            new Driver(
                    new UserInfo("Driver 4", "D4", "driver4@example.com", "999990004"),
                    new Location(22.93, 77.62),
                    DriverStatus.AVAILABLE
            ),
            new Driver(
                    new UserInfo("Driver 5", "D5", "driver5@example.com", "999990005"),
                    new Location(15.96, 77.59),
                    DriverStatus.AVAILABLE
            )
    );



    public List<Driver> getDrivers() {
        return drivers;
    }

    public void addDriver(Driver driver){
        drivers.add(driver);
    }

    private List<Driver> getDriverWithStatus(DriverStatus driverStatus) throws NoDriverAvailableException{
        if (drivers == null || drivers.isEmpty()) {
            throw new NoDriverAvailableException();
        }
        List<Driver> filteredDrivers =  getDrivers()
                .stream()
                .filter( driver -> driver.getDriverStatus() == driverStatus)
                .collect(Collectors.toList());

        if (filteredDrivers.isEmpty()) {
            throw new NoDriverAvailableException();
        }
        return filteredDrivers;
    }

    @Override
    public Driver findClosestDriverForRide(Location riderLocation) throws NoDriverAvailableException{
        RideManagerUtils rideManagerUtils = RideManagerUtils.getInstance();
        List<Driver> availableDrivers = getDriverWithStatus(DriverStatus.AVAILABLE);
        return availableDrivers.stream()
                .min((d1, d2) -> {
                    double dist1 = rideManagerUtils.calculateDistance(d1.getLocation(), riderLocation);
                    double dist2 = rideManagerUtils.calculateDistance(d2.getLocation(), riderLocation);
                    return Double.compare(dist1, dist2);
                })
                .orElse(null);
    }
}
