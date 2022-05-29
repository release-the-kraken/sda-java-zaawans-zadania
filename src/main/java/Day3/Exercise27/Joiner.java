package Day3.Exercise27;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Joiner<T> {
    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... elements){
        return Arrays.stream(elements)
                .map(Object::toString)
                .collect(Collectors.joining(this.separator));

    }
}
