package Day1.Cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarService {
    private List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
    }
    void addCar(Car car){
        if(car != null) {
            this.carList.add(car);
        }
    }
    void removeCar(Car car){
        if(car != null) {
            this.carList.remove(car);
        }
    }
    List<Car> getCarList(){
        //return carList; ---> returns a reference to carList, operations done on new list will affect the original list
        return new ArrayList<>(carList);
    }
    List<Car> getV12Cars(){
        List<Car> V12CarList = carList
                .stream()
                .filter(car -> car.getEnginType() == EngineType.V12)
                .toList();
        return V12CarList;
    }
    List<Car> getCarsMadeBefore1999(){
        List<Car> carsMadeBefore1999 = carList
                .stream()
                .filter(car -> car.getYear() < 1999)
                .toList();
        return carsMadeBefore1999;
    }
    Car getMostExpensiveCar(){
        List<Car> mostExpensiveCar = carList
                .stream()
                .max(Comparator.comparingDouble(Car::getPrice))
                .stream()
                .toList();
        return mostExpensiveCar.get(0);
    }
    Car getCheapestCar(){
        List<Car> cheapestCar = carList
                .stream()
                .min(Comparator.comparingDouble(Car::getPrice))
                .stream()
                .toList();
        return cheapestCar.get(0);
    }
    List<Car> getCarWithMinimumThreeManufacturers(){
        List<Car> carsWithMin3Manufacturers = carList
                .stream()
                .filter(car -> car.getManufacturerList().size() >= 3)
                .toList();
        return carsWithMin3Manufacturers;
    }
    List<Car> sortedCarList(SortOrder sortOrder){
        List<Car> sortedCarList =
                switch (sortOrder){
                    case ASCENDING -> carList
                            .stream()
                            .sorted((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()))
                            .toList();
                    case DESCENDING -> carList
                            .stream()
                            .sorted((o1, o2) -> o2.getName().compareToIgnoreCase(o1.getName()))
                            .toList();
                };
        return sortedCarList;
    }
    boolean isCarOnList(Car car){
        return carList.contains(car);
    }

}
