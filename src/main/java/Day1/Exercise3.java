package Day1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
    Map<String, Integer> myMap = new HashMap<>();
    myMap.put("Java", 9);
    myMap.put("Python", 4);
    myMap.put("Ruby", 8);
    myMap.put("Javascript", 2);
    myMap.put("PHP", 0);
    String resultString = getStringFromMap(myMap);
    System.out.println(resultString);
    }
    public static String getStringFromMap(Map<String, Integer> myMap){
        return myMap.entrySet()
                .stream()
                .map((entry) -> "Klucz: %s, Wartość: %s".formatted(entry.getKey(), entry.getValue()))
                .collect(Collectors.joining(", \n", "", "."));
       /* return mapResult.stream()
                .collect(Collectors.joining(",\n")) + ".";//joining with suffix*/
    }


}
