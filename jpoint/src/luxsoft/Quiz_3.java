package luxsoft;

public class Quiz_3 {

    public static void main(String[] args) {
        String str = "true";
        if ("t" + "r" + "u" + "e" == "true") System.out.println("1");
        if (str + "" == "true") System.out.println("2");
        if (str.replace('T', 't') == "true") System.out.println("3");
    }
}
