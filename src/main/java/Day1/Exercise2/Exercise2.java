package Day1.Exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise2 {
    static List<String> sortIgnoringCase(final List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new MyIgnoreCaseComparator());
        return sorted;
    }


}
