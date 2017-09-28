
package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP? If
 * not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator {

    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;

    private double bill;
    private double tip;

    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality quality, double billAmt) {
        this.setServiceRating(quality);
        this.setBill(billAmt);
    }

    @Override
    public final double getTip() {
//        double tip = 0.00; // always initialize local variables

        switch (serviceQuality) {
            case GOOD:
                tip = bill * GOOD_RATE;
                break;
            case FAIR:
                tip = bill * FAIR_RATE;
                break;
            case POOR:
                tip = bill * POOR_RATE;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if (billAmt < 0) {
            throw new IllegalArgumentException("Error: Bill amount can never be negative.");
        }
        bill = billAmt;
    }

    public final double getBill() {
        return bill;
    }
    
    

    public final void setServiceRating(ServiceQuality quality) {
        // No need to validate because enums provide type safety!
        serviceQuality = quality;
    }

    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
    
   

}
