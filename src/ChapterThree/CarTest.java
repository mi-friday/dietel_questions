package ChapterThree;

import ChapterThree.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CarTest {
    Car car;
    @BeforeEach
    public void carExist(){
        car = new Car();
    }
    @Test public void TestForCarModel(){
        car.carModel("Toyota");
        assertNotNull(car.getCarModel());
    }
    @Test public void TestForCarYear(){
        car.carYear("2023");
        assertNotNull(car.getCarYear());
    }
    @Test public void TestForCarPrice(){
        car.carPrice(4_000_000_000.00);
        assertEquals(4_000_000_000.00,car.getCarPrice());
    }
}