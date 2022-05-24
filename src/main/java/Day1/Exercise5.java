package Day1;

import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
    private final List<String> myHashSet;


    public Exercise5() {
       this.myHashSet = new ArrayList<>();
    }

    public List<String> getMyHashSet() {
        return myHashSet;
    }

    void add(String str){
        if(str != null && !myHashSet.contains(str)){
            myHashSet.add(str);
        }
    }
    void remove(String str){
        if(str != null){
            myHashSet.remove(str);
        }
    }
    int size(){
        return myHashSet.size();
    }
    boolean contains(String str){
        return myHashSet.contains(str);
    }
    void clear(){
        myHashSet.removeAll(myHashSet);
    }

}
