package Day1.Cars;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;


import java.util.List;
@EqualsAndHashCode
@Builder
@Getter
public class Car {
    private String name;
    private String model;
    private double price;
    private int year;
    private List<Manufacturer> manufacturerList;
    private EngineType enginType;

    @Override
    public String toString() {
        return "Car - " +
                "name: " + name +
                ", model: " + model +
                ", price: " + price +
                ", year: " + year +
                ", manufacturers: " + manufacturerList +
                ", engine type: " + enginType +
                '.';
    }
}
