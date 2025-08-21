package Services;

import Entities.Driver;
import Entities.Location;
import Utils.NoDriverAvailableException;

import java.util.List;

public interface DriverManagerService {

    public Driver findClosestDriverForRide(Location riderLocation) throws NoDriverAvailableException;



}
