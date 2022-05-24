package Day1;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Exercise6 {
    public static void main(String[] args) {
        Map<Integer, String> myTreeMap = new TreeMap<>();
        myTreeMap.put(1, "Elaine");
        myTreeMap.put(2, "George");
        myTreeMap.put(3, "Jerry");
        myTreeMap.put(4, "Newman");
        myTreeMap.put(5, "Kramer");
        getFirstAndLastEntryOfTreeMap(myTreeMap);

    }

    private static void getFirstAndLastEntryOfTreeMap(Map<Integer, String> inputMap) {
        if(!inputMap.isEmpty() && inputMap.size() > 1) {
            List<Map.Entry<Integer, String>> entryList = inputMap
                    .entrySet()
                    .stream()
                    .toList();
            int lastIndex = entryList.size() - 1;
            System.out.printf("First entry: %s, last entry: %s%n", entryList.get(0), entryList.get(lastIndex));
        }else if(inputMap.size() == 1){
            System.out.println("Map contains single entry: " + inputMap.entrySet());
        }

    }

}
