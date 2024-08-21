package phase3;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        ArrayList<String> newData = new ArrayList<>((List.of("C", "C++", "C#")));
        data.add("Java");
        data.add("PHP");
        data.add("Python");
        data.add(1, "SQL");
        data.set(0,"JavaScript");
        data.addAll(newData);
        // for(String element : data){
        //     System.out.println(element);
        // }
        System.out.println(data);
        System.out.println(data.size());
        System.out.println(data.get(1));
        System.out.println(data.indexOf("Python"));
    }
}
