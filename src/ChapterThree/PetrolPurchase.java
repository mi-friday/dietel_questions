package ChapterThree;

public class PetrolPurchase {
    private String stationLocation;
    private String typeOfPetrol;
    private int quantity;
    private double pricePerLiter;
    private double percentageDiscount;
    public void stationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void typeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;

    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void quantity(int quantity) {
        this.quantity = quantity;

    }

    public int getQuantity() {
        return quantity;
    }

    public void pricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void percentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public double PurchaseAmount() {
       double calculate = (quantity * pricePerLiter) - percentageDiscount;
       return calculate;

    }
}
