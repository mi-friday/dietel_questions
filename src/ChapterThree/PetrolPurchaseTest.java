package ChapterThree;

import ChapterThree.PetrolPurchase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetrolPurchaseTest {
    PetrolPurchase petrolPurchase;

    @BeforeEach
    public void petrolPurchaseExist(){
        petrolPurchase = new PetrolPurchase();
    }
    @Test public void TestForStationLocation(){
        petrolPurchase.stationLocation("Okota");
        assertNotNull(petrolPurchase.getStationLocation());
    }
    @Test public void TestForTypeOfPetrol(){
        petrolPurchase.typeOfPetrol("Diesel");
        assertNotNull(petrolPurchase.getTypeOfPetrol());
    }
    @Test public void TestForQuantity(){
        petrolPurchase.quantity(5);
        assertEquals(5,petrolPurchase.getQuantity());
    }
    @Test public void TestForPricePerLiter(){
        petrolPurchase.pricePerLiter(150.0);
        assertEquals(150.0,petrolPurchase.getPricePerLiter());
    }
    @Test public void TestForPercentageDiscount(){
        petrolPurchase.percentageDiscount(50.0);
        assertEquals(50.0,petrolPurchase.getPercentageDiscount());
    }
    @Test public void TestForPurchaseAmount(){
        petrolPurchase.quantity(5);
        petrolPurchase.pricePerLiter(150.0);
        petrolPurchase.percentageDiscount(50.0);
        assertEquals(700.0,petrolPurchase.PurchaseAmount());
    }
}