import Entities.*;
import Services.DriverManagerService;
import Services.DriverManagerServiceImpl;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {




        UserInfo userInfo = new UserInfo("vishesh","1","vish@gail.com","29325312");
        Location source = new Location(12.81,77.50);
        Location destination = new Location(32.91,77.40);
        Rider rider =  new Rider(userInfo,source);
        RideRequest rideRequest = new RideRequest(source,destination);
        RideRequestResponse response =  rider.requestRide(rideRequest);
        System.out.println(response);

        RideRequest rideRequest2 = new RideRequest(source,destination);
        RideRequestResponse response2 =  rider.requestRide(rideRequest2);
        System.out.println(response2);

        RideRequest rideRequest3 = new RideRequest(source,destination);
        RideRequestResponse response3 =  rider.requestRide(rideRequest3);
        System.out.println(response3);

        RideRequest rideRequest4 = new RideRequest(source,destination);
        RideRequestResponse response4 =  rider.requestRide(rideRequest4);
        System.out.println(response4);
        RideRequest rideRequest5 = new RideRequest(source,destination);
        RideRequestResponse response5 =  rider.requestRide(rideRequest5);
        System.out.println(response5);

        RideRequest rideRequest6 = new RideRequest(source,destination);
        RideRequestResponse response6 =  rider.requestRide(rideRequest6);
        System.out.println(response6);



    }
}