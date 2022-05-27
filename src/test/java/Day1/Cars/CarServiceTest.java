package Day1.Cars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarServiceTest {
    private CarService carServiceDB;
    private static final Manufacturer MANUFACTURER_1 = new Manufacturer("Umbrella Corp.", 1988, "USA");
    private static final Manufacturer MANUFACTURER_2 = new Manufacturer("Mass-Neotek", 2020, "Netherlands");
    private static final Manufacturer MANUFACTURER_3 = new Manufacturer("Kenbishi Heavy Industries", 2022, "Japan");
    private static final Manufacturer MANUFACTURER_4 = new Manufacturer("Tyrell Corp.", 1998, "USA");
    @BeforeEach
    void init(){
        carServiceDB = new CarService();
    }
    @Test
    void shouldAddCarToList() {
        //given
        Car car1 = Car.builder()
                .name("Stinger")
                .model("Blue Lightning")
                .year(2000)
                .price(2_000_00000)
                .enginType(EngineType.V6)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_3))
                .build();
        //when
        carServiceDB.addCar(car1);
        //then
        assertThat(carServiceDB.getCarList()).containsExactly(car1);
    }

    @Test
    void carListSizeShouldEqualZeroAfterAddingAndRemovingOneCar() {
        //given
        Car car1 = Car.builder()
                .name("Stinger")
                .model("Blue Lightning")
                .year(2000)
                .price(2_000_00000)
                .enginType(EngineType.V6)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_3))
                .build();
        //when
        carServiceDB.addCar(car1);
        carServiceDB.removeCar(car1);
        //then
        Assertions.assertEquals(0, carServiceDB.getCarList().size());
    }
    @Test
    void carListShouldContainOnlyCar2AfterAddingTwoCarsAndRemovingOne() {
        //given
        Car car1 = Car.builder()
                .name("Stinger")
                .model("Blue Lightning")
                .year(2000)
                .price(2_000_00000)
                .enginType(EngineType.V6)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_3))
                .build();
        Car car2 = Car.builder()
                .name("Zeus")
                .model("Speeder")
                .year(2025)
                .price(1_000_00000)
                .enginType(EngineType.S6)
                .manufacturerList(List.of(MANUFACTURER_2, MANUFACTURER_4))
                .build();
        //when
        carServiceDB.addCar(car1);
        carServiceDB.addCar(car2);
        carServiceDB.removeCar(car1);
        //then
        assertThat(carServiceDB.getCarList()).containsExactly(car2);
    }

    @Test
    void newListCreatedFromCarServiceDBShouldContainSameItems() {
        //given
        Car car1 = Car.builder()
                .name("Stinger")
                .model("Blue Lightning")
                .year(2000)
                .price(2_000_00000)
                .enginType(EngineType.V6)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_3))
                .build();
        Car car2 = Car.builder()
                .name("Zeus")
                .model("Speeder")
                .year(2025)
                .price(1_000_00000)
                .enginType(EngineType.S6)
                .manufacturerList(List.of(MANUFACTURER_2, MANUFACTURER_4))
                .build();
        //when
        carServiceDB.addCar(car1);
        carServiceDB.addCar(car2);
        List<Car> copyOfCarList = carServiceDB.getCarList().stream().toList();
        //then
        assertThat(copyOfCarList).containsExactly(car1, car2);
    }

    @Test
    void shouldCreateNewListContainingOnlyOneCarWithV12Engine() {
        //given
        Car car1 = Car.builder()
                .name("Stinger")
                .model("Blue Lightning")
                .year(2000)
                .price(2_000_00000)
                .enginType(EngineType.V12)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_3))
                .build();
        Car car2 = Car.builder()
                .name("Zeus")
                .model("Speeder")
                .year(2025)
                .price(1_000_00000)
                .enginType(EngineType.S6)
                .manufacturerList(List.of(MANUFACTURER_2, MANUFACTURER_4))
                .build();
        //when
        carServiceDB.addCar(car1);
        carServiceDB.addCar(car2);
        List<Car> V12Cars = carServiceDB.getV12Cars();
        //then
        assertThat(V12Cars).containsExactly(car1);
    }

    @Test
    void shouldCreateNewListContainingOnlyOneCarMadeBefore1999() {
        Car car1 = Car.builder()
                .name("Stinger")
                .model("Blue Lightning")
                .year(1998)
                .price(2_000_00000)
                .enginType(EngineType.V12)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_3))
                .build();
        Car car2 = Car.builder()
                .name("Zeus")
                .model("Speeder")
                .year(1999)
                .price(1_000_00000)
                .enginType(EngineType.S6)
                .manufacturerList(List.of(MANUFACTURER_2, MANUFACTURER_4))
                .build();
        //when
        carServiceDB.addCar(car1);
        carServiceDB.addCar(car2);
        List<Car> carsMadeBefore1999 = carServiceDB.getCarsMadeBefore1999();
        //then
        assertThat(carsMadeBefore1999).containsExactly(car1);
    }

    @Test
    void shouldReturnTrueForComparisonOfMosExpensiveCarWithCar1() {

        Car car1 = Car.builder()
                .name("Stinger")
                .model("Blue Lightning")
                .year(1998)
                .price(2_000_00000)
                .enginType(EngineType.V12)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_3))
                .build();
        Car car2 = Car.builder()
                .name("Zeus")
                .model("Speeder")
                .year(1999)
                .price(1_000_00000)
                .enginType(EngineType.S6)
                .manufacturerList(List.of(MANUFACTURER_2, MANUFACTURER_4))
                .build();
        //when
        carServiceDB.addCar(car1);
        carServiceDB.addCar(car2);
        Car mostExpensiveCar = carServiceDB.getMostExpensiveCar();
        //then
        Assertions.assertEquals(car1, mostExpensiveCar);
    }

    @Test
    void shouldReturnTrueForComparisonOfChapestCarWithCar2() {

        Car car1 = Car.builder()
                .name("Stinger")
                .model("Blue Lightning")
                .year(1998)
                .price(2_000_00000)
                .enginType(EngineType.V12)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_3))
                .build();
        Car car2 = Car.builder()
                .name("Zeus")
                .model("Speeder")
                .year(1999)
                .price(1_000_00000)
                .enginType(EngineType.S6)
                .manufacturerList(List.of(MANUFACTURER_2, MANUFACTURER_4))
                .build();
        //when
        carServiceDB.addCar(car1);
        carServiceDB.addCar(car2);
        Car cheapestCar = carServiceDB.getCheapestCar();
        //then
        Assertions.assertEquals(car2, cheapestCar);
    }
    @Test
    void shouldReturnFalseForComparisonOfCheapestCarWithCar1() {

        Car car1 = Car.builder()
                .name("Stinger")
                .model("Blue Lightning")
                .year(1998)
                .price(2_000_00000)
                .enginType(EngineType.V12)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_3))
                .build();
        Car car2 = Car.builder()
                .name("Zeus")
                .model("Speeder")
                .year(1999)
                .price(1_000_00000)
                .enginType(EngineType.S6)
                .manufacturerList(List.of(MANUFACTURER_2, MANUFACTURER_4))
                .build();
        //when
        carServiceDB.addCar(car1);
        carServiceDB.addCar(car2);
        Car cheapestCar = carServiceDB.getCheapestCar();
        //then
        Assertions.assertNotEquals(car1, cheapestCar);
    }

    @Test
    void sizeOfListOfCarsWithMinThreeManufactuersShouldEqualTwo() {

        Car car1 = Car.builder()
                .name("Stinger")
                .model("Blue Lightning")
                .year(1998)
                .price(2_000_00000)
                .enginType(EngineType.V12)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_2, MANUFACTURER_3, MANUFACTURER_4))
                .build();
        Car car2 = Car.builder()
                .name("Zeus")
                .model("Speeder")
                .year(1999)
                .price(1_000_00000)
                .enginType(EngineType.S6)
                .manufacturerList(List.of(MANUFACTURER_2, MANUFACTURER_4))
                .build();
        Car car3 = Car.builder()
                .name("Dart")
                .model("Cowboy Bebop")
                .year(2025)
                .price(1_500_00000)
                .enginType(EngineType.V8)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_2, MANUFACTURER_4))
                .build();
        //when
        carServiceDB.addCar(car1);
        carServiceDB.addCar(car2);
        carServiceDB.addCar(car3);
        List<Car> carsWithMinThreeManufacturers = carServiceDB.getCarWithMinimumThreeManufacturers();
        //then
        Assertions.assertEquals(2, carsWithMinThreeManufacturers.size());
    }
    @Test
    void sizeOfListOfCarsWithThreeManufacturersShouldNotEqualSizeOfCarServiceDBList() {

        Car car1 = Car.builder()
                .name("Stinger")
                .model("Blue Lightning")
                .year(1998)
                .price(2_000_00000)
                .enginType(EngineType.V12)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_2, MANUFACTURER_3, MANUFACTURER_4))
                .build();
        Car car2 = Car.builder()
                .name("Zeus")
                .model("Speeder")
                .year(1999)
                .price(1_000_00000)
                .enginType(EngineType.S6)
                .manufacturerList(List.of(MANUFACTURER_2, MANUFACTURER_4))
                .build();
        Car car3 = Car.builder()
                .name("Dart")
                .model("Cowboy Bebop")
                .year(2025)
                .price(1_500_00000)
                .enginType(EngineType.V8)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_2, MANUFACTURER_4))
                .build();
        //when
        carServiceDB.addCar(car1);
        carServiceDB.addCar(car2);
        carServiceDB.addCar(car3);
        List<Car> carsWithMinThreeManufacturers = carServiceDB.getCarWithMinimumThreeManufacturers();
        //then
        Assertions.assertNotEquals(carServiceDB.getCarList().size(), carsWithMinThreeManufacturers.size());
    }

    @Test
    void shouldReturnTrueForComparisonWithExpectedSortedCarListInAscendingOrder() {

        Car car1 = Car.builder()
                .name("Stinger")
                .model("Blue Lightning")
                .year(1998)
                .price(2_000_00000)
                .enginType(EngineType.V12)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_2, MANUFACTURER_3, MANUFACTURER_4))
                .build();
        Car car2 = Car.builder()
                .name("Zeus")
                .model("Speeder")
                .year(1999)
                .price(1_000_00000)
                .enginType(EngineType.S6)
                .manufacturerList(List.of(MANUFACTURER_2, MANUFACTURER_4))
                .build();
        Car car3 = Car.builder()
                .name("Dart")
                .model("Cowboy Bebop")
                .year(2025)
                .price(1_500_00000)
                .enginType(EngineType.V8)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_2, MANUFACTURER_4))
                .build();
        List<Car> expectedSortedCarList = List.of(car3, car1, car2);
        //when
        carServiceDB.addCar(car1);
        carServiceDB.addCar(car2);
        carServiceDB.addCar(car3);
        List<Car> sortedCarList = carServiceDB.sortedCarList(SortOrder.ASCENDING);
        //then
        Assertions.assertEquals(expectedSortedCarList, sortedCarList);
    }

    @Test
    void shouldReturnTrueForComparisonWithExpectedSortedCarListInDescendingOrder() {

        Car car1 = Car.builder()
                .name("Stinger")
                .model("Blue Lightning")
                .year(1998)
                .price(2_000_00000)
                .enginType(EngineType.V12)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_2, MANUFACTURER_3, MANUFACTURER_4))
                .build();
        Car car2 = Car.builder()
                .name("Zeus")
                .model("Speeder")
                .year(1999)
                .price(1_000_00000)
                .enginType(EngineType.S6)
                .manufacturerList(List.of(MANUFACTURER_2, MANUFACTURER_4))
                .build();
        Car car3 = Car.builder()
                .name("Dart")
                .model("Cowboy Bebop")
                .year(2025)
                .price(1_500_00000)
                .enginType(EngineType.V8)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_2, MANUFACTURER_4))
                .build();
        List<Car> expectedSortedCarList = List.of(car2, car1, car3);
        //when
        carServiceDB.addCar(car1);
        carServiceDB.addCar(car2);
        carServiceDB.addCar(car3);
        List<Car> sortedCarList = carServiceDB.sortedCarList(SortOrder.DESCENDING);
        //then
        Assertions.assertEquals(expectedSortedCarList, sortedCarList);
    }

    @Test
    void shouldReturnFalseIfCarIsNotOnCarList() {

        Car car1 = Car.builder()
                .name("Stinger")
                .model("Blue Lightning")
                .year(1998)
                .price(2_000_00000)
                .enginType(EngineType.V12)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_2, MANUFACTURER_3, MANUFACTURER_4))
                .build();
        Car car2 = Car.builder()
                .name("Zeus")
                .model("Speeder")
                .year(1999)
                .price(1_000_00000)
                .enginType(EngineType.S6)
                .manufacturerList(List.of(MANUFACTURER_2, MANUFACTURER_4))
                .build();
        Car car3 = Car.builder()
                .name("Dart")
                .model("Cowboy Bebop")
                .year(2025)
                .price(1_500_00000)
                .enginType(EngineType.V8)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_2, MANUFACTURER_4))
                .build();
        //when
        carServiceDB.addCar(car1);
        carServiceDB.addCar(car3);
        //then
        assertThat(carServiceDB.getCarList()).doesNotContain(car2);
    }    @Test
    void shouldReturnTrueIfCarIsOnCarList() {

        Car car1 = Car.builder()
                .name("Stinger")
                .model("Blue Lightning")
                .year(1998)
                .price(2_000_00000)
                .enginType(EngineType.V12)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_2, MANUFACTURER_3, MANUFACTURER_4))
                .build();
        Car car2 = Car.builder()
                .name("Zeus")
                .model("Speeder")
                .year(1999)
                .price(1_000_00000)
                .enginType(EngineType.S6)
                .manufacturerList(List.of(MANUFACTURER_2, MANUFACTURER_4))
                .build();
        Car car3 = Car.builder()
                .name("Dart")
                .model("Cowboy Bebop")
                .year(2025)
                .price(1_500_00000)
                .enginType(EngineType.V8)
                .manufacturerList(List.of(MANUFACTURER_1, MANUFACTURER_2, MANUFACTURER_4))
                .build();
        //when
        carServiceDB.addCar(car1);
        carServiceDB.addCar(car2);
        carServiceDB.addCar(car3);
        //then
        assertThat(carServiceDB.getCarList()).contains(car2);
    }

}