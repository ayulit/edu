package alfa;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Cypher {
    public static void main(String[] args) {

        String str2 = "1,2,3,4,5,0";
        String str1 = "1,65,55,8,44,25";

        int [] arr1 = Arrays.asList(str1.split(",")).
                stream().
                mapToInt(Integer::parseInt).toArray();

        int [] arr2 = Arrays.asList(str2.split(",")).
                stream().
                mapToInt(Integer::parseInt).toArray();

        Optional<String> coordinates = Stream.iterate(0, i -> arr2[i]).
                map(res -> arr1[res]).
                skip(1).
                limit(arr2.length).
                map(Object::toString).
                reduce((a,b) -> a + "," + b);

        if(coordinates.isPresent()) {
            coordinates.map(s -> new StringBuilder(s).reverse().toString());
        }

        System.out.println(String.format("%s° %s′ %s″" +
                                         System.getProperty("line.separator") +
                                          "%s° %s′ %s″",
                                          coordinates.get().split(",")));



    }
}
