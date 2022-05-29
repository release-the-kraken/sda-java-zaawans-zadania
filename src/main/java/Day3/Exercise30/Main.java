package Day3.Exercise30;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static Day3.Exercise30.Exercise30.*;

public class Main {
    public static void main(String[] args) {
        Path dirPath = Path.of("src/main/java/Day3/Exercise30/");
        Path inputFile = dirPath.resolve("course.txt");
        if(!inputFile.toFile().exists()){
            System.out.println("File doesn't exist.");
            return;
        }
        List<String> contents = new ArrayList<>();
        try {
            contents = getFileContent(inputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(contents);
        List<String> reversedFileContents = reverseFileContent(contents);
        System.out.println(reversedFileContents);
        Path outputFile = reverseFileName(inputFile);
        System.out.println(outputFile);
        try {
            saveFile(outputFile, reversedFileContents);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
