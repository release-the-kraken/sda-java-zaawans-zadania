package Day2;

import java.util.Arrays;

public enum Runner {
    BEGINNER(240, 360),
    INTERMEDIATE(180, 240),
    ADVANCED(120, 180);

    int minMarathonTime;
    int maxMarathonTime;

    Runner(int minMarathonTime, int maxMarathonTime) {
        this.minMarathonTime = minMarathonTime;
        this.maxMarathonTime = maxMarathonTime;
    }

    static Runner getFitnessLevel(int time){
        return  Arrays.stream(values())
                .filter(r -> time > r.minMarathonTime && time <= r.maxMarathonTime)
                .findFirst()
              //  .orElse(BEGINNER);
                .orElseThrow(() -> new IllegalArgumentException("Given time out of bounds."));

    }

}
