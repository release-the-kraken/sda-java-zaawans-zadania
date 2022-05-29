package Day3.Exercise30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Exercise30 {

    static List<String> getFileContent(Path inputFile) throws IOException {
        return Files.readAllLines(inputFile);
    }
    static List<String> reverseFileContent(List<String> input){
        return input.stream()
                //.map(word -> new StringBuilder(word).reverse().toString())
                //.map(Exercise30::reverseString)
                .map(word -> reverseString(word))
                .toList();
    }

    private static String reverseString(String word) {
        return new StringBuilder(word).reverse().toString();
    }
    static Path reverseFileName(Path inputFile){
        String fileName = inputFile.toFile().getName();
        int dotIndex = fileName.indexOf(".");
        String fileExtension = null;
        if(dotIndex > 1){
            fileExtension = fileName.substring(dotIndex);
            fileName = fileName.substring(0, dotIndex);
        }
        String reversedFileName = new StringBuilder(fileName)
                .reverse()
                .append(fileExtension)
                .toString();

        return inputFile
                .getParent()
                .resolve(reversedFileName);
    }
    static void saveFile(Path outputPath, List<String> contents) throws IOException {
        Files.write(outputPath, contents);

    }
}
