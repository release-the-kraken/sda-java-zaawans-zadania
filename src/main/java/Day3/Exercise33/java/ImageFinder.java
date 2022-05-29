package Day3.Exercise33.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ImageFinder {
    public static List<String> findImages(Path directory){
        try(Stream<Path> walk = Files.walk(directory)){
            walk.filter(file -> imageValidator(file))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    private static boolean imageValidator(Path file) {
        return file.toString().contains(".jpg") || file.toString().contains(".png");
    }

}
