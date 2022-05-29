package Day3.Exercise33.java;

import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path dirPath = Path.of("src/main/java/Day3/Exercise33/files");
        List<String> result = ImageFinder.findImages(dirPath);
        System.out.println(result);
    }
}
