package Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    /*public static void main(String[] args) {
        List<String> sortedList = new ArrayList<>();
        String string1 = "kura";
        String string2 = "kaczka";
        String string3 = "gęś";
        String string4 = "indyk";
        stringList.add(string1);
        stringList.add(string2);
        stringList.add(string3);
        stringList.add(string4);
        List<String> sortedList = (List<String> stringList){


    }*/
    static List<String> sortUsingAnonymousClass(List<String> unsorted){
        List<String> sortedList = new ArrayList<>(unsorted);
        Collections.sort(sortedList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        return sortedList;
    }
    static List<String> sortedUsingOwnComparator(final List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new MyComparator());
        return sorted;
    }
    static List<String> sortedUsingOwnStream(final List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        return sorted.stream()
                .sorted(Comparator.reverseOrder())
                //.sorted((o1, o2) -> o2.compareTo(o1)) - alternative
                .collect(Collectors.toList());

    }
}
