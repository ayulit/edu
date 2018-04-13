package luxsoft;

import java.util.Arrays;

public class Quiz_2 {

    public static void main(String[] args) {
        String[] strings = {"1", "2"};
        Object[] objects = strings;
        objects[0] = 0;
        System.out.println(Arrays.toString(objects));
    }
}
