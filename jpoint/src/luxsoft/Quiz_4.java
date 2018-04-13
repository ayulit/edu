package luxsoft;

import java.util.stream.Stream;

public class Quiz_4 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A", "B");
        System.out.print(1);
        stream.peek(System.out::print);
        System.out.print(2);
        stream.forEach(System.out::print);
    }

}
