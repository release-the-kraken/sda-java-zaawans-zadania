package Day1.exercise1;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

    public MyComparator() {
    }

    @Override
    public int compare(String o1, String o2) {
        return o2.compareToIgnoreCase(o1);
    }

}
