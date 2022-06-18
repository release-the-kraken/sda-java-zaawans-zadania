package website_homework.collections;

import java.util.ArrayList;
import java.util.List;

public class SDAArrayList<T> {
    private List<T> SDAArrayList;

    public SDAArrayList() {
        this.SDAArrayList = new ArrayList<>();
    }

    public List<T> getSDAArrayList() {
        return SDAArrayList;
    }

    void add(T t) {
        this.SDAArrayList.add(t);
    }

    void remove(T t) {
        this.SDAArrayList.remove(t);
    }

    T get(int index) {
        return this.SDAArrayList.get(index);
    }

    void display() {
        this.SDAArrayList.stream()
                .forEach(s -> System.out.println(s + ", "));
    }
}
