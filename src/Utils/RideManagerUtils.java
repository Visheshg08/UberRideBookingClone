package Utils;

import Entities.Location;

public class RideManagerUtils {
    private static RideManagerUtils instance;

    private RideManagerUtils() {}
    public static RideManagerUtils getInstance() {
        if(instance == null){
            instance = new RideManagerUtils();
        }
        return instance;
    }

    public Double calculateDistance(Location to, Location from) {
        double num = 111*(Math.pow(to.getLatitude() - from.getLatitude(),2))
                + 88 * Math.pow(to.getLongitude() - from.getLongitude(),2);
        return Math.sqrt(num);

    }

}
