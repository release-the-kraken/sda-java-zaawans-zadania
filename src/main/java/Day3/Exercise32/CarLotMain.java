package Day3.Exercise32;

import java.nio.file.Path;
import java.util.List;

public class CarLotMain {
    public static void main(String[] args) {
        Path dirPath = Path.of("src/main/java/Day3/Exercise32");
        Path outputFile = dirPath.resolve("cars.txt");
        //CarLot.save(outputFile, CarLot.cars);
        List<Car> carList = CarLot.load(outputFile);
        System.out.println(carList);
    }
}
