package ChapterThree;

public class Car {
    private String carModel;
    private String carYear;
    private double carPrice;

    public void carModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    public void carYear(String carYear) {
        this.carYear = carYear;
    }

    public String getCarYear() {
        return carYear;
    }

    public void carPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }
    public int discount (int carPrice) {
        int discountedPrice = (int) (0.05 * carPrice);
        int price = carPrice - discountedPrice;
        return price;
    }
    public int discount2 (int carPrice) {
        int discountedPrice2 = (int) (0.07 * carPrice);
        int price2 = carPrice - discountedPrice2;
        return price2;
    }
}
