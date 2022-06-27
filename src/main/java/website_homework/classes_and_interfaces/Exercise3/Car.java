package website_homework.classes_and_interfaces.Exercise3;

import static website_homework.classes_and_interfaces.Exercise3.CarType.LUXURY;
import static website_homework.classes_and_interfaces.Exercise3.EngineType.*;

public class Car {
    private String name;
    private CarType type;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public CarType getType() {
        return type;
    }
    public void setType(CarType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
    class Engine{
        private EngineType type;

        @Override
        public String toString() {
            return "Engine{" +
                    "type=" + type +
                    '}';
        }

        public EngineType getEngineType() {
            return type;
        }

        void setEngine(){
            if(getType() == null){
                this.type = PETROLEUM;
            }else if(getType().equals(LUXURY)){
                this.type = ELECTRIC;
            } else {
                this.type = DIESEL;
            }
        }
    }
}
