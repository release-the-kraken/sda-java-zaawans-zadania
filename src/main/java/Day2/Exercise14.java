package Day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Exercise14 {
    private static Map<Integer, Integer> randomIntMap = new HashMap<>();

    public static void main(String[] args) {
        populateMap();
        System.out.println(randomIntMap.toString());
    }
    static void populateMap() {
        Random random = new Random();
        for (int i = 1; i <= 10000; i++) {
            randomIntMap.put(i, random.nextInt(501));
        }
    }

}
