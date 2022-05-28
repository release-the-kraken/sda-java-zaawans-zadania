package Day2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Exercise14 {
    private static Map<Integer, Integer> randomIntMap = new HashMap<>();

    public static void main(String[] args) {
        populateMap();
        System.out.println(randomIntMap.toString());
        System.out.println(getUniqueEntries());
        System.out.println(getDuplicateEntries());
    }

    static void populateMap() {
        Random random = new Random();
        for (int i = 1; i <= 10000; i++) {
            randomIntMap.put(i, random.nextInt(1001));
        }
    }

    static List<Map.Entry<Integer, Integer>> getUniqueEntries() {
        List<Map.Entry<Integer, Integer>> uniqueEntries = randomIntMap.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getValue,
                        Map.Entry::getKey,
                        Math::min))
                .entrySet()
                .stream().collect(Collectors.toMap(Map.Entry::getValue,
                        Map.Entry::getKey))
                .entrySet()
                .stream()
                .toList();

        return uniqueEntries;
    }
    static List<Map.Entry<Integer, Integer>> getDuplicateEntries(){
//        List<Map.Entry<Integer, Integer>> duplicateEntries = randomIntMap.entrySet()
//                .stream()
//                .sorted()
//  THE SHIT   -->.reduce((e1,e2) -> e1.getValue().equals(e2.getValue()) ? e1 : e2)
//                .stream().toList();

      return null;
    }
}
