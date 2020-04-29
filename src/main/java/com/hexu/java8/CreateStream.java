package com.hexu.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
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
        createStreamFromIterator().forEach(System.out::println);

        System.out.println("==================");
        createStreamFromGenerate().forEach(System.out::println);

        System.out.println("==================");
        createObjStreamFromGenerate().forEach(i -> System.out.println(i));
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

    private static Stream<Integer> createStreamFromIterator(){


        Stream<Integer> stream = Stream.iterate(1,n -> n + 1).limit(15);


        return stream;
    }

    private static Stream<Double> createStreamFromGenerate(){

        return Stream.generate(Math::random).limit(10);
    }


    private static Stream<Obj> createObjStreamFromGenerate(){

        return Stream.generate(new ObjSuppiler()).limit(50);
    }



    static class ObjSuppiler implements Supplier<Obj>{
        private int index = 0;

        private Random random = new Random(System.currentTimeMillis());

        @Override
        public Obj get() {
            index = random.nextInt(100);
            return new Obj(index,"Name->" + index);
        }
    }


    static class Obj{

        private int id;

        private String name;

        public Obj() {
        }

        public Obj(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Obj{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
