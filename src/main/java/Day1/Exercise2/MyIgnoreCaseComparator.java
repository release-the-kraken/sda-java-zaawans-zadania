package Day1.Exercise2;

import java.util.Comparator;

public class MyIgnoreCaseComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareToIgnoreCase(o1);
    }
}

