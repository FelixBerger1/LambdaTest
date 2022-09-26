import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class HalloJavaMitForEach {
    private ArrayList<String> list = (ArrayList<String>) Arrays.asList("Hello","World","!");


    public void forEach() {
        for (String s : list) {
            System.out.println(s);
        }
    }

    public void forEachLambda() {
        list.forEach(System.out::println);
    }

    public void Consumer()
    {
        Consumer<String> consumer = (String s) ->System.out.println(s);
    }




}
