package com.hexu.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {

        createStreamFromCollection().forEach(System.out::println);

        System.out.println("==================");
        createStreamFromValues().forEach(System.out::println);

        System.out.println("==================");
        createStreamFromArrays().forEach(System.out::println);
        System.out.println("==================");

        System.out.println(createStreamFromFile());


        System.out.println("==================");


    }



    private static Stream<String> createStreamFromCollection(){
        List<String> list = Arrays.asList("Hello", "world", "I am hexu");

        return list.stream();

    }

    private static Stream<String> createStreamFromValues(){
        return Stream.of("Sam", "Charles", "Hexu", "Liqun", "Horace");
    }

    private static Stream<String> createStreamFromArrays(){

        return Arrays.stream(new String [] {"hexu","CC"});
    }

    private static Stream<String> createStreamFromFile(){

        Path path = Paths.get("/Users/hexu/Developer/WorkSpace/IDEA/java8-sharing/src/main/java/com/hexu/java8/StreamFilter.java");

        try (Stream<String> streamFromFiles = Files.lines(path)) {
            streamFromFiles.forEach(System.out::println);
            return streamFromFiles;

        }catch (IOException e) {

        }

        return null;

    }
}
