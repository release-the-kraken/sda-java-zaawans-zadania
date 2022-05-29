package Day3.Exercise28;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<T> extends ArrayList<T> {
    public List<T> getEveryNthElement(int startIndex, int skipValue){
        List<T> resultList = new ArrayList<>();
            for(int i = startIndex; i < this.size(); i += skipValue + 1){
                resultList.add(this.get(i));
            }
        return resultList;
    }
}
