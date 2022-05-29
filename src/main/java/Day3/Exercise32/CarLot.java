package Day3.Exercise32;

import java.io.*;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class CarLot {
    static final List<Car> cars = List.of(new Car("VolksWagen", "Passat", 2000),
            new Car("BWM", "e36", 1999),
            new Car("Fiat", "Panda", 2010)
    );

    static void save(Path outputFile, List<Car> cars) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFile.toFile()))) {
            oos.writeObject(cars);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static List<Car> load(Path file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file.toFile()))
        ) {
            return (List<Car>) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

}
