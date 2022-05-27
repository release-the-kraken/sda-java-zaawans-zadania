package Day1.Cars;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Manufacturer {
    private String name;
    private int establishmentYear;
    private String country;


    @Override
    public String toString() {
        return "Manufacturer - " +
                "name: " + name +
                ", establishmentYear: " + establishmentYear +
                ", country: " + country + '.';
    }
}
