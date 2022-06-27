package website_homework.classes_and_interfaces.Exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static website_homework.classes_and_interfaces.Exercise3.CarType.ECONOMY;
import static website_homework.classes_and_interfaces.Exercise3.CarType.LUXURY;
import static website_homework.classes_and_interfaces.Exercise3.EngineType.*;

class CarTest {
        Car car = new Car();
        Car.Engine engine = car.new Engine();
    @Test
    void economyCarShouldReturnTrueForDieselEngine(){
        //when
        car.setName("VW");
        car.setType(ECONOMY);
        engine.setEngine();
        //then
        Assertions.assertEquals(DIESEL, engine.getEngineType());
    }
    @Test
    void luxuryCarShouldReturnTrueForElectricEngine(){
        //when
        car.setName("Tesla");
        car.setType(LUXURY);
        engine.setEngine();
        //then
        Assertions.assertEquals(ELECTRIC, engine.getEngineType());
    }
    @Test
    void defaultCarShouldReturnTrueForPetroleumEngine(){
        //when
        car.setName("Fiat");
        engine.setEngine();
        //then
        Assertions.assertEquals(PETROLEUM, engine.getEngineType());
    }
}