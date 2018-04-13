package epam.one;

import java.util.function.Supplier;

public class Test {

    private String str;

    public void saySmth() {
        str = "joker";
        Supplier<String> spkr1 = str::toUpperCase;
        Supplier<String> spkr2 = () -> str.toUpperCase();
        str = "джокер";
        System.out.println(spkr1.get());
        System.out.println(spkr2.get());
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.saySmth();
    }

}
