import java.util.ArrayList;

public class HalloJavaMitForEach {
    private ArrayList<String> list = new ArrayList<>();

    public void forEach() {
        list.add("Hello");
        list.add("World");
        for (String s : list) {
            System.out.println(s);
        }
    }

    public void forEachLambda() {
        list.forEach(System.out::println);
    }
}
