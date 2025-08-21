package Services;

public class PricingServiceImplementation implements PricingService {

    private double BASE_PRICE =  2;
    @Override
    public Double calculateFair(Double distance) {
        // pickup base price based on vehicletype
        return BASE_PRICE*distance;
    }



}
