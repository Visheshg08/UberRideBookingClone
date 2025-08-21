package Entities;

public class Driver extends User {


    private DriverStatus driverStatus;

    public Driver(UserInfo userInfo, Location location, DriverStatus driverStatus) {
        super(userInfo,location);
        this.driverStatus = driverStatus;
    }


    public DriverStatus getDriverStatus() {
        return driverStatus;
    }

    public void setDriverStatus(DriverStatus driverStatus) {
        this.driverStatus = driverStatus;
    }

}
