package Day1.Exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {
    private Map<String, List<String>> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public List<String> getValues(String key) {
        return storage.get(key);
    }

    public void addToStorage(String key, String value) {
        if (storage.containsKey(key)) {
            storage.get(key).add(value);
        } else {
            List<String> list = new ArrayList<>();
            list.add(value);
            storage.put(key, list);
        }
    }

    public void printValues(String key) {
        String entry = storage.get(key).toString();
        System.out.println(entry);
    }

    public List<String> findValues(String value) {
//        return storage.values()
//                .stream()
//                .map(stringList -> stringList
//                        .stream()
//                        .filter(s -> s.equals(value)))
//                .collect(Collectors.toList());
        return storage.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(value))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
