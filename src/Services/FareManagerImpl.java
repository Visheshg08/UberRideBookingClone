package Services;

public class FareManagerImpl implements FareManager {

    // should be picked up from config
    private double BASE_FARE = 2;
    @Override
    public Double calculateFare(Double distance) {
        return BASE_FARE*distance;
    }
}
